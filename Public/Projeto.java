import java.util.ArrayList;
public class Projeto{
    private int numSequencial;
    private String nomeID;
    private String lider; //não se este último é um String
    private ArrayList<String> sponsors;
    private ArrayList<String> clientes;
    private ArrayList<String> users;


    public Projeto(int numSequencial,String nomeID, String lider){
        this.numSequencial=numSequencial;
        this.nomeID=nomeID;
        this.lider=lider;
        sponsors = new ArrayList<String>(); 
        clientes = new ArrayList<String>();
        users = new ArrayList<String>();
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

    public ArrayList<String> getSponsors(){
        return sponsors;
    }

    public ArrayList<String> getClientes(){
        return clientes;
    }

    public ArrayList<String> getUsers(){
        return users;
    }
    
}