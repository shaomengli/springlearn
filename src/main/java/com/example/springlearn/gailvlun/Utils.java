package com.example.springlearn.gailvlun;

public class Utils {
    /*
     * @description:
     * @return
     * @author      邵梦丽
     * @date        2021/1/17 15:16
     **/


    public static ResultDivisible subtractionResultDivisible(ResultDivisible pa,ResultDivisible pb){
        return new ResultDivisible(pa.getNum()*pb.getNum(),pa.getCount()*pb.getNum()-pb.getCount()*pa.getNum());
    }

    public static ResultDivisible addResultDivisible(ResultDivisible pa,ResultDivisible pb){
        return new ResultDivisible(pa.getNum(),pa.getCount()+pb.getCount());
    }

    public static ResultDivisible mulResultDivisible(ResultDivisible pa,ResultDivisible pb){
        return new ResultDivisible(pa.getNum()*pb.getNum(),pa.getCount()*pb.getCount());
    }

    /*
     * @description 计算最小公倍数
     * @return
     * @author      邵梦丽
     * @date        2021/1/17 14:28
     **/
    public static Long leastCommonMultiple(Long num1,Long num2){
        Long smaller,lagger;
        if(num1>num2){
            smaller=num2;
            lagger=num1;
        }else{
            smaller=num1;
            lagger=num2;
        }
       for(Long i = 1L; i<=smaller; i++){
           Long temp=lagger*i;
           if(temp%smaller==0){
               return temp;
           }
       }
       return null;
    }
}
