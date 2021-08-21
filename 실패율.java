class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] rates = new double[N];
        
        for (int i=0; i<N; i++){    //N번 반복한다
            int a = 0;              // a는 스테이지에 도달했으나 클리어못한 플레이어 수. 실패율의 분자.
            int b = 0;              // b는 스테이지에 도달한 플레이어의 수. 실패율의 분모.
            for (int stage:stages){  // stages에 있는 각 stage에 대하여 반복
                if (stage == i+1){   // stage가 1이면, 2이면 .. 반복
                    a = a+1;          // 분자 1증가
                }
                if (stage >= i+1){      // stage가 현재 스테이지보다 크거나 같으면, 즉 플레이어가 스테이지에 도달했거나 넘어갔으면
                    b = b+1;            // 분모 1 증가
                }
            if (b != 0){                //zero division error 피하기위한 조건문
                rates[i] = a/b;         //rate배열에 a/b 실패율 저장
            }
            else if (a==0 || b==0){    // 분자 또는 분모가 0이면
                rates[i] = 0;           //실패율은 0
            }
            }
        }

        for (int i = 1; i<N+1; i++){   // 스테이지 넘버를 answer에 저장. 추후 실패율따라 정렬할것임!
            answer[i-1] = i;
        }
        

        //버블 정렬~
        for (int i = 0; i<N; i++){
            for (int j=0; j<N-i-1; j++){
                if (rates[j] <rates[j+1]){
                    double temp = rates[j+1];
                    rates[j+1] = rates[j];
                    rates[j] = temp;

                    int temp2 = answer[j+1];
                    answer[j+1] = answer[j];
                    answer[j] = temp2;
                }
            }
        }
        
        
        return answer;
    }
}