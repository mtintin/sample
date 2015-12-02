package provider.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.HelloService;
 
public class Consumer {
 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start(); 
       HelloService demoService = ( HelloService)context.getBean("helloService"); // ��ȡԶ�̷������
        String hello = demoService.sayHello("world--ploo"); // ִ��Զ�̷���
 
        System.out.println( hello ); // ��ʾ���ý��
    }
 
    
}
