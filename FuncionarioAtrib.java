
public class FuncionarioAtrib implements IFuncionario, Atleta {
    private int matricula;
    private String nome;
    private float salario;
    private Modalidade modAtleta;
   
	public FuncionarioAtrib(int matricula, String nome, float salario, Modalidade modAtleta) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		this.modAtleta = modAtleta;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public Modalidade getModalidade() {
		return modAtleta;
	}
}
