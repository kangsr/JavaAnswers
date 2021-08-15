import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int get = nums.length / 2 ;
        
        Set<Integer> set = new HashSet<>();
        for (int pkm: nums){
            set.add(pkm);
        }
        
        if (get > set.size()){
            answer = set.size();
        }
        
        else{
            answer = get;
        }
        return answer;
    }
}