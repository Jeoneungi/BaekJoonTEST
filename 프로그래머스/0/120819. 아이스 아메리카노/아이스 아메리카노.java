class Solution {
    public int[] solution(int money) {
        int price = 5500; 
        int count = money / price;
        int remainder = money % price; 
        
        return new int[]{count, remainder};
    }
}