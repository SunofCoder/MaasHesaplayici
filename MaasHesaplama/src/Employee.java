public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYears;

    public Employee(String name, double salary, int workHours, int hireYears){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;

    }

    public double tax(){
        if(this.salary < 1000){
            return 0;

        }else {

            return this.salary * 0.03;
        }
    }

    public double bonus(){
        if (workHours >= 40){
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary(){
        if((2021 - this.hireYears) < 10){
            return this.salary * 0.05;
        }else if ((2021 - this.hireYears) >= 10 && (2021 - this.hireYears) < 19){
            return this.salary * 0.1;
        }else if(2021 - this.hireYears >= 19){
            return this.salary * 0.15;
        }else {
            return 0;
        }
    }

    public void printEmployeeInfo(){


        System.out.println("Employee Name \t\t: "+this.name);
        System.out.println("Employee Salary \t\t\t\t: "+this.salary);
        System.out.println("Work Hour Per Week \t\t\t\t: "+this.workHours);
        System.out.println("Hire Year : \t\t\t\t: "+this.hireYears);
        System.out.println("Tax Amount : \t\t\t\t: "+this.tax());
        System.out.println("Bonus Salary : \t\t\t\t: "+this.bonus());
        System.out.println("Raise Salary \t\t\t: "+this.raiseSalary());
        System.out.println("Salary with Tax and Bonus : \t: " +(this.salary + this.bonus() - this.tax()));
        System.out.println("New Salary : \t\t\t: " +(this.raiseSalary() + this.salary));

    }

}