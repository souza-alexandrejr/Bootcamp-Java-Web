package livraria.controlador;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@SessionScoped
public class ListaBean implements Serializable {
	
	private static final String redirect = "?face-redirect=true";
	
	public static String getRedirect() {
		return redirect;
	}

	public String voltar() {
		return "livros";
	}
	
	public String encerrarSessao() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "lista" + redirect;
	}

}
