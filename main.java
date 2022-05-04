import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> valList = new ArrayList<Integer>();
        for(int i = 0; i < 1000; i++) {
            if(i % 2 == 1) {
              if(i % 3 == 2) {
                if(i % 7 == 6) {
                  valList.add(i);
                  System.out.println(i);
                }
              }
            }
        }
    }
}