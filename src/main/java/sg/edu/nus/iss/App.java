package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Console cons = System.console();

        List<String> myTodo = new ArrayList<>();
        String input = "";

        while (!"stop".equals(input)) {
            input = cons.readLine("? ");

            if (!"stop".equals(input))
                myTodo.add(input);
        }

        for (String item : myTodo) {
            System.out.printf("%s\n", item);
        }
    }
}
