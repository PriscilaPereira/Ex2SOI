package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Controller {
	public Controller(){
		super();
	}
	
public String ip(){
		String ip = System.getProperty("os.name");
		return ip;
}

public void listaProcessos(String process){
	try{
		Process p = Runtime.getRuntime().exec(process);
		java.io.InputStream fluxo = p.getInputStream();
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		String linha = buffer.readLine();
		while (linha != null){
			System.out.println(linha);
			linha = buffer.readLine();
		}
		buffer.close();
		leitor.close();
		fluxo.close();
	}catch (Exception e){
		e.printStackTrace();
	}
}
public void KillPid(String processo){
	try{
		Process s = Runtime.getRuntime().exec(processo);
		java.io.InputStream fl = s.getInputStream();
		InputStreamReader ler = new InputStreamReader(fl);
		BufferedReader buf = new BufferedReader(ler);
		String lin = buf.readLine();
		while (lin != null){
			System.out.println(lin);
			lin = buf.readLine();
		}
		buf.close();
		ler.close();
		fl.close();
	}catch (Exception i){
		i.printStackTrace();
	
}

	
}
public void KillPross(String proc){
	try{
		Process r = Runtime.getRuntime().exec(proc);
		java.io.InputStream fx = r.getInputStream();
		InputStreamReader le = new InputStreamReader(fx);
		BufferedReader buff = new BufferedReader(le);
		String line = buff.readLine();
		while (line != null){
			System.out.println(line);
			line = buff.readLine();
		}
		buff.close();
		le.close();
		fx.close();
	}catch (Exception o){
		o.printStackTrace();
}
}
}