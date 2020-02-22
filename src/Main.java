import java.util.*;

import static java.util.Comparator.naturalOrder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candies = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int threshold = Integer.parseInt(sc.nextLine());
       // 33, 20, 12, 19, 29 // 33
        //16, 3, 14, 17, 11 // 99
        //62, 67, 100 // 8
        //16, 39, 67, 16, 38, 71 // 17
        sugarHigh(threshold, candies);

    }

    private static void sugarHigh(int threshold, int[] array) {
        List<Candy> myList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            myList.add(new Candy(i, array[i]));
        }

        myList.sort(naturalOrder());

        for (Candy candy : myList) {
            if (candy.getSugarContent() < threshold) {
                result.add(candy.getIndex());
                threshold -= candy.getSugarContent();
            } else {
                break;
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println(result);
    }

}