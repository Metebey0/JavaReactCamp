package day2Homework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"JAVA","Engin Demiroğ",true);
		Course course2 = new Course(2,"C#","Engin Demiroğ",true);
		
		Course course3 = new Course();
		course3.id=3;
		course3.courseDetail="PYTHON";
		course3.instructor="Engin Demiroğ";
		course3.free=true;
		
		Course[] course = {course1,course2,course3};
		
		for(Course kurs : course) {
			System.out.println(kurs.courseDetail+" "+" "+kurs.instructor);
		}
		
		System.out.println("Eğitmenin"+course.length+" adet kursu vardır.");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addToCart(course1);
		courseManager.deleteFromCart(course2);

	}
}
