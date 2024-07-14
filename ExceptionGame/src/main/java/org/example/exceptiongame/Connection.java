package org.example.exceptiongame;

class Connection {
    public void open() {
        System.out.println("Connection opened.");
    }

    public void commit() {
        System.out.println("Transaction committed.");
    }

    public void rollback() {
        System.out.println("Transaction rolled back.");
    }

    public void close() {
        System.out.println("Connection closed.");
    }
}