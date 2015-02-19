package lab1;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;


public class multiply {

	@Test
	public multiply(){
	  matrix m = new matrix();
	   
	   m.readFile();
	   int s[][]=matrixx.get(0);
    int r = s.length;
    int c = s[0].length;
    int s1[][]=matrixx.get(1);
    int rt1 = s1.length;
    int ct1 = s1[0].length;
	   int l,d;
    int result[][]  = m.add(s, s1, r, rt1, c, ct1);
	   
	   for ( l = 0 ; l < r ; l++ )
    {
       for ( d = 0 ; d < c ; d++ )
          System.out.print(result[l][d]+"\t");

       System.out.print("\n");
    } 
 
	 
	   
	   //m.multiply();
}
}