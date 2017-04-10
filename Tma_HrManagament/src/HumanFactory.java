import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanFactory {
	
	private Human human;
	private List<Human> listHuman = new ArrayList<>();
	
	public HumanFactory(List<Human> listHuman){
		this.listHuman = listHuman;
	}
	
	public void sortHumanByName(){
		//Collections.sort(listHuman, new HumanComparator());
		HumanComparator.sortHumanByName(listHuman);
		for(int i=0; i< listHuman.size(); i++){
			if(listHuman.get(i) instanceof Student){
				System.out.println("\nStudent: ");
				System.out.print(listHuman.get(i));
			}else if(listHuman.get(i) instanceof Worker){
				System.out.println("\nWorker: ");
				System.out.println(listHuman.get(i));
			}
		}
	}

}
