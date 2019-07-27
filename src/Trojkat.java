public class Trojkat {
    int bok1;
    int bok2;
    int bok3;

    public Trojkat(int bok1, int bok2, int bok3) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.bok3 = bok3;
    }

    String sprawdz() {

        if (bok1 == bok2 && bok2 == bok3) {
            return "rownoboczny";
        } else if (bok1 == bok2 || bok1 == bok3 || bok2 == bok3) {
            return "rownoramienny";
        } else {
            return "roznoboczny";
        }
    }
}

