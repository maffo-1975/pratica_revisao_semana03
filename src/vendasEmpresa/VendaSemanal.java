package vendasEmpresa;

import java.util.ArrayList;
import java.util.List;

public class VendaSemanal {

	private static Double[] precosItens = { 239.99, 129.75, 99.95, 350.89 };
	private static Double comissaoFixa = 200.00;
	private static Double percentualComissaoVariavel = 0.09;

	private List<VendasItem> vendasSemana = new ArrayList<>();

	public void adicionaVendasItem(VendasItem vendasItem) {
		vendasSemana.add(vendasItem);
	}

	public double calculaComissao() {

		double comissao = 0.0;

		for (VendasItem vendasItem : vendasSemana) {
			comissao += precosItens[vendasItem.getcodigoItem() - 1] * vendasItem.getQuantidadeVendida();
		}

		comissao *= percentualComissaoVariavel;

		comissao += comissaoFixa;

		return comissao;
	}

}
