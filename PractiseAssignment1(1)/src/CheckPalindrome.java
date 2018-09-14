import java.math.BigInteger;
import java.util.Scanner;

public class CheckPalindrome {
    private BigInteger number;

    public BigInteger takeInput() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter any number : ");
            try {
                number = input.nextBigInteger();
                return number;
            } catch (java.util.InputMismatchException e) {
                System.out.println("enter valid number!!");
                input.nextLine();
            }
        }
    }

    public static BigInteger reverseNumber(BigInteger origNumber) {
        BigInteger remainder;
        BigInteger divideValue = new BigInteger("10");
        BigInteger revNumber = new BigInteger("0");
        BigInteger compareValue = new BigInteger("0");
        while (origNumber.compareTo(compareValue) != 0) {
            remainder = origNumber.remainder(divideValue);
            revNumber = revNumber.multiply(divideValue).add(remainder);
            origNumber = origNumber.divide(divideValue);
        }
        return revNumber;
    }

    public boolean checkPalindrome(Object num) {

        if(!(num.toString().length()==0)) {
            try {
                if (num instanceof BigInteger) {
                    if (((BigInteger) num).toString().length() != 0) {
                        BigInteger origNumber = (BigInteger) num;
                        BigInteger revNUmber = reverseNumber(origNumber);
                        if (origNumber.compareTo(revNUmber) == 0) {
                            return true;
                        }
                    }
                }
                else if(num instanceof Integer){
                    BigInteger intnum=new BigInteger(""+num);
                    BigInteger revNUmber = reverseNumber(intnum);
                    if (intnum.compareTo(revNUmber) == 0) {
                        return true;
                    }
                }


            } catch (Exception e) {

                System.out.println("Not a valid input");
            }
        }
        return false;
    }


}








