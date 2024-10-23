public class Kata {
  public static int makeMove(int sticks) {
    int c = 0;
    while(sticks % 4 !=0){
        c++;
        sticks--;
          }
    return c;
  }
}
