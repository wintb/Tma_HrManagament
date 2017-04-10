import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HrManagementTest {
	
	
	private static void sortStudentByGrade(List<Student> listStudent){
		StudentComparator.sortStudentByGrade(listStudent);
		if(listStudent != null){
			for(int i=0; i< listStudent.size(); i++){
				System.out.println("Student " + (i+1) + ": ");
				System.out.println(listStudent.get(i));
			}
		}
	}
	
	private static void sortWorkerByMoney(List<Worker> listWorker){
		WorkerComparator.sortWorkerByMoney(listWorker);
		if(listWorker != null){
			for(int i=0; i< listWorker.size(); i++){
				System.out.println("Worker " + (i+1) + ": ");
				System.out.println(listWorker.get(i));
			}
		}
	}
	
	public static void main(String[] args){
		
		List<Student> listStudent = new ArrayList<>();
		List<Worker> listWorker = new ArrayList<>();
		
		List<Human> listHuman = new ArrayList<>();
		
		Student student1 = new Student("A","Nguyen" , 7);
		Student student2 = new Student("B","Nguyen", 3);
		Student student3 = new Student("C","Nguyen" , 5);
		Student student4 = new Student("D","Nguyen" , 6);
		Student student5 = new Student("E","Nguyen" , 9);
		Student student6 = new Student("F","Nguyen" , 8);
		Student student7 = new Student("G","Nguyen" , 2);
		Student student8 = new Student("H","Nguyen" , 1);
		Student student9 = new Student("I","Nguyen" , 7);
		Student student10 = new Student("K","Nguyen", 9);
		
		Worker worker1 = new Worker("L","Nguyen", 5000, 8);
		Worker worker2 = new Worker("M","Nguyen", 6000, 8);
		Worker worker3 = new Worker("N","Nguyen", 4000, 8);
		Worker worker4 = new Worker("O","Nguyen", 9000, 8);
		Worker worker5 = new Worker("P","Nguyen", 1000, 8);
		Worker worker6 = new Worker("K","Nguyen", 8000, 8);
		Worker worker7 = new Worker("R","Nguyen", 7000, 8);
		Worker worker8 = new Worker("S","Nguyen", 10000, 8);
		Worker worker9 = new Worker("T","Nguyen", 2000, 8);
		Worker worker10 = new Worker("U","Nguyen", 11000, 8);
		
		listStudent.add(student1);
		listStudent.add(student2);
		listStudent.add(student3);
		listStudent.add(student4);
		listStudent.add(student5);
		listStudent.add(student6);
		listStudent.add(student7);
		listStudent.add(student8);
		listStudent.add(student9);
		listStudent.add(student10);
		
		listWorker.add(worker1);
		listWorker.add(worker2);
		listWorker.add(worker3);
		listWorker.add(worker4);
		listWorker.add(worker5);
		listWorker.add(worker6);
		listWorker.add(worker7);
		listWorker.add(worker8);
		listWorker.add(worker9);
		listWorker.add(worker10);
		
		//sortStudentByGrade(listStudent);
		//sortWorkerByMoney(listWorker);
		
		listHuman.addAll(listWorker);
		listHuman.addAll(listStudent);
		
		HumanFactory humanFactory = new HumanFactory(listHuman);
		humanFactory.sortHumanByName();
		
		
	}

}
