package day2Homework;

public class CourseManager {
	
	public void addToCart(Course course) {
		System.out.println("Kurs KAydedildi: "+course.courseDetail);
	}
	public void deleteFromCart(Course course) {
		System.out.println("Kurs kaydedilenlerden silindi: "+course.courseDetail);
	}

}
