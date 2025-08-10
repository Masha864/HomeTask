import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
        PhoneBook pB = new PhoneBook();

         pB.add("Петров", "+7 (495) 322-22-23");
        pB.add("Иванов", "+7 (495) 444-44-44");
        pB.add("Петров", "+7 (495) 322-22-23");
        pB.add("Сидоров", "+7 (495) 555-55-55");
        pB.add("Андреев", "+7 (495) 666-69-69");
        pB.add("Петров", "+7 (495) 772-27-72");
        pB.add("Иванов", "+7 (495) 802-08-02");
        pB.add("Петров", "+7 (495) 999-09-90");

        pB.get("Петров");
        pB.get("Иванов");
        pB.get("Сидоров");
}