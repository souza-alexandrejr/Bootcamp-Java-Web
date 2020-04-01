package questao03;

public enum StatusUsuario {
	NOVO(1), ATIVO(2), BLOQUEADO(3), BANIDO(4);
	
	public final int opcao;  

    private StatusUsuario(int opcaoEscolhida) {  
        this.opcao = opcaoEscolhida;  
    }  

    public static StatusUsuario getOpcao(int opcao){
        switch (opcao) {
            case 1:
                return NOVO;
           case 2:
                return ATIVO;
            case 3:
                return BLOQUEADO;
            case 4:
            	return BANIDO;
            default:
                throw new IllegalArgumentException();
        }
    }

}
