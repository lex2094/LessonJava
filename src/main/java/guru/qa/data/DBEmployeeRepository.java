package guru.qa.data;

import guru.qa.domain.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class DBEmployeeRepository implements EmployeeRepository {

    private static final Map<UUID, Employee> storage = new HashMap<>();
    static {
        Employee existingEmployee0 = new Employee(UUID.randomUUID(), "Вася", "Иванонов");
        Employee existingEmployee1 = new Employee(UUID.randomUUID(), "Вася", "Иванонов");
        storage.put(existingEmployee0.getId(),existingEmployee0);
        storage.put(existingEmployee1.getId(),existingEmployee1);
    }

    @Override
    public Optional<Employee> lookup(String name, String surName) {
        for (Employee employee : storage.values()) {
            if (employee.getName().equals(name) && employee.getSurName().equals(surName))
                return Optional.of(employee);
        }
        return Optional.empty();
    }


    @Override
    public Employee save(Employee employee) {
        if (employee.getId() != null && storage.get(employee.getId()) != null ){
            throw new IllegalArgumentException("Обьект уже сохранен в storage");
        }
        employee.setId(UUID.randomUUID());
        storage.put(employee.getId(), employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee){
        if (employee.getId() != null && storage.get(employee.getId()) != null ){
            throw new IllegalArgumentException("Обьект не может быть изменен, так как отсутствует");
        }
        storage.put(employee.getId(), employee);
        return employee;
    }
}
