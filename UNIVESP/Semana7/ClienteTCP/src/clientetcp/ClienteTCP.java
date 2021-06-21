package clientetcp;

// Ilustra a implementação do cliente TCP Java usando Socket
import java.net.*;
import java.io.*;

public class ClienteTCP {

    // inicializa socket e streams de entrada e saída 
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    // construtor da classe, passando endereco e porta 
    public ClienteTCP(String address, int port) {
        // faz a conexão
        try {
            socket = new Socket(address, port);
            System.out.println("Conexão estabelecida...");

            // lê dados do terminal 
            input = new DataInputStream(System.in);

            // envia para socket 
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        }

        // string para ler mensagem da entrada 
        String line = "";

        // leia até que receba "Fim" 
        while (!line.equals("Fim")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException i) {
                System.out.println(i);
            }
        }

        // fecha a conexão
        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ClienteTCP client = new ClienteTCP("127.0.0.1", 5000);
    }
}
