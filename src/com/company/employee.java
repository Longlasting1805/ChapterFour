package com.company;

public class employee {
    private String f_name;
    private String l_name;
    private double monthly_salary;

    public employee(String f_name, String l_name, double monthly_salary){
        this.f_name = f_name;
        this.l_name = l_name;
        this.monthly_salary = monthly_salary;
        if(monthly_salary>0){
            this.monthly_salary = monthly_salary;
        }
        else{
            this.monthly_salary = 0;
        }
    }

    public
    void setF_name(String f_name){
        this.f_name = f_name;
    }
    public
    String getF_name(){
        return f_name;
    }

    public
    void setL_name(String l_name){
        this.l_name = l_name;
    }
    public
    String getL_name(){
        return l_name;
    }

    public
    void setMonthly_salary(double monthly_salary){
        this.monthly_salary = monthly_salary;
    }

    public
    double getMonthly_salary(){
        return monthly_salary;
    }

    public void increase_salary(){
        monthly_salary=monthly_salary+((monthly_salary*10)/100);
    }

}
