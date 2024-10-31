package Anudip.hibernate.EmployeeManagementSystem.service;

import Anudip.hibernate.EmployeeManagementSystem.exception.EmpException;
import Anudip.hibernate.EmployeeManagementSystem.model.Employee;

public interface EmpService {
    public boolean createEmpAccount(Employee e) throws EmpException;
    public boolean deleteEmp(int eid) throws EmpException;
    public boolean updateEmp(Employee e) throws EmpException;
    public boolean findEmp(int eid) throws EmpException;

}
