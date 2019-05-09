import java.util.Scanner;
import javax.swing.JOptionPane;
public class arquivo {
	public static void main(String[]args){
		int nProporcicoes,nLinhas,nColunas;
		Scanner teclado = new Scanner(System.in);
		//System.out.println("Diga a quantidade de proporcicoes:");
		String qntProporcicoes = JOptionPane.showInputDialog(null, "Quantas proporcicoes?", "Matriz", JOptionPane.QUESTION_MESSAGE);
		nProporcicoes = Integer.parseInt(qntProporcicoes);
		char vetor[] = new char[nProporcicoes];
		for(int i = 0 ;i<nProporcicoes;i++){
			vetor[i] = teclado.next().charAt(0);
		}
		int linhas=2;
		System.out.print("|");
		for(int i = 0 ;i<nProporcicoes;i++){
			System.out.print(vetor[i]+"|");
			linhas=linhas*2;
			//System.out.print(i);
		}
		System.out.println();
		nLinhas = linhas/2;
		nColunas = nProporcicoes;
		//System.out.println(nColunas);
		String matriz[][] = new String[nLinhas][nColunas];
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				if(i==0){
					matriz[i][j] = "V";
				}else if((i%2!=0)&&(j==nColunas-1)){
					matriz[i][j] = "F";
				}
				if((j==0)&&(nLinhas/2>i)){
					matriz[i][j] = "V";
				}
				if((nLinhas/2<=i)&&(j==0)){
						matriz[i][j] = "F";
				}
				
				/*else{
					matriz[i][j] = "N";
				}*/
			}
		}
		for (int l = 0; l < matriz.length; l++)  {  
			for (int c = 0; c < matriz[0].length; c++)     { 
				System.out.print(matriz[l][c] + " ");
			}  
			System.out.println(" "); //muda de linha
		}
		//System.out.print("\n"+linhas);
	}
}