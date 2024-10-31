package Anudip.hibernate.EmployeeManagementSystem.serviceImpl;

import Anudip.hibernate.EmployeeManagementSystem.dao.EmpDao;
import Anudip.hibernate.EmployeeManagementSystem.daoImpl.EmpDaoImpl;
import Anudip.hibernate.EmployeeManagementSystem.exception.EmpException;
import Anudip.hibernate.EmployeeManagementSystem.model.Employee;
import Anudip.hibernate.EmployeeManagementSystem.service.EmpService;

public class EmpServiceImpl implements EmpService {
	
	EmpDao dao = new EmpDaoImpl();

	@Override
	public boolean createEmpAccount(Employee e) throws EmpException {
		
		return false;
	}

	@Override
	public boolean deleteEmp(int eid) throws EmpException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmp(Employee e) throws EmpException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean findEmp(int eid) throws EmpException {
		// TODO Auto-generated method stub
		return false;
	}

}
