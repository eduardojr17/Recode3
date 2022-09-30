package model;

	import java.math.BigDecimal;

public class Viagem {
	
	private int idDestino;
	private String origem;
	private String destino;
	private String dataIda;
	private String dataVolta;
	private BigDecimal preco;
	
	//Getters and Setters
	
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDataIda() {
		return dataIda;
	}
	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}
	public String getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Viagem [idDestino=" + idDestino + ", origem=" + origem + ", destino=" + destino + ", dataIda=" + dataIda
				+ ", dataVolta=" + dataVolta + ", preco=" + preco + "]";
	}
	public void setPreco(String parameter) {
		
	}

}
