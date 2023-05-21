public class Review1 {
  
  public static void main(String[] args) {
    String arr = "abcde123";
    String arr1 = "abc";
    System.out.println(arr.length());			//长度
    System.out.println(arr.concat(arr1));		//连接arr1
    System.out.println(arr.indexOf("c"));		//字符串索引
    System.out.println(arr.charAt(2));			//按索引打印单个字符串
    System.out.println(arr.equals("abcde123")); //比较字符串
    System.out.println(arr.equalsIgnoreCase("ABde123"));//不考虑大小写比较字符串	
    System.out.println(arr.substring(0,5));		//按索引打印一部分字符串
    System.out.println(arr.toUpperCase());		//转换大写
    System.out.println(arr.toLowerCase());		//转换小写

  }
  
}