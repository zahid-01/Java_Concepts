package com.sudo;

import Consumer.Consumer;
import Producer.Producer;

public class Main {
    public static void main(String[] args) {
        Shared shared = new Shared();

        new Producer(shared).start();
        new Consumer(shared).start();
    }
}
