package assignment5;

public class Teacher extends Person {
	int numCourses;
	String[] courses = {};
	final int maxCourse = 5;

	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[maxCourse];
	}

	public String toString() {
		return "Teacher : " + super.toString();
	}

	public boolean addCourse(String course) {
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				return false;
			}
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}

	public boolean removeCourse(String course) {
		boolean found = false;
		int courseIndex = -1;
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courseIndex = i;
				found = true;
				break;
			}
		}
		if (found) {
			for (int i = courseIndex; i < numCourses; i++) {
				courses[i] = courses[i + 1];
			}
			numCourses--;
			return true;
		} else {
			return false;
		}
	}

}
