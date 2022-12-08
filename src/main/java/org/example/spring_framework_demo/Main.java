package org.example.spring_framework_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext( "spring.xml");

//        Doctor doctor=context.getBean(Doctor.class);
//        doctor.assist();

//        Staff nurse1= (Nurse) context.getBean("nurse");
//        nurse1.assist();
        Staff doctor=context.getBean(Doctor.class);
        doctor.assist();

        Staff nurse=context.getBean(Nurse.class);
        nurse.assist();

//        Staff nurse=context.getBean(Nurse.class);
//        nurse.assist();

//        Doctor doctor1=context.getBean(Doctor.class);
//        System.out.println( "Qualification is:"+ doctor1.getQualification());
    }
}