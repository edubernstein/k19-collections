public class TestaListaLigada {
	
	public static void main(String[] args) {
		System.out.println("INTEGER");
		ListaLigada<Integer> l1 = new ListaLigada<Integer>();
		l1.add(99);
		l1.add(-10);
		l1.add(50);
		l1.add(44);
		l1.add(8);
		System.out.println(l1);
		System.out.println(l1.get(3));
		l1.remove(3);
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println("\nSTRING");
		ListaLigada<String> l2 = new ListaLigada<String>();
		l2.add("alpha");
		l2.add("beta");
		l2.add("gama");
		l2.add("delta");
		l2.add("epsilon");
		System.out.println(l2);
		System.out.println(l2.get(1));
		l2.remove(1);
		System.out.println(l2);
		System.out.println(l2.size());
	}
	
}
