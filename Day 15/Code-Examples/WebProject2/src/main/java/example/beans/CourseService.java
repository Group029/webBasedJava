package example.beans;

import example.dao.CourseDao;
import example.dao.IDao;

public class CourseService {

	public static Course getCourseById(String courseId) {
		// TODO Auto-generated method stub
		IDao<Course, String> idaoRef = new CourseDao();
		Course foundCourse = idaoRef.getOne(courseId);
		return foundCourse;
		
	}

}
