/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import static java.lang.Math.random;
import java.util.Vector;

/**
 *Clase que crea una lista de platillos
 * @author Ricardo
 */
public class ListaPlatillo {
    private static Vector<Platillo> datosP =new Vector<Platillo>();
    private static Platillo tempP;
    /**
     * Método que agrega un objeto a la lista
     * @param obj Objeto tipo Platillo que se agrega a la lista
     */
    public static void agregar(Platillo obj){
        datosP.addElement(obj);
    }
    /**
     * Método que elimina un objeto de la lista segun el indice
     * @param pos Número que indica la posicion del objeto 
     */
    public static void eliminar(int pos){
        datosP.removeElementAt(pos);
    }
    public static Vector mostrar(){
        return datosP;
    }
    public static void crearPozole(){
        Platillo obj=new Platillo();
        obj.setNombre("Pozole");
        obj.setIngrediente("Maíz/maciza/lechuga/orégano");
        obj.setPrecio(93);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTacoPastor(){
        Platillo obj=new Platillo();
        obj.setNombre("Taco de pastor");
        obj.setIngrediente("Tortilla/carne de pastor/cilantro/cebolla");
        obj.setPrecio(10);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTostadaTinga(){
        Platillo obj=new Platillo();
        obj.setNombre("Tostada de tinga");
        obj.setIngrediente("Tostada/tinga/lechuga/crema/queso");
        obj.setPrecio(22);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTostadaPata(){
        Platillo obj=new Platillo();
        obj.setNombre("Tostada de pata");
        obj.setIngrediente("Tostada/pata/lechuga/crema/queso");
        obj.setPrecio(25);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearPambazo(){
        Platillo obj=new Platillo();
        obj.setNombre("Pambazo");
        obj.setIngrediente("Pan/chile guajillo/papas/longaniza/lechuga/crema/queso");
        obj.setPrecio(22);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTlayuda(){
        Platillo obj=new Platillo();
        obj.setNombre("Tlayuda");
        obj.setIngrediente("Frijoles/lechuga/jitomate/nopales/queso");
        obj.setPrecio(30);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearEnchiladas(){
        Platillo obj=new Platillo();
        obj.setNombre("Enchiladas");
        obj.setIngrediente("Tortillas/pollo/cebolla/ajo");
        obj.setPrecio(85);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTacoLonganiza(){
        Platillo obj=new Platillo();
        obj.setNombre("Taco de longaniza");
        obj.setIngrediente("Tortilla/longaniza/cilantro/cebolla");
        obj.setPrecio(9);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTacoBistec(){
        Platillo obj=new Platillo();
        obj.setNombre("Taco de bistec");
        obj.setIngrediente("Tortilla/bistec/cilantro/cebolla");
        obj.setPrecio(12);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTacoBarbacoa(){
        Platillo obj=new Platillo();
        obj.setNombre("Taco de barbacoa");
        obj.setIngrediente("Chile guajillo/chile de árbol/orégano/comino/cebolla/carne de cordero");
        obj.setPrecio(20);
        obj.setStock(3);
        obj.setTipoDePlatillo("Mexicano");
        ListaPlatillo.agregar(obj);
    }
    public static void crearSushi(){
        Platillo obj=new Platillo();
        obj.setNombre("Sushi");
        obj.setIngrediente("Arroz/Algas Nori/Pepino/Atún rojo/Mayonesa/Wasabi");
        obj.setPrecio(20);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearRamen(){
        Platillo obj=new Platillo();
        obj.setNombre("Ramen");
        obj.setIngrediente("Espinazo de cerdo/Algas/Hongo shiitake/Piernas de pollo/Tocino ahumado/Zanahoria");
        obj.setPrecio(135);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearYakitori(){
        Platillo obj=new Platillo();
        obj.setNombre("Yakitori");
        obj.setIngrediente("Muslos de pollo/Cebolleta/Puerro/Soja/Vino de arroz/Sake");
        obj.setPrecio(80);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearOnigiri(){
        Platillo obj=new Platillo();
        obj.setNombre("Onigiri");
        obj.setIngrediente("Arroz/Alga Nori/Sal/Sesamo");
        obj.setPrecio(35);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearSashimi(){
        Platillo obj=new Platillo();
        obj.setNombre("Sashimi");
        obj.setIngrediente("Medallon de atún/Ajonjolí/Soya/Jugo de limón/Cebollín");
        obj.setPrecio(149);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearSoba(){
        Platillo obj=new Platillo();
        obj.setNombre("Soba");
        obj.setIngrediente("Kombu/Shiitake/Fideos soba/Soja/Azúcar");
        obj.setPrecio(105);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTakoyaki(){
        Platillo obj=new Platillo();
        obj.setNombre("Takoyaki");
        obj.setIngrediente("Harina takoyaki/Huevo/Aceite de oliva/Soja/Repollo/Pulpo");
        obj.setPrecio(155);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearKatsudon(){
        Platillo obj=new Platillo();
        obj.setNombre("Katsudon");
        obj.setIngrediente("Chuleta de cerdo/Pimienta/Huevo/Panko/Harina");
        obj.setPrecio(123);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTempura(){
        Platillo obj=new Platillo();
        obj.setNombre("Tempura");
        obj.setIngrediente("Huevo/Harina/Sal/Azúcar/Agua/Verduras");
        obj.setPrecio(77);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearMonjayaki(){
        Platillo obj=new Platillo();
        obj.setNombre("Monjayaki");
        obj.setIngrediente("Acelga/Harina/Cebolla/Carne picada/Pimienta");
        obj.setPrecio(89);
        obj.setStock(3);
        obj.setTipoDePlatillo("Japonesa");
        ListaPlatillo.agregar(obj);
    }
    public static void crearPizza(){
        Platillo obj=new Platillo();
        obj.setNombre("Pizza");
        obj.setIngrediente("Harina/Sal/Aceite de oliva/Levadura/Queso/Jitomate");
        obj.setPrecio(89);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void crearPasta(){
        Platillo obj=new Platillo();
        obj.setNombre("Pasta");
        obj.setIngrediente("Huevo/Sal/Harina/Queso");
        obj.setPrecio(78);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void crearResoto(){
        Platillo obj=new Platillo();
        obj.setNombre("Resoto");
        obj.setIngrediente("Arroz/Mantequilla/Cebolla/Caldo/Vino/Queso parmigiano");
        obj.setPrecio(167);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void crearLasana(){
        Platillo obj=new Platillo();
        obj.setNombre("Lasaña");
        obj.setIngrediente("Carne de ternera/Panceta/Cebolla/Zanahoria/Apio");
        obj.setPrecio(131);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void crearRavioles(){
        Platillo obj=new Platillo();
        obj.setNombre("Ravioles");
        obj.setIngrediente("Harina/Huevo/Aceite/Sal/Agua");
        obj.setPrecio(69);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void crearPannaCotta(){
        Platillo obj=new Platillo();
        obj.setNombre("Panna Cotta");
        obj.setIngrediente("Nata liquida/Azúcar blanco/Gelatina/Canela/Vainilla");
        obj.setPrecio(115);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void crearGelato(){
        Platillo obj=new Platillo();
        obj.setNombre("Gelato");
        obj.setIngrediente("Leche/Huevo/Azúcar/Vainilla/Chocolate en polvo/Crema para batir");
        obj.setPrecio(68);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void crearCarpaccio(){
        Platillo obj=new Platillo();
        obj.setNombre("Carpaccio");
        obj.setIngrediente("Solomillo de ternera/Sal/Pimienta/Aceite de oliva/Alcaparras/Queso Parmesano");
        obj.setPrecio(249);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void crearTiramisu(){
        Platillo obj=new Platillo();
        obj.setNombre("Tiramisu");
        obj.setIngrediente("Huevo/Vino/Ralladura de naranja/Azúcar glass/Café espresso/Cocoa");
        obj.setPrecio(97);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void crearCapresse(){
        Platillo obj=new Platillo();
        obj.setNombre("Ensalada Capresse");
        obj.setIngrediente("Tomate/Albahaca/Aceite de oliva/Vinagre/Pimienta");
        obj.setPrecio(89);
        obj.setStock(3);
        obj.setTipoDePlatillo("Italiana");
        ListaPlatillo.agregar(obj);
    }
    public static void contiene(String platillo){
        for (int i = 0; i < ListaPlatillo.datosP.size(); i++) {
            if(datosP.get(i).nombre.equalsIgnoreCase(platillo)){
                ListaPlatillo.eliminar(i);
                i=ListaPlatillo.datosP.size();
            }
        } 
        
    }
}
