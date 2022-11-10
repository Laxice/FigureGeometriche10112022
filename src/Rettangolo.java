public class Rettangolo extends Forma {

    private double lunghezza;
    private double altezza;
    
    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.altezza = larghezza;
    }

    @Override
    public double area() {
        return lunghezza*altezza;
    }

    @Override
    public double perimetro() {
        return 2*(altezza*lunghezza);
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

<<<<<<< HEAD
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
=======
   
>>>>>>> d59c1994fad1210c7d830b90fee100ae1826517e

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
