package com.example.demo.controller;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeAbsence;
import com.example.demo.model.EmployeeAbsenceHistory;
import com.example.demo.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/employees")
public class EmployeeController {
   private EmployeeService employeeService;
   
   public EmployeeController(EmployeeService employeeService) {
	super();
	this.employeeService = employeeService;
   }

//create employee REST API
   @PostMapping("/saveEmployee")
   public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
	   return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
   }
   
  //create employee adbsence history REST API
   @PostMapping("/saveEmpAbsenceHistory")
   public ResponseEntity<EmployeeAbsenceHistory> saveEmpAbsenceHistory(@RequestBody EmployeeAbsenceHistory employeeAbsenceHistory){
	   return new ResponseEntity<EmployeeAbsenceHistory>(employeeService.saveEmpAbsenceHistory(employeeAbsenceHistory), HttpStatus.CREATED);
   }
   
   //get all employee REST API
   @GetMapping("/getAllEmployees")
   public List<Employee> getAllEmployees(){
	   return employeeService.getAllEmployees();   
   }
   
 //get all employee REST API
   @GetMapping("/getAllEmployeesAbsence")
   public List<EmployeeAbsence> getAllEmployeesAbsence(){
	   return employeeService.getAllEmployeesAbsence();   
   }
   
 //get employee by id REST API
   @GetMapping("/getEmployeeById/{id}")
   public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
	return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK); 
   }
   
 //get employee absence history by id REST API
   @GetMapping("/getEmpAbsenceHistoryById/{id}")
   public List<EmployeeAbsenceHistory> getEmpAbsenceHistoryById(@PathVariable("id") long employeeId){
	return employeeService.getEmpAbsenceHistoryById(employeeId); 
   }
   
 //update employee REST API
   @PutMapping("/updateEmployee/{id}")
   public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long employeeId, @RequestBody  Employee employee){
	   return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, employeeId), HttpStatus.OK);
   }
   
 //delete employee REST API
   @DeleteMapping("/deleteEmployee/{id}")
   public ResponseEntity<String> deleteEmployee(@PathVariable("id") long employeeId){
	   employeeService.deleteEmployeeById(employeeId);
	   return new ResponseEntity<String>("Employee deleted successfully", HttpStatus.OK);
   }

}
