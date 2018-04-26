package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("-");
		StringBuilder sb = new StringBuilder();
		for (String word: words) {
			sb.append(capitalize(word));
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
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	public static void main(String[] args){
		String answer1=snakeToCamelcase("abc-def-ghi");
		String answer2=camelToSnakecase("AbcDefGhi");
		
		System.out.println(answer1);
		System.out.println(answer2);
		
	}
	
}
