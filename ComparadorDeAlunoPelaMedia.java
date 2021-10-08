import java.util.Comparator;

public class ComparadorDeAlunoPelaMedia implements Comparator<Aluno> {

    @Override
    public int compare(Aluno este, Aluno aquele) {
        if (este.mediaFinal() < aquele.mediaFinal()){
            return 1;
        }else if (este.mediaFinal() == aquele.mediaFinal()){
            return 0;
        }else{
            return -1;
        }
        //return este.mediaFinal() - aquele.mediaFinal();
    }
    
}
