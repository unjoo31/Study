package ex13;

class Data<T> {
    int status; // 200
    T body; // 값
}

public class Generic03 {

    // <?>를 사용하면 메서드가 모든 타입을 리턴할 수 있다 (와일드카드)
    Data<?> getNum(int check) {
        if (check == 1) {
            Data<String> data = new Data<>();
            return data;
        } else {
            Data<Integer> data = new Data<>();
            return data;
        }
    }

    // Object 타입
    Object getNum2(int check) {
        if (check == 1) {
            return "안녕";
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Generic03 g3 = new Generic03();
        // Object 타입이기 때문에 다운캐스팅해서 해야한다
        int n = (int) g3.getNum2(1);
        // 와일드카드이기 때문에 <?>타입으로 받으면 된다
        Data<?> d = g3.getNum(1);
    }
}
