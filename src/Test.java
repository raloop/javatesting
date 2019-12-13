import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList<String> names = new LinkedList<String>();
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		ListIterator<String> it = names.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (String s : names) {
			System.out.println(s);
		}
		
		names.add(2, "Susan");
		
		for (String s : names) {
			System.out.println("The names is " + s);
		}
	}
}
