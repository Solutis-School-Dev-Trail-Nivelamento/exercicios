package TrabalhoDeClassePOO;

public class Main {
    public static void main(String[] args) {
        // Criação dos trabalhadores
        SeguroSaude chefe1 = new Chefe("Antonio", "Pereira", 4500, "32534534", 1);
        SeguroSaude chefe2 = new Chefe("Marcos", "Vinicius", 5000, "4634634", 0);
        SeguroSaude trabalhador1 = new TrabalhadorPorComissao("Joao", "Silva", "43523532", 2);
        SeguroSaude trabalhador2 = new TrabalhadorPorComissao("Maria", "Silva", "433452345", 2);

        // Criação de um vetor para armazenar todos os trabalhadores
        SeguroSaude[] trabalhadores = new SeguroSaude[4];
        trabalhadores[0] = chefe1;
        trabalhadores[1] = chefe2;
        trabalhadores[2] = trabalhador1;
        trabalhadores[3] = trabalhador2;

        // Imprime a legislação do seguro
        System.out.println("Legislação do seguro: " + SeguroSaude.LEGISLACAO);
        System.out.println();

        // Loop para imprimir as informações de cada trabalhador
        for (int i = 0; i < trabalhadores.length; i++) {
            System.out.println("Trabalhador " + (i + 1) + ":");
            System.out.println("Matrícula: " + trabalhadores[i].getMatriculaPlano());
            System.out.println("Nome completo: " + trabalhadores[i].getNomeCompletoTitular());
            System.out.println("Quantidade de dependentes: " + trabalhadores[i].getQtdeDependentes());
            System.out.println();
        }
    }
}
