import test.testModel.*;
import test.*;

public class TestDriver {

	public static void main (String[] args) {
		Test t = new TestUser ();
		try {
			//t.testAndGenerate ("model/testUser2.txt", 2);
			t.testAndGenerate ("model/testUser4.txt", 4);
		} catch (Exception e) {
			e.printStackTrace ();
		}
	}

}