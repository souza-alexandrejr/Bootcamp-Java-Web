package jogo.controlador;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import jogo.bean.Chute;

@SuppressWarnings("serial")
@Named
@ApplicationScoped
public class ChuteBean implements Serializable{
	
	private int numMenor = 0, numMaior = 100;
	private Chute chute;
	private int numero; 
	private int contTentativas = 10;
	private String mensagem;

	public ChuteBean() {
		this.chute = new Chute();
		this.numero = (int)java.lang.Math.round(java.lang.Math.random() * 100);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getContTentativas() {
		return contTentativas;
	}

	public void setContTentativas(int contTentativas) {
		this.contTentativas = contTentativas;
	}
	
	public Chute getChute() {
		return chute;
	}

	public void setChute(Chute chute) {
		this.chute = chute;
	}
	
	public int getNumMenor() {
		return numMenor;
	}

	public void setNumMenor(int numMenor) {
		this.numMenor = numMenor;
	}

	public int getNumMaior() {
		return numMaior;
	}

	public void setNumMaior(int numMaior) {
		this.numMaior = numMaior;
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void validaChute(FacesContext context, UIComponent toValidate, String valor) {
		if (!valor.matches("[0-9]+")) {
			FacesMessage mensagem = new FacesMessage("Chute inválido!");
			context.addMessage(toValidate.getClientId(context), mensagem);
			((UIInput) toValidate).setValid(false);
		}
		else {
			int entrada = Integer.parseInt(valor);
			if ((entrada < this.numMenor) || (entrada > this.numMaior)) {
				FacesMessage mensagem = new FacesMessage("Chute inválido!");
				context.addMessage(toValidate.getClientId(context), mensagem);
				((UIInput) toValidate).setValid(false);
			}
		}
	}
	
	public void compararChute() {
		int entrada = Integer.parseInt(chute.getValor());
		if (getContTentativas()!=0) {
			if (this.numero == entrada) {
				this.setMensagem("PARABÉNS, VOCÊ ACERTOU!!!");
				}
			else if(this.numero > entrada) {
				this.setMensagem("Maior!");
				setNumMenor(entrada+1);
				setNumMaior(this.numMaior);
				setContTentativas(getContTentativas() - 1);
			}
			else {
				this.setMensagem("Menor!");
				setNumMenor(this.numMenor);
				setNumMaior(entrada-1);
				setContTentativas(getContTentativas() - 1);
			}
		}
		else
			this.setMensagem("SEU NÚMERO DE TENTATIVAS ACABOU! REINICIAR JOGO!");
	}
	
	public String reiniciar() {
		this.chute = new Chute();
		this.numero = (int)java.lang.Math.round(java.lang.Math.random() * 100);
		this.numMenor = 0;
		this.numMaior = 100;
		this.contTentativas = 10;
		this.mensagem = "";
		System.out.println(getNumero()); // para teste
		return "index";
	}

}
