package com.example.springlearn.gailvlun;

public class ResultDivisible {
    private Long num;
    private Long count;

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ResultDivisible(Long num, Long count) {
        this.num = num;
        this.count = count;
    }

    public ResultDivisible() {
    }

    public double getValue(){
        return (count+0.00)/num;
    }
}
