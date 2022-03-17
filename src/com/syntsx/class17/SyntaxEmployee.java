package com.syntsx.class17;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SyntaxEmployee {

    String empId;
    double salary;
    static String CEO="Sumiar";

    public static void main(String[] args) {
        SyntaxEmployee aselObject=new SyntaxEmployee();
        aselObject.empId="1223";
        System.out.println(aselObject.empId);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee obj=new SyntaxEmployee();
        obj.empId="8569";
        System.out.println(obj.empId);
        System.out.println(SyntaxEmployee.CEO);
    }
}