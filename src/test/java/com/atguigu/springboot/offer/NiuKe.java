package com.atguigu.springboot.offer;

/**
 * @author Natalie
 * @date 2020-6-22--23:15
 */
public class NiuKe {
    public static void main(String[] args) {
        Integer s=new Integer(9);
        Integer t=new Integer(9);
        Long u=new Long(9);
        System.out.println(s==t);
        System.out.println(s.equals(9));
        System.out.println(s.equals(t));
        System.out.println(s.equals(new Integer(9)));
        int i =0;
        int j = i++;
        System.out.println(j);
        System.out.println(i);
    }
}
