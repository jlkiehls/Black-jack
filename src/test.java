
public class test {
	
	public static void main(String[] args) {
		
		String str = "%_'%\\%";
		
		str = str.replaceAll("%", "\\\\%");
		/*str = str.replaceAll("\\", "\\\\");*/
		
		System.out.println(str);
	}
}
