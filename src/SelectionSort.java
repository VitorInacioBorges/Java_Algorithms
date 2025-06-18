import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {7, 8, 2, 5, 1, 3, 4, 9, 0, 6}; // Disordered
        selectionSort(array); // Ordered
        System.out.println(Arrays.toString(array)); // Proof of Ordering
    }
    public static void selectionSort(int array[]){
        int i, j, temp;
        for(i=0; i<array.length-1; i++){
            for(j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}