public class main {
	public static void main(String[] args) {
		RunkaiList testList = new RunkaiList();

		testList.add(0);
		testList.add(3, 2);
		testList.add(5, 3);
		testList.add(91, 4);
		testList.remove(2);
		System.out.println(testList.size());
		// The link is now broken.
		System.out.println(testList.get(2));
	}
}