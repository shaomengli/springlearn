package com.example.springlearn.gailvlun;

/*
 * @description
 * @return
 * @author      邵梦丽
 * @date        2021/1/17 15:31
 **/
public class A {
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

    public A(Long n, Long r) {
        this.n = n;
        this.r = r;
    }

    public A() {
    }

    public Long getAResult(){
        Long temp=n;
        for(Long i=n-1;i>(n-r);i--){
            temp=temp*i;
        }
        return temp;
    }

    public static Long getR(Long r){
        if(r==1)
            return 1l;
        else{
            return r*getR(r-1);
        }
    }
}
