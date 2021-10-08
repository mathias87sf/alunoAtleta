public class FuncionarioStr implements IFuncionario,Atleta{
    private String dados;

    public FuncionarioStr(int matricula, String nome, float salario, Modalidade modAtleta) {
		dados = matricula + ",";
		dados = dados + nome + ",";
		dados = dados + salario + ",";
		dados = dados + modAtleta;
	}

    private String parse(int i){            
        String[] aux = dados.split(",");
        return aux[i];
    }

    @Override
    public float getSalario() {
        return Float.parseFloat(parse(2));
    }

    @Override
    public void setSalario(float salario) {
        String aux[] = dados.split(",");
        aux[2] = ""+salario;
        dados = aux[0]+","+aux[1]+","+aux[2]+","+aux[3];
    }

    @Override
    public int getMatricula() {
        return Integer.parseInt(parse(0));
    }

    @Override
    public String getNome() {
        return parse(1);
    }

    @Override
    public Modalidade getModalidade() {
        switch(parse(3)){
            case "CORRIDA":
                return Modalidade.CORRIDA;
            case "NATACAO":
                return Modalidade.NATACAO;
            case "FUTEBOL":
                return Modalidade.FUTEBOL;
            case "VOLEI":
                return Modalidade.VOLEI;
            case "BASQUETE":
                return Modalidade.BASQUETE;
            case "TENIS":
                return Modalidade.TENIS;            
            default:
                return Modalidade.NONE;
        }
    }
}
