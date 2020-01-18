public class riemann
{
  public static int randomMethod(String[] r){
    int shortIn = 0;
    int small = r[0].length();
      for( int i = 0; i < r.length; i++){
          if(r[i].length() < small){
            small = r[i].length();
            shortIn = i;
  }
  }
  return shortIn;
  }

    public static void main(String[ ] args)
    {
      String[] cool = {"ohh","oh","ohh","o"};
      System.out.println(7%9);

    }
}
