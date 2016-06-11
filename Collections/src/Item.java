public class Item<T> {
	private T		valor;
	private Item<T>	proximo;
	
	public T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public Item<T> getProximo() {
		return proximo;
	}
	
	public void setProximo(Item<T> proximo) {
		this.proximo = proximo;
	}
}
