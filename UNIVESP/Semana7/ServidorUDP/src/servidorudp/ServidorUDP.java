package servidorudp;

// Java program to illustrate Server side 
// Implementation using DatagramSocket 
import java.io.IOException; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.net.SocketException; 

public class ServidorUDP {

    public static void main(String[] args) throws IOException {
        // Criar um soquete, escutando na porta 2020
        DatagramSocket ds = new DatagramSocket(2020);
        byte[] receive = new byte[65535];

        DatagramPacket DpReceive = null;
        while (true) {

            // Cria um DatgramPacket para receber o dado 
            DpReceive = new DatagramPacket(receive, receive.length);

            // Recebe o dado do buffer 
            ds.receive(DpReceive);

            System.out.println("Cliente: " + data(receive));

            // Finaliza o processo servidor, quando ele recebe "tchau" 
            if (data(receive).toString().equals("tchau")) {
                System.out.println("Cliente enviou tchau...");
                break;
            }

            // Limpa o buffer após receber a mensagem
            receive = new byte[65535];
        }
    }

    // Conversão de um vetor de bytes em uma String
    public static StringBuilder data(byte[] a) {
        if (a == null) {
            return null;
        }
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0) {
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}

