package provider.service.impl;

import common.HelloService;

public class HelloServiceImpl implements HelloService {
    public String sayHello(String str) {
       return "Hello "+str;
    }
}