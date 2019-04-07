package eu.noelvaes.hello;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class AppTest{
	@Test
	public final void testSayHello(){
		App app = new App();
		String text = app.sayHello();
		assertEquals("Hello World", text);
	}
}