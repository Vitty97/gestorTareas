
/**
 * Write a description of class Tarea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.time.LocalDate;
public class Tarea
{
    private String descripcion;
    private boolean estaCompletada;
    private int prioridad;
    private LocalDate fechaVencimiento;
    private boolean fechaAsignada = false;
    
    public Tarea(String descripcion){
        this.descripcion = descripcion;
        estaCompletada = false;
        prioridad = 5;
        fechaVencimiento = null;
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
        String nuevoDia = "" + fechaVencimiento.getDayOfMonth();
        String nuevoMes = "" + fechaVencimiento.getMonthValue();
        if(fechaAsignada){
            if(fechaVencimiento.getDayOfMonth() < 10){
                nuevoDia = "0" + fechaVencimiento.getDayOfMonth();       
            }
            if(fechaVencimiento.getMonthValue() < 10){
                nuevoMes = "0" + fechaVencimiento.getMonthValue();
            }
            fecha = nuevoDia + "/" + nuevoMes + "/" + fechaVencimiento.getYear();
        }        
        return fecha;
    }
    
    public void setCambiarFecha(int dia, int mes, int ano){
        fechaVencimiento =  fechaVencimiento.of(ano, mes, dia);
        fechaAsignada = true;
    } 
    
    public boolean fechaAsignada(){
        return fechaAsignada;
    }
}
