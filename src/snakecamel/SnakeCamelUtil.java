package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<words.length;i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			
			if (Character.isUpperCase(c)) {
				if (sb.length() > 0) {
					sb.append("_");
				}
				j = i;
			}
			sb.append(Character.toLowerCase(c));
		}
		return new String(sb);
	}
	
	static String capitalize(String s) {
		if(s.length()!=0){
			char first;
		first=s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		System.out.println("aa");
		return upperFirst + rest;
		
		}
		return "";
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
	public static void main(String[] args){
		String answer1=snakeToCamelcase("abc__def__gh");
		String answer2=camelToSnakecase("AbcefDefGhi");
		//String answer3=capitalize("");
		
		System.out.println(answer1);
		System.out.println(answer2);
	   //System.out.println(answer3);
	    
	    
		
		
	}
	
	
}
