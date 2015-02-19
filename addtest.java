package lab1;



import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class addtest {
	@Test
public void testAdd() {
		
		int  x, d;
		matrix m = new matrix();
		   List<int[][]> list = new ArrayList<int[][]>(); 
		 list =  m.readFile();
		 int temp[][];
         
			 
			 int matrix[][]=list.get(0);
			 
          int r = matrix.length;
          	int c = matrix[0].length;
           int matrix1[][]=list.get(1);
           int rt1 = matrix1.length;
          
           
           int ct1 = matrix1[0].length;
          
           int matrix2[][]=list.get(2);
           int rt2 = matrix2.length;
           int ct2 = matrix2[0].length;
           int result[][] = null;
        
          list.size();
          
          
          
 
          temp = m.add(list.get(0),list.get(1),r,rt1,c,ct1);
          if(temp != null){
        	  
        	  result = m.add(temp,matrix2,r,rt2,ct1,ct2);
        	  
          }
         
		  for ( x = 0 ; x < r ; x++ ) {
	            for ( d = 0 ; d < c ; d++ ){
	               System.out.print(result[x][d]+"\t");
	 
         } 
          
		 }
		
		
		
	
	
	
	}

}