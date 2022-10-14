package com.flywhale.suanfa.printNum;

public class TestA {

    static int num = 0;
    static {
        num++;
    }

    {
        num++;
    }

    public TestA(){
        num++;
    }

}
