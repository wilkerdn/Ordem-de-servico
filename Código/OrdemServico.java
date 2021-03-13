
public class OrdemServico {
	private int codigo;
	private String descricao;
	private String data;
	private String status;
	private double preco;
	
	public OrdemServico(int codigo, String descricao, String data, String status, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.data = data;
		this.status = status;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void mudarStatus(String status) {
		setStatus(status);
	}
	
	public String imprimirOrdem() {
		String imp = "";
		imp = "Código: "+getCodigo()+"\nDescrição: "+getDescricao()+"\nData: "
				+getData()+"\nStatus: "+getStatus()+"\nPreco: "+getPreco();
		return imp;
	}
}
