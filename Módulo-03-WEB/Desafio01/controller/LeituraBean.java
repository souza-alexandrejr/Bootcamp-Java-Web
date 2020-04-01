package livraria.controlador;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class LeituraBean implements Serializable {
	
	private int paginas;

	public LeituraBean() {
		this.paginas = 0;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
}
