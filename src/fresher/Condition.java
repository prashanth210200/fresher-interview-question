package fresher;

public class Condition {

		  public static void main(String[] args) {
		 
			  
			  
			  int [] a= {89,98,76,56,9};
			  int temp=0;
			  int num=0;
			  for(int i=0;i<a.length;i++){
				  for (int k = 0; k < a.length; k++) {
				  if(a[k]>=a[i]) {
					  temp=a[k];
					  a[k]=a[i];
					  a[i]=temp;  
				  }	  
				  }
				  }
			  for (int i:a) {
				  System.out.print(" "+i);
			  }
				
			}
}

	