import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteEncodings {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String nome = "S�rgio";
		
		System.out.println("A String � '" + nome + "'");
		
		System.out.println(nome.codePointAt(1)); // Pega o codepoint na posicao do index indicado, baseado no charset padrao do sistema
		
		byte[] codepoints = nome.getBytes("UTF-8"); // Converte a string para codepoints baseados no charset padrao do sistema, ou no charset passado como parametro
		
		System.out.print("A convers�o dessa string para codepoints � "); 
		for(byte singleCodepoint : codepoints) {
			System.out.print(singleCodepoint + " "); // Repare como o byte que representa "�" fica incompreens�vel.
		}
		
		System.out.print(System.lineSeparator()); // System.lineSeparator() = System.out.println()
		
		String nomeConvertidoDoCodepoint = new String(codepoints, "UTF-8");
		System.out.println("A convers�o desses codepoints para string � " + nomeConvertidoDoCodepoint);
		
		System.out.println("O charset (encoding) padr�o deste computador � " + Charset.defaultCharset());
	}
}
