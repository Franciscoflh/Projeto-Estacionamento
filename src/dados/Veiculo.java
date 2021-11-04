package dados;

import java.util.Date;

public abstract class Veiculo{
    private int hora;
    private Pessoa proprietario;
    private String placa;
    private String modelo;
    private Tipo tipo;
    private double custoInicial = 2.00;
    private double custoAdicional = 2.50;
	@SuppressWarnings("deprecation")
	public Veiculo(Pessoa proprietario, String placa, String modelo, Tipo tipo) {
		this.proprietario = proprietario;
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		
		Date date = new Date();
		//this.hora = date.getHours();
	}
	
	public Tipo getTipo() {
		return tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public int getHora() {
		return hora;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public String getModelo() {
		return modelo;
	}
	
	//public abstract double getCustoInicial();
	//public abstract double getCustoAdicional();

    public double getCustoInicial() {
        return custoInicial;
    }

    public void setCustoInicial(double custoInicial) {
        this.custoInicial = custoInicial;
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }
        
}
