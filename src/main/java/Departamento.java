public class Departamento implements Cloneable {
    private String departamento;
    private Funcionario funcionario;

    public Departamento(String departamento, Funcionario funcionario){
        this.departamento = departamento;
        this.funcionario = funcionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public Departamento clone() throws CloneNotSupportedException{
        Departamento departamentoClone = (Departamento) super.clone();
        departamentoClone.funcionario = (Funcionario) departamentoClone.funcionario.clone();
        return departamentoClone;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "departamento='" + departamento + '\'' +
                ", funcionario=" + funcionario +
                '}';
    }
}
