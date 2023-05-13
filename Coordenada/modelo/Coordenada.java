package modelo;

public class Coordenada{
    private double x; 
    private double y;

    public Coordenada(){}
    
    public Coordenada (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    
    public void setX (double x)
    {
        this.x = x;
    }
    public double getY()
    { 
        return y;
    }
    
    public void setY(double y){
        this.y = y;
    }
    /// --------------------------------------
    /// Método sobreescrito de la clase Object
    /// --------------------------------------
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    /// --------------------------------------
    /// Método sobreescrito de la clase Object
    /// --------------------------------------
    
    public boolean equals(Object o){
        Coordenada otra = (Coordenada)o;
        return (x==otra.x) && (y==otra.y);
    }

    /// ------------------------------------------------------------
    /// Método para calcular la distancia entre dos puntos del plano
    /// ------------------------------------------------------------
    public Double calcularDistancia(Object objeto){
        Coordenada coordenadaSecundaria = (Coordenada) objeto; 
        Double distanciaX = Math.abs (this.getX() - coordenadaSecundaria.getX());
        Double distanciaY = Math.abs (this.getY() - coordenadaSecundaria.getY()); 
        return Math.sqrt(Math.pow(distanciaY,2) + Math.pow(distanciaX,2));
    }
}
