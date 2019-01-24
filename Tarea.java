
/**
 * Write a description of class Tarea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tarea
{
    private String descripcion;
    private boolean estaCompletada;
    private int prioridad;
    private int dia;
    private int mes;
    private int ano;
    
    public Tarea(String descripcion){
        this.descripcion = descripcion;
        estaCompletada = false;
        prioridad = 5;
        dia = 0;
        mes = 0;
        ano = 0;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public boolean getEstaCompletada(){
        return estaCompletada;
    }
    
    public int getPrioridad(){
        return prioridad;
    }
    
    public void marcarComoCompletada(){
        estaCompletada = true;
    }
    
    public void setCambiarPrioridad(int nuevaPrioridad){
        prioridad = nuevaPrioridad;
    }
    
    public String getFecha(){
        String fecha = "";
        String nuevoDia = "" + dia;
        String nuevoMes = "" + mes;
        if(dia != 0){

            if(dia < 10){
                nuevoDia = "0" + dia;       
            }
            if(mes < 10){
                nuevoMes = "0" + mes;
            }
            fecha = " - " + nuevoDia + "/" + nuevoMes + "/" + ano;
        }        
        return fecha;
    }
    
    public void setCambiarFecha(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    } 
}
