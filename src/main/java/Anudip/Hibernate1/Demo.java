package Anudip.Hibernate1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
     public static void main(String[]args) {
    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
    	 EntityManager em = emf.createEntityManager();
    	 
    	 //add data
    	 
    /*	 em.getTransaction().begin();
    	 
    	 Employee e1 = new Employee(23,"Nitin","ec");
    	 
    	 em.persist(e1);
    	 
    	 em.getTransaction().commit();
    	 
    	 em.close();   */
    	 
    	 //delete data
    	 
       /* System.out.println("Emter the id which you want to remove");
    	 Scanner sc = new Scanner(System.in);
    	 
    	 int eid = sc.nextInt();
    	 
    	 Employee ee = em.find(Employee.class, eid);
    	 
    	 if(ee != null) {
    		 
             em.getTransaction().begin();
        	 
        	 em.remove(ee);
        	 
        	 em.getTransaction().commit();
        	 
        	 System.out.println("The employee has been removed");
        	 
        	 em.close();

    	 }else {
    		 System.out.println(" There is no such employee with this id");
    	 }      */
    	 
    	 
    	 //update  
    	 
    	 
    	 System.out.println("Emter the id which you want to update");
    	    Scanner sc = new Scanner(System.in);
    	 
    	    int eid = sc.nextInt();
    	 
    	    Employee ee = em.find(Employee.class, eid);
    	    
    	    System.out.print("Please add your surname");
    	    
    	    String surname = sc.next();
    	    
    	 
    	 if(ee != null) {
    		 
             em.getTransaction().begin();
             
             String fullName = ee.getEname() + " " + surname;
        	 
        	 ee.setEname(fullName);
        	 
        	 em.getTransaction().commit();
        	 
        	 System.out.println("The employee has been updated");
        	 
        	 em.close();

    	 }else {
    		 System.out.println(" There is no such employee with this id");
    	 }

     }
}
