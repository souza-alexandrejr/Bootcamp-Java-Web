package questao03;

public enum StatusPedido {
	NOVO(1), AGUARDANDO(2), ENVIADO(3), ENTREGUE(4), ENCERRADO(5);
	
	public final int opcao;  

    private StatusPedido(int opcaoEscolhida) {  
        this.opcao = opcaoEscolhida;  
    }  

    public static StatusPedido getOpcao(int opcao){
        switch (opcao) {
            case 1:
                return NOVO;
           case 2:
                return AGUARDANDO;
            case 3:
                return ENVIADO;
            case 4:
            	return ENTREGUE;
            case 5:
            	return ENCERRADO;
            default:
                throw new IllegalArgumentException();
        }
    }


}
