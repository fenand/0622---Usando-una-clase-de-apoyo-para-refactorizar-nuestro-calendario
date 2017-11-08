
public class CalendarioBasico
{
    //declarando variables dia mes y año
    private DisplayDosCaracteres dia;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres ano;

    /**
     * Constructor de la  class CalendarioBasico
     */
    public CalendarioBasico()
    {
        //se pone 31 por que solo llega hasta 30 y no lo usa el ultimo numer que se ponga
        dia = new DisplayDosCaracteres (31);
        mes = new DisplayDosCaracteres (13);
        ano = new DisplayDosCaracteres (100);
    }

    /**
     * Fijar fecha
     */
    public void fijarFecha(int nuevoDia,int nuevoMes, int nuevoAno)
    {
        // fijar la fecha teniendo encuena la clase nueva creada segun el metodo en la clase DisplayDosCaracteres
        dia.setValorAlmacenado(nuevoDia);
        mes.setValorAlmacenado(nuevoMes);
        ano.setValorAlmacenado(nuevoAno);
    }

    /**
     * metodo para obtener la fecha
     */
    public String obtenerFecha()
    { 
        return dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + ano.getTextoDelDisplay();
    }

    /**
     * Añadir un dia mas, avanzar un dia.
     * 
     */
    public void avanzarFecha()
    {
        
        if (dia.getValorAlmacenado () == 30)
        {
            mes.incrementaValorAlmacenado();  
            if(mes.getValorAlmacenado() == 1)
            {
                ano.incrementaValorAlmacenado();

            }
        }
        dia.incrementaValorAlmacenado();
    }
}