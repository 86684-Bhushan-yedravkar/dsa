

	import java.util.Scanner;

	public class Q2linear{

		public static  int comp=0;
		public static int searchthekey1(int[] arr, int key) {
					
			for (int i = 0; i < arr.length; i++) {
				
				comp++;
				
			  if(key==arr[i]) {
			  
				
			  return i;
			}
			
		}
		return -1;
		
		}
		public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int arr[]= {88,23,56,75,43,94,12,32,17,};
	System.out.println("Enter the key");
	int key =sc.nextInt();

	 int index=searchthekey1(arr,key);
		if(index==-1) {
			
			System.out.println("key is not found");
			
			
		}	
		else {
			
			System.out.println("key is found whichis="+index);
			
		}
			
			System.out.println("compariesion will be="+comp);
		sc.close();	
			
			

		}




		
	


	}


