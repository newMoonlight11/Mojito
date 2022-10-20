
package mojito;

public class Mojito {

    public static void main(String[] args) {
        Rosas rose = new Rosas();
        rose.setFamilia("Rosaceae");
        rose.setDivision("Magnoliophyta");
        rose.setOrden("Rosales");
        rose.setGenero("Rosa");
        System.out.println("Las rosas pertenecen a la familia "+rose.getFamilia()+" de la división "+rose.getDivision()+" de orden "+rose.getOrden()+" del género "+rose.getGenero()+".");
    }
    
}
