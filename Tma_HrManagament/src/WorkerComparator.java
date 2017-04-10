import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WorkerComparator{
	
	public static void sortWorkerByMoney(List<Worker> listWorker){
		Collections.sort(listWorker, new Comparator<Worker>() {

			@Override
			public int compare(Worker o1, Worker o2) {
				if(o1.MoneyPerHour() == o2.MoneyPerHour())
					return 0;
				else if(o1.MoneyPerHour() > o2.MoneyPerHour())
					return 1;
				else
					return -1;
			}
		});
	}

}
