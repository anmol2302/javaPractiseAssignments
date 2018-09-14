import java.math.BigInteger;

import static java.lang.Math.log;

public class PowerFour{
    BigInteger num;
    public boolean retValue(Object number) {
        boolean found = false;

        if (number instanceof BigInteger) {
            num = (BigInteger) number;

        }

        if (number instanceof Integer) {

            num = new BigInteger("" + number);


        }

        if (number instanceof String) {
            num = new BigInteger(number+"");

        }

        if (num.toString().length() != 0) {

            if(num.signum()!=1){ // condition to check weather the number is positive or not

                num=num.multiply(new BigInteger("-1"));
            }

            double i = Math.log(num.doubleValue()) / log(4);
            if(i-(int)i==0){

                return true;
            }
            else{
                return false;
        }
        }
        return false;
    }

    }





