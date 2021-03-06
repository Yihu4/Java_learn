package Java_learn.Grammar;

// 非递归，三个变量
public class FibUncursion {
    public static void main(String[] args) {
        System.out.println(fib(40));
    }

    public static long fib(int index) {
        if(index < 1) {
            System.out.println("invalid parameter!");
            return -1;
        }
        if (index == 1 || index == 2) {
            return 1;
        }

        long f1 = 1L;
        long f2 = 1L;
        long f = 0;

        for (int i = 0; i < index - 2; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }

        return f;
    }
}