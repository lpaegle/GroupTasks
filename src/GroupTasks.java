import java.util.Scanner;

public class GroupTasks {
    public static void main(String[] args) {
        //////////Task 1
        //Print first, last and any other element from array.
        int[] cocktailsInDay = {2,4,8,5,6};
        System.out.println("First day's cocktails: " + cocktailsInDay[0]);
        System.out.println("Last day's cocktails: " + cocktailsInDay[4]);
        System.out.println("Third day's cocktails: " + cocktailsInDay[2]);

        //Initialization of values with random numbers; Print elements and length of array.
        cocktailsInDay[0] = (int) (Math.random()*100d);
        cocktailsInDay[1] = (int) (Math.random()*100d);
        cocktailsInDay[2] = (int) (Math.random()*100d);
        cocktailsInDay[3] = (int) (Math.random()*100d);
        cocktailsInDay[4] = (int) (Math.random()*100d);
        System.out.println("Random number #1: " + cocktailsInDay[0]);
        System.out.println("Random number #2: " + cocktailsInDay[1]);
        System.out.println("Random number #3: " + cocktailsInDay[2]);
        System.out.println("Random number #4: " + cocktailsInDay[3]);
        System.out.println("Random number #5: " + cocktailsInDay[4]);
        System.out.println("Length of the array is " + cocktailsInDay.length);

        //Sum of all elements
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            counter += cocktailsInDay[i];
        }
        System.out.println("Sum of elements: " + counter);

        ///Bonus - user input asking to set first and last element;
        ///  Other elements have random values
        int[] countOfCandies = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first element: ");
        int firstElement = scanner.nextInt();
        System.out.println("Please enter last element: ");
        int lastElement = scanner.nextInt();

        countOfCandies[0] = firstElement;
        countOfCandies[1] = (int)(Math.random()*100d);
        countOfCandies[2] = (int)(Math.random()*100d);
        countOfCandies[3] = (int)(Math.random()*100d);
        countOfCandies[4] = lastElement;

        System.out.println("Arrays elements: "); //Prints out all elements
        System.out.println(countOfCandies[0]);
        System.out.println(countOfCandies[1]);
        System.out.println(countOfCandies[2]);
        System.out.println(countOfCandies[3]);
        System.out.println(countOfCandies[4]);

        //Sum of all elements
        int elementSum = 0;
        for (int i = 0; i < countOfCandies.length; i++) {
            elementSum += countOfCandies[i];
        }
        System.out.println("Sum of elements is " + elementSum);
        System.out.println("Sum of the users numbers: " + (firstElement + lastElement));
        System.out.println("------------------------------");

        //////////Task 2

        int[] numArray = {8,5,10,1,4,2,15,18,6,3};
        int sum = 0;
        //In a for loop print all odd values
        System.out.println("Odd numbers from array: ");
        for (int i = 0; i < 10; i++) {
            if (numArray[i] % 2 != 0){
                System.out.println(numArray[i]);
                //Print sum of all odd values
                sum += numArray[i];
            }
        }
        System.out.println("Sum of odd numbers is " + sum);

        ////Bonus - find smallest value and largest
        int smallest = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < smallest){
                smallest = numArray[i];
            }
        }
        System.out.println("Smallest number from array: " + smallest);

        int largest = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > largest){
                largest = numArray[i];
            }
        }
        System.out.println("Largest element in array: " + largest);

    }
}
