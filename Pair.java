
public class Pair<A,B> {
	protected A x;
	protected B y;
	public Pair(A x,B y) {
		this.x = x;
		this.y = y;
	}
	public A getX() {
		return x;
	}
	public B getY() {
		return y;
	}
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
}
