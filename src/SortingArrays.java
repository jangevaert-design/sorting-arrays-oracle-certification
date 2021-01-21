import java.util.Arrays;

public class SortingArrays {

  public static void main(String[] args) {
    int[] numbers = {5, 10, 2};
    
    Arrays.sort(numbers);
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
    //we can also use Arrays.toString()
    System.out.println(Arrays.toString(numbers));
    System.out.println();
    String[] strings = {"50", "9", "500"};
    Arrays.sort(strings);

    System.out.println(Arrays.toString(strings));//will print 50, 500, 9 because Strings are printed
    //alphabetically.
  }
}
