package Anudip.hibernate.EmployeeManagementSystem.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empUserName;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpUserName() {
		return empUserName;
	}
	
	public void setEmpUserName(String empUserName) {
		this.empUserName = empUserName;
	}
	
	public Employee(int empId, String empName, String empUserName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empUserName = empUserName;
	}
	
	public Employee() {}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empUserName=" + empUserName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empUserName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Objects.equals(empUserName, other.empUserName);
	}
    
   
}
