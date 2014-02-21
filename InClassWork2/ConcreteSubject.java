import java.util.ArrayList;


public class ConcreteSubject implements SubjectEx {
	
	ArrayList observers;


	
	public ConcreteSubject(){
		observers = new ArrayList();

	
	}
	
	
	public void addObserver(String ob){	
			observers.add(ob);			
	}
	
	public void removeObserver(String ob){
		int i = observers.indexOf(ob);
		if (i >= 0) {
			observers.remove(ob);
		}	
	}
	
	public void notifyObserver(){
		for (int i = 0; i < observers.size(); i++) {
			ObserverEx observer = (ObserverEx)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}

		
	}
	
	public void update(){
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
