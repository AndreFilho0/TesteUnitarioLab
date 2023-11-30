package exer1_10;

public class Pessoa {
    private  String nome;
    private int idade;
    private int responsavel;
    private  double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(int responsavel) {
        this.responsavel = responsavel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, int responsavel, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.responsavel = responsavel;
        this.salario = salario;
    }

    public double calcularImposto(){

        if (getIdade()>=65){
            return 0;

        }
        if (getSalario()<1787.77 && getIdade()<65){


            return 0;
        }

        if (getSalario()<2679.29 && getSalario()>=1787.77 && getIdade()<65){
           //7,5%
            double dependente = 179.71;

            return getSalario()*0.075 - dependente*getResponsavel() ;
        }
        if (getSalario()>=2679.29 && getSalario()<3572.43 && getIdade()<65){
            //15%
            double dependente=179.71;
            return getSalario()*0.15-dependente*getResponsavel();

        }

        if (getSalario()>=3572.43 && getSalario()<4463.81 && getIdade()<65){
            //22.5%
            double dependente=179.71;
            return getSalario()*0.225-dependente*getResponsavel();

        }

        if (getSalario()>=4463.81 && getIdade()<65){
            //27.5%
            double dependente=179.71;
            return getSalario()*0.275-dependente*getResponsavel();

        }


        return 0;
    }
}
