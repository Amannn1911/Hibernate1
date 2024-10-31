package Anudip.hibernate.EmployeeManagementSystem.daoImpl;

import javax.persistence.EntityManager;

import Anudip.hibernate.EmployeeManagementSystem.dao.EmpDao;
import Anudip.hibernate.EmployeeManagementSystem.exception.EmpException;
import Anudip.hibernate.EmployeeManagementSystem.model.Employee;
import Anudip.hibernate.EmployeeManagementSystem.utility.EMutil;

public class EmpDaoImpl implements EmpDao {

	@Override
	public boolean createEmpAccount(Employee e) throws EmpException {
		boolean flg = false;
		
		String username = e.getEmpUserName();
		if(username.contains("@")) {
		EntityManager em =  EMutil.providerEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		flg = true;
		em.getTransaction().commit();
		em.close();
		}
		else {
			throw new EmpException("Your Username is invalid");
		}

		return true;
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
