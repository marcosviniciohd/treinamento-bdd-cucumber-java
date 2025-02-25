package br.com.marcos.vinicio.passos;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class AprenderCucumberPassos {
    private int contador;

    @Dado ("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente()  throws Throwable {

    }

    @Quando ("executá-lo")
    public void executar() throws Throwable{

    }

    @Então ("a especificação deve finalizar com sucesso")
    public void a_especificacao_deve_finalizar_com_sucesso() throws Throwable {

    }

    @Dado("que o valor do contador é {int}")
    public void queOValorDoContadorE(int valorContador) {
        contador = valorContador;
        System.out.println("O contador será iniciado com o valor: " + valorContador);
    }

    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(int valorIncremento) {
        contador += valorIncremento;
        System.out.println("O contador será incrementado em: " + valorIncremento);
    }

    @Então("o valor do contador será {int}")
    public void OValorDoContadorSera(int valorEsperado) {
        System.out.println("O método será chamado com o valor esperado: " + valorEsperado);
        System.out.println("Valor esperado: " + valorEsperado);

        Assert.assertEquals(valorEsperado, contador);
        Assert.assertEquals("O valor do contador não corresponde ao valor esperado!", valorEsperado, contador);
    }
}
