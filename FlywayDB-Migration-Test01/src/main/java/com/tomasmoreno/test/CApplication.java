package com.tomasmoreno.test;

import org.flywaydb.core.Flyway;

public class CApplication {

    public static void main(String[] args) {

        Flyway flyway = new Flyway();
        flyway.setDataSource( "jdbc:mysql://localhost:3306/TestDB02", "root", "rafael" );
        flyway.migrate();
        
    }

}
