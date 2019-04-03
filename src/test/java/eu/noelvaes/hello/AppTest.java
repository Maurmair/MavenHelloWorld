package eu.noelvaes.hello;

import static org.junit.Assert.*;
import org.junit.*;

public class AppTest{
	@Test
	public final void testSayHello(){
		App app = new App();
		String text = app.sayHello();
		Assertions.assertEquals("Hello World", text);
	}
}