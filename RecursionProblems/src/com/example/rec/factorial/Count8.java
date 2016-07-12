/*
 *Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 
 */
package com.example.rec.factorial;

public class Count8 {
	
	public int count8(int n) {
		  if(n==8)
				    return 1;
				if(n == 0)
					return 0;
				 if(n%10 == 8)
				  {int num=n;
				    if((num/10)%10 == 8)
				    {
				      return 2+count8(n/10);
				    }
				    else{
				      return 1+count8(n/10);
				    }
				  }
				  else 
				    return count8(n/10);
		}
	public static void main(String[] args)
	{
		Count8 count8 = new Count8();
		System.out.println("count:\t"+count8.count8(898));
	}

}
