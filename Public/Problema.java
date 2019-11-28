public class Problema{
    private String sintomas;
    private String causas;

    public Problema(String sintomas, String causas){
        this.sintomas=sintomas;
        this.causas=causas;
    }

    public String getSintomas(){
        return sintomas;
    }

    public void setSintomas(String sintomas){
        this.sintomas=sintomas;
    }

    public String getCausas(){
        return causas;
    }

    public void setCausas(String causas){
        this.causas=causas;
    }
}