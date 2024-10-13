public class Notebook extends Produto{

    private double armazenamento;
    private String gpu;
    private String processador;

    public Notebook(String nome, double preco, double armazenamento, String gpu, String processador) {
        super(nome, preco);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }

    @Override
    public String etiquetaPreco(){
        System.out.println("Armazenamento: " + armazenamento + "GB");
        System.out.println("GPU: " + gpu);
        System.out.println("Processador: " + processador);
        return super.etiquetaPreco();
    }
}
