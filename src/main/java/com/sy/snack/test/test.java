package com.sy.snack.test;

/**
 * Created by Administrator on 2017/10/13.
 */
public class test implements Comparable<test> {
    @Override
    public int compareTo(test o) {
        return o.getTime().compareTo(this.getTime());
    }

    private String time;
    private Double value1;
    private Double value2;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getValue1() {
        return value1;
    }

    public void setValue1(Double value1) {
        this.value1 = value1;
    }

    public Double getValue2() {
        return value2;
    }

    public void setValue2(Double value2) {
        this.value2 = value2;
    }

    public test( ) {

    }

    public test(String time, Double value1, Double value2) {
        this.time = time;
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "test{" +
                "time='" + time + '\'' +
                ", value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }


}
