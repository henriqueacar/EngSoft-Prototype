import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void testeDepartamento() throws CloneNotSupportedException{
        Departamento departamento = new Departamento("Informatica", new Funcionario("Jose", "Dev", 1));

        Departamento departamentoClone = departamento.clone();
        departamentoClone.setDepartamento("Logistica");
        departamentoClone.getFuncionario().setNome("Andre");
        departamentoClone.getFuncionario().setIdentificacao(2);
        departamentoClone.getFuncionario().setFuncao("Aux");

        assertEquals("Departamento{departamento='Informatica', funcionario=Funcionario{nome='Jose', funcao='Dev', identificacao=1}}", departamento.toString());
        assertEquals("Departamento{departamento='Logistica', funcionario=Funcionario{nome='Andre', funcao='Aux', identificacao=2}}", departamentoClone.toString());
    }

}