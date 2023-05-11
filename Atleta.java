

public class Atleta extends Pessoa {
    public String pais;
    public double altura;
    
    public Atleta(){
    };
    
    public Atleta(String nome, char sexo, String pais, double altura){
        super(nome, sexo);
        this.pais = pais;
        this.altura = altura;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return "\n" + getNome() + ", " + getSexo() + ", " + pais 
                + ", superou a altura de " + altura + " metros";
    }
}           
