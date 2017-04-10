import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HumanComparator{
	
	public static void sortHumanByName(List<Human> listHuman){
		Collections.sort(listHuman, new Comparator<Human>() {

			@Override
			public int compare(Human o1, Human o2) {
				int FirstNameCompare = o1.FirstName.compareTo(o2.FirstName);
				if(FirstNameCompare != 0)
					return FirstNameCompare;
				else
					return o1.LastName.compareTo(o2.LastName);
			}
		});
	}

}
