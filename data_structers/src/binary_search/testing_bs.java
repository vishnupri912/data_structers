package binary_search;

public class testing_bs {
public static void main(String[] args) {
	int[] a={1, 3, 5, 5, 5, 5,7,7, 67, 123, 125};
	//int foe=first_occurence_ele(a,7);
	//System.out.println("first occurence of element in array = "+foe);
	//int loe=last_occurence_ele(a,5);
	//System.out.println("last occurence of element in array = "+loe);
	//int f=89;
	//int o=square_root(f);
	//System.out.println(o);
	boolean b=isPerfectSquare(2147483647);
	System.out.println(b);
}
static int square_root(int n) {
	 long a=-1;
	 long s=0;
	         //long n=x;
	 	long e=n;
	 	while (s<=e) {
	 	long	m=s+((e-s)/2);
	 	long v =(m*m);
	 	if (v==n) {
	 		return (int)m;
	 	}
	 	else if(v<n) {
	 		a=m;
	 		s=m+1;
	 	}
	 	else {
	 		e=m-1;
	 	}
	 	}
	 	return (int)a;
}
static int first_occurence_ele(int[] a,int t) {
	int ans=-1;
	int s=0;
	int e=a.length-1;
	while(s<=e) {
		int m=s+(e-s)/2;
		if (a[m]>t) {
		e=m-1;	
		}
		else if(a[m]==t) {
           ans=m;
           e=m-1;
		}
		else {
			s=m+1;
		}
	}
	return ans;
}
static int last_occurence_ele(int[] a,int t) {
	int ans=-1;
	int s=0;
	int e=a.length-1;
	while(s<=e) {
		int m=s+(e-s)/2;
		if (a[m]>t) {
		e=m-1;	
		}
		else if(a[m]==t) {
           ans=m;
           s=m+1;
		}
		else {
			s=m+1;
		}
	}
	return ans;
}
public static boolean isPerfectSquare(int num) {
    long s=0;
    long e=num;
   boolean a=false;
    while(s<=e){
      long  m=s+((e-s)/2);
        if ((m*m)==num){
            return true;
        }
        else if((m*m)>num){
            e=m-1;
        }
        else {
            s=m+1;
        }
        
    }
    return a;
}

}
