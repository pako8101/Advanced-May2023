package ExamsAdvanced.ExamPrepAdvancedMartin;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OSPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> tasksStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(tasksStack::push);
        ArrayDeque<Integer> threadsQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        int endTask = Integer.parseInt(scanner.nextLine());
        int task = tasksStack.peek();
        int thread = threadsQueue.peek();

        while (task != endTask) {
            if (thread >= task) {
                tasksStack.pop();
            }
            threadsQueue.poll();


            task = tasksStack.peek();
            thread = threadsQueue.peek();
        }
        System.out.printf("Thread with value %d killed task %d%n", threadsQueue.peek(), endTask);

        String leftThreads = threadsQueue.stream().map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(leftThreads);
    }
}
