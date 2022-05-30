package persoana;

/*author: otiliaH*/
public class Persoana {

    private String nume;
    private String varsta;
    private String sex;
    private String stareCivila;
    private String angajat;

    public Persoana(String nume, String varsta, String sex, String stareCivila, String angajat) {
        this.nume = nume;
        this.varsta = varsta;
        this.sex = sex;
        this.stareCivila = stareCivila;
        this.angajat = angajat;
    }

    public static Persoana getInstance(String nume, String varsta, String sex, String stareCivila, String angajat) {
        if (nume == null || nume.trim().isEmpty() || nume.length() < 2 || (nume.indexOf(" ") != nume.lastIndexOf(" "))) {
            return null;
        }
        for (int i = 0; i < varsta.length(); i++) {
            if (Character.isLetter(varsta.charAt(i))) {
                return null;
            }
        }
        if (varsta.trim().length() == 0 || Integer.parseInt(varsta) <= 0 || Integer.parseInt(varsta) > 150) {
            return null;
        }
        return new Persoana(nume, varsta, sex, stareCivila, angajat);
    }

    public String getNume() {
        return nume.substring(0, 1).toUpperCase() + nume.substring(1).toLowerCase();
    }

    public String getVarsta() {
        return varsta;
    }

    public String getSex() {
        return sex;
    }

    public String getStareCivila() {
        return stareCivila;
    }

    public String getAngajat() {
        return angajat;
    }

    @Override
    public String toString() {
        String[] n = nume.split(" ");
        if (n.length == 1) {
            return " Nume: " + nume.substring(0, 1).toUpperCase() + nume.substring(1).toLowerCase()
                    + "\n Varsta:  " + varsta + " ani \n Sex:  " + sex + "\n Angajat/Neangajat:  " + angajat + "\n Stare civila:  " + stareCivila;
        } else {
            return " Nume: " + n[0].substring(0, 1).toUpperCase() + n[0].substring(1).toLowerCase() + " " + n[1].substring(0, 1).toUpperCase() + n[1].substring(1).toLowerCase()
                    + "\n Varsta:  " + varsta + " ani \n Sex:  " + sex + "\n Angajat/Neangajat:  " + angajat + "\n Stare civila:  " + stareCivila;
        }
    }
}
