import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Sampletest {
		
		@Test
		public void  simpleTest(){
			int a=1;
			int b=2;
			assertTrue(a+b==3);
		
	}
		
		@Test
		public void sampleTestfail() {
			int a = 2;
			int b=2;
			assertTrue(a+b == 4);
		}

}
