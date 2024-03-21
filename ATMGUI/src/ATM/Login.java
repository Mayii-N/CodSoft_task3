
package ATM;


class Login {

    private int defaultPin = 1234;
    boolean checkPin(int pin)  {
        boolean verification = false;
        
        if (pin == defaultPin)  {
            verification = true;
        }
        return verification;
    }
}
