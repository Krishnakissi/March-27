package com.xworkz.hospitalapp.patientapp;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.constant.GovtId;
import lombok.Data;

@Data

public class Patient {
    private  int patientid;
    private String name;
    private long phoneNumber;
    private int age;
    Gender gender;
    private String diseasesName;
    String gardian;
    String adress;
    String bloodGroup;
    GovtId govtId;


}
