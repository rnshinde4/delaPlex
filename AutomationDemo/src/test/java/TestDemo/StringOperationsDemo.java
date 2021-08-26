package TestDemo;

public class StringOperationsDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "I Love India";
		String str2 = "          India";
		String[] array = str1.split(" ");
		for(String str: array) {
			if(str.equals("Love")) {
				System.out.println("Love String found");
			}
			else{
				System.out.println("Love String not found");
			}
		}
		
		System.out.println(str1.toUpperCase());
		
		char[] chArray = str2.toCharArray();
		for(int i=0;i<chArray.length;i++) {
			System.out.print(chArray[i]+" ");
		}
		
		System.out.println(str2);
		System.out.println(str2.trim());

		int value = 30;
		String str3 = String.valueOf(value);
		System.out.println(str3+10);
		
	}

}
