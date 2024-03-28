package workingWithDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingInDataProvider {
       @DataProvider(name = "testData")
       public String[][] getData(){
    	   String[][] data = new String[2][5];
    	   data[0][0] = "Apoorva";
    	   data[0][1] = "Mangalor";
    	   data[0][2] = "apoorva@gmail.com";
    	   data[0][3] = "123abc";
    	   data[0][4] = "123abc5";
    	   
    	   data[1][0] = "Mangalore";
    	   data[1][1] = "Apoorva";
    	   data[1][2] = "apoorva.c@gmail.com";
    	   data[1][3] = "apoorvaABC";
    	   data[1][4] = "apoorvacdf";
    	   
    	   return data;
     			   
       }
      @Test(dataProvider = "testData")
       public void dataDemo(String Firstname, String Lastname, String emailId, String pwd, String confirmPwd)
       {
    	   System.out.println(Firstname);
    	   System.out.println(Lastname);
    	   System.out.println(emailId);
    	   System.out.println(pwd);
    	   System.out.println(confirmPwd);
       }  
       
      // @Test(dataProvider = "testData")
      // public void dataDemo(String )
}
