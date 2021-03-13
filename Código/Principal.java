import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList <>();
		int op = 0, i = 0, num = 0, op2 = 0;
		String c = "";
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÕES\n1 - Cadastrar cliente\n"
					+ "2 - Inserir ordem de serviços\n3 - Alterar o status de uma ordem de serviços\n"
					+ "4 - Imprimir as ordens de serviço de um determinado cliente\n5 - Imprimir todas as ordens de serviços\n"
					+ "6 - Sair\n"));
			switch(op) {
			case 1:{
				String n = JOptionPane.showInputDialog("Digite o nome do cliente");
				String e = JOptionPane.showInputDialog("Digite o endereço do cliente");
				do {
				op2 = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de documento\n1- CPF\n2 -CNPJ\n"));
				switch(op2) {
				case 1:{
				c = JOptionPane.showInputDialog("Digite o CPF do cliente");
				break;
				}
				case 2:{
				c = JOptionPane.showInputDialog("Digite o CNPJ do cliente");
				break;
				}
				default:{
				JOptionPane.showMessageDialog(null, "Opção inválida!", "ERRO", JOptionPane.WARNING_MESSAGE);	
				break;
				}
				}
				}while((op2!=1)&&(op2!=2));
				String t = JOptionPane.showInputDialog("Digite o telefone do cliente");
				Cliente cliente = new Cliente(n, e, c, t);
				clientes.add(cliente);
				break;
			}
			case 2:{
				String aux = "";
				aux += "Escolha um cliente\n";
				for(i=0;i<clientes.size();i++) {
					aux += "Posição: "+i+"\nNome: "+clientes.get(i).getNome()+"\nEndereço: "+clientes.get(i).getEndereco()+
							"\nCPF/CNPJ: "+clientes.get(i).getCpfCnpj()+"\nTelefone: "+clientes.get(i).getTelefone()+"\n\n";
				}
				int escolha = 0, controle = 0;
				do {
				escolha = Integer.parseInt(JOptionPane.showInputDialog(aux));
				if(escolha>clientes.size()||escolha<0) {
					JOptionPane.showMessageDialog(null, "Opção inválida!", "ERRO", JOptionPane.WARNING_MESSAGE);
					controle = 0;
				}else {
					controle = 1;
				}
				}while(controle!=1);
				int cod = num;
				num++;
				String desc = JOptionPane.showInputDialog("Digite a descrição");
				String data = JOptionPane.showInputDialog("Digite a data dd/mm/aaaa");
				String status = JOptionPane.showInputDialog("Digite o status");
				double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
				OrdemServico os = new OrdemServico(cod, desc, data, status, preco);
				clientes.get(escolha).inserirOrdem(os);
				break;
			}
			case 3:{
				break;
			}
			case 4:{
				String aux = "";
				aux += "Escolha um cliente\n";
				for(i=0;i<clientes.size();i++) {
					aux += "Posição: "+i+"\nNome: "+clientes.get(i).getNome()+"\nEndereço: "+clientes.get(i).getEndereco()+
							"\nCPF/CNPJ: "+clientes.get(i).getCpfCnpj()+"\nTelefone: "+clientes.get(i).getTelefone()+"\n\n";
				}
				int escolha = 0, controle = 0;
				do {
				escolha = Integer.parseInt(JOptionPane.showInputDialog(aux));
				if(escolha>clientes.size()||escolha<0) {
					JOptionPane.showMessageDialog(null, "Opção inválida!", "ERRO", JOptionPane.WARNING_MESSAGE);
					controle = 0;
				}else {
					controle = 1;
				}
				}while(controle!=1);
				JOptionPane.showMessageDialog(null, clientes.get(escolha).retornaCliente());
				break;
			}
			case 5:{
				for(i=0;i<clientes.size();i++) {
					JOptionPane.showMessageDialog(null, clientes.get(i).retornaCliente());
				}
				break;
			}
			case 6:{
				JOptionPane.showMessageDialog(null, "Programa finalizado!", "Finalizado", JOptionPane.INFORMATION_MESSAGE );
				break;
			}
			default:{
				JOptionPane.showMessageDialog(null, "Opção inválida!", "ERRO", JOptionPane.WARNING_MESSAGE);
				break;
			}
			}
		}while(op!=6);

	}

}
