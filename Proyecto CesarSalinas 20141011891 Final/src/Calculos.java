
class Calculos extends Articulos {

    public Calculos() {
    }

    public Calculos(String Nombre, String Unidades, String PrecioU) {
        super(Nombre, Unidades, PrecioU);
    }
    
       
    @Override
    public String getPrecioT(){
        Double A;
        Double B;
        Double C;
        A=Double.parseDouble(getPrecioU());
        B=Double.parseDouble(getUnidades());
        C = A*B;
        C = Math.rint(C*100)/100;
        return Double.toString(C);
    }
  
    @Override
    public void setSubtotal(String subTotal){
        this.subTotal = subTotal;
    }
    
    
    @Override
    public String getSubtotal(){
        double A = Double.parseDouble(subTotal);
        A = Math.rint(A*100)/100;
        return Double.toString(A);
    }
    
    
    @Override
    public String getISV(){
       double A = Double.parseDouble(getSubtotal());
       double B = A*0.15;
       B = Math.rint(B*100)/100;
       return Double.toString(B); //Recortar los decimales, para evitar un numero con decimales periodicos
       
    }
    
    @Override
    public String getTotalPagar(){
        double A = Double.parseDouble(getSubtotal());
        double B = Double.parseDouble(getISV());
        double C = A+B;
        C = Math.rint(C*100)/100;
        return Double.toString(C);
    }
    
    @Override
    public String getCreditoC(){
        double A = Double.parseDouble(getTotalPagar());
        double B = A*0.30;
        B= Math.rint(B*100)/100;
        return Double.toString(B);
    }
    
}
