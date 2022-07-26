package ffff;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	//한수
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=Integer.parseInt(s.nextLine());
		System.out.println(getResult(a));
	}
	public static int getResult(int n) {
		int sum=0;
		if(n==1000) n=999;
		if(n<100) {
			sum=n;
			return sum;
		}else {
			sum=99;
			for(int i=100;i<=n;i++) {
				int a=i%10;
				int b=i/10%10;
				int c=i/100%10;
				if(a-b==b-c) sum++;
			}
			return sum;
		}
	}
}







//셀프넘버
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		ArrayList<Integer> ar=new ArrayList<Integer>();
//		for(int i=1;i<10000;i++) {
//			list.add(i);
//			ar.add(d(i));
//		}
//		list.removeAll(ar);
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//	}
//
//	public static int d(int n) {
//		int sum=n;
//		while(n!=0) {
//			sum+=n%10;
//			n/=10;
//		}
//		return sum;
//	} 
		

	//평균은 넘겠지
//		Scanner s=new Scanner(System.in);
//		int a=Integer.parseInt(s.nextLine());
//		String [] ar=new String [a];
//		for(int i=0;i<a;i++) {
//			ar[i]=s.nextLine();
//		}
//		for(int i=0;i<ar.length;i++) {
//			int sum=0;
//			String [] arr=ar[i].split(" ");
//			
//			int[] br=new int[arr.length];
//			for(int m=0;m<arr.length;m++) {
//				br[m]=Integer.parseInt(arr[m]);
//			}
//			for(int k=1;k<br.length;k++) {
//				sum+=br[k];
//			}
//			float ave=sum/br[0];
//			double x=0;
//			for(int j=1;j<br.length;j++) {
//				if(br[j]>ave) {
//					x++;
//				}
//			}
//			double b=(float) (x/br[0]*100);
//			System.out.println(String.format("%.3f", b)+"%");
//		}
//	}
		
		


//		//ox퀴즈
//		Scanner s=new Scanner(System.in);
////		System.out.println("숫자 입력");
//		int a=Integer.parseInt(s.nextLine());
//		String[] ar = new String[a];
////		System.out.println("문자열 입력");
//		for(int i=0;i<a;i++) {
//			ar[i]=s.nextLine();
//		}
//		for(int i=0;i<a;i++) {
//			int x=0,y=0;
//			String[] str=ar[i].split("");
//			for(int j=0;j<str.length;j++) {
//				if(str[j].equals("o")) {
//					x=x+1;
//				} else if(str[j].equals("x")) {
//					x=0;
//				}
//				y+=x;
//			}
//			System.out.println(y);
//		}
//
//	}