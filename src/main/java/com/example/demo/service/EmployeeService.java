package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeAbsence;
import com.example.demo.model.EmployeeAbsenceHistory;

public interface EmployeeService {
   Employee saveEmployee(Employee employee);
   List<Employee> getAllEmployees();
   Employee getEmployeeById(long id);
   Employee updateEmployee(Employee employee,long id);
   void deleteEmployeeById(long id);
   List<EmployeeAbsence> getAllEmployeesAbsence();
   EmployeeAbsenceHistory saveEmpAbsenceHistory(EmployeeAbsenceHistory employeeAbsenceHistory);
   List<EmployeeAbsenceHistory> getEmpAbsenceHistoryById(long id);
}
