package com.jk.guardedSuspension;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 11:18 2023-07-21
 * @ Description：
 */
public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue,"Alice",3141592L).start();
        new ServerThread(requestQueue,"Bobby",6535897L).start();
    }
}
