//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        //Step 1: Create an array to hold five different weather temperatures.
        //int [] temperatures = new int [5];

        //Step 2: Initialize the array with five temperature values of your choice.

        //temperatures[0] = 25 ;

        int [] temperatures = {25,-10,38,100,-196};


        // Step 3: Change the temperature at the third position (index 2) to a new value.
        temperatures[2] = 38 ;

        //Step 4: Use a loop to display all the temperatures in your array.


        for(int i =0 ; i<temperatures.length;i++){
            System.out.println(temperatures[i]);
        }



        }
    }