package lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class matrix {

	static ArrayList<int[][]> matrixx = new ArrayList<int[][]>();
	public static List<int[][]> readFile(){
		BufferedReader breader = null;
		 
		try {
 
			String line;
 
			breader = new BufferedReader(new FileReader("/Users/asadqureshi/Documents/test.txt"));
		
			
			while ((line = breader.readLine()) != null) {
				//System.out.println(line);
				 int rows= 0, columns = 0;
					int[][] mat = new int[100][100];
					
				 StringTokenizer tokenizer = new StringTokenizer(line, ";");
		            while (tokenizer.hasMoreElements()) {
		            	columns =0;
		            	//int element = Integer.parseInt(tokenizer.nextToken());
		            	String element = tokenizer.nextToken();
		                //System.out.println(element);
		                
		             
		                
		                StringTokenizer tokenizer2 = new StringTokenizer(element, " "); 
		                while (tokenizer2.hasMoreElements()) {
		                
		            	
		                int element2 = Integer.parseInt(tokenizer2.nextToken());
		                //System.out.println(element2);
		          
		    	      
							
						
							mat[rows][columns] = element2;
							
						
							columns++;
							}
		                rows++;
		                

			}
		           
		         
		            
		      int[][] matrix  = new int[rows][columns];      
		            for(int i = 0; i <rows; i++) {           
			                for (int j = 0; j <columns; j++) {    
			                	matrix[i][j]= mat[i][j];
			                	System.out.println(matrix[i][j]);
			                	
			                }  
		            }
		            matrixx.add(matrix);  
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (breader != null)breader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return matrixx;
 
	}



		
 int[][] add(int matrix1[][], int matrix2[][],int row1,int row2,int col1,int col2){
			
			int  sum = 0;
			int a,b ;
			 
		      Scanner in = new Scanner(System.in);
		      
		     
			
		      if ( row1 != row2 && col1 != col2   ){
		    	  System.out.println("Matrice Orders are wrong. ");
		    	  return null;
		      }else{
		      
		 	 
		      int result[][] = new int[row1][col1];
		      
		      for ( a = 0 ; a < row2 ; a++ )
		            for ( b = 0 ; b < col2 ; b++ )
		               result[a][b] = matrix1[a][b] + matrix2[a][b];
		      
		      
		      
		      return result;
		      
		      }
		      
		      
		      
		      
		      
		}
		
		
		
 int[][] subtract(int matrix1[][], int matrix2[][],int row1,int row2,int col1,int col2){
		
		int  sum = 0;
		int a,b ;
		 
	      Scanner in = new Scanner(System.in);
	      
	     
		
	      if ( row1 != row2 && col1 != col2   ){
	    	  System.out.println("Matrice Orders are wrong. ");
	    	  return null;
	      }else{
	      
	 	 
	      int result[][] = new int[row1][col1];
	      
	      for ( a = 0 ; a < row2 ; a++ )
	            for ( b = 0 ; b < col2 ; b++ )
	               result[a][b] = matrix1[a][b] - matrix2[a][b];
	      
	      
	      
	      return result;
	      
	      }
	      
	      
	      
	      
	      
	}
 
 
 int[][] multiply(int matrix1[][], int matrix2[][],int row1,int row2,int col1,int col2){
	 int  sum = 0;
	 int c, d, k;

      if ( col1 != row2 )
          System.out.println("Matrices cannot be multiplied");
      else{ 
         	 int result[][] = new int[row1][col2];
 

         for ( c = 0 ; c < row1 ; c++ )    {
            for ( d = 0 ; d < col2 ; d++ ){   
               for ( k = 0 ; k < row2 ; k++ )
               {
                  sum = sum + matrix1[c][k] * matrix2[k][d];
               }
               result[c][d] = sum;
               sum = 0;
          
            } }
 
         	return result;
   	}
	return null;
	
}
	
 

 
 
 
 
}
		
	