package binary_search;//video-3(1. Find Minimum Difference in a Sorted array.)
//here we are finding minimum difference of element if difference of float and ceil in both which has minimum 
//difference with target element that element returned either ceil or floor in below array if we give target as 
//t=4 then o/p as 3 & t=6 then o/p as 7
public class easy_2_bs {
   public static void main(String args[]) {
	  int[] a= {2,3,7,19,20};
	int  t=92;
	  int m=min_difference(a,t);
	  System.out.println(m);
   }
   static int min_difference(int[] b,int k) {
	   int ans=-1;
	   int s=0;
	   int e=b.length-1;
	   while(s<=e) {
		  int m=s+((e-s)/2);
		  if (b[m]==k) {
			  return b[m];}//returning element if present in array
		  else if(b[m]>k) {
			  e=m-1;
		  }
		  else {
			  s=m+1;
		  }
	   }
	  // System.out.println(s);//it's ceil
	 //  System.out.println(e);//it's floor
	   int res=-1;
	   if(e==-1) {//if target is less that a[0] then e=-1 cause (e=m-1)
	    	ans=b[s];//ans=b[s] which is b[0]
	    	//System.out.println(ans);
	    	res=b[s];
	    	return res;
	    }
	   if (s==b.length) {//if target is greter that b[(b.length-1)] then s=b.length cause (s=m+1)
	    	ans=b[e];//ans=b[e] which is b[(b.length-1)]
	    	res=b[e];
	    	//System.out.println(ans);
	    	return res;
	    }
	   int m1=k-b[s];//difference b/w target and ceil element
	   int d1=(m1<0)?(m1*-1):(m1*1);//if m1 is -ve convert to +ve cause abs()
	   //System.out.println(d1);
	   int m2=k-b[e];//difference b/w target and floor element
	   int d2=(m2<0)?(m2*-1):(m2*1);//if m2 is -ve convert to +ve cause abs()
	   //System.out.println(d2);
	 //d1 means ceil (ceil=b[s]) and d2 means floor(floor=b[e])
	    if (d1<d2) {//d1 lessthan d2 (ceil less floor)
	    	ans=b[s];//ans=ceil means ans=b[s]
	   // System.out.println("a "+ans);
	    return b[s];}
	    
	    else if(d1>d2) {//d2 lessthan d1 (floor less ceil)
	    	ans=b[e];//ans=ceil means ans=b[s]
	    	//System.out.println("2 "+ans);
	    	return b[e];
	    }
	    
	   return res;
   }
   //below code is sheswath bhai code 
   static void findMinimumAbsoluteDifference(int arr[], int target){

       if(arr.length == 0){
           return;
       }

       int ans = -1;
       int start = 0;
       int end = arr.length-1;
       while (start<=end){
           int mid = start + (end-start)/2;
           if(arr[mid] == target){
               ans = mid;
               break;
           } else if(arr[mid]<target){
               start = mid+1;
           } else {
               end = mid-1;
           }
       }

       // if element exists then ans will be zero
       int res = 0;

       // element does not exists
       if(ans == -1){
           if(end == -1){
               res = Math.abs(target - arr[start]);
           } else if(start == arr.length){
               res = Math.abs(target - arr[end]);
           }
           else {
               int ans1 = Math.abs(target - arr[start]);
               int ans2 =  Math.abs(target - arr[end]);
               res = (ans1<ans2)?ans1:ans2;
           }
       }
       System.out.println("Minimum Absolute difference is :"+ res);
   }
}
