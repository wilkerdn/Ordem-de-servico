import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String endereco;
	private String CpfCnpj;
	private String telefone;
	private ArrayList<OrdemServico> servicos = new ArrayList<>();
	
	public Cliente(String nome, String endereco, String CpfCnpj, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.CpfCnpj = CpfCnpj;
		this.telefone = telefone;
		servicos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpfCnpj() {
		return CpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		CpfCnpj = cpfCnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ArrayList<OrdemServico> getServicos() {
		return servicos;
	}

	public void setServicos(ArrayList<OrdemServico> servicos) {
		this.servicos = servicos;
	}
	
	public void inserirOrdem(OrdemServico servico) {
		servicos.add(servico);
	}
	
	public String retornaCliente() {
		String imp = "";
		imp = "Nome: "+getNome()+"\nEndereço: "+getEndereco()+"\nCPF/CNPJ: "
				+getCpfCnpj()+"\nTelefone: "+getTelefone()+"\nOrdens de Serviço\n";
		for(int i=0;i<servicos.size();i++) {
			imp += servicos.get(i).imprimirOrdem()+"\n\n";
		}
		return imp;
	}
}
