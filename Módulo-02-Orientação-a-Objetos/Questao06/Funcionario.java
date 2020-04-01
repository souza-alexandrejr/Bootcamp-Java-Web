package questao06;

import java.util.ArrayList;

public class Funcionario {

	private Integer matricula;
	private String nomeCompleto;
	private String cpf;
	private Integer sexo;
	private String dataDeNascimento;
	private double salario;
	private int telefone;
	private ArrayList<Dependente> dependentes;
	
	// ENCAPSULAMENTO
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Integer getSexo() {
		return sexo;
	}
	
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public ArrayList<Dependente> getDependentes() {
		return dependentes;
	}
	
	public void setDependentes(ArrayList<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	
}
