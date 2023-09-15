public class Calificacion {
    public static void main(String[] args) throws Exception {
        Calificacion calificacion = new Calificacion();
        calificacion.resultado();
    }

    public void resultado(){
        int i = -1225;
        if(i>0 && i<5){
            System.out.println("Insuficiente");
        }else if (i>0 && i<6) {
            System.out.println("Suficiente");
        }else if(i>0 && i<7){
            System.out.println("Bien");
        }else if(i>0 && i<9){
            System.out.println("Notable");
        }else if(i>0 && i<=10){
            System.out.println("Sobresaliente");
        }else{
             System.out.println("LA NOTA ES INCORRECTA");
        }
    }
}
