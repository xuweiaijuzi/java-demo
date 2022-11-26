package com.asyf.demo.customer;

import com.asyf.demo.config.LoginInterceptor;
import com.asyf.demo.customer.client.ServiceDemo;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.Date;

public class CustomerTest {

    public static void main(String[] args) {
//        test1();
        //test2();
        test3();
    }

    private static void test3() {
        String address = "http://10.0.20.60:8000/sap/bc/srt/rfc/sap/zetwserv003/100/zetwserv003/zetwserv003";



    }

    //这种方式如何加密码
    private static void test2() {
        //        ServerServiceDemoImplService service = new ServerServiceDemoImplService();
//        String s = service.getServerServiceDemoPort().emrService("a2021-01-13 09:42:42");
//        System.out.println(s);
    }

    /**
     * 方式1:使用代理类工厂,需要拿到对方的接口
     */
    public static void test1() {
        String address = "http://127.0.0.1:8080/services/ws/api?wsdl";
        // 代理工厂
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        // 设置代理地址
        jaxWsProxyFactoryBean.setAddress(address);
        //添加用户名密码拦截器
        jaxWsProxyFactoryBean.getOutInterceptors().add(new LoginInterceptor("root", "root"));
        // 设置接口类型
        jaxWsProxyFactoryBean.setServiceClass(ServiceDemo.class);
        // 创建一个代理接口实现
        ServiceDemo cs = (ServiceDemo) jaxWsProxyFactoryBean.create();
        // 数据准备
        String data = String.valueOf(new Date());
        // 调用代理接口的方法调用并返回结果
        String rs = cs.emrService(data);
        System.out.println("==============\n返回结果:" + rs);
    }

}
