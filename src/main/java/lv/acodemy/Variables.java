package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");

        // int (number)
        int myCurrentAge = 27;
        System.out.println(myCurrentAge);

    /*
    This is multi line comment approach
    TODO: Delete it later
     */


        byte myWeight = 82; // byte data type
        short salary = 2000; // short data type
        Character myFirstLetterOfName = 'A'; // character data type
        long populationOfLatvia = 1900000; // character data type

        double numberPi = Math.PI; //PI number
        float randomNumber = 378812.231313f; //float number
        double classicFloatingNumber = 32313123123213123.23313131; // double number

        // Boolean true/false is, has
        // Example: isSummer, isAdult,  hasEnoughAge.
        boolean isSummer = false;
        boolean isAutum = true;


        long myCash = 200000; // characters data type
        double randomNumberOfCash = 1220.2321; // Character data type
        float numberOfWalletCash = (float) 32131.31F; // float number
        double myBitcoinWalletCash = 89331.23213; // character data type
        short myMoney = 900; // short data type


        int x, y, z;
        x = 10;
        y = 4;
        z = 8;
        int summa = x + y + z;
        System.out.println(summa);
        int summaExample = 10 + 5 + 2 + x + y + 4 + z;
        System.out.println(summaExample);

        // 2a(a + b) : results?
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        System.out.println(result);

        int remainder = 10 % 3;
        System.out.println(remainder);


        // String ( non-primitive)

        String firstName = "Andrew";
        String lastName = "Degtyarev";

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName + " " + lastName);

        System.out.printf("My full name is: %s %s\n", firstName, lastName);
        System.out.println("Hello World");

        String todayDay = "Monday";
        String newDay = "Sunday";

        System.out.println(todayDay);
        System.out.println(newDay);

        System.out.println(todayDay + " " + newDay);

        System.out.printf("Soon I will go home on %s or %s\n", todayDay, newDay);


    }
}
