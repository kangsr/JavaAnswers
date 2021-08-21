class Solution {
    public int solution(String s) {
        
        String[] eng = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] integers = {"0","1","2","3","4","5","6","7","8","9"};
        
        for (int i = 0; i<10; i++){
            s=s.replace(eng[i],integers[i]);
        }
      
        return Integer.parseInt(s); //문자열 s를 integer로 바꾸는 함수
    }
}