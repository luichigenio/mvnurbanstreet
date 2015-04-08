/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.urbanstreet2.controller;

import com.urbanstreet2.view.Login;
import com.urbanstreet2.common.*;
import com.urbanstreet2.controller.database.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JMG12
 */
public class Main {

    public static Login login = new Login();

    public static void main(String[] args) {

        login.setVisible(true);
///probando conexion a la base de datos
        String name = null;
        String consulta = "SELECT * FROM personas";
        conexion conectar = new conexion();
        conectar.crearConexion();
        ResultSet resultado = conectar.ejecutarSQLSelect(consulta);
        try {

            while (resultado.next()) {
                System.out.println(resultado.getString(1));
                System.out.println(resultado.getString(2));
                System.out.println(resultado.getString(3));
                  System.out.println(resultado.getString(4));
                System.out.println(resultado.getString(5));
                System.out.println(resultado.getString(6));
                  System.out.println(resultado.getString(7));
                System.out.println(resultado.getString(8));
                System.out.println(resultado.getString(9));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
