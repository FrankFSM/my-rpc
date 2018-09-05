package com.ralap.rpc.sample.client.service;


import com.ralap.rpc.sample.client.bean.Person;

public interface HelloService {

    String hello(String name);

    String hello(Person person);
}
