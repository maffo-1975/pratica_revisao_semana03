package vendasEmpresa;

public class VendasItem {

	private Integer codigoItem;
	private Integer quantidadeVendida;

	public VendasItem(Integer codigoItem, Integer quantidadeVendida) {
		this.codigoItem = codigoItem;
		this.quantidadeVendida = quantidadeVendida;
	}

	public Integer getcodigoItem() {
		return codigoItem;
	}

	public Integer getQuantidadeVendida() {
		return quantidadeVendida;
	}

}
