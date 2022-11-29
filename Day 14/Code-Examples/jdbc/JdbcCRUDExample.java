package jdbc;

import java.util.Collection;

import jdbc.dao.CourseDao;
import jdbc.dao.IDao;
import jdbc.entity.Course;

public class JdbcCRUDExample {
	private static void updateOneCourse() {
		IDao<Course, String> idaoRef = new CourseDao();
		//Obtain the Course that is to be modified
		Course searchedCourse = idaoRef.getOne("ANG");
		//Change the state using Setters
		searchedCourse.setName("Angular 11");
		searchedCourse.setFees(11500);
		//Send this modified state to the update method
		idaoRef.update(searchedCourse);
	}
	private static void deleteOneCourse() {
		IDao<Course, String> idaoRef = new CourseDao();
		String courseId = "ML";
		idaoRef.deleteOne(courseId);
	}
	
	private static void addNewCourse() {
		IDao<Course, String> idaoRef = new CourseDao();
		Course crs = new Course("ML", "Machine Learning", 5, 20000);
		idaoRef.create(crs);
	}
	private static void showOneCourse() {
		IDao<Course, String> idaoRef = new CourseDao();
		Course searchedCourse = idaoRef.getOne("HB");
		if(searchedCourse != null)
			System.out.println(searchedCourse);
		else
			System.out.println("Course not found");
	}
	private static void showAllCourses() {
		IDao<Course, String> idaoRef = new CourseDao();
		Collection<Course> courseList = idaoRef.getAll();
		for(Course currentCourse : courseList)
			System.out.println(currentCourse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//showAllCourses();
		//showOneCourse();
		//addNewCourse();
		//deleteOneCourse();
		updateOneCourse();

	}

}
