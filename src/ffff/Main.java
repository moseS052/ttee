package ffff;

//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//다이얼
		Scanner s=new Scanner(System.in);
		String[] str=s.nextLine().toUpperCase().split("");
		int[] ar=new int[str.length];
		int sum=0;
		for(int i=0;i<str.length;i++) {
			char ch=str[i].charAt(0);
			ar[i]=ch;
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<=79 || (ar[i]>=84 && ar[i]<=85) ) {
				sum+=(ar[i]+1)/3-19;
			}else if(ar[i]==86) {
				sum+=9;
			}else if(ar[i]>=87) {
				sum+=10;
			}else {
				sum+=8;
			}
		}
		System.out.println(sum);
	}
}






//상수
//		Scanner s=new Scanner(System.in);
//		String[] str=s.nextLine().split(" ");
//		int[] ar=new int[3];
//		int x=0,y=0;
//		for(int i=0;i<str.length;i++) {
//			String[] strr=str[i].split("");
//			for(int j=0;j<strr.length;j++) {
//				ar[strr.length-1-j]=Integer.parseInt(strr[j]);
//			}
//			if(i==0) x=ar[0]*100+ar[1]*10+ar[2];
//			if(i==1) y=ar[0]*100+ar[1]*10+ar[2];
//		}
//		if(x>y) {
//			System.out.println(x);
//		}else System.out.println(y);

//단어의 개수
//Scanner s=new Scanner(System.in);
//String str1=s.nextLine().strip();
//String[] str=str1.split(" ");
//if(str[0].equals("")) {
//	System.out.println(0);
//}else System.out.println(str.length);

////단어 공부
//Scanner s=new Scanner(System.in);
//String[] str=s.nextLine().toUpperCase().split("");
//ArrayList<Integer> al=new ArrayList<Integer>();
//Map<String, Integer> map = new HashMap<String, Integer>();
//for(int i=0;i<str.length;i++) {
//	int n=0;
//	int h=1;
//	for(int j=0;j<al.size();j++) {
//		if(al.get(j)==i) {
//			n=1;
//			break;
//		}
//	}
//	if(n==1) continue;
//	for(int k=0;k<str.length;k++) {
//		if(str[i].equals(str[k])) {
//			map.put(str[i],h++);
//			al.add(k);
//		}
//	}
//}
//int maxs=Collections.max(map.values());
//ArrayList<String> ku=new ArrayList<String>();
//for (String key : map.keySet()) {
//	if (map.get(key)==maxs) {
//		ku.add(key);
//	}
//	
//}
//if(ku.size()>1) {
//	System.out.println("?");
//}else System.out.println(ku.get(0));


//문자열 반복
//		Scanner s=new Scanner(System.in);
//		int a=Integer.parseInt(s.nextLine());
//		String[] ar=new String[a];
//		for(int i=0;i<a;i++) {
//			ar[i]="";
//			String[] arr=s.nextLine().split(" ");
//			int j=Integer.parseInt(arr[0]);
//			String[] ar2=arr[1].split("");
//			for(int l=0;l<ar2.length;l++) {
//				for(int k=0;k<j;k++) {
//					ar[i]+=ar2[l];
//				}
//			}
//		}
//		for(int i=0;i<ar.length;i++) System.out.println(ar[i]);

//알파벳 찾기		
//		Scanner s=new Scanner(System.in);
//		String a=s.nextLine();
//		int[] ar=new int[a.length()];
//		for(int i=0;i<a.length();i++) {
//			ar[i]=a.charAt(i);
//		}
//		int[] br=new int[26];
//		int k=0;
//		for(int i=97;i<123;i++) {
//			for(int j=0;j<ar.length;j++) {
//				if(i==ar[j]) {
//					br[k]=j;
//					break;
//				} else br[k]=-1;
//			}
//			k++;
//		}
//		for(int i=0;i<br.length;i++) System.out.print(br[i]+" ");

//숫자의 합
//		Scanner s=new Scanner(System.in);
//		int a=Integer.parseInt(s.nextLine());
//		int[] ar=new int[a];
//		String[] ar1=s.nextLine().split("");
//		int sum=0;
//		for(int i=0;i<a;i++) {
//			ar[i]= Integer.parseInt(ar1[i]);
//			sum+=ar[i];
//		}
//		System.out.println(sum);

//아스키 코드
//		Scanner s=new Scanner(System.in);
//		int a=s.nextLine().charAt(0);
//		System.out.println(a);
		

//한수
//		Scanner s=new Scanner(System.in);
//		int a=Integer.parseInt(s.nextLine());
//		System.out.println(getResult(a));
//	}
//	public static int getResult(int n) {
//		int sum=0;
//		if(n==1000) n=999;
//		if(n<100) {
//			sum=n;
//			return sum;
//		}else {
//			sum=99;
//			for(int i=100;i<=n;i++) {
//				int a=i%10;
//				int b=i/10%10;
//				int c=i/100%10;
//				if(a-b==b-c) sum++;
//			}
//			return sum;
//		}


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