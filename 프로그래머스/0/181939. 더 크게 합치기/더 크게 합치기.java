class Solution {
    public int solution(int a, int b) {
        
        String A = String.valueOf(a) + b;
        String B = String.valueOf(b) + a;
                        
        int abint = Integer.parseInt(A);
        int baint = Integer.parseInt(B);
        
        if(abint >= baint ){
         return abint;
        } else{
            return baint;
        }
    }
}