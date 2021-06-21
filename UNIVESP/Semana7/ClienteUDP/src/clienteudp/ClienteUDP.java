package clienteudp;

// Ilustra a implementação do Client UDP usando DatagramSocket
import java.io.IOException; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.util.Scanner; 

public class ClienteUDP {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        // cria um socket
        DatagramSocket ds = new DatagramSocket();

        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;

        // enquanto não digitar tchau 
        while (true) {
            String inp = sc.nextLine();

            // converte a string de entrada em um vetor de bytes 
            buf = inp.getBytes();

            // Step 2 : Cria o datagramPacket para ser enviado pela rede  
            DatagramPacket DpSend
                    = new DatagramPacket(buf, buf.length, ip, 1234);

            // invoca o send para fazer o envio de fato
            ds.send(DpSend);

            // para o loop quando o usuário digitar tchau
            if (inp.equals("tchau")) {
                break;
            }
        }
    }
}

