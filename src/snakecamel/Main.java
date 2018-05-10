package snakecamel;

public class Main {
	public static void main(String[] args){
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String answer1=scu.snakeToCamelcase("abc__def");
		String answer2=scu.camelToSnakecase("AbcefDefGhi");
		String answer3=scu.capitalize("");
		
		System.out.println(answer1);
		System.out.println(answer2);
	   System.out.println(answer3);
	}

}
