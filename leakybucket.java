package program7;
import java.util.*;
public class prg7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,size,opr,nop,temp=0;
		int[] datarate=new int[100];
		System.out.println("Enter the bucket size:");
		size=sc.nextInt();
		System.out.println("Enter the number of packets:");
		nop=sc.nextInt();
		System.out.println("Enter the data rate:");
		for(i=0;i<nop;i++)
			datarate[i]=sc.nextInt();
		System.out.println("Enter the output rate:");
		opr=sc.nextInt();
		for(i=0;i<nop;i++)
		{
			if(datarate[i]>size)
				System.out.println("bucket Overflow");
			else
			{
				temp=datarate[i];
				while(temp>opr)
				{
					System.out.println("Packet transmission "+opr);
					temp=temp-opr;
				}
				System.out.println("Packet Transmission "+temp);
			}
		}
	}
}


