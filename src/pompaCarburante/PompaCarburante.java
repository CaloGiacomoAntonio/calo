package pompaCarburante;

public class PompaCarburante {
    private String nomeDistributore;
    private double prezzoCarburante;
    private double capacitaCisterna;
    private double carburanteVenduto;
    
    public PompaCarburante(String nomeDistributore, double prezzoCarburante,
                            double capacitàCisterna, double carburanteVenduto){
        this.nomeDistributore = nomeDistributore;
        this.prezzoCarburante = prezzoCarburante;
        this.capacitaCisterna = capacitàCisterna;
        this.carburanteVenduto = carburanteVenduto;
    }
    
    public double carburanteRimasto(){
        return capacitaCisterna-carburanteVenduto;
    }
    
    public double riempiCisterna(){
        return capacitaCisterna-carburanteRimasto();
    }
    
    public double valoreCarburanteRimasto(){
        return carburanteRimasto()*prezzoCarburante;
    }
    
    public double importoPieno(){
        return capacitaCisterna*prezzoCarburante;
    }
    
    public double importo10L(){
        return 10*prezzoCarburante;
    }
    
    public String stampa (){
        return " il nome del benzinaio è "+ nomeDistributore+ " il prezzo del carburante è "+ prezzoCarburante+ 
                " la capacità della cisterna è "+ capacitaCisterna+ " il carburante venduto è "+ carburanteVenduto;
    }
}

