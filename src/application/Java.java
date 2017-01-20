package application;

import java.util.LinkedList;
import java.util.List;

public class Java {
	
	 private List<String> parole = new LinkedList<>();
	
	 public void aggiungi(String p){
		 if(!parole.contains(p)){
		     parole.add(p);
	     }
	 }

	public List<String> getParole() {
		System.out.println(parole);
		return parole;
	}

	public void setParole(List<String> parole) {
		this.parole = parole;
	}
	 
	public int contaTutteLettere(){   //ok
		int num=-1;
		for(String s : parole){
			num += s.length();
		}
		System.out.println(num);
		return num;
	}
	
	public int numeroOccorrenze(char lettera){    //ok 
		int occ = 0;
		for(String p : parole){
			for(int i =0; i< p.length(); i++){
				if(p.charAt(i)==lettera)
					occ++;
			}
		}
		System.out.println(occ);
		return occ;
	}
	
	
	
	
	
	
	public int altro (){   //ok
		String str ="a, b, c, c, c, c, d";
		int numberOfC= countCharOccurrences(str, 'c');
		return numberOfC;
	}
	
	 private int countCharOccurrences(String str, char c) {  //ok
		 int tot =0;
		for(int i =0; i<str.length(); i++){
			if(str.charAt(i)== c){
				tot++;
			}
		}
		System.out.println(tot);
		return tot;
	}


	public static void main(String [] args){
		 Java j = new Java();
		 
		 String p1 ="casa"; 
		 String p2 ="sasso";
		 String p3 ="lupo";
		 String p4 ="cane";
		 String p5 ="luna";
		 
		 j.aggiungi(p1);
		 j.aggiungi(p2);
		 j.aggiungi(p3);
		 j.aggiungi(p4);
		 j.aggiungi(p5);
		 
		 j.getParole();
		 j.contaTutteLettere();
		 j.numeroOccorrenze('a');
		// j.countCharOccurrences("a, c, c, c, c", 'c');
	 }
}
