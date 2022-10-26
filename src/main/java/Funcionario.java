public class Funcionario implements Cloneable {
    private String nome;
    private String funcao;
    private Integer identificacao;

    public Funcionario(String nome, String funcao, Integer identificacao){
        this.funcao = funcao;
        this.identificacao = identificacao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Integer getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Integer identificacao) {
        this.identificacao = identificacao;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                ", identificacao=" + identificacao +
                '}';
    }
}
