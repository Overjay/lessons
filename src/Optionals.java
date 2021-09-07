import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable("hee");
        System.out.println(opt1.isEmpty());
        System.out.println(opt1.isPresent());

        opt1.ifPresent(word -> {
                    System.out.println(word);
                });

    }
}
