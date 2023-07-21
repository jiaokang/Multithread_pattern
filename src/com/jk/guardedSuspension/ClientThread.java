package com.jk.guardedSuspension;

import java.util.Random;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 11:11 2023-07-21
 * @ Description：发送请求的类
 */
public class ClientThread extends Thread {
    private final Random random;

    private final RequestQueue requestQueue;

    public ClientThread(RequestQueue requestQueue, String name, long seed) {
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Request request = new Request("No." + i);
            System.out.println(Thread.currentThread().getName() + " request " + request);
            requestQueue.putRequest(request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {

            }
        }
    }
}
