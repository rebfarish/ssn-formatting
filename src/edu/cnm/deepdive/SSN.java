package edu.cnm.deepdive;

public class SSN {

  private static char[] charParam = {'1','2','3','4','5','6','7','8','9'};
  private static String stringParam= "123-45-6789";

  public static void main(String[] args) {
    if(charParam.length !=9){
      System.out.println("Invalid input");
    }

    String strResult = formatChars(charParam);
    System.out.println(strResult);
    char[] charResult = returnChars(stringParam);
    System.out.println(charResult);
  }

  private static char[] returnChars(String stringParam) {
    return stringParam.replaceAll("-","" ).toCharArray();
  }

  private static String formatChars(char[] charParam) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i<charParam.length; i++){
      if (i == 3 || i == 5){
        builder.append("-");
      }
      builder.append(charParam[i]);
    }
    return builder.toString();
  }

}
