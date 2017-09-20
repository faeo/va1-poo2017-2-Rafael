package br.unincor.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Nesta classe você deve tratar exceção
 * em todos os métodos que podem vir a lançar
 * exceções por entrada incorreta do usuário. 
 *
 */
public class Usuario {

	public void exibeMsg(String texto) {
		JOptionPane.showMessageDialog(null, texto, "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
	}

	public Long recebeLong(String texto) {
		int f = 0;
		
		while(f == 0){
			try {
				String resposta = JOptionPane.showInputDialog(texto);
				Long respostaConvertida = Long.parseLong(resposta);
				f = 1;
				
				return respostaConvertida;
			} catch (Exception e) {
				exibeMsg("Entrada inválida!");
				f = 0;
			}
		}
		return null;
	}
 
}
