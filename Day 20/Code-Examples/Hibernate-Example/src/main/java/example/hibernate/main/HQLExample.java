package example.hibernate.main;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import example.hibernate.bean.EmployeeNameAndSalary;
import example.hibernate.entity.Employee;
import example.hibernate.utilities.HibernateUtils;

public class HQLExample {
	private static void simpleCriteriaUsingRestrictionsExample() {
		Class<Employee> entityType = Employee.class;
		SessionFactory sf = HibernateUtils.getSessionFactory();
		try(Session ss = sf.openSession()){
			Criteria cr = ss.createCriteria(entityType);
			Criterion criterion = Restrictions.between("empSal", 20000, 40000);
			cr.add(criterion);//Adding this criterion to Criteria: cr
			List<Employee> empList = cr.list();
			for(Employee emp : empList)
				System.out.println(emp);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	private static void simpleCriteriaExample() {
		Class<Employee> entityType = Employee.class;
		SessionFactory sf = HibernateUtils.getSessionFactory();
		try(Session ss = sf.openSession()){
			Criteria cr = ss.createCriteria(entityType);
			List<Employee> empList = cr.list();
			for(Employee emp : empList)
				System.out.println(emp);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	private static void selectClauseUsingConstructorExpression() {
		String hqlQuery = 
		"select new example.hibernate.bean.EmployeeNameAndSalary(emp.empName, emp.empSal) from Employee emp";
		SessionFactory sf = HibernateUtils.getSessionFactory();
		try(Session ss = sf.openSession()){
			Query<EmployeeNameAndSalary> 	qr = 	ss.createQuery(hqlQuery);
			List<EmployeeNameAndSalary> empList = qr.list();
			for(EmployeeNameAndSalary nameAndSal : empList)
				System.out.println(nameAndSal);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	private static void selectClauseExample() {
		String hqlQuery = "select emp.empName, emp.empSal from Employee emp";
		SessionFactory sf = HibernateUtils.getSessionFactory();
		try(Session ss = sf.openSession()){
			Query<Object[]> 	qr = 	ss.createQuery(hqlQuery);
			List<Object[]> employees = qr.list();
			for(Object[] empData : employees) {
				String name = (String)empData[0];
				Integer sal = (Integer)empData[1];
				System.out.println(name + " is earning a salary: " + sal);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	private static void fromClauseExample() {
		String hqlQuery = "from Employee emp";
		SessionFactory sf = HibernateUtils.getSessionFactory();
		try(Session ss = sf.openSession()){
			Query<Employee> 	qr = 	ss.createQuery(hqlQuery);
			List<Employee> allEmployees = qr.list();
			for(Employee currentEmp : allEmployees)
				//System.out.println(currentEmp.getEmpName() + " and " + currentEmp.getMobileNo());
				System.out.println(currentEmp);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	private static void addSomeEmployees() {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		try(Session ss = sf.openSession()){
			Transaction tx = ss.beginTransaction();
				for(int a=1;a<=5;a++) {
					Employee emp = new Employee(a, "Employee: "+ a, "Mobile: " + a, a * 10000);
					ss.save(emp);
				}
			tx.commit();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addSomeEmployees();
		//fromClauseExample();
		//selectClauseExample();
		//selectClauseUsingConstructorExpression();
		//simpleCriteriaExample();
		simpleCriteriaUsingRestrictionsExample();

	}

}
