import test.testModel.*;
import test.*;

public class TestDriver {
	
	public static void main (String[] args) {
		Test t = new TestUser ();
		try {
			t.testAndGenerate ("../logs/test/model/testUser.txt");
		} catch (Exception e) {
			e.printStackTrace ();
		}
	}
	
}