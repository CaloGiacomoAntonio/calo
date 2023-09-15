package circonferenza;

public class Circonferenza {
    private double x1A;
    private double y1A;
    private double x2B;
    private double y2B;
    
    public Circonferenza (double x1A, double y1A, double x2B, double y2B){
        this.x1A=x1A;
        this.y1A=y1A;
        this.x2B=x2B;
        this.y2B=y2B;
    }
    
    public double getRaggio(){
        return Math.sqrt( Math.pow((x1A-x2B),2) + Math.pow((y1A-y2B),2));
    }
    
    public double getArea(){
        return Math.PI*Math.pow(getRaggio(),2);
    }
    
    public double getCirconferenza(){
        return 2*Math.PI*getRaggio();
    }
    
    public String stampa(){
        return "coordinate primo punto: "+x1A+", "+y1A+"\n coordinate secondo punto: "+
                                            x2B+", "+y2B;
    }
            
}
