import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TemaLL {

	public static void main(String[] args) {

		LinkedList<String> lista1 = new LinkedList<String>();

		Scanner input = new Scanner(System.in);
		String sir = input.next();
		lista1.add(sir);
		while (!lista1.getLast().equals("stop")) {
			sir = input.next();
			lista1.add(sir);
		}

		LinkedList<String> lista2 = new LinkedList<String>();

		Iterator<String> it = lista1.iterator();
		while (it.hasNext()) {
			String elem = it.next();
			Iterator<String> it2 = lista2.iterator();
			boolean dublura = false;
			while (it2.hasNext()) {
				if (elem.equals(it2.next()))
					dublura = true;
			}
			if (dublura == false)
				lista2.add(elem);
		}
		lista1.removeLast();
		lista2.removeLast();
		System.out.println(lista1);
		System.out.println(lista2);

	}
}
