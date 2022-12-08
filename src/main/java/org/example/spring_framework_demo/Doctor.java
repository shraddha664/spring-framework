package org.example.spring_framework_demo;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {
//private String qualification;
    public void assist(){
        System.out.println("Doctor is assisting");
    }

//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }
//
//    public String getQualification() {
//        return qualification;
//    }

//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
}
