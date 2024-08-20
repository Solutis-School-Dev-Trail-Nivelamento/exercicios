package TrabalhoDeClassePOO;

public class Chefe extends Trabalhador implements SeguroSaude {
    private double salarioBase;
    private String matriculaPlano;
    private int qtdeDependentes;

    // Construtor de Chefe
    public Chefe(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    public String getMatriculaPlano() {
        return this.matriculaPlano;
    }
    public int getQtdeDependentes() {
        return this.qtdeDependentes;
    }
    public String getNomeCompletoTitular() {
        return getNome() + " " + getSobrenome();
    }

    private String getSobrenome() {
        return "";
    }

    private String getNome() {
        return "";
    }

    @Override
    public double gerarSalario() {
        return 0;
    }
    // Demais métodos da classe.
}
