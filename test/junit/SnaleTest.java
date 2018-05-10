package junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnaleTest {

	@Test
		public void snakeToCamelcaseでスネークをキャメルに(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected="AbcDefGhi";
		String actual=scu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expected));
	}
	@Test
	public void  camelToSnakecaseでキャメルをスネークに(){
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected="abc_def_ghi";
	String actual=scu.camelToSnakecase("AbcDefGhi");
	assertThat(actual,is(expected));
}
	@Test
	public void capitalizeで先頭を大文字に(){
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected="A";
	String actual=scu.snakeToCamelcase("a");
	assertThat(actual,is(expected));
}

}
