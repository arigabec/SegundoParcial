package segundoParcial.E1;

public class Client {
    public static void main(String[] args){
        Controlador caretaker = new Controlador();
        Versionador originator = new Versionador();
        Documento documento;

        documento = new Documento("Primeras lineas", "State1");
        originator.setVersion(documento);
        caretaker.addVersion(originator.createVersion());


        documento = originator.restoreVersion(caretaker.getVersion(0));

        documento.showInfo();
    }
}
