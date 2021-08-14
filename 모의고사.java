class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] score = new int[3];
        int[] supoza1={1,2,3,4,5};
        int[] supoza2={2,1,2,3,2,4,2,5};
        int[] supoza3={3,3,1,1,2,2,4,4,5,5,};
        
        for (int i=0; i<answers.length; i++){
            if (answers[i] == supoza1[i % 5]) {
                score[0] ++;
            }
            if (answers[i] == supoza2[i % 8]) {
                score[1] ++;
            }
            if (answers[i] == supoza3[i % 10]) {
                score[2] ++;
            }
        }
        
        int max = 0;
        for (int i=0; i<3; i++){
            if (max < score[i]){
                max = score[i];
            }
        }
        
        int cnt = 0;
        for (int i=0; i<3; i++){
            if (score[i] == max){
                cnt ++;
            }
        }
    
        answer= new int[cnt];
        for(int i=0; i<3; i++){
            if ( score[i] == max){
                answer[i]=i+1;
            }
        }
        
        return answer;
    }
}