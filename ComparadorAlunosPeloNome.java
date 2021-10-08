import java.util.Comparator;

public class ComparadorAlunosPeloNome implements Comparator<Aluno> {
    @Override
    public int compare(Aluno este, Aluno aquele){
        return este.getNome().compareTo(aquele.getNome());
    }
}
