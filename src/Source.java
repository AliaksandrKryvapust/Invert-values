import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        int [] arr =new int[] {-1,2,-3,4,-5};
        System.out.println(Arrays.equals(invert(arr), new int[]{1, -2, 3, -4, 5}));
    }
    public static int[] invert(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i]=-array[i];
        }
        return temp; //return stream(array).map(i -> -i).toArray();
    }
}
