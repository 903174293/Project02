package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author xiaov
 * @create 2019-05-20 12:05
 *
 * 1. IDEA中代码模板所处的位置：settings - Edit - Live Template /Postfix Completion
 *  二者的区别：Live Templates可以自定义，而Postfix Completion 不可以。同时，
 *  有些操作二者都提供了模板，Postfix Templates 较 Live Templates 能快 0.01 秒
 */
public class TemplateTest {

    //模板六：prsf：可生成private static final   ////**********clt+enter快捷键加入依赖**********关键   ctrl+shift+y********转大写
    private static final Customer customer = new Customer();   ////*********非常关键：非maven项目中模块的类引用，只是在Project01.iml文件中加入了配置：关键

    //变形：psf
    public static final int NUM = 1;
    //变形psfi
    public static final int SNUM = 1;
    //变形psfs
    public static final String NATION = "china";

    //模板一：psvm
    public static void main(String[] args) {
        //模板而：sout
        System.out.println("TemplateTest"); //sout
        //变形：soutp【打印方法参数】 / soutm【打印方法】 /soutv 【打印就近变量】 /xxx.sout
        System.out.println("args = [" + args + "]");

        int num1 = 10 ;
        int num2 = 20 ;
        System.out.println("num2 = " + num2);  //**********就近选择变量

        System.out.println("TemplateTest.main");  //********打印方法名
        System.out.println("abc");  //"abc".sout

        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","Lilei","HanMeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList<>();
        list.add(123);
        list.add("fdsf");
        list.add(23);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            //********逆序遍历
            System.out.println(i);
        }
    }
}
