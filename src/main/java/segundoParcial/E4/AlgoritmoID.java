package segundoParcial.E4;

import java.util.List;

public class AlgoritmoID implements IStrategy {

    @Override
    public void ordenar(List<Libro> list){
        System.out.println("Ordenando por ID");
        /* Collections.sort(lista, new Comparator<TuObjeto>() {
            public int compare(TuObjeto obj1, TuObjeto obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        });*/

    }
}
