public class ArrayDemo3{	
    public static void main(String[] args) {
    	//定义数组
    	int[] arr = {1,2,3,4,5};
    	//遍历01234
//    	for(int i=0; i<5; i++) {
//    		System.out.println(arr[i]);
//    		
//    	}
//    	求和
		int a = 0;
    	for (int i=0; i<arr.length; i++) {
    		a = a+arr[i];
    	}
		System.out.println(a); 
    	
    	
    }
}