package entities;

public class Bill {

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public Bill(){
    }

    public Bill(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;

    }

    public double cover() {
        double consumo = feeding();
        if (consumo > 30.0) {
            return 0;
        } else {
            return 4.0;
        }
    }

    public double feeding() {
        return beer * 5 + softDrink * 3 + barbecue * 7;
    }

    public double ticket() {
        if(gender == 'F') {
            return 8.00;
        } else if (gender == 'M') {
            return 10.00;
        }
        return 0;
    }

    public double total() {
        return cover() + feeding() + ticket();
    }
}
