package string;

public class Test05 {
    public static void main(String[] args) {
        // String[] tokens = "I am a boy.".split(" ");
        // for(String token : tokens){
        //     System.out.println(token);
        // }

        String [] tokens = "100,200,300".split(",");
        for(String token : tokens){
            System.out.println(token);
        }
    }
}
