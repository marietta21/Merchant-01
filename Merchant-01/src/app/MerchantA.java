package app;


public class MerchantA extends Merchant implements Bonus {

    String email;
    String lastName;

    public MerchantA(String firstName, String lastName, String phone, String email) {
        super(firstName, phone);
        this.lastName = lastName;
        this.email = email;
    }

    public String infoMerchant() {
        String firstName = getName();
        String phone = getPhone();
        return "\nMerchant: " + firstName + " " + lastName + ", " + phone + ", " + email + "\n";
    }

    @Override
    public double calcBonus(double sales) {
        if (sales <= 10000) {
            return sales * 5 / 100;
        } else if (sales > 10000 && sales <= 30000) {
            return sales * 10 / 100;
        } else if (sales > 30000 && sales <= 50000){
            return sales * 15 / 100;
        } else {
            return sales * 20 / 100;
        }
    }
}
