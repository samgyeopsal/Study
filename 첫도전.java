public class Hello {
	public static int sum(int i, int j) {
		return i + j; // i�� j�� ���� ����
	}
	public static void main(String[] args) {
		int i;
		int j;
		char a;
		String b;
		final int TEN = 10;
		i = 1;
		j = sum(i, TEN);
		a = '?';
		b = "Hello";
		java.lang.System.out.print(a);
		System.out.print(b);
		System.out.print(TEN);
		System.out.print(j);
	}
}