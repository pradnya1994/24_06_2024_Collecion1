package List;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(125,"Piyu"));
		students.add(new Student(124,"Siya"));
		students.add(new Student(123,"Raghav"));
		students.add(new Student(122,"Mukund"));
		students.add(new Student(121,"Pradnya"));

		for(Student student : students )
		{
			student.toString();
			System.out.println(student);
		}
	}

}
