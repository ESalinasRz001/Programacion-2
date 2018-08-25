
public abstract class Articulos {
    String Nombre, Unidades, PrecioU; //Variables de constructores
    String subTotal;

    public Articulos() {
    }

    public Articulos(String Nombre, String Unidades, String PrecioU) {
        double A = Double.parseDouble(Unidades);
        double B = Double.parseDouble(PrecioU);
        if(A<0){ A*=-1;}
        if(B<0){ B*=-1;}
        
        this.Nombre=Nombre;
        this.Unidades = Double.toString(A);
        this.PrecioU = Double.toString(B);
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getPrecioU() {
        return PrecioU;
    }
    public void setPrecioU(String PrecioU) {
        this.PrecioU = PrecioU;
    }
    public String getUnidades() {
        return Unidades;
    }

    public void setUnidades(String Unidades) {
        this.Unidades = Unidades;
    }  
    
    public abstract String getPrecioT();
    public abstract void setSubtotal(String subTotal);
    public abstract String getSubtotal();
    public abstract String getISV();
    public abstract String getTotalPagar();
    public abstract String getCreditoC();
}
