package TrabalhoDeClassePOO;

public class TrabalhadorPorComissao extends Trabalhador implements SeguroSaude{

   private String matricula;
   private int quantidadeDependentes;

    public TrabalhadorPorComissao(String nome, String sobrenome, String matricula, int quantidadeDependentes) {
        super(nome, sobrenome);
        this.matricula = matricula;
    }

    @Override
    public String getMatriculaPlano() {
        return "";
    }

    @Override
    public int getQtdeDependentes() {
        return 0;
    }

    @Override
    public String getNomeCompletoTitular() {
        return "";
    }

    @Override
    public double gerarSalario() {
        return 0;
    }


}
