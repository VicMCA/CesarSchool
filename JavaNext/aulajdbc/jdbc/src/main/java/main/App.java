package main;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.net.ConnectException;
// import java.util.ArrayList;
// import java.sql.PreparedStatement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// import java.sql.ResultSet;
import main.java.main.Usuario;

public class App {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banco-next");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {
    
        Usuario user = null;
        try {
            user = entityManager.find(Usuario.class, 1);
            System.out.println(user.getNome());

        } catch (Exception e) {
            e.printStackTrace();
        }

        Usuario varUser = new Usuario("Gerson", "Rodrigues", "gersonrs", "next");

        //================================= Inserção
        entityManager.getTransaction().begin();
        entityManager.persist(varUser);
        entityManager.getTransaction().commit();
        //================================= Atualização
        if (user != null) {
            entityManager.getTransaction().begin();
            user.setNome("Guga"); // update
            entityManager.getTransaction().commit();
        }
        //================================= Deleção
        Usuario novoUser = entityManager.find(Usuario.class, 4); // select
        entityManager.getTransaction().begin();
        entityManager.remove(novoUser);
        entityManager.getTransaction().commit();
        //================================= Fechar
        entityManager.close();
        entityManagerFactory.close();

    }
}
  