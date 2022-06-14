package segundoParcial.E1;

public class Client {
    public static void main(String[] args){
        Controlador caretaker = new Controlador();
        Versionador originator = new Versionador();
        Documento documento;

        documento = new Documento("Primeras lineas", "Primer Cambio");
        originator.guardarCambio(documento);
        caretaker.addVersion(originator.createCambio());

        documento = new Documento("Nuevas lineas", "Segundo Cambio");
        originator.guardarCambio(documento);
        caretaker.addVersion(originator.createCambio());

        documento = new Documento("Cambios nuevos", "Tercer Cambio");
        originator.guardarCambio(documento);
        caretaker.addVersion(originator.createCambio());

        int nroCambios = 3;
        // Equivalente al ctrl+z
        documento = originator.revertirCambio(caretaker.getVersion(nroCambios - 2));
        documento.showInfo();

        documento = originator.revertirCambio(caretaker.getVersion(nroCambios - 1));
        documento.showInfo();

        documento = originator.revertirCambio(caretaker.getVersion(nroCambios));
        documento.showInfo();

        // Equivalente al ctrl+y
        documento = originator.revertirCambio(caretaker.getVersion(nroCambios - 1));
        documento.showInfo();

        documento = originator.revertirCambio(caretaker.getVersion(nroCambios - 2));
        documento.showInfo();
    }
}
