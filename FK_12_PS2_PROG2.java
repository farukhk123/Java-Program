package com.company;

import javax.management.MBeanAttributeInfo;

public class FK_12_PS2_PROG2 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypting the grade

        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
