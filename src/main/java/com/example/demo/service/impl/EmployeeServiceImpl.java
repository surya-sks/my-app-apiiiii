package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeAbsence;
import com.example.demo.model.EmployeeAbsenceHistory;
import com.example.demo.repository.EmployeeAbsenceHistoryRepository;
import com.example.demo.repository.EmployeeAbsenceRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeAbsenceRepository employeeAbsenceRepository;
	
	@Autowired
	private EmployeeAbsenceHistoryRepository employeeAbsenceHistoryRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository,
			EmployeeAbsenceRepository employeeAbsenceRepository,
			EmployeeAbsenceHistoryRepository employeeAbsenceHistoryRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.employeeAbsenceRepository = employeeAbsenceRepository;
		this.employeeAbsenceHistoryRepository = employeeAbsenceHistoryRepository;
	}
//	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//		super();
//		this.employeeRepository = employeeRepository;
//	}
	@Override
	public Employee saveEmployee(Employee employee) {
		EmployeeAbsence empAbsence = new EmployeeAbsence();
		empAbsence.setName(employee.getName());
		empAbsence.setLeaveBalance(12);
		employeeAbsenceRepository.save(empAbsence);
		return employeeRepository.save(employee);
	}
	@Override
	public EmployeeAbsenceHistory saveEmpAbsenceHistory(EmployeeAbsenceHistory employeeAbsenceHistory) {
		//check emp absence is available
		EmployeeAbsence existingEmpAbsence = employeeAbsenceRepository.findById(employeeAbsenceHistory.getEmpNumber()).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", employeeAbsenceHistory.getEmpNumber()));
		existingEmpAbsence.setLeaveBalance(existingEmpAbsence.getLeaveBalance() - employeeAbsenceHistory.getDuration());
		employeeAbsenceRepository.save(existingEmpAbsence);
		return employeeAbsenceHistoryRepository.save(employeeAbsenceHistory);
	}
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	@Override
	public List<EmployeeAbsence> getAllEmployeesAbsence() {
		return employeeAbsenceRepository.findAll();
	}
	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}
//		else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
		
		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
	}
	
	@Override
	public List<EmployeeAbsenceHistory> getEmpAbsenceHistoryById(long id) {
		return employeeAbsenceHistoryRepository.findByEmpNumber(id);
	}
	
	@Override
	public Employee updateEmployee(Employee employee, long id) {
		//check emp is available
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		existingEmployee.setName(employee.getName());
		existingEmployee.setRole(employee.getRole());
		existingEmployee.setLocation(employee.getLocation());
		existingEmployee.setContactNumber(employee.getContactNumber());
		//save existing to DB
		employeeRepository.save(existingEmployee);
		return existingEmployee;
    }
	@Override
	public void deleteEmployeeById(long id) {
		//check emp is available
		employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);
		
	} 	
}
