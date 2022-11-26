package com.asyf.demo.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author yjz
 * @Date 2021/9/28 15:59
 */
@Slf4j
public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long start = System.currentTimeMillis();
        test1();
        long end = System.currentTimeMillis();
        log.info("耗时：{}", end - start);
        test2();
        long end2 = System.currentTimeMillis();
        log.info("耗时：{}", end2 - end);

    }

    private static void test2() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            final Integer a = i;
            Future<Integer> submit = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(1000);
                    return a;
                }
            });
            list.add(submit);
//            Integer integer = submit.get();
//            log.info("输出:{}", integer);
        }
        for (Future<Integer> integerFuture : list) {
            Integer integer = integerFuture.get();
            log.info("输出:{}", integer);
        }
        log.info("end");
        executorService.shutdown();
    }

    private static void test1() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            final Integer a = i;
            Future<Integer> submit = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Thread.sleep(1000);
                    return a;
                }
            });
            Integer integer = submit.get();
            log.info("输出:{}", integer);
        }
        log.info("end");
        executorService.shutdown();
    }
}
