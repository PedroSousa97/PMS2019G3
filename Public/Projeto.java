import java.util.ArrayList;
public class Projeto{
    private int numSequencial;
    private String nomeID;
    private String lider; //não se este último é um String
    private String descricao;
    private ArrayList<String> sponsors;
    private ArrayList<String> clientes;
    private ArrayList<String> users;
    private ArrayList<Integer> fases;

    //private enum prioridade{Alta, Média, Baixa}

    public Projeto(int numSequencial,String nomeID, String lider, String descricao){
        this.numSequencial=numSequencial;
        this.nomeID=nomeID;
        this.lider=lider;
        this.descricao=descricao;
        sponsors = new ArrayList<String>(); 
        clientes = new ArrayList<String>();
        users = new ArrayList<String>();
        fases = new ArrayList<Integer>();
    }

    public int getNumSequencial(){
        return numSequencial;
    } 

    public void setNumSequencial(int numSequencial){
        this.numSequencial=numSequencial;
    }

    public String getNomeID(){
        return nomeID;
    }

    public void setNomeID(String nomeID){
        this.nomeID=nomeID;
    }

    public String getLider(){
        return lider;
    }

    public void setLider(String lider){
        this.lider=lider;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao=descricao;
    }

    public ArrayList<String> getSponsors(){
        return sponsors;
    }

    public ArrayList<String> getClientes(){
        return clientes;
    }

    public ArrayList<String> getUsers(){
        return users;
    }

    public ArrayList<Integer> getFases(){
        return fases;
    }

    public void addFases(Integer fase){ 
        fases.add(fase);
    }
}