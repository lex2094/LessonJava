package guru.qa.io;

import guru.qa.domain.Employee;

public interface IO {

    Employee readEmployee();

    void printEmployee(String message, Employee employee);

    Employee inputDepartureDate(Employee employee);


}
