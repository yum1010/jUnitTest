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
		String actual=scu.snakeToCamelcase("abc-def-ghi");
		assertThat(actual,is(expected));
	}
	@Test
	public void  camelToSnakecaseでキャメルをスネークに(){
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected="abc-def-ghi";
	String actual=scu.camelToSnakecase("AbcDefGhi");
	assertThat(actual,is(expected));
}

}
