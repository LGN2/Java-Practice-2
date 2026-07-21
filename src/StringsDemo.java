public class StringsDemo {
    public static void main(String[] args) {
        String greeting = "Salam Aliekum";
        greeting.toUpperCase();
        IO.println(greeting);
        String upperCaseGreeting = greeting.toUpperCase();
        IO.println(upperCaseGreeting);
        String name = "Ali Daniyal";
        name.toUpperCase();
        IO.println(name);
        String upperCaseName = name.toUpperCase();
        IO.println(upperCaseName);
        String s = " Hello Codeline ";
        Integer strlen = s.length();
        IO.println(s.strip());
        String str1 = "       ";
        IO.println(str1.strip().isBlank());
        IO.println(str1.isBlank());
        IO.println(str1.isEmpty());
        String str2 = "";
        IO.println(str2.isBlank());
        IO.println(str2.isEmpty());
        String input = IO.readln("enter your name:").strip();
        if (input.isBlank()) {
            IO.println("Name is required");
        }
        IO.println(input);
        String email = IO.readln("Enter your Email:").strip();
        IO.println(email.indexOf("@"));
        IO.println(email.indexOf("@")+1);
        IO.println(email.indexOf("$"));
        IO.println(email.length());
    }
}
