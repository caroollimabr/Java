package exemploserializadeserializa;

    public class Funcionario implements java.io.Serializable {
        public String nome;
        public String endereco;
        public transient int id;
        public int numero;
        public void verificaEmail() {
            System.out.println("Checagem para: " + nome + " " + endereco);
        }
    }