import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparator{

	public static void sortStudentByGrade(List<Student> listStudent){
		Collections.sort(listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getGrade() == o2.getGrade())
					return 0;
				else if(o1.getGrade() > o2.getGrade())
					return 1;
				else
					return -1;
			}
		});
	}

}
