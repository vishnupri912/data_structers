package binary_search;
 //video 2
/*1. First occurrence of element in sorted array.
2. Last occurrence of element in sorted array.
3. Count total occurrence of element in sorted array.
4. Ceil of a number.
5. Floor of a Number.
6. Find the Next smallest letter in sorted array.*/
public class b_s_questions {
public static void main(String args[]) {
	//int[] a=new int[2];
	//int key=5;
	int[] arr= {1,3,3,5,5,5,5,5,5,5,49};
	//boolean c=true;
	//int min=binary_search_min(arr,key,true);
   // int max=binary_search_min(arr,key,false);
//	a[0]=min;
//	a[1]=max;
//	System.out.println(a[0]+","+a[1]);
//	if (min==-1) {
//		System.out.println("number of occurance of target = "+0);
//	}
//	else {
//		System.out.println("number of occurance of target = "+(max-min+1));
//	}
	int f1=2;
	int f2=floor_bs(arr,f1);
	System.out.println("floor "+f2);
	int c1=2;
	int c2=ceil_bs(arr,c1);
	System.out.println("ceil "+c2);
}
public static int floor_bs(int[] b,int c){//finding floor of a number(less number or equal to target)
	int ans=-1;
	int s=0;
	int e=b.length-1;
	while(s<=e) {
		int m=s+((e-s)/2);
		
		 if (b[m]<c) { //if mid less than target
			ans=b[m];// storing mid as  ans it may ans bcoz it is less than target 
			s=m+1;//after storing mid as ans now start is mid+1
			
		}
		else if(b[m]>c) {//if mid greater than target
			e=m-1; //here finding floor means ans should be less or equal to target
		}
		else  {//if mid equal to target
			ans=b[m];//so need do any operations bcoz element find
			break;
		}
		
	}
	return ans;//returning less than or equal to target 
}
public static int ceil_bs(int a[],int t) {//finding ceil of a number(greater number or equal to target)
	int ans=-1;
	int s=0;
	int e=a.length-1;
	while(s<=e) {
		int m=s+((e-s)/2);
		
		 if (a[m]<t) {//if mid less than target
			s=m+1;//here ceiling  means ans should be greater or equal to target so s=m+1
			
		}
		else if(a[m]>t) {//if mid greater than target
			ans=a[m];// storing mid as  ans it may ans bcoz it is greater than target
			e=m-1;//after storing mid as ans now end is mid-1
		}
		else  {//if mid equal to target
			ans=a[m];//so need do any operations bcoz element find
			break;
		}
		
	}
	return ans;//returning less than or equal to target 
}
//here we are findind 1st or last occurence of given element  
public static int binary_search_min(int[] a,int k,boolean t){
	int ans=-1;//to store occurence we assigned ans=-1
	int s=0;
	int le=a.length-1;
	while(s<=le) {
		int m=s+((le-s)/2);//finding mid
		if (a[m]==k) {//if mid is equal to target
			ans=m; //Assign ans as mid here ans may be ans or not it may change 
			if(t) {//t is true 
			le=m-1;//then finding 1st occurrence of element
			}
			else {// t is false then
				s=m+1;// finding last occurrence of element
			}
		}
		else if(a[m]>k) {//if target is less than mid
			le=m-1; //move last element is mid-1
		}
		else { // if target is greater than mid
			s=m+1; // move start element is mid+1
		}
	}
	return ans; // returning update value
}
}
