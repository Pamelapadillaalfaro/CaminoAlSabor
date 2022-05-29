/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import caminoalsabor.CaminoAlSabor;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Objects;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *Clase que crea una lista de platillos
 * @author Ricardo
 */
public class ListaPlatillo {
    private static Vector<Platillo> datosP =new Vector<Platillo>();
    private static Platillo tempP;
    /**
     * Método que agrega un objeto al vector
     * @param obj Objeto tipo Platillo que se agrega a la lista
     */
    public static void agregar(Platillo obj){
        datosP.addElement(obj);
    }
    /**
     * Método que elimina un objeto del vector segun el indice
     * @param pos Número que indica la posicion del objeto en el vector
     */
    public static void eliminar(int pos){
        datosP.removeElementAt(pos);
    }
    /**
     * Método que regresa al vector
     * @return Vector
     */
    public static Vector mostrar(){
        return datosP;
    }
    /**
     * Método que inicializa los atributos de un platillo llamado pozole
     * y lo agrega al vector
     */
    public static void crearPozole(){
        Platillo obj=new Platillo();
        obj.setNombre("Pozole");
        obj.setIngrediente("Maíz/maciza/lechuga/orégano");
        obj.setPrecio(93);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado taco de pastor
     * y lo agrega al vector
     */
    public static void crearTacoPastor(){
        Platillo obj=new Platillo();
        obj.setNombre("Taco de pastor");
        obj.setIngrediente("Tortilla/carne de pastor/cilantro/cebolla");
        obj.setPrecio(10);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado tostada de tinga
     * y lo agrega al vector
     */
    public static void crearTostadaTinga(){
        Platillo obj=new Platillo();
        obj.setNombre("Tostada de tinga");
        obj.setIngrediente("Tostada/tinga/lechuga/crema/queso");
        obj.setPrecio(22);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado tostada de pata
     * y lo agrega al vector
     */
    public static void crearTostadaPata(){
        Platillo obj=new Platillo();
        obj.setNombre("Tostada de pata");
        obj.setIngrediente("Tostada/pata/lechuga/crema/queso");
        obj.setPrecio(25);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado pambazo
     * y lo agrega al vector
     */
    public static void crearPambazo(){
        Platillo obj=new Platillo();
        obj.setNombre("Pambazo");
        obj.setIngrediente("Pan/chile guajillo/papas/longaniza/lechuga/crema/queso");
        obj.setPrecio(27);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado tlayuda
     * y lo agrega al vector
     */
    public static void crearTlayuda(){
        Platillo obj=new Platillo();
        obj.setNombre("Tlayuda");
        obj.setIngrediente("Frijoles/lechuga/jitomate/nopales/queso");
        obj.setPrecio(30);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado enchiladas
     * y lo agrega al vector
     */
    public static void crearEnchiladas(){
        Platillo obj=new Platillo();
        obj.setNombre("Enchiladas");
        obj.setIngrediente("Tortillas/pollo/cebolla/ajo");
        obj.setPrecio(85);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado 
     * taco de longaniza y lo agrega al vector
     */
    public static void crearTacoLonganiza(){
        Platillo obj=new Platillo();
        obj.setNombre("Taco de longaniza");
        obj.setIngrediente("Tortilla/longaniza/cilantro/cebolla");
        obj.setPrecio(9);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado taco de bistec
     * y lo agrega al vector
     */
    public static void crearTacoBistec(){
        Platillo obj=new Platillo();
        obj.setNombre("Taco de bistec");
        obj.setIngrediente("Tortilla/bistec/cilantro/cebolla");
        obj.setPrecio(12);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado taco de barbacoa
     * y lo agrega al vector
     */
    public static void crearTacoBarbacoa(){
        Platillo obj=new Platillo();
        obj.setNombre("Taco de barbacoa");
        obj.setIngrediente("Chile guajillo/chile de árbol/orégano/comino/cebolla/carne de cordero");
        obj.setPrecio(20);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado sushi
     * y lo agrega al vector
     */
    public static void crearSushi(){
        Platillo obj=new Platillo();
        obj.setNombre("Sushi");
        obj.setIngrediente("Arroz/Algas Nori/Pepino/Atún rojo/Mayonesa/Wasabi");
        obj.setPrecio(20);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado ramen
     * y lo agrega al vector
     */
    public static void crearRamen(){
        Platillo obj=new Platillo();
        obj.setNombre("Ramen");
        obj.setIngrediente("Espinazo de cerdo/Algas/Hongo shiitake/Piernas de pollo/Tocino ahumado/Zanahoria");
        obj.setPrecio(135);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado yakitori
     * y lo agrega al vector
     */
    public static void crearYakitori(){
        Platillo obj=new Platillo();
        obj.setNombre("Yakitori");
        obj.setIngrediente("Muslos de pollo/Cebolleta/Puerro/Soja/Vino de arroz/Sake");
        obj.setPrecio(80);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado onigiri
     * y lo agrega al vector
     */
    public static void crearOnigiri(){
        Platillo obj=new Platillo();
        obj.setNombre("Onigiri");
        obj.setIngrediente("Arroz/Alga Nori/Sal/Sesamo");
        obj.setPrecio(35);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado sashimi
     * y lo agrega al vector
     */
    public static void crearSashimi(){
        Platillo obj=new Platillo();
        obj.setNombre("Sashimi");
        obj.setIngrediente("Medallon de atún/Ajonjolí/Soya/Jugo de limón/Cebollín");
        obj.setPrecio(149);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado soba
     * y lo agrega al vector
     */
    public static void crearSoba(){
        Platillo obj=new Platillo();
        obj.setNombre("Soba");
        obj.setIngrediente("Kombu/Shiitake/Fideos soba/Soja/Azúcar");
        obj.setPrecio(105);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado takoyaki
     * y lo agrega al vector
     */
    public static void crearTakoyaki(){
        Platillo obj=new Platillo();
        obj.setNombre("Takoyaki");
        obj.setIngrediente("Harina takoyaki/Huevo/Aceite de oliva/Soja/Repollo/Pulpo");
        obj.setPrecio(155);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado katsudon
     * y lo agrega al vector
     */
    public static void crearKatsudon(){
        Platillo obj=new Platillo();
        obj.setNombre("Katsudon");
        obj.setIngrediente("Chuleta de cerdo/Pimienta/Huevo/Panko/Harina");
        obj.setPrecio(123);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado tempura
     * y lo agrega al vector
     */
    public static void crearTempura(){
        Platillo obj=new Platillo();
        obj.setNombre("Tempura");
        obj.setIngrediente("Huevo/Harina/Sal/Azúcar/Agua/Verduras");
        obj.setPrecio(77);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado monjayaki
     * y lo agrega al vector
     */
    public static void crearMonjayaki(){
        Platillo obj=new Platillo();
        obj.setNombre("Monjayaki");
        obj.setIngrediente("Acelga/Harina/Cebolla/Carne picada/Pimienta");
        obj.setPrecio(89);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado pizza
     * y lo agrega al vector
     */
    public static void crearPizza(){
        Platillo obj=new Platillo();
        obj.setNombre("Pizza");
        obj.setIngrediente("Harina/Sal/Aceite de oliva/Levadura/Queso/Jitomate");
        obj.setPrecio(89);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado pasta
     * y lo agrega al vector
     */
    public static void crearPasta(){
        Platillo obj=new Platillo();
        obj.setNombre("Pasta");
        obj.setIngrediente("Huevo/Sal/Harina/Queso");
        obj.setPrecio(78);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado resoto
     * y lo agrega al vector
     */
    public static void crearResoto(){
        Platillo obj=new Platillo();
        obj.setNombre("Resoto");
        obj.setIngrediente("Arroz/Mantequilla/Cebolla/Caldo/Vino/Queso parmigiano");
        obj.setPrecio(167);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado lasaña
     * y lo agrega al vector
     */
    public static void crearLasana(){
        Platillo obj=new Platillo();
        obj.setNombre("Lasaña");
        obj.setIngrediente("Carne de ternera/Panceta/Cebolla/Zanahoria/Apio");
        obj.setPrecio(131);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado ravioles
     * y lo agrega al vector
     */
    public static void crearRavioles(){
        Platillo obj=new Platillo();
        obj.setNombre("Ravioles");
        obj.setIngrediente("Harina/Huevo/Aceite/Sal/Agua");
        obj.setPrecio(69);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado panna cotta
     * y lo agrega al vector
     */
    public static void crearPannaCotta(){
        Platillo obj=new Platillo();
        obj.setNombre("Panna Cotta");
        obj.setIngrediente("Nata liquida/Azúcar blanco/Gelatina/Canela/Vainilla");
        obj.setPrecio(115);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado gelato
     * y lo agrega al vector
     */
    public static void crearGelato(){
        Platillo obj=new Platillo();
        obj.setNombre("Gelato");
        obj.setIngrediente("Leche/Huevo/Azúcar/Vainilla/Chocolate en polvo/Crema para batir");
        obj.setPrecio(68);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado carpaccio
     * y lo agrega al vector
     */
    public static void crearCarpaccio(){
        Platillo obj=new Platillo();
        obj.setNombre("Carpaccio");
        obj.setIngrediente("Solomillo de ternera/Sal/Pimienta/Aceite de oliva/Alcaparras/Queso Parmesano");
        obj.setPrecio(249);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado tiramisu
     * y lo agrega al vector
     */
    public static void crearTiramisu(){
        Platillo obj=new Platillo();
        obj.setNombre("Tiramisu");
        obj.setIngrediente("Huevo/Vino/Ralladura de naranja/Azúcar glass/Café espresso/Cocoa");
        obj.setPrecio(97);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que inicializa los atributos de un platillo llamado 
     * ensalada capresse y lo agrega al vector
     */
    public static void crearCapresse(){
        Platillo obj=new Platillo();
        obj.setNombre("Ensalada Capresse");
        obj.setIngrediente("Tomate/Albahaca/Aceite de oliva/Vinagre/Pimienta");
        obj.setPrecio(89);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    /**
     * Método que busca si el platillo se encuentra en el vector
     * borra la primera coincidencia e imprime el ticket en pantalla
     * @param platillo Nombre del platillo
     * @param envoltorio Número que indica tipo de envoltorio 
     * 0 si es de carton 1 si es de plastico
     * @param cubiertos Número que indica si el usuario quiere cubiertos o no
     * 0 para si 1 para no
     */
    public static void contiene(String platillo, int envoltorio, int cubiertos){
        String txtTemp=platillo;
        int j=0;
        for (int i = 0; i < ListaPlatillo.datosP.size(); i++) {
            if(datosP.get(i).nombre.equalsIgnoreCase(platillo)){
                if(envoltorio==0){
                    datosP.elementAt(i).tipoEnvoltorio="Cartón";
                }
                else{
                    datosP.elementAt(i).tipoEnvoltorio="Plastico";
                }
                if(cubiertos==0){
                    datosP.elementAt(i).cubiertos="Si";
                }
                else{
                    datosP.elementAt(i).cubiertos="No";
                }
                JOptionPane.showMessageDialog(null, "Gracias por su compra\n"
                + "Descripción       Precio\n"
                + txtTemp+"       "+datosP.elementAt(i).precio+"\n"
                + "Tipo de envoltorio: "+datosP.elementAt(i).tipoEnvoltorio+"\n"
                + "Cubiertos: "+datosP.elementAt(i).cubiertos);
                ListaPlatillo.eliminar(i);
                i=ListaPlatillo.datosP.size();
                j=1;
            }
        }  
        if(j==0){
            JOptionPane.showMessageDialog(null,"El platillo "+txtTemp+" no esta disponible","Info",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void baseDatos(){
        PrintWriter ticket1=null;
        String text1=datosP.toString();
        try {        
            ticket1=new PrintWriter("baseDatos.csv");
            Objects.requireNonNull(ticket1).println(text1);
            ticket1.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CaminoAlSabor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
