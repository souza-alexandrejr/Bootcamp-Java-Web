package questao03;

import java.util.Date;
import java.util.List;

public class Conta {
	
	private int id;
	private Endereco endCobranca;
	private boolean fechado;
	private Date dataAbertura;
	private Date dataEncerramento;
	private Consumidor consumidor;
	private List<Pagamento> pagamentos;
	private List<Pedido> pedidos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Endereco getEndCobranca() {
		return endCobranca;
	}
	public void setEndCobranca(Endereco endCobranca) {
		this.endCobranca = endCobranca;
	}
	public boolean isFechado() {
		return fechado;
	}
	public void setFechado(boolean fechado) {
		this.fechado = fechado;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataEncerramento() {
		return dataEncerramento;
	}
	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
	public Consumidor getConsumidor() {
		return consumidor;
	}
	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}
