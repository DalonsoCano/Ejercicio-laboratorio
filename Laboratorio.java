import java.util.ArrayList;

public class Laboratorio
{
    private ArrayList<alumno> alumno;
    
    public void darDeAlta()
    {
        
    }
    
    public void darDeBaja(String claveBaja)
    {
        for(int i=0;i<alumno.size();i++);
        {
            Alumno aux = alumno.get(i);
            if(aux.dimeClave==claveBaja)
            {
                alumno.remove(i);
            }
        }
    }
}