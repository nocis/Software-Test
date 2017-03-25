
package Test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
	
	public String[] num = new String[120];
	public String[] name = new String[120];
	public String[] add = new String[120];
	public String[] pwd = new String[120];
	

	public void read (){		  
		  int idx = 0;
		  File csv = new File("D:\\java\\workplace\\seleniumTest\\bin\\Test1\\inputgit.csv");
		  BufferedReader br = null;
		  try
		  {
		      br = new BufferedReader(new FileReader(csv));
		  } catch (FileNotFoundException e)
		  {
		      e.printStackTrace();
		  }
		  String line = "";
		  String[] everyLine = new String[3];
	      try {
	    	  line = br.readLine();
	          while ((line = br.readLine()) != null)
	          {
		          everyLine =line.split(",");
		          num[idx] = everyLine[0];
		          name[idx] = everyLine[1];
		          add[idx] = everyLine[2];
		          pwd[idx] = num[idx].substring(4);
		          
		          idx++;
		      }
		  } catch (IOException e)
		  {
		      e.printStackTrace();
		  }  
		  
	}
	
}
