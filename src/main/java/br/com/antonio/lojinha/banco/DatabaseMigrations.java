
package br.com.antonio.lojinha.banco;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;

/**
 *
 * @author professor
 */
public class DatabaseMigrations {
    public static void main(String [] args){
        try{
            Flyway flyway = Flyway
                .configure()
                .dataSource("jdbc:mysql://localhost:3306/lojinha", "root", "231281")
                .locations("classpath:db/migration").validateMigrationNaming(true)
                .load();
        flyway.migrate(); // Executa as migrations
        System.out.println("Migration executada");
        }catch(FlywayException ex){
            System.out.println("Ex:" + ex.getMessage());
        }
        
    }
}
