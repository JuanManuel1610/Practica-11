/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21juanp11;

import com.google.gson.Gson;

/**
 *
 * @author user
 */
public class G4s21Juanp11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        datos datos = new datos("Juan", 20, "personal@gmail.com");
        Gson gson = new Gson();
        String cadena = gson.toJson(datos);
        System.out.println("Nombre " + datos.getNombre());
        System.out.println("Edad " + String.valueOf(datos.getEdad()));
        System.out.println("Correo " + datos.getCorreo());
        
        System.out.println("La cadena contiene = " + cadena);
        
        String cjson ="{\"nombre\":\"Javier\",\"edad\":22,\"correo\":\"sin correo\"}";
        
       datos dato2=gson.fromJson(cjson, datos.class);
       System.out.println("Nombre " + dato2.getNombre());
        System.out.println("Edad " + String.valueOf(dato2.getEdad()));
        System.out.println("Correo " + dato2.getCorreo());
    }
    
}
