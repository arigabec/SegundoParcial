package segundoParcial.E1;

public class Versionador {
    private Documento state;

    public void setVersion(Documento state){
        System.out.println("Guardando version del documento" + state.getState());
        this.state = state;
    }

    public Memento createVersion(){
        return new Memento(state);
    }

    public Documento restoreVersion(Memento m){
        this.state = m.getState();
        System.out.println("Originator > restoreMemento > " + state.getState());
        return state;
    }
}
