package segundoParcial.E4;

public class Client {
    public static void main(String[] args){
        Database db = new Database();
        db.addLibros(new Libro("123", "Blancanieves", "Infantil"));

        // db.setStrategy(new AlgoritmoID());
        db.ordenar();
    }
}
