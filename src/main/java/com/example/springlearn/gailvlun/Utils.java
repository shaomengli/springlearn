package com.example.springlearn.gailvlun;

public class Utils {
    public static ResultDivisible subtractionResultDivisible(ResultDivisible pa,ResultDivisible pb){
        return new ResultDivisible(pa.getNum()*pb.getNum(),pa.getCount()*pb.getNum()-pb.getCount()*pa.getNum());
    }

    public static ResultDivisible addResultDivisible(ResultDivisible pa,ResultDivisible pb){
        return new ResultDivisible(pa.getNum(),pa.getCount()+pb.getCount());
    }

    public static ResultDivisible mulResultDivisible(ResultDivisible pa,ResultDivisible pb){
        return new ResultDivisible(pa.getNum()*pb.getNum(),pa.getCount()*pb.getCount());
    }

}
