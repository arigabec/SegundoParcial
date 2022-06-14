package segundoParcial.E2;

public class Client {
    public static void main(String[] args){
        ConcreteChat chat = new ConcreteChat();

        Estudiante e1 = new Estudiante(chat);
        e1.setTipoPersona("estudiante");
        e1.setNombre("Carlos");

        Estudiante e2 = new Estudiante(chat);
        e2.setTipoPersona("estudiante");
        e2.setNombre("Luisa");

        Docente d1 = new Docente(chat);
        d1.setTipoPersona("docente");
        d1.setNombre("Ramiro");

        Docente d2 = new Docente(chat);
        d2.setTipoPersona("docente");
        d2.setNombre("Alma");

        Administrativo a1 = new Administrativo(chat);
        a1.setTipoPersona("administrativo");
        a1.setNombre("Esteban");

        Administrativo a2 = new Administrativo(chat);
        a2.setTipoPersona("administrativo");
        a2.setNombre("Rafaela");

        chat.addToChat(e1);
        chat.addToChat(e2);
        chat.addToChat(d1);
        chat.addToChat(d2);
        chat.addToChat(a1);
        chat.addToChat(a2);

        // Los estudiantes pueden decidir si su mensaje es enviado a todos, solo a docentes o solo administrativos.

        e1.send("Este mensaje es para todos", "grupal");
        e1.send("Este mensaje es para los docentes", "docentes");

        // Los docentes solo envían mensajes a docentes y estudiantes.
        d2.send("Este mensaje es para los estudiantes", "estudiantes");

        // Los administrativos envían mensajes a todos.
        a2.send("Este mensaje es para todos", "grupal");
    }
}
