public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int result = 0;
        int zu = x;
        while (x!= 0) {
            result += x % 10;
            x /= 10;
        }
        return zu%result==0?result:-1;
    }
}
