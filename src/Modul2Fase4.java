import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Modul2Fase4 {

	public static void main(String[] args) {
		
		

		ArrayList<Character> nom = new ArrayList <Character>();
		nom.add('L');
		nom.add('l');
		nom.add('u');
		nom.add('i');
		nom.add('s');
		nom.add('1');
		System.out.println("Total de caràcters al ArrayList son : "+nom.size());
		System.out.println(nom);
		Iterator<Character> buscador= nom.iterator();
		while (buscador.hasNext())
		{
			Character lletra = buscador.next();
			if (lletra.equals('a')||lletra.equals('e')|| lletra.equals('i')||lletra.equals('o')
					||lletra.equals('u')) {
				System.out.println("Vocal");}
				else if (lletra.equals('1')||lletra.equals('2')||lletra.equals('3')||lletra.equals('4')||
							lletra.equals('5')||lletra.equals('6')||lletra.equals('7')||lletra.equals('8')||
							lletra.equals('9')||lletra.equals('0')) {
						System.out.println("Els noms no  tenen números");}
				else	
			
			{
				System.out.println("Consonant");
	
			}
		}
		HashMap <Integer,Character> name = new HashMap <Integer, Character> ();
		for(int i=0;i<nom.size();i++) {
		
		name.put(i,nom.get(i));
	}
		
		System.out.print("El nom és:     "+name.values());
		System.out.println("");
		System.out.print("Els index son: "+name.keySet());
		
		HashMap <Integer,Character> surname = new HashMap <Integer, Character> ();
		surname.put(101, 'G');
		surname.put(102, 'u');
		surname.put(103, 't');
		surname.put(104, 'i');
		surname.put(105, 'e');
		surname.put(106, 'r');
		surname.put(107, 'r');
		surname.put(108, 'e');
		surname.put(109, 'z');
		HashMap<Integer,Character> fullName=new HashMap <Integer,Character>();
		fullName.putAll(name);
		fullName.putAll(surname);
		int contador=name.size()-1;
		char Espai=(' ');
		fullName.put(contador,Espai);
		System.out.println("");
		System.out.println(fullName.values());
		
		
	}



}
	


