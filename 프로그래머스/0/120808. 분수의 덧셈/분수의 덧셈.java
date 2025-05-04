class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // 통분
        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;

        // 최대공약수 계산
        int gcd = getGCD(numerator, denominator);

        // 약분
        numerator /= gcd;
        denominator /= gcd;

        return new int[]{numerator, denominator};
    }

    // 최대공약수 계산 
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}