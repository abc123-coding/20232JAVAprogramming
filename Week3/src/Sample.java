public class Sample {
	int count = 10;
	static int num = 20;
	public int sum(int x, int y) {
		return x+y;
	}
	static int mul(int x, int y) {
		return x*y;
	}
	public static void main(String[] args) {
		int same;
		Sample sample = new Sample();
		same = sample.count; 
		System.out.println("same: " + same);
		same = num;
		System.out.println("same: " + same);
		same = sample.sum(5,5);
		System.out.println("same: " + same);
		same = mul(5,5);
		System.out.println("same: " + same);

	}

}
