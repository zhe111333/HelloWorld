import java.util.ArrayList;//调用ArrayList
public class ArrayList1{
	public static void main(String[] args) {
		//ArrayList动态数组调用类似于类，<>内填写数据类型Integer String Double char
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//添加
		arr.add(1);
		arr.add(2);
		arr.add(3);
		//减少
		arr.remove(0);
		//循环数组元素， 调用size()方法代表动态数组长度
		for(int i=0; i<arr.size(); i++) {
			//获取动态数组元素调用get（）方法
			System.out.println(arr.get(i));
		}
	}
}