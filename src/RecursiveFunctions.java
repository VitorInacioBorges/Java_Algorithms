import java.util.Arrays;
public class RecursiveFunctions {
    public static void main(String[] args) {
        int list[] = {0, 4, 2, 5, 7, 1};
        System.out.println(sum(list)); // 19
        System.out.println(count(list)); // 6
        System.out.println(max(list)); // 7
    }
    public static int sum(int list[]){
        if(list.length == 0) return 0;
        else return list[0] + sum(Arrays.copyOfRange(list, 1, list.length));
    }
    public static int count(int list[]){
        if(list.length == 0) return 0;
        else return 1 + count(Arrays.copyOfRange(list, 1, list.length));
    }
    private static int max(int list[]) {
        if (list.length == 2) {
            return list[0] > list[1] ? list[0] : list[1];
        }

        int subMax = max(Arrays.copyOfRange(list, 1, list.length));
        return list[0] > subMax ? list[0] : subMax;
    }
}