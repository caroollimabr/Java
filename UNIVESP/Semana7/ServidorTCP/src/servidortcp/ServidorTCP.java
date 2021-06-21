package servidortcp;

import java.net.*; 
import java.io.*; 

public class ServidorTCP {
    //inicializa o socket e stream de entrada 

    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    // construtor passando a porta 
    public ServidorTCP(int port) {
        // inicia o servidor e espera pela conexão do cliente 
        try {
            server = new ServerSocket(port);
            System.out.println("Servidor inicializado...");

            System.out.println("Esperando pela conexão do cliente ...");

            socket = server.accept();
            System.out.println("Cliente conecatado...");

            // lê do socket cliente
            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));

            String line = "";

            // ler mensagem do cliente até que "Fim" seja escrito 
            while (!line.equals("Fim")) {
                try {
                    line = in.readUTF();
                    System.out.println(line);

                } catch (IOException i) {
                    System.out.println(i);
                }
            }
            System.out.println("Conexão finalizada!");

            // fecha a conexão
            socket.close();
            in.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ServidorTCP server = new ServidorTCP(5000);
    }
}
