public class Calificacion {
    public static void main(String[] args) throws Exception {
        resultado();
        resultado2();
    }

    public static void resultado(){
        int i = 8;
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
    public static void resultado2(){
    	int nota = 8;
    	if (nota < 0 || nota > 10) {
            System.out.println("Nota incorrecta");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");                                                                  
        }
    }
    }
    
