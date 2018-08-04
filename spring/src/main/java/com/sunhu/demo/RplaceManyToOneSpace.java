package com.sunhu.demo;

/**
 * Created by Administrator on 2018/8/2.
 */
public class RplaceManyToOneSpace {
    public static void main(String[] args){
        System.out.println(rplaceManyToOneSpace("你   好   world I  come from      china"));
    }
    public static String rplaceManyToOneSpace(String arg){
        StringBuilder str = new StringBuilder();
        boolean isFrist = false;
        char c;
        for (int i = 0; i < arg.length(); i++) {
            c = arg.charAt(i);
            if(c == ' ' || c == '\t'){
                if (!isFrist) {
                    str.append(c);
                    isFrist = true;
                }
            }else{
                str.append(c);
                isFrist = false;
            }
        }
        return str.toString();
    }
}
