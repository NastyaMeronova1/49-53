import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> numbers = new ArrayList<>();
        numbers.add(new User(1, "Rina", "rina2001", true));
        numbers.add(new User(2, "Costel", "kartoshka123", false));
        numbers.add(new User(3, "Attikos", "suspiciousduck445", false));
        numbers.add(new User(4, "Putra", "gamemaster001", false));
        numbers.add(new User(5, "Elsa", "anonimoushacker", true));
        numbers.add(new User(6, "Yoshiro", "jimcarreyfan44", false));
        numbers.add(new User(7, "Nikodim", "wildflower", true));
        numbers.add(new User(8, "Lyana", "randomastronaut", true));
        numbers.add(new User(9, "Nikhil", "nikhilbush1998", false));
        numbers.add(new User(10, "Ramesh", "spetsnaz65", true));
        numbers.add(new User(11, "Leonarda", "brownrice", false));
        numbers.add(new User(12, "Heidrun", "cutehamster1", true));
        numbers.add(new User(13, "Letha", "letha65", true));

        long stream = numbers
                .stream()
                .filter(a -> a.getId() < 11)
                .skip(2)
                .limit(8)
                .distinct()
                .sorted()
                .count();

    }
}
