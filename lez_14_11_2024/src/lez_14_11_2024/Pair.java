package lez_14_11_2024;

//classe generica, con due tipi generici
//coppia F, S
public class Pair<F,S> {
	private final F first;
	private final S second;

	public Pair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	public F getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}
}
