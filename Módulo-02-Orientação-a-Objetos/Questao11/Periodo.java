package questao11;

import java.util.Date;

public class Periodo {
	
	private Date inicioSolicitacao;
	private Date fimSolicitacao;
	private Date inicioPeriodoLetivo;
	private Date fimPeriodoLetivo;
	
	public Date getInicioSolicitacao() {
		return inicioSolicitacao;
	}
	public void setInicioSolicitacao(Date inicioSolicitacao) {
		this.inicioSolicitacao = inicioSolicitacao;
	}
	public Date getFimSolicitacao() {
		return fimSolicitacao;
	}
	public void setFimSolicitacao(Date fimSolicitacao) {
		this.fimSolicitacao = fimSolicitacao;
	}
	public Date getInicioPeriodoLetivo() {
		return inicioPeriodoLetivo;
	}
	public void setInicioPeriodoLetivo(Date inicioPeriodoLetivo) {
		this.inicioPeriodoLetivo = inicioPeriodoLetivo;
	}
	public Date getFimPeriodoLetivo() {
		return fimPeriodoLetivo;
	}
	public void setFimPeriodoLetivo(Date fimPeriodoLetivo) {
		this.fimPeriodoLetivo = fimPeriodoLetivo;
	}
	
	public void criar() {
		System.out.println("Classe: Periodo");
		System.out.println("Metodo: criar");

	}
	
	public void visualizar() {
		System.out.println("Classe: Periodo");
		System.out.println("Metodo: visualizar");

	}
	
	public void editar() {
		System.out.println("Classe: Periodo");
		System.out.println("Metodo: editar");

	}
	

}
