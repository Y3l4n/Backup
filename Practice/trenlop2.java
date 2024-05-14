public class trenlop2 {
        
    public class Employee{
        private String employeeName; //khai bao bien private -> can co getter+setter de dam bao tinh ket tap(encapsulation)
        private double basicSalary;
        private double salaryCoefficient;
        public static final double SALARY_MAX = 1000000000; //bien co dinh

        //Parameterized constructor (tham so hoa)
        public Employee(String employeeName, double basicSalary, double salaryCoefficient){

            this.employeeName = employeeName;
            this.basicSalary = basicSalary;
            this.salaryCoefficient = salaryCoefficient;
        }

        //getters
        public String getemployeeName(){
            return employeeName;
        }

        public double getbasicSalary(){
            return basicSalary;
        }

        public double getsalaryCoefficient(){
            return salaryCoefficient;
        }


        //print out a person's info
        public void printInfo(){
            System.out.println("Name: " + employeeName);
            System.out.println("Basic salary: " + basicSalary);
            System.out.println("Salary coefficient: " + salaryCoefficient);
        }

        //setters
        public void setName(String employeeName){
            this.employeeName = employeeName;
        }

        public void setBasicSalary(double basicSalary){
            this.basicSalary = basicSalary;
        }

        public void setSalaryCoefficient(double salaryCoefficient){
            this.salaryCoefficient = salaryCoefficient;
        }

        public double getSalary(double basicSalary, double salaryCoefficient){
            double currentSalary = basicSalary * salaryCoefficient;
            return currentSalary;
        }

        public boolean increaseSalary(double x){
            double temp = salaryCoefficient + x;
            if(temp > SALARY_MAX){
                return false;
            }else{
                this.salaryCoefficient = temp;
                return true;
            }
        }
    }
}

