
package br.com.antonio.lojinha.banco;

import org.flywaydb.core.Flyway;

/**
 *
 * @author professor
 */
public class DatabaseMigrations {
    public static void main(String [] args){
        try{
            Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:mysql://localhost:3308/lojinha", "root", "231281")
                .locations("classpath:db/migration").validateMigrationNaming(true)
                .load();
        flyway.migrate(); // Executa as migrations
        System.out.println("Migration executada");
        }catch(Exception ex){
            System.out.println("Erro: "+ ex.getMessage());
            System.out.println("Causa: "+ ex.getCause());
        }
        
    }
}
