import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int[] insert = { 3, 0, 1, 8, 7, 2, 5, 4, 9, 6 };
        ArrayList<Integer>numbers = new ArrayList<>();
        add(10,numbers);
        printArray(insert);
        System.out.print(insert(insert));

    }

    public static int sss(int num) {
        return num == 1 ? 1 : num * sss(num - 1);
    }

    public static int fact(int a) {
        int sum = 1;
       for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int fact2(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * fact2(n - 1);
        return result;
    }

    public static int fact3(int b) {
        int score = b + 1;
        if (score == 1) {
            fact(5);
            return b * score - 1;
        } else {
            System.out.println("your fact is ready" + b);
        }
        return b;
    }

    public static void printArray(int[] insert) {
        for (int j = 0; j < insert.length; j++) {
            System.out.print(insert[j] + " ");
        }
    }

    public static int[] insert(int[] insert) {
        int a;
        int b;
        for (int i = 0; i < insert.length; i++) {
            if (insert[i] > insert[i++]) {
                a = insert[i];
                b = insert[i++];
                insert[i] = b;
                insert[i++] = a;
                printArray(insert);
            } else {
            i++;
            }
        }
        return insert;
    }
public static int add(int a,ArrayList<Integer>numbers){
    for (int i = 0; i < numbers.size(); i++) {
    if(a!=numbers.get(i)){
        numbers.add(a);
        System.out.println("we are added your number to collection to index:");
    }else{
System.out.println("we can't add your number to collection becouse this number has already");
    }
    System.out.println(numbers);
}
    return a;
}
}