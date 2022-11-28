package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import jdbc.JdbcUtils;
import jdbc.entity.Course;

public class CourseDao implements IDao<Course, String> {

	@Override
	public Collection<Course> getAll() {
		// TODO Auto-generated method stub
		Collection<Course> allCourses = new ArrayList<Course>();
		String sqlQuery = 
				"select course_name, course_fees, course_duration, course_id from course_master";
		try(Connection conn = JdbcUtils.obtainConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery)){
			
				while(rs.next()) {
					//Capturing the values from ResultSet				
					String name = rs.getString(1);
					int fees = rs.getInt(2);
					int duration = rs.getInt(3);
					String id = rs.getString(4);
					
					//Populating a Course object based upon these 4 values:
					Course crs = new Course(id, name, duration, fees);
					//Adding this object into the collection
					allCourses.add(crs);
				}
				
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return allCourses;
	}

	@Override
	public Course getOne(String courseId) {
		// TODO Auto-generated method stub
		Course foundCourse = null;
		String sqlQuery = 
		"select course_name, course_fees, course_duration, course_id from course_master where course_id = ?";
		//In the above query, '?' indicates unknown parameter
		
		try(Connection conn = JdbcUtils.obtainConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			//Substitute value in place of '?'
			pstmt.setString(1, courseId);
			ResultSet rs = 	pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString(1);
				int fees = rs.getInt(2);
				int duration = rs.getInt(3);
				String id = rs.getString(4);
				foundCourse = new Course(id, name, duration, fees);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return foundCourse;
	}

	@Override
	public void create(Course newCourse) {
		// TODO Auto-generated method stub
		String sqlQuery = "insert into course_master values(?,?,?,?)";
		try(Connection conn = JdbcUtils.obtainConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			//Extract the values from newCourse
			String id = newCourse.getCourseId();
			String name = newCourse.getName();
			int duration = newCourse.getDuration();
			int fees = newCourse.getFees();
			//Substitute all the values in place of unknown parameters
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, duration);
			pstmt.setInt(4, fees);
			
			int updateCount =  pstmt.executeUpdate();
			System.out.println("Record Added. Count: " + updateCount);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}








