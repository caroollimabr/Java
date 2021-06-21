package exemplomultithread;

// Exemplo que ilustra como a criação de uma thread ao implementar a interface Runnable

class Multithreading implements Runnable {

    @Override
    public void run() {
        try {
            // Mostra a thread em execução
            System.out.println("Thread " + Thread.currentThread().getId() + " está executando.");
        } catch (Exception e) {
            // lança exceção
            System.out.println("Exceção gerada!");
        }
    }
}

public class ExemploMultithread {
    public static void main(String[] args) {
        int n = 8; // Numero de threads
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(new Multithreading());
            t.start();
        }
    }
}
