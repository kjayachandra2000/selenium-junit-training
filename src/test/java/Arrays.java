public class Arrays {

    public static void main(String[] args) {

        //3,1

        String[][] salutation = {{"Mr. ", "Mrs. ", "Ms. "},
                {"Kumar"}};
        // Mr. Kumar
        System.out.println(salutation[0][0] + salutation[1][0]);
        // Mrs. Kumar
        System.out.println(salutation[0][1] + salutation[1][0]);


        String[] integerArray = {"3", "5", "6", "7", "8"};
        System.out.println(integerArray.length);
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }

        for (int i = integerArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < 2; j++) {
                System.out.println(integerArray[i]);
            }
        }
        // do loop and //while loop
        boolean pageloaded = false;
        do {
            //wait for 10sec
            //if page loaded
            // then pageloaded = true
            //else
            // then pageloaded = false
        } while (pageloaded == true);


        //5 6
        //6 7
        // Mr. Kumar System.out.println(salutation[0][0] + salutation[1][0]); // Mrs. Kumar System.out.println(salutation[0][1] + salutation[1][0]);


    }
}
