package com.jk.guardedSuspension;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 11:08 2023-07-21
 * @ Description：用于存放请求的类
 */
public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();

    public synchronized Request getRequest() {
        while (queue.peek()==null){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        return queue.remove();
    }

    public synchronized void  putRequest(Request request){
        queue.offer(request);
        notifyAll();
    }
}
