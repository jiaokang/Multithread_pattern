package com.jk.guardedSuspension;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 11:07 2023-07-21
 * @ Description：表示请求的request类
 */
public class Request {
    private final String name;

    public Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
