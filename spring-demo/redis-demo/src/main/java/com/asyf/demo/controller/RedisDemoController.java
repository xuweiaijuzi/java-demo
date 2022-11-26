package com.asyf.demo.controller;

import cn.hutool.json.JSONUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @Author yjz
 * @Date 2021/8/16 13:59
 */
@RestController
@Api(tags = "redis测试模块")
@RequestMapping(value = "/poi")
@Slf4j
public class RedisDemoController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "demo", method = RequestMethod.POST)
    public Object demo() {
        return "1";
    }

    @RequestMapping(value = "save（zSet测试）", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "key", required = true, dataType = "String", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "value", value = "value", required = true, dataType = "String", paramType = "query", defaultValue = "123")
    })
    public Object save(String key, String value) {
        redisTemplate.opsForValue().set(key, value);

        //10 是什么含义？score 排序
        redisTemplate.opsForZSet().add("zSetTest", "1", 10);
        redisTemplate.opsForZSet().add("zSetTest", "2", 3);
        redisTemplate.opsForZSet().add("zSetTest", "3", 2);
        redisTemplate.opsForZSet().add("zSetTest", "4", 3);

        //删除
        redisTemplate.opsForZSet().remove("zSetTest", "2");

        Set zSetTest = redisTemplate.opsForZSet().range("zSetTest", 0, -1);
        log.info(JSONUtil.toJsonStr(zSetTest));
        return "1";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "key", required = true, dataType = "String", paramType = "query", defaultValue = "zSetTest"),
    })
    public Object delete(String key) {
        redisTemplate.delete(key);
        return "1";
    }

    @RequestMapping(value = "hash", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "key", required = true, dataType = "String", paramType = "query", defaultValue = "zSetTest"),
    })
    public Object hash(String key) {
        redisTemplate.opsForHash().put("user", "age", 18);
        redisTemplate.opsForHash().put("user", "name", "Lisa");

        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        redisTemplate.opsForHash().putAll("user", map);

        redisTemplate.opsForHash().put("user", "age", 1228);

        return redisTemplate.opsForHash().entries("user");

//        return redisTemplate.opsForHash().values("user");
    }

    @RequestMapping(value = "expireTest", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key", value = "key", required = true, dataType = "String", paramType = "query", defaultValue = "1"),
            @ApiImplicitParam(name = "value", value = "value", required = true, dataType = "String", paramType = "query", defaultValue = "123")
    })
    public Object expireTest(String key, String value) {
        redisTemplate.opsForValue().set("testKey", value, 1, TimeUnit.DAYS);

        Long expire = redisTemplate.opsForValue().getOperations().getExpire(key);
        return expire;
    }


    /**
     * String(字符串): string类型时⼆进制安全的，意思就是可以存储任何数据；
     * Hash（哈希）： 类似于map ： java中的Map<String,Object>；
     * List（列表）：实际上是链表，可以添加任何⼀个元素在表头或者表位；
     * Set（集合）：⽆序⽆重复；
     * Zset（有序集合）：跟set⼀样也是string类型元素的集合。关联⼀个double分数。
     * <p>
     * https://wenku.baidu.com/view/1df0383ba000a6c30c22590102020740be1ecdee.html
     * <p>
     * 示例：abc_* 查询abc开头的
     *
     * @param prefix
     * @return
     */
    @RequestMapping(value = "prefixGet", method = RequestMethod.POST)
    @ApiOperation(value = "根据前缀匹配数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "prefix", value = "匹配规则", required = true, dataType = "String", paramType = "query", defaultValue = "*"),
    })
    public Object prefixGet(String prefix) {
        Set keys = redisTemplate.keys(prefix);
        List<Map> maps = new ArrayList<>();
        for (Object key : keys) {
            DataType type = redisTemplate.type(key);
            log.info("{}数据类型:{}", key, type);
            Object o = null;
            switch (type) {
                case NONE:
                    break;
                case STRING:
                    o = redisTemplate.opsForValue().get(key);
                    break;
                case HASH:
                    o = redisTemplate.opsForHash().values(key);
                    break;
                case ZSET:
                    o = redisTemplate.opsForZSet().range(key, 0, -1);
                    break;
                case LIST:
                    o = redisTemplate.opsForList().range(key, 0, -1);
                    break;
                case SET:
                    o = redisTemplate.opsForSet().members(key);
                    break;
                case STREAM:
                    o = redisTemplate.opsForStream().info(key);
                    break;
                default:
                    break;

            }
            Map map = new HashMap();
            map.put(key, o);
            maps.add(map);
        }
        return maps;
    }

    @RequestMapping(value = "prefixExpire", method = RequestMethod.POST)
    @ApiOperation(value = "根据前缀匹配设置过期时间")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "prefix", value = "匹配规则", required = true, dataType = "String", paramType = "query", defaultValue = "*"),
            @ApiImplicitParam(name = "expire", value = "过期时间（秒）", required = true, dataType = "long", paramType = "query", defaultValue = "30"),
    })
    public Object prefixExpire(String prefix, long expire) {
        Set keys = redisTemplate.keys(prefix);
        for (Object key : keys) {
            redisTemplate.expire(key, expire, TimeUnit.SECONDS);
        }
        return keys.size();
    }

}
