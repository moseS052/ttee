package ffff;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;

public class afaf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("숫자 입력");
		

		//변경된 값
		//아직 미완임 ox퀴즈 다음
//		int a=Integer.parseInt(s.nextLine());
//		String [] ar=new String [a];
//		for(int i=0;i<a;i++) {
//			ar[i]=s.nextLine();
//		}
//		int sum=0;
//		for(int i=0;i<ar.length;i++) {
//			String [] arr=ar[i].split(" ");
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
//			double b=(x/br[0]*1000)/1000;
//			System.out.println(b);
////			System.out.println(Math.round(b);
//			// 아직 미완
//		}
		
	}
}
	
		
		
		
















//ox퀴즈
//int a=Integer.parseInt(s.nextLine());
//String[] ar = new String[a];
//System.out.println("문자열 입력");
//for(int i=0;i<a;i++) {
//	ar[i]=s.nextLine();
//}
//for(int i=0;i<a;i++) {
//	int x=0,y=0;
//	String[] str=ar[i].split("");
//	for(int j=0;j<str.length;j++) {
//		if(str[j].equals("o")) {
//			x=x+1;
//		} else if(str[j].equals("x")) {
//			x=0;
//		}
//		y+=x;
//	}
//	System.out.println(y);
//}

//평균
//		int a=Integer.parseInt(s.nextLine());
//		float[] ar = new float[a];
//		System.out.println("점수 입력");
//		String[] str=s.nextLine().split(" ");
//		for(int i=0;i<ar.length;i++) {
//			ar[i]=Integer.parseInt(str[i]);
//		}
//		Arrays.sort(ar);
//		for(int i=0;i<ar.length;i++) {
//			ar[i]=ar[i]/ar[a-1]*100;
//		}
//		float sum=0;
//		for(int i=0;i<ar.length;i++) {
//			sum+=ar[i];
//		}
//		System.out.println(sum/a);

//나머지
//		String str=s.nextLine();
//		int[] ar=new int[10];
//		int i=0;
//		while(!str.equals("")) {
//			ar[i]=Integer.parseInt(str);
//			i++;
//			str=s.nextLine();
//		}
//		for(int j=0;j<ar.length;j++) {
//			ar[j]=ar[j]%42;
//		}
//		System.out.println(ar[0]+", "+ar[1]+", "+ar[2]);
//		Set<Integer> hashSet = new HashSet<>();
//		for(int loop : ar) {
//			hashSet.add(loop);
//		}
//		System.out.println(hashSet.size());

//숫자의 개수		int a=Integer.parseInt(s.nextLine());
//		int b=Integer.parseInt(s.nextLine());
//		int c=Integer.parseInt(s.nextLine());
//		a=a*b*c;
//		String d=a+"";
//		String[] e=d.split("");
//		int[] ar = new int[e.length];
//		for(int i=0;i<e.length;i++) {
//			ar[i]=Integer.parseInt(e[i]);
//		}
//		int k=0;
//		for(int i=0,j;i<10;i++) {
//			for(j=0;j<e.length;j++) {
//				if(ar[j]==i) {
//					k++;
//				}
//			}
//			System.out.println(i+","+k);
//			k=0;
//		}
//		
//		String a="1234";
//		String[] b=a.split("");
//		System.out.println(b[3]);


//String str=s.nextLine();
//int x=Integer.parseInt(str);
//System.out.println("숫자 입력");
//str=s.nextLine();
//int y=Integer.parseInt(str);
//int j=1;
//for(int i=2;!str.equals("");i++) {
//	y=Integer.parseInt(str);
//	if(x<y) {
//		int temp=x;
//		x=y;
//		y=temp;
//		j=i;
//	}
//	System.out.println("숫자 입력");
//	str=s.nextLine();
//}
//System.out.println(x+","+j);

