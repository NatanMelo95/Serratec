package model.funcionario;
public class Funcionario {
    private String nome; 
    private String cargo;
    private Double salarioBruto;
    private Integer dependentes;
    private Double salarioLiquido;
    
    public Funcionario(){}
    public Funcionario(String nome,
    String cargo,
    Double salarioBruto,
    int dependentes){
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
        this.dependentes = dependentes;
    }

    //#region Gets e Sets
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Integer getDependentes() {
        return this.dependentes;
    }
    public void setDependentes(Integer dependentes) {
        this.dependentes = dependentes;
    }

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public Double getSalarioLiquido(){
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido){
        this.salarioLiquido = salarioLiquido;
    }
    //#endregion
    
}