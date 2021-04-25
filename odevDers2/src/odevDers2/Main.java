package odevDers2;


public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java", "Engin Demirog");
		Course course2 = new Course(2, "C#", "Engin Demirog");
		
		Course[] courses = { course1 , course2 };
		
		for (Course course : courses) {
			System.out.println("Kurs ismi : " + course.name + ", Kurs veren : " + course.author);
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addCourse(course1);
		courseManager.removeCourse(course2);
		
		
		Category category1 = new Category(1,"Programming");
		Category category2 = new Category(2, "Language");
		
		Category[] categories = { category1 , category2 };
		
		for (Category category : categories) {
			System.out.println();
		}

	}

}