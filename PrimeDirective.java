// Import statement:

class PrimeDirective {
  
  // Add your methods here:
  public void tiqu(int[] numbers){
    for (int num : numbers) {
    	//假设Pri不是质数
        boolean Pri = false;
        for (int i = 2; i < num; i++) {
        	//判断条件循环不是质数的情况 假设成立，能被除了1和他本身的其他数整除的 不是质数 
        	if (num % i == 0) {
        		continue;
        	}else {
        		Pri = false;
        	}
        }
    	System.out.println(num + "检测结果为" + Pri);
    }
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89, 7};
    pd.tiqu(numbers);




  }  

}