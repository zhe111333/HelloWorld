public class Droid{
  int batteryLevel = 100;
  String name;
  //空参
  public Droid(){}
  //初始化成员变量
   public void Droid(String droidName){
    name = droidName;
  }
   //打印name
   public String toString(){
    return "Hello, I’m the droid: " + name;
  }
   //传入行为 剩余电量
   public void performTask(String task){
    System.out.println(name + "is performing task:" + task);
    batteryLevel = batteryLevel - 10;
  }
  //创建对象 打印行为 剩余电量
  public static void main(String[] args){
    Droid Codey = new Droid();
    Codey.Droid("Codey");
    System.out.println(Codey.toString());
    Codey.performTask("dancing");
    System.out.println(Codey.batteryLevel);    
  }
}