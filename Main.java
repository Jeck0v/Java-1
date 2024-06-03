public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Types:
        // int
        // byte
        // short
        // long
        // double
        // float
        // boolean
        // char

        int age = 18;
        System.out.println("I am " + age + " years old");

       
        char copyrightSymbol =  '\u00A9';
        System.out.println("This is the copyright symbol " + copyrightSymbol);
        
        char number1 = 12;
        int number2 = 6;

        // addition
        System.out.println(number1 + number2);
        // soustraction
        System.out.println(number1 - number2);
        // multiplication
        System.out.println(number1 * number2);
        // division
        System.out.println(number1 / number2);
        // modulo
        System.out.println(number1 % number2);

        int score=10;
        score--;
        score++;
        System.out.println(score);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}

//commentaire
