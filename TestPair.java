
public class TestPair {

	public static void main(String[] args) {
		Pair<Integer, String> p = new Pair<Integer, String>(23,"juan");
		Pair<Float, Long> q = new Pair<Float, Long>(23.2f, 21345l);
		System.out.println("p: "+ p.toString());
		System.out.println("q: "+ q.toString());
	}

}
