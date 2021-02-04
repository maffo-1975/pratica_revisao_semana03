package programaPrincipal;

import java.util.Locale;
import java.util.Scanner;

import vendasEmpresa.VendaSemanal;
import vendasEmpresa.VendasItem;

public class GeradorRendimentos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		VendaSemanal vendaSemanal = new VendaSemanal();

		char resposta;

		do {
			System.out.print("Código do item: ");
			Integer codigoItem = sc.nextInt();

			System.out.print("Quantidade de vendas do item: ");
			Integer quantidadeVendida = sc.nextInt();

			vendaSemanal.adicionaVendasItem(new VendasItem(codigoItem, quantidadeVendida));

			System.out.print("Deseja adicionar outro item (s/n)? ");
			resposta = sc.next().charAt(0);
			
			System.out.println();

		} while (resposta != 'n' && resposta != 'N');

		System.out.printf("Comissao = %.2f", vendaSemanal.calculaComissao());

		sc.close();

	}

}
