package com.company;

public class Car implements AutoCloseable{

    public void drive()throws Exception{
        System.out.println("машина журуп жатат");
    }

    @Override
    public void close()throws Exception{
        System.out.println("машина жабылып жатат");
    }
}
