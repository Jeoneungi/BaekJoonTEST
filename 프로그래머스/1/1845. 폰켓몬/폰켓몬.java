import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] nums) {
        Set<Integer> uniquePokemon = new HashSet<>();
        
        for (int num : nums) {
            uniquePokemon.add(num);
        }
     
        return Math.min(uniquePokemon.size(), nums.length / 2);
    }
}
