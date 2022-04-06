package highPeak.com;

import java.util.Arrays;
import java.util.Scanner;

public class Goodies {
 static   Scanner in=new Scanner(System.in); 
 
 public static void  goodie_dilemma(int n) {
   int arr[]=new int[n];
    for(int i=0;i<n;i++) {
    System.out.println(i+1+" Enter The Prices:"); 
    arr[i]=in.nextInt(); 
    }
    // sort the arrays
     for(int i=0;i<=arr.length-1;i++) {
    for(int j=i+1;j<=arr.length-1;j++) {
     int temp=arr[i];
     if(arr[i]>arr[j]) {
      arr[i]=arr[j];
      arr[j]=temp;
     }
    }
   }
   System.out.println("Number Of The Employees:");
    int m=in.nextInt();
    // initially answer= maximum int value stored    
    int answer=1000000000;
    for(int i=0;i<=n-m;i++) {
     int min=arr[i];
     int max=arr[i+m-1];
     
     if((max-min)<answer) {
      answer=max-min;
     }
     }
    System.out.println("the difference between the chosen goodie with highest price and the lowest price is : "+answer);
   
 }

 public static void main(String[] args) {
  int count=1;
   while(count==1) {
  
    System.out.println("Enter The Size :"); 
    int n=in.nextInt();
    
    goodie_dilemma(n);
   System.out.println("\n\nagain test case execute for 1 or test case end for 2");
   count=in.nextInt();
   }
 }

}
