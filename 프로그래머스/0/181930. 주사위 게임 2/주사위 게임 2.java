class Solution {
    public int solution(int a, int b, int c) {
        int sum = a + b + c;
        int squereSum = a * a + b * b + c * c;
        int cubeSum = a * a * a + b * b * b + c * c * c;
        
        if(a == b && b == c){
            return sum * squereSum * cubeSum;
        }else if(a == b || b == c || a == c){
            return sum * squereSum;
        }else{
            return sum;
            
        }
        
    }
}