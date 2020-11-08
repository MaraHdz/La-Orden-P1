import java.util.HashMap;
import java.util.Map;
/**
 * Ejercicios 1, 2 y 3
 * @author Mara
 * @version 5-NOV-2020
 */
public class TablasHash{
    //public static 
    /**
     * Ejercicio 1 Probando métodos de la tambla Hash
     * @param  nada
     * @return nada
     */
    public static void main(String[] args){
        Map<Integer, String> tab = new HashMap<>();//Key INTEGER Value STRING
        Map<Integer, String> bat = new HashMap<>();//Key INTEGER Value STRING
        System.out.println("Utilizamos put()\n\n");
        tab.put(1,"Juan");
        tab.put(2,"Romina");
        tab.put(3,"Miguel");
        tab.put(4, "Yolanda");
        tab.put(5, "Tomas");
        tab.put(6, "Amelia");
        muestra(tab);
        //Aquí conocemos la extensión 
        System.out.println("Utilizamos size()-> "+tab.size());
        //Aquí sólo vale containsKey o containsValue, pero no sólo
        System.out.println("Utilizamos containsKey(1)-> "+tab.containsKey(1));
        System.out.println("Utilizamos containsKey(41)-> "+tab.containsKey(41));
        System.out.println("Utilizamos tab.containsValue(Yolanda)-> "+tab.containsValue("Yolanda"));
        System.out.println("Utilizamos tab.containsValue(Luis)-> "+tab.containsValue("Luis"));
        //Aquí utlizamos get
        System.out.println("Utilizamos get(Key 3) regresa un valor-> "+tab.get(3));
        System.out.println("Utilizamos get(Key 6) regresa un valor-> "+tab.get(6));
        //caso equals.es aparte
        System.out.println("Utilizamos equals en dos mapas distintos-> "+bat.equals(tab));
        //Quitar elementos 
        System.out.println("Utilizamos remove(Key) elimina el elemnto en Key");
        tab.remove(5);
        tab.remove(1);
        System.out.println("Utilizamos size()-> "+tab.size());
        System.out.println("Final");
        muestra(tab);
    }
    
    
     public static void muestra(Map<Integer, String> mapa){
        for (Integer i :mapa.keySet()){
            System.out.println("Llave "+i+" Valor "+mapa.get(i));
        }
        //System.out.println("\n\n");
    }
}
