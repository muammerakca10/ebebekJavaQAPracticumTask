//Muammer Akca
package com.mycompany.ebebek_java_qa_practicum_task;

//import java.time.LocalDateTime;
        
public class Employee{

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    static final int MAX_HOURS = 40;
    //static private LocalDateTime nowYear = LocalDateTime.now();
    static final int NOW_YEAR = 2021;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        //System.out.println("Calistigi yil : " +(nowYear.getYear() - hireYear) );
    }
    
    public double tax(double salary){
        if (this.salary < 1000){
            return 0;
        } else {
            return this.salary *0.03;
        }
    }
    
    public double bonus(int workHours){
        if(workHours > 40) {
            return (workHours-40)*30;
        } else {
            return 0;
        }
    }
    
    public double raiseSalary(int hireYear, double salary){
        int totalWorkYear = NOW_YEAR - hireYear;
        if (totalWorkYear > 0 && totalWorkYear <= 9){
            return salary * 0.05;
        } else if (totalWorkYear > 9 && totalWorkYear <= 19){
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
    
    @Override
    public String toString() {
        return "Adı : " + this.name + 
                "\nMaaşı : " + this.salary + 
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.getHireYear() +
                "\nVergi : " + this.tax(this.salary) +
                "\nBonus : " + this.bonus(this.workHours) +
                "\nMaaş Artışı : " + this.raiseSalary(this.hireYear, this.salary) +
                "\nVergi ve bonuslarla toplam maaş : " + (this.salary - tax(this.salary) + bonus(this.workHours))+
                "\nToplam Maaş : " +(this.salary - tax(this.salary) + bonus(this.workHours) + this.raiseSalary(this.hireYear, this.salary));
    }
    
}
