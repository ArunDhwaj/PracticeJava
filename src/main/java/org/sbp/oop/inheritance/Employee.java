package org.sbp.oop.inheritance;

public class Employee  extends Worker {
    private long employeeId=0;
    private String  hireDate;

    private static int employeeNo = 1;

    public Employee() {
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        employeeId = employeeNo++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}' + super.toString() ;
    }
}
