package assignment5;

public class Test {
	public static void main(String[] args) {
		// student test
		Student s1 = new Student("Joy", "Alappuzha");
		s1.addCourseGrade("Java", 90);
		s1.addCourseGrade("Digital Electronics", 80);
		s1.printGrades();
		System.out.println("Avarage is " + s1.getAvarageGrade());
		// teacher test
		Teacher t1 = new Teacher("Lekha", "kochi");
		System.out.println(t1);
		String[] courses = { "Java", "Python", "C++", "Java" };
		for (String course : courses) {
			if (t1.addCourse(course)) {
				System.out.println(course + " added");
			} else {
				System.out.println(course + " cannot be added");
			}
		}
		for (String course : courses) {
			if (t1.removeCourse(course)) {
				System.out.println(course + " removed");
			} else {
				System.out.println(course + " Cannot be removed");
			}
		}
	}

}
