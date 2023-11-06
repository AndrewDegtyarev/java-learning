package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {


//        for (int i = 0; i < 10; i++) {
//            System.out.println("Helo world");
//        }
//
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//
//        for (int i = 10; i >= 0; i--) {
//            System.out.println(i);
//        }
//
//        String[] arraysOfName = {"Andrew", "Vicror", "Sasha", "Pasha"};
//        for (int i = 0; i <= arraysOfName.length; i++) ;
//        {
//            System.out.println(arraysOfName[i]);
//        }
//        for (String name : arraysOfName) {
//            System.out.println(name);
//        }
//
//        String[] countries = {


//                String[] countries = {
//                "United States",
//                "Canada",
//                "United Kingdom",
//                "Germany",
//                "France",
//                "Australia",
//                "Japan",
//                "India",
//                "China",
//                "Brazil"
//        };

//
//        for (int i = 0; i < countries.length; i++) {
//            if (countries[i].equals("Japan"))
//                System.out.println("Jamate kurasai");
//            break;
//        }
//        System.out.println(countries[i]);


        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {3, 4, 5, 6, 7};
        int[] thirdArray = {5, 6, 7, 8, 9};

        for (int numberOfFirstArray : firstArray) {
            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : thirdArray) {
                    if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                        System.out.println(numberOfFirstArray);
                    }
                }
            }
        }

        int number = 50;
        boolean isEven = number % 2 == 0;
        System.out.println(isEven);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        // while -> do while
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


        int x = 1;
        int summa = 0;
        while (x <= 5) {
            summa = summa + x;
            x++;
        }
        System.out.println("summa" + summa);

        int y = 0;
        while (y <= 20) {
            System.out.println(y + " ");
            y = y + 2;
        }


        int z = 1;
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);


    }
}
