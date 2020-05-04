package JavaPrograms.Programs;



public class Test2{
	public static void main(String[] args) {
		String helloWorld="This";
		System.out.println("Length: "+stringLength(helloWorld));
	}	
	
	static int stringLength(String s) {
		char[] c = s.toCharArray();
		for (int i = 0;; i++) {
			try {
			System.out.println(c[i]);
			} catch (Exception e) {
				return i;
			}
		}
	}
}