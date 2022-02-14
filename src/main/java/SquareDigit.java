import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareDigit {

    public int squareDigits(int digits) {
        String strDigits = String.valueOf(digits);
        List<String> digitList = new ArrayList<>();
        String answer = "";

        //Split string into each value and add to arraylist
        digitList = Arrays.asList(strDigits.split(""));

        //Use special for loop to move through each item in list
        for (String number : digitList) {

            //Change each value to an int, use Math.pow to raise the number to second power, format no decimals, add to string
            answer = answer + String.format("%.0f", Math.pow(Integer.parseInt(number), 2));
        }

        //Return the final string converted to an int
        return Integer.parseInt(answer);
    }
}
