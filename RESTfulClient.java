/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufidelitas;

/**
 *
 * @author geral
 */
public class RESTfulClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inserta(200,"CELULAR",1000);
        consulta(200);
        consulta(1);
    }

    public static void inserta(int codigo, String descripcion, float precio) {
        String xmlInserta = "<articulo>"
                + "<codigo>" + codigo + "</codigo>"
                + "<descripcion>" + descripcion + "</descripcion>"
                + "<precio>" + precio + "</precio></articulo>";
        Client client = new Client();
        client.create_XML(xmlInserta);
        client.close();
    }

    public static void consulta(int codigo) {
        Client client = new Client();
        String xmlConsulta = client.find_XML(String.class, "" + codigo);
        javax.swing.JOptionPane.showMessageDialog(null, "La información es:\n" + xmlConsulta);
        client.close();
    }

}
