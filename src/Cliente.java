
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author paco
 */
public class Cliente {

    final String HOST = "172.16.2.237";
    final int PUERTO = 5000;
    Socket sc;
    DataOutputStream mensaje;
    DataInputStream entrada;
    String sa = "";
//Cliente

    public void initClient(String control) /*ejecuta este metodo para correr el cliente */ {
        try {

            sc = new Socket(HOST, PUERTO);
            /*conectar a un servidor en ip con puerto 5000*/

//creamos el flujo de datos por el que se enviara un mensaje

            mensaje = new DataOutputStream(sc.getOutputStream());
//             String ips=InetAddress.getLocalHost().getHostAddress();
//enviamos el mensaje
            mensaje.writeUTF(control + ",Alumno");
            entrada = new DataInputStream(sc.getInputStream());
//            System.out.println(entrada.readUTF());
            String Array[] = entrada.readUTF().split("\\.");
            String NombreAlumno = Array[0];
            System.out.println("nombre "+NombreAlumno);
            String dividir[] = Array[1].split("\\-");
            System.out.println("tamaño"+dividir.length);
            
            for (int i = 0; i < dividir.length; i++) {
                System.out.println("grupo de tres:: "+dividir[i]); 
            }
            
            String NombreCredito[] = dividir[0].split("\\,");
            String Nombreinstructur[] = dividir[1].split("\\,");
            String Dia[] = dividir[2].split("\\,");
            String hora[] = dividir[3].split("\\,");
          
            for (int i = 0; i < NombreCredito.length; i++) {
                ESTUDIANTE.visualizarCreditos( NombreCredito[i],Nombreinstructur[i],Dia[i],hora[i]);

            }
            ESTUDIANTE.jTextField2.setText(NombreAlumno);

//cerramos la conexión
            sc.close();

        } catch (Exception e) {

            System.out.println("Error: " + e);

        }

    }

}
