class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddstr = new StringBuilder();
        StringBuilder evenstr = new StringBuilder();
        
        for(int num : num_list){
            if (num % 2 == 0){
                evenstr.append(num);
            } else{
                oddstr.append(num);
            }
        }
        int odd = oddstr.length() > 0 ? Integer.parseInt(oddstr.toString()) : 0;
        int even = evenstr.length() > 0 ? Integer.parseInt(evenstr.toString()) : 0;
        
        return odd + even;
    }
}