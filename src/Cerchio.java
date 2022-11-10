public class Cerchio extends Forma {

    private double raggio;
    
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }
    //Oggi c'è una bellissima nuvola
    @Override
    public double area() {
        return raggio * raggio * Math.PI;
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public String toString() {
        return "Cerchio [raggio=" + raggio + "]";
    }

    @Override
    public double perimetro() {
        return extracted();
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(raggio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cerchio other = (Cerchio) obj;
        if (Double.doubleToLongBits(raggio) != Double.doubleToLongBits(other.raggio))
            return false;
        return true;
    }

    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
   
    

    private double extracted() {
        System.out.println("Hello World"); //Aggiunto un print
        return 2*raggio*Math.PI;
    }
}
