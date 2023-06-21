package com.xworkz.hospitalapp.patientapp;

import com.xworkz.hospitalapp.Apollo;
import com.xworkz.hospitalapp.Hospital;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.constant.GovtId;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
//        Hospital hospital =new Apollo();
//        Patient patient=new Patient();
//        patient.setPatientid(1);
//        patient.setName("Likith");
//        patient.setPhoneNumber(8748917604l);
//        patient.setAge(25);
//        patient.setGender(Gender.MALE);
//        patient.setDiseasesName("headache");
//        patient.setGardian("gopal");
//        patient.setAdress("banglore");
//        patient.setBloodGroup("b+");
//        patient.setGovtId(GovtId.DL);
//        hospital.addDetails(patient);
//        hospital.getData();
//
//        System.out.println("***********************************************************");
//        Patient patient1=new Patient();
//        patient1.setPatientid(2);
//        patient1.setName("Akarash");
//        patient1.setPhoneNumber(8874965415l);
//        patient1.setAge(28);
//        patient1.setGender(Gender.MALE);
//        patient1.setDiseasesName("lung Cancer");
//        patient1.setGardian("Rakshith");
//        patient1.setAdress("tumkur");
//        patient1.setBloodGroup("A+");
//        patient1.setGovtId(GovtId.HEALTHCARD);
//        hospital.addDetails(patient1);
//        hospital.getData();
//        System.out.println("***********************************************************");
//
//        Patient patient2=new Patient();
//        patient2.setPatientid(3);
//        patient2.setName("Krishna");
//        patient2.setPhoneNumber(8123825024l);
//        patient2.setAge(25);
//        patient2.setGender(Gender.MALE);
//        patient2.setDiseasesName("Siesures");
//        patient2.setGardian("Jashwanth");
//        patient2.setAdress("banglore");
//        patient2.setBloodGroup("A-");
//        patient2.setGovtId(GovtId.PANCARD);
//        hospital.addDetails(patient2);
//        hospital.getData();
//        System.out.println("***********************************************************");
//
//        Patient patient3=new Patient();
//        patient3.setPatientid(4);
//        patient3.setName("Govardhan");
//        patient3.setPhoneNumber(8877462587l);
//        patient3.setAge(23);
//        patient3.setGender(Gender.MALE);
//        patient3.setDiseasesName("bone fracture");
//        patient3.setGardian("Gokul");
//        patient3.setAdress("Tumkur");
//        patient3.setBloodGroup("O+");
//        patient3.setGovtId(GovtId.DL);
//        hospital.addDetails(patient3);
//        hospital.getData();
//        System.out.println("***********************************************************");
//
//        Patient patient4=new Patient();
//        patient4.setPatientid(5);
//        patient4.setName("Shreedhar");
//        patient4.setPhoneNumber(9980960329l);
//        patient4.setAge(55);
//        patient4.setGender(Gender.MALE);
//        patient4.setDiseasesName("Joint pain");
//        patient4.setGardian("Gokul");
//        patient4.setAdress("Madhugiri");
//        patient4.setBloodGroup("O+");
//        patient4.setGovtId(GovtId.AADHAR);
//        hospital.addDetails(patient4);
//        hospital.getData();
//        System.out.println("***********************************************************");
//
//
//        Patient patient5=new Patient();
//        patient5.setPatientid(6);
//        patient5.setName("Krishna murthy");
//        patient5.setPhoneNumber(8864152794l);
//        patient5.setAge(65);
//        patient5.setGender(Gender.MALE);
//        patient5.setDiseasesName("Diabetics");
//        patient5.setGardian("Jashwanth");
//        patient5.setAdress("Banglore");
//        patient5.setBloodGroup("B+");
//        patient5.setGovtId(GovtId.AADHAR);
//        hospital.addDetails(patient5);
//        hospital.getData();
//        System.out.println("***********************************************************");
//
//        Patient patient6=new Patient();
//        patient6.setPatientid(7);
//        patient6.setName("Hemanth");
//        patient6.setPhoneNumber(7745987451l);
//        patient6.setAge(26);
//        patient6.setGender(Gender.MALE);
//        patient6.setDiseasesName("Stomach pain");
//        patient6.setGardian("Prakash");
//        patient6.setAdress("Banglore");
//        patient6.setBloodGroup("A+");
//        patient6.setGovtId(GovtId.AADHAR);
//        hospital.addDetails(patient6);
//        hospital.getData();
//        System.out.println("***********************************************************");
//
//
//
//
//
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of patient to be added=");
        Hospital hospital=new Apollo(sc.nextInt());
        Patient patient= new Patient();
        System.out.println("enter the patient id=");
        patient.setPatientid(sc.nextInt());
        System.out.println("enter the patient Name=");
        patient.setName(sc.next());
        System.out.println("enter the phoneNumber=");
        patient.setPhoneNumber(sc.nextLong());
        System.out.println("enter age");
        patient.setAge(sc.nextInt());
        System.out.println("enter gender");
        patient.setGender(Gender.valueOf(sc.next()));
        System.out.println("enter diseases name");
        patient.setDiseasesName(sc.next());
        System.out.println("enter gardian name");
        patient.setGardian(sc.next());
        System.out.println("");
   }
}