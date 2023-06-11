package ex05.ch00.Programing;

import java.util.*;

class WordTest{
    String eng;
    String kor;
    
    public WordTest(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getKor() {
        return kor;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }   
}

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<WordTest> list = new ArrayList<>();

        list.add(new WordTest("house", "집"));

        while(true){
            System.out.println("검색할 영어 단어를 입력하시오(종료는 quit):");
            String eng = sc.next();
            if(eng.equals("quit")){
                break;
            }
            for(WordTest w : list){
                if(w.getEng().equals(eng)){
                    System.out.println(eng+"->"+w.getKor());
                }else{
                    System.out.println("사전에 없는 단어입니다.");
                }
            }
        }
    }
}
