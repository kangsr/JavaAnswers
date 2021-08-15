import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Set<Integer> Jjin_reserve = new HashSet<>();
        Set<Integer> Jjin_lost = new HashSet<>();
        
        for (int std: reserve){
            Jjin_reserve.add(std);
        }
        
        for(int std: lost){
            Jjin_lost.add(std);
        }
        
        answer = n - Jjin_lost.size();
        Integer[] arr_reserve = Jjin_reserve.toArray(new Integer[Jjin_reserve.size()]);
        
        for (int i=0; i<Jjin_reserve.size(); i++){
            if (Jjin_lost.contains(arr_reserve[i]-1) || Jjin_lost.contains(arr_reserve[i]+1)){
               
                answer +=1;
            }
        }
        return answer;
    }
}