public class BinarySerach {
    public static void main(String[] args){
        int[] myList = {10, 46, 59, 61, 123, 229, 236, 238, 712, 9983};
        System.out.println(binarySearch(myList, 10)); // 0
        System.out.println(binarySearch(myList, 46)); // 1
    }
    public static int binarySearch(int[] myList, int item){
        if(myList.length == 0){
        return -1;
        }
        int low = 0, high = myList.length - 1;
        while(low <= high){
            int center = low + high / 2, guess = myList[center];
            if(guess == item) return center;
            else if(guess < item) low = center + 1;
            else if(guess > item) high = center - 1;
        }
        return -1;
    }
}

