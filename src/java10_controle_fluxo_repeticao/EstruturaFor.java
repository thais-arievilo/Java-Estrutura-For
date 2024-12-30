package java10_controle_fluxo_repeticao;

public class EstruturaFor {
    public static void main(String[] args) {
        for(int carneiro = 1;carneiro <= 20;carneiro++) {
            System.out.println(carneiro + " carneirinho(s)");
        }

        int carneiros = 0;
        for( ; carneiros <= 20 ; ) {
            System.out.println(carneiros + " carneirinho(s)");
            carneiros = carneiros +4; //colocando o +numero, é a quantidade que será somando
        }

        //É utilizado o length, porque o indice do array seria divergete com a variavel contadora (uma contadora iria ficar vazia, e um indice não seria impresso)
        String alunos[] = {"Thaís", "Eliana", "Josefa", "Murilo"};
        for(int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno do código " + i + " é  " + alunos[i]);
        }

        //Percorre todo o array, mas não é necessario utilizar os indices (ForEach)
        for(String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
