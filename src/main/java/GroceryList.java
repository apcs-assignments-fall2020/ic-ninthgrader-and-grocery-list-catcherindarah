import java.util.stream.*;
import java.util.Arrays;

public class GroceryList {
    private String[] arr;
    public GroceryList() {
        this.arr = new String[10];
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }
    public void remove(String item) {
        for (int i = 0; i <arr.length; i++){
            if (arr[i].equals(item)) {
                for ( int k = i; i < arr.length-1; k++) {
                    arr[k] = arr[k+1];
                }
                arr[arr.length-1] = null;
                break;
            }
        }
    }
    public String toString(){
        String a = Arrays.toString(arr);
        System.out.println("Grocery List: ");
        return a;
    }
}