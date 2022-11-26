<h2>教程</h2>
官方地址：https://www.flowable.org/docs/userguide/index.html
<br/>
易百教程：https://www.e-learn.cn/topic/3893390

<h2>启动问题</h2>
<h3>mybatis依赖冲突异常:</h3>
<p>排除依赖 exclusion</p>
<h3>Specified key was too long; max key length is 767 bytes异常:</h3>
<br>
<p>索引超出了限制的长度767<br/>
启用大索引前缀<br/>
SHOW variables like 'innodb_large_prefix';<br/>
SET GLOBAL INNODB_LARGE_PREFIX = ON;
</p>
<h2>Index column size too large. The maximum column size is 767 bytes</h2>
set global innodb_file_format = BARRACUDA;
set global innodb_large_prefix = ON;
<p>style="color:red;">数据库字符集设置成utf-8才行
修改sql的建表语句也可以，参考：https://www.cnblogs.com/zhangXingSheng/p/13304496.html
</p>
<h2>flowable流程图乱码</h2>
FlowableConfig配置字体