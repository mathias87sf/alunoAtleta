import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class App {
/*
        public static int contaCorredores(Atleta[] atletas) {
                int cont = 0;
                for (int i = 0; i < atletas.length; i++) {
                        if (atletas[i].getModalidade() == Modalidade.CORRIDA) {
                                cont++;
                        }
                }
                return cont;
        }

        public static int contaCorredores(List<Atleta> atletas) {
                int cont = 0;
                for (Atleta a:atletas) {
                        if (a.getModalidade() == Modalidade.CORRIDA) {
                                cont++;
                        }
                }
                return cont;
        }

        public static void main(String[] args) {
                Aluno alunos[] = new Aluno[3];

                alunos[0] = new AlunoAtrib(10, "Huguinho");
                alunos[1] = new AlunoArranjo(20, "Zezinho");
                alunos[2] = new AlunoAtleta(30, "Luizinho", Modalidade.BASQUETE);

                IFuncionario funcionarios[] = new IFuncionario[3];
                funcionarios[0] = new FuncionarioAtrib(100, "Ze", 5000, Modalidade.CORRIDA);
                funcionarios[1] = new FuncionarioAtrib(200, "Ze Maria", 7000, Modalidade.FUTEBOL);
                funcionarios[2] = new FuncionarioStr(300, "Ze Maria", 7000, Modalidade.NONE);

                Atleta atletas[] = new Atleta[5];
                atletas[0] = (Atleta)funcionarios[0];
                atletas[1] = (Atleta)alunos[2];
                atletas[2] = (Atleta)funcionarios[1];
                atletas[3] = (Atleta)funcionarios[2];
                atletas[4] = new AlunoAtleta(1012, "Fulano", Modalidade.NATACAO);

                for (int i = 0; i < atletas.length; i++) {
                        System.out.println(atletas[i].getNome()+":"+atletas[i].getModalidade());
                }
        */
        public static void main(String args[]){
                List<Aluno> alunos = new LinkedList<>();

                Aluno ze = new AlunoAtrib(20, "Zezinho");
                alunos.add(new AlunoAtrib(10, "Huguinho"));
                alunos.add(ze);
                alunos.add(new AlunoAtrib(30, "Luizinho"));
                ze.setNota(1, 8);
                ze.setNota(2, 7);
                ze.setNota(3, 6);

                Collections.sort(alunos);
                for(Aluno a:alunos){
                        System.out.println(a);
                }

                // Classe aninhada anônima para definir o citério de comparação
                alunos.sort(new Comparator<Aluno>(){
                        @Override
                        public int compare(Aluno este, Aluno aquele) {
                                return este.getNome().compareTo(aquele.getNome());
                        }
                });

                /*
                System.out.println("-----");
                alunos.sort(new ComparadorAlunosPeloNome());
                for(Aluno a:alunos){
                        System.out.println(a);
                }
                System.out.println("-----");
                alunos.sort(new ComparadorDeAlunoPelaMedia());
                for(Aluno a:alunos){
                        System.out.println(a);
                }
                */
        }
}
