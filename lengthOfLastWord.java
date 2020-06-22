public class lengthOfLastWord {
  public static int lengthOfLastWord(String s)
  {
      String[] arr = s.split(" ");

      if(arr.length>=1)
      {
          return arr[arr.length-1].length();
      }
      else
      {
          return 0;
      }

  }
}
