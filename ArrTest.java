public class ArrTest{	
    public static void main(String[] args) {
    	//要求：判断数组arr中有多少个能被三整除的数
    	//1定义数组
    	int[] arr = {1,2,3,4,5,6,7,8,9,10};
    	//2提取数组元素
    	int count = 0;
    	for(int i = 0; i < arr.length ; i++) {
    		if(arr[i] % 3 == 0) {

    			count++;
    		}
    	}
    	System.out.println(count);
    	
    	
    }
}