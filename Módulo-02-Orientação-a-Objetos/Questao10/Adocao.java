package questao10;

import java.util.Date;

public class Adocao {
	
	int id;
	Animal animal;
	Adotante adotante;
	Date dataAdocao;
	Date dataDevolucao;
	Usuario usuario;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Animal getAnimal() {
		return animal;
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public Adotante getAdotante() {
		return adotante;
	}
	
	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}
	
	public Date getDataAdocao() {
		return dataAdocao;
	}
	
	public void setDataAdocao(Date dataAdocao) {
		this.dataAdocao = dataAdocao;
	}
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
