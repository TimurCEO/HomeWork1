package task3;

class Answer {
    public int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

public class Printer {
    public static void main(String[] args) {
        int n = 345;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        Answer ans = new Answer();
        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res);
    }
}
