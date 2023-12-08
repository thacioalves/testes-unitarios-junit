package br.unitins;

import br.unitins.model.Eleitor;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

@QuarkusTest
public class EleitorTest {

    @Test
    public void calcularIdade(){
        Eleitor joao = new Eleitor("Joao", "000011112222", LocalDateTime.of(2002, 02, 11, 22, 11, 33));
        Assertions.assertEquals(16, joao.getIdade());
    }

    @Test
    public void retornarIdadeEleitor(){
        Eleitor joao = new Eleitor("Joao", "000011112222", LocalDateTime.of(2002, 02, 11, 22, 11, 33));
        Assertions.assertTrue(joao.aprovadoVotar());
    }
}
