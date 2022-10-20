package mojito;

public class Rosas {

    private String familia;
    private String division;
    private String orden;
    private String genero;
        
    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void germinar(){System.out.println("Puedes sembrar en primavera o en otoño, en semillero o directamente en la tierra.");}
    public void crecer(){System.out.println("Las rosas crecen todo el año hasta principios de invierno.");}
    public void florecer(){System.out.println("Las rosas florecen en la primavera.");}
}
