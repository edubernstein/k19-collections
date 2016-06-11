public class ListaLigada<T> {
	private Item<T>	inicio;
	private int		tamanho;
	
	public ListaLigada() {
		tamanho = 0;
	}
	
	public void add(T i) {
		Item<T> it = new Item<T>();
		it.setValor(i);
		it.setProximo(inicio);
		inicio = it;
		tamanho++;
	}
	
	public T get(int pos) {
		if (pos > tamanho)
			return null;
		else {
			Item<T> aux = inicio;
			for (int i = 0; i < pos; i++)
				aux = aux.getProximo();
			return aux.getValor();
		}
		
	}
	
	public void remove(int pos) {
		if (pos <= tamanho) {
			Item<T> aux = inicio;
			for (int i = 0; i < pos - 1; i++)
				aux = aux.getProximo();
			Item<T> atual = aux;
			aux = aux.getProximo();
			atual.setProximo(aux.getProximo());
			tamanho--;
		}
	}
	
	public int size() {
		return tamanho;
	}
	
	public String toString() {
		String aux = null;
		if (inicio != null) {
			aux = inicio.getValor() + "";
		}
		Item<T> it = inicio.getProximo();
		while (it != null) {
			aux += " -> " + it.getValor();
			it = it.getProximo();
		}
		return aux;
	}
}
