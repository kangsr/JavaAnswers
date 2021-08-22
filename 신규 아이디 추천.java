class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        answer = new_id.toLowerCase(); // 1단계
        
        answer = answer.replaceAll("[^a-z0-9-_.]",""); //2  ^:XOR연산자
        answer = answer.replaceAll("[.]{2,}", "."); //3     {}:범위
        answer = answer.replaceAll("^[.]|[.]$",""); //4  ^:문자열 시작 |:or연산자 $:문자열 끝
        
        if (answer.equals("")){     //5
            answer += "a";
        }
        
        if (answer.length() >= 16){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("[.]$", "");  //6
        }
        
        if (answer.length() <3 ){
            while (answer.length() < 3){
                answer += answer.charAt(answer.length()-1);
            }
        } //7
        return answer;
    }
}