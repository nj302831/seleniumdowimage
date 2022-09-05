import java.io.File;
import java.util.List;

//public class JavaParameter {
//public class  JavaParameter{
//			 
//		    // Function to change the value
//		    // of the parameters
//		    public static void Example(int x, int y)
//		    {
//		        x++;
//		        y++;
//		    }
//		
//		 
//		// Caller
//	
//		    public static void main(String[] args)
//		    {
//		 
//		        int a = 10;
//		        int b = 20;
//		 
//		        // Instance of class is created
//		        JavaParameter object = new JavaParameter();
//		 
//		        System.out.println("Value of a: " + a
//		                           + " & b: " + b);
//		 
//		        // Passing variables in the class function
//		        object.Example(a, b);
//		 
//		        // Displaying values after
//		        // calling the function
//		        System.out.println("Value of a: "
//		                           + a + " & b: " + b);
//		    }
//		}
//		

	
public class JavaParameter {

	public static void main(String[] args) {
		
//		String name = args[3];
//        System.out.println("The name of the user is: " +name);
	System.out.println("Number of Command Line Argument = "+args.length);
		
		for(int i = 0; i< args.length; i++) {
			System.out.println(String.format("Command Line Argument %d is %s", i, args[i]));
		}
	}

}

//...file path arguments

//public class JavaParameter {
//
//public static void main(String[] args) {
//
//    fileReader fr = new fileReader();
//    getList lists = new getList();
//
//
//    File CP_file = new File("C:/Users/XYZ/workspace/Customer_Product_info.txt");
//    int count = fr.fileSizeInLines(CP_file);
//    System.out.println("Total number of lines in the file are: "+count);
//
//    List<String> lines = fr.strReader(CP_file);
//
//}   ....
//
//}
//
//}
