package persoana;

import java.util.ArrayList;
import java.util.List;

/* @author otilia*/
public class ListaPersoane {

    private List<Persoana> pers = new ArrayList<>();

    public Persoana adaugarePersoana(Persoana p) {
        pers.add(p);
        return p;
    }

    public Persoana getPersoana(int index) {
        return pers.get(index);
    }

    public void stergePersoana(int index) {
        pers.remove(getPersoana(index));
    }

    public void golesteLista() {
        pers.removeAll(pers);
    }
}
