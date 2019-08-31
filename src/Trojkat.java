public class Trojkat {
    double bok1;
    double bok2;
    double bok3;

    public Trojkat(double bok1, double bok2, double bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }

    String sprawdz() {


        if (bok1 <=0 || bok2 <= 0 || bok3 <= 0)
            return "nie istnieje";
        if (bok1+bok2<bok3 ||bok1+bok3<bok2 ||bok2+bok3<bok1)
            return "nie istnieje";
        if (bok1 == bok2 && bok2 == bok3) {
            return "rownoboczny";
        } else if (bok1 == bok2 || bok1 == bok3 || bok2 == bok3) {
            return "rownoramienny";
        } else
            return "roznoboczny";


    }
}

