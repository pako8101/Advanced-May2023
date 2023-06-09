package Generics.Exercises.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        CustomList<String> list = new CustomList<>();
        while (!command.equals("END")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Add":
                    String elementToAdd = commandParts[1];
                            list.add(elementToAdd);
                    break;
                case "Remove":
                    int elementToRemove = Integer.parseInt(commandParts[1]);
                    list.remove(elementToRemove);
                    break;
                case "Contains":
                    String elementToSearch = commandParts[1];
                    System.out.println(list.contains(elementToSearch));
                    break;
                case "Swap":
                    int first = Integer.parseInt(commandParts[1]);
                    int second = Integer.parseInt(commandParts[2]);
                    list.swap(first,second);
                    break;
                case "Greater":
                    String element = commandParts[1];
                    System.out.println(list.countGreater(element));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
