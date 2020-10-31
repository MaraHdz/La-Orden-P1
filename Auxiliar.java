package proyecto.pkg1.eda.pkg2;
import java.io.*;
import java.util.List;
import java.util.LinkedList;
public class Auxiliar {
    
}
class Archivos{
	List<Alumno> leerTxt(String direccion){
            List<Alumno> lista = new LinkedList<>();
		try{
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			Alumno aux = new Alumno("","",0);
			String temp = "";
			while((temp = bf.readLine())!=null){
				String [] aux2 = temp.split(",");
				String a = aux2[0];
				String b = aux2[1];
				long c = Long.valueOf(aux2[2]);
                                aux = aux.Sustituir(a, b, c);
                                lista.add(aux);
			}
		}catch(Exception ex){}
        return lista;
        }
}
class Alumno{
	String Nombre;
	String Apellido;
	long NoCuenta;
	public Alumno(String nom, String ap, long cu){
		Nombre = nom;
		Apellido = ap;
		NoCuenta = cu;
	}
	public Alumno Sustituir(String nom, String ap, long cu){
		Alumno aux = new Alumno(nom,ap,cu);
		return aux;
	}
}
