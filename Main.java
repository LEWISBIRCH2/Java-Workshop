public class Main{
    public static void main(String[] args) {
        System.out.println(123456789);

    //Variables must be declared as tehy are initialised. Variable types include String, int, boolean, etc... 
        String name = "Lewis";
        System.out.println(name);

        int number = 10;
        System.out.println(number);

        //Variables can be loosely assigned, and defined later. See below. 
        int letNum;
        letNum = 15;
        System.out.println(letNum);

        // things can also be changed later, without 'let' needed. See below.
        number = 20;
        System.out.println(number);

        // The keyword FINAL can be used to make things constant (const). See below.
        final int lastNumber = 100;
        System.out.println(lastNumber);
    }}

    // javac Main.java
    // java Main

    // int - whole number
    // float - decimal number
    // char - single letter
    