package criathread;

public class CriaThread extends Thread {

    static class Task1 extends Thread {
        // sobrescreve o método run() herdado
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Utiliza Herança");
            }
        }
}
    // implementa a interface Runnable
    static class Task2 implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Utiliza Runnable");
            }
        }
    }

    public static void main(String[] args) {
        // intância da classe que estende Thread
        Thread threadComHeranca = new Task1();
        // alocação de uma instância de tarefa
        Task2 tarefa = new Task2();
        // criação da nova Thread, passando tarefa como argumento
        Thread threadComRunnable = new Thread(tarefa);
        // inicialização das duas Threads
        threadComHeranca.start();
        threadComRunnable.start();
    }
}
