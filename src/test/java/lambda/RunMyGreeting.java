package lambda;

public class RunMyGreeting {
    public static void main(String args[]) {
        MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
        MyGreeting eveningGreeting = (str) -> "Good Evening " + str + "!";

        // Output: Good Morning Luis!
        System.out.println(morningGreeting.processName("Luis"));

        // Output: Good Evening Jessica!
        System.out.println(eveningGreeting.processName("Jessica"));
    }
}

interface MyGreeting {
    String processName(String str);
}
