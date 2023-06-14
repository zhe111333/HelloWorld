import java.util.ArrayList;
public class ArraylistDemo{
	public static void main(String[] args) {
		//创建集合,ArrayList<引用数据> 变量 = ArrayList<>;add、remove（2种方式）、set（必须加索引）、get
		ArrayList<String> list = new ArrayList<>();
		//添加
		list.add("aaa");
		list.add(1,"bbb");
		list.add(2,"ccc");
		//删除
		//list.remove(0);
		//list.remove("bbb");
		//修改
		//list.set(0,"ddd");
		//查询
		//String result = list.get(0);
		//遍历
		for(int i = 0; i <list.size(); i++){
			System.out.println(list.get(i));	
		}

	}	
}