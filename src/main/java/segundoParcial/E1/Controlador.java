package segundoParcial.E1;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Memento> stateList = new ArrayList<>();

    public void addVersion(Memento m){
        stateList.add(m);
    }

    public Memento getVersion(int position){
        return stateList.get(position);
    }
}
