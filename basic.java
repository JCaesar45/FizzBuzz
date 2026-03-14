import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    
    public static List<Object> fizzBuzz() {
        List<Object> result = new ArrayList<>();
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(i);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(fizzBuzz());
    }
}
