import java.util.ArrayList;

class Playlist{
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("song1");
    desertIslandPlaylist.add("song2");
    desertIslandPlaylist.add("song3");
    desertIslandPlaylist.add("song4");
    desertIslandPlaylist.add("song5");
    desertIslandPlaylist.add("song6");
    System.out.println(desertIslandPlaylist);//打印数组
    System.out.println(desertIslandPlaylist.size());//打印长度
    desertIslandPlaylist.remove(0);//删除0索引元素
    System.out.println(desertIslandPlaylist);//再次打印数组，少个元素
    String arr = desertIslandPlaylist.get(4);//song6 赋值给arr
    desertIslandPlaylist.set(4,desertIslandPlaylist.get(3));//更改song6为song5
    desertIslandPlaylist.set(3,arr);//更改song5为arr
    System.out.println(desertIslandPlaylist);//打印数组

    int arr2 = desertIslandPlaylist.indexOf("song6");
    System.out.println(arr2);
    String tempA = "songxin";
    


 }
  
}