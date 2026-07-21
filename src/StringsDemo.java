public class StringsDemo {
    public static void main(String[] args) {
  /*      String greeting = "Salam Aliekum";
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
*/
    /*    String t = "Hello Codeline World";
// 0123456789...
        IO.println(t.indexOf("Codeline"));
        IO.println(t.indexOf("Java"));
        IO.println(t.lastIndexOf("o"));
        IO.println(t.contains("World"));
        IO.println(t.startsWith("Hello"));
        IO.println(t.endsWith("World"));
        */
     /*   String n = "Hello Codeline World";
        IO.println(n.charAt(16));
        IO.println(n.charAt(0));
        IO.println(n.charAt(19));
        IO.print(n.substring(6));
        IO.print(n.substring(6,14));*/

        String file = "report.pdf";
        Integer dot =  file.lastIndexOf(".");
        IO.println("File name is: "+file.substring(0,dot));
    }
}
