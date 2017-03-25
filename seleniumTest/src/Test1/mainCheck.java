package Test1;

public class mainCheck {
	
	public static void main(String args[]) { 
		readFile readFile = new readFile();
		readFile.read();
		
		NumTest ntest = new NumTest();
		try {			
			for (int idx = 0; idx < readFile.num.length;idx++ )
			{
				System.out.println(idx);
				ntest.setUp();
				ntest.testNum(readFile.num[idx], readFile.pwd[idx]);
				if (!ntest.add.equals(readFile.add[idx]) )
					System.out.println(readFile.num[idx]+"wrong!");
				else 
					System.out.println(readFile.num[idx]+"right!");
				ntest.tearDown();
			}	
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
