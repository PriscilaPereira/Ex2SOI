package view;

import javax.swing.JOptionPane;


public class Main {
	
	public static void main(String[] args){
	
	
		int op=0;
		while (op!=9){
			op = Integer.parseInt(JOptionPane.showInputDialog("\n1-Mostra sistema operacional\n2-Lista Processos\n3-Mata Pid\n4-Mata Processo\n9-Sair"));
		
		switch (op){
			
		case 1:
		Controller redesController = new Controller();
		String ip = redesController.ip();
		
		
		System.out.println(ip);
		break;
		
		case 2:
		redesController = new Controller();
		String process = "ps -ef";
		redesController.listaProcessos(process);
		break;

		case 3:
		redesController = new Controller();	
		String processo = "kill -9 numero_do_PID";
		redesController.KillPid(processo);
		break;
		
		case 4:
			redesController = new Controller();	
			String proc = "pkill -f nome_do_processo";
			redesController.KillPross(proc);
			break;
		
		case 9:
			JOptionPane.showMessageDialog(null,"Sair");
		break;
		
		default:
			JOptionPane.showMessageDialog(null,"Invalido");
	}

	}
}
}