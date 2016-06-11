import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Testes {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		long tempo = Testes.adicionaNoFinal(arrayList);
		System.out.println("Adiciona no FINAL");
		System.out.println("ArrayList: " + tempo + " ms");
		tempo = Testes.adicionaNoFinal(linkedList);
		System.out.println("LinkedList: " + tempo + " ms");
		arrayList.clear();
		linkedList.clear();
		System.out.println("\nAdiciona no COMEÇO");
		tempo = Testes.adicionaNoComeco(arrayList);
		System.out.println("ArrayList: " + tempo + " ms");
		tempo = Testes.adicionaNoComeco(linkedList);
		System.out.println("LinkedList: " + tempo + " ms");
		arrayList.clear();
		linkedList.clear();
		System.out.println("\nGET");
		tempo = Testes.get(arrayList);
		System.out.println("ArrayList: " + tempo + " ms");
		tempo = Testes.get(linkedList);
		System.out.println("LinkedList: " + tempo + " ms");
		arrayList.clear();
		linkedList.clear();
		System.out.println("\nRemove do começo");
		tempo = Testes.removeDoComeco(arrayList);
		System.out.println("ArrayList: " + tempo + " ms");
		tempo = Testes.removeDoComeco(linkedList);
		System.out.println("LinkedList: " + tempo + " ms");
		arrayList.clear();
		linkedList.clear();
		System.out.println("\nRemove do final");
		tempo = Testes.removeDoFinal(arrayList);
		System.out.println("ArrayList: " + tempo + " ms");
		tempo = Testes.removeDoFinal(linkedList);
		System.out.println("LinkedList: " + tempo + " ms");
		arrayList.clear();
		HashSet hashSet = new HashSet();
		System.out.println("\nContains");
		tempo = Testes.contains(arrayList);
		System.out.println("ArrayList: " + tempo + " ms");
		tempo = Testes.contains(hashSet);
		System.out.println("HashSet: " + tempo + " ms");
		
		LinkedList<Integer> linkedListInteger = new LinkedList<Integer>();
		int size = 100000;
		for (int i = 0; i < size; i++) {
			linkedListInteger.add(i);
		}
		tempo = Testes.forTradicional(linkedListInteger);
		System.out.println("\nFor Tradicional: " + tempo + " ms");
		tempo = Testes.foreach(linkedListInteger);
		System.out.println("Foreach: " + tempo + " ms");
	}
	
	public static long adicionaNoFinal(List lista) {
		long inicio = System.currentTimeMillis();
		int size = 100000;
		for (int i = 0; i < size; i++) {
			lista.add(i);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
	public static long adicionaNoComeco(List lista) {
		long inicio = System.currentTimeMillis();
		int size = 100000;
		for (int i = 0; i < size; i++) {
			lista.add(0, i);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
	public static long get(List lista) {
		int size = 100000;
		for (int i = 0; i < size; i++) {
			lista.add(i);
		}
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			lista.get(i);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
	public static long removeDoComeco(List lista) {
		int size = 100000;
		for (int i = 0; i < size; i++) {
			lista.add(i);
		}
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			lista.remove(0);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
	public static long removeDoFinal(List lista) {
		int size = 100000;
		for (int i = 0; i < size; i++) {
			lista.add(i);
		}
		long inicio = System.currentTimeMillis();
		for (int i = size - 1; i >= 0; i--) {
			lista.remove(i);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
	public static long contains(Collection colecao) {
		int size = 100000;
		for (int i = 0; i < size; i++) {
			colecao.add(i);
		}
		long inicio = System.currentTimeMillis();
		for (int i = size - 1; i >= 0; i--) {
			colecao.contains(Integer.valueOf(i));
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
	public static long forTradicional(List<Integer> lista) {
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < lista.size(); i++) {
			int x = lista.get(i);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
	
	public static long foreach(List<Integer> lista) {
		long inicio = System.currentTimeMillis();
		for (int x : lista) {
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
}
