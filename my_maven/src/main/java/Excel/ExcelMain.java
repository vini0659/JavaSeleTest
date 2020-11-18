package Excel;

import java.io.IOException;

public class ExcelMain {
	

	public static void main(String[] args) throws IOException 
	{
	 Excel ex = new Excel();
	 
	 for(int i = 0; i< ex.rowSize(); i++)
	 {
		 for (int j = 0; j<2; j++)
		 {
			 String s = ex.readData(i, j);
			 System.out.println("Value of Cell :" +s);
		 }
	 }

	}

}
