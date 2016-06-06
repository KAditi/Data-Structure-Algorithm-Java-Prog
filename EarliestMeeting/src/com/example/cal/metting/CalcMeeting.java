package com.example.cal.metting;

public class CalcMeeting {
	
	int[][] A,B;
	int duration;
	
	public void calMeeting()
	{
		A = new int[][]{{1,15},{25,50}};
		B = new int[][]{{10,100}};
		duration = 20;
		//int i=0,j=0;
		int startTime=0;
		for(int j=0;j<B.length;j++)
		{
			for(int i=0;i<A.length;i++){
			if(A[i][0]<B[j][0])
			{
				System.out.println(""+(A[i][1]-A[i][0]));
				if((A[i][1]-A[i][0])>= duration)
				{
					startTime = A[i][0];
					break;
				}
				else
					i++;
				
				
			}
			else
			{
				if(B[j][1]-B[j][0]>=duration)
				{
					startTime = B[j][0];
					break;
				}
				
			}
		}
		}
		System.out.println("Start Time:\t"+startTime);
		
		
	}
	public static void main(String[] args) {
		
		CalcMeeting object = new CalcMeeting();
		object.calMeeting();
	}

}
