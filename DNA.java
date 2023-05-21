public class DNA {
  public static void main(String[] args){
    // DNA 
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna1;
    System.out.println("Length: " + dna.length());
    int start = dna.indexOf("ATG");
    int last = dna.indexOf("TGA");
    System.out.println("Start: " + start);
    System.out.println("Last: " + last);
    if (start != -1 && last != -1 && (last - start) % 3 == 0){
      System.out.println("youdanbaizhi");
      String protein = dna.substring(3,12);
    }else{
      System.out.println("No protein.");
    }

  }
}