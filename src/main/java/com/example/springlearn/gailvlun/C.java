package com.example.springlearn.gailvlun;

public class C {
    private Long n;
    private Long r;

    public Long getN() {
        return n;
    }

    public void setN(Long n) {
        this.n = n;
    }

    public Long getR() {
        return r;
    }

    public void setR(Long r) {
        this.r = r;
    }

    public C() {
    }

    public C(Long n, Long r) {
        this.n = n;
        this.r = r;
    }

    public static double getResult(Long n,Long r){
        return ((new A(n,r).getAResult()+0.00)/A.getR(r));
    }

}