//int i=Integer.parseInt(s.nextLine());
//int[] ar=new int[i];
//System.out.println("배열 입력");
//String str=s.nextLine();
//String[] ary=str.split(" ");
//for(int j=0;j<ary.length;j++) {
//	ar[j]=Integer.parseInt(ary[j]);
//}
//for(int j=0;j<ar.length;j++) {
//	for(int k=j+1;k<ar.length;k++) {
//		if(ar[j]>ar[k]){
//			int temp=ar[j];
//			ar[j]=ar[k];
//			ar[k]=temp;					
//		}
//	}
//}
//System.out.println("최솟값="+ar[0]+"최댓값="+ar[i-1]);
//


//int	x=Integer.parseInt(s.nextLine());
//if(x==0) {
//	System.out.println(1);
//	return;
//}
//int a=x/10,b=x%10,d,i,c=0;
//for(i=0;c!=x;i++) {
//	d=a+b;
//	d%=10;
//	c=b*10+d;
//	a=c/10;
//	b=c%10;
//}
//System.out.println(i);



//String a="*";
//String b=" ";
//String c="";
//int d=x;
//for(int i=0;i<d;i++,x--,c="") {
//	for(int j=1;j<x;j++) {
//		c=c+b;
//	}
//	for(int n=0;n<=i;n++) {
//		c=c+a;
//	}
//	System.out.println(c);			
//}

//Scanner s=new Scanner(System.in);
//System.out.println("숫자 입력");
//String	str=s.nextLine();
//int x =Integer.parseInt(str);
//int a=0;
//for( int i=1;i<=x;i++) {
//	a=a+i;
//}
//System.out.println(a);
		
//		String[] str=s.nextLine().split(" ");
//		int[] ar=new int[3];
//		for(int i=0;i<str.length;i++) {
//			ar[i]=Integer.parseInt(str[i]);
//		}
//		Arrays.sort(ar);
//		int x =ar[0];
//		int y =ar[1];
//		int z =ar[2];
//		if(x>6 || y>6 || z>6) {
//			System.out.println("잘못된 값");
//			return;
//		}
//		if(x==y && y==z) {
//			System.out.println(10000+x*1000);
//		} else if(x==y || y==z) {
//			System.out.println(1000+y*100);
//		}else {
//			System.out.println(z*100);
//		}
		
//Scanner s=new Scanner(System.in);
//System.out.println("시간 입력");
//String[] str=s.nextLine().split(" ");
//int x =Integer.parseInt(str[0]);
//int y =Integer.parseInt(str[1]);
//System.out.println("요리 시간");
//int z=Integer.parseInt(s.nextLine());
//if(x<=24 && y<=60) {
//	int a=y+z;
//	for(;a>=60;x++,a-=60) {	}
//	if(x>23) x-=24;
//	System.out.println(x+"시"+a+"분");
//} else System.out.println("잘못된 값");
		
//		String[] str=s.nextLine().split(",");
//		int x =Integer.parseInt(str[0]);
//		int y =Integer.parseInt(str[1]);
//		if(x!=0 && y!=0) {
//			if(x>0 && y>0) {
//				System.out.println("Quadrant 1");
//			}else if(x<0 && y>0) {
//				System.out.println("Quadrant 2");
//			} else if(x<0 && y<0) {
//				System.out.println("Quadrant 3");
//			} else System.out.println("Quadrant 4");
//		} else System.out.println("0은 x");
//		
		
//		int a=Integer.parseInt(s.nextLine());
//		
//		if (a%4==0) {
//			if(a%100==0) {
//				if(a%400==0) {
//					System.out.println(1);
//					return;
//				} else System.out.println(0); return;
//			}
//			System.out.println(1);
//		} else System.out.println(0);
		
		
		
		
		
/*		String a=s.nextLine();
		String[] b=a.split(" ");
		
		if (Integer.parseInt(b[0])>Integer.parseInt(b[1])) {
			System.out.println(">");
		} else if (Integer.parseInt(b[0])<Integer.parseInt(b[1])) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		*/
//		System.out.println(b[0]);
//		aa.add(a.split(" "));
//		System.out.println(a);
