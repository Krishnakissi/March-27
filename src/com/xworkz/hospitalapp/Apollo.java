package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.patientapp.Patient;



public class Apollo implements Hospital{
    Patient patient[];
    int index;
    public Apollo(int size){
        patient=new Patient[size];
    }
    @Override
    public boolean addDetails(Patient patient) {
        System.out.println("invoked addDetails method");
        boolean isAdded=false;
        if(patient !=null){
            System.out.println("patient check is completed.....proceed to add patient");
            if(patient.getName()!=null&&!patient.getName().isEmpty()&&patient.getBloodGroup()!=null&&
                    !patient.getBloodGroup().isEmpty())
            {
                this.patient[index++]=patient;

                isAdded=true;
                System.out.println("Patient name is added");
            }
            else{
                System.out.println("Patient name is exceed");
            }

        }
        return isAdded;
    }

    @Override
    public void getData() {
    System.out.println("invoked getAll patients");
    System.out.println("list of patients are:");
    for(Patient pat:this.patient){
        System.out.println(pat);
    }

    }
}
