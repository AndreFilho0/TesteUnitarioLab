package org.example;

import exer1_10.Pessoa;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest  {

    @Test
    public void testCalcularImpostoMais65() {
       Pessoa pessoa = new Pessoa("joão",70,0,2000);
       double imposto= pessoa.calcularImposto();
        Assertions.assertEquals(0,imposto);

    }

    @Test
    public  void testeCalculaImpostoSalarioMenor1787(){
        Pessoa pessoa = new Pessoa("joão",21,0,100);
        double imposto = pessoa.calcularImposto();
        Assertions.assertEquals(0,imposto);

    }

    @Test
    public  void testeCalculaImpostoSalarioEntre1787e2679(){
        Pessoa pessoa = new Pessoa("joão",21,0,2000);
        double imposto = pessoa.calcularImposto();
        Assertions.assertEquals(150,imposto);

    }

    @Test
    public  void testeCalculaImpostoSalarioEntre2679e3572(){
        Pessoa pessoa = new Pessoa("joão",21,0,3000);
        double imposto = pessoa.calcularImposto();
        Assertions.assertEquals(450,imposto);
    }

    @Test
    public  void testeCalculaImpostoSalarioEntre3572e4463(){
        Pessoa pessoa = new Pessoa("joão",21,0,4000);
        double imposto = pessoa.calcularImposto();
        Assertions.assertEquals(900,imposto);
    }

    @Test
    public  void testeCalculaImpostoSalarioMaior4463(){
        Pessoa pessoa = new Pessoa("joão",21,0,5000);
        double imposto = pessoa.calcularImposto();
        Assertions.assertEquals(1375,imposto);
    }

    @Test
    public  void testeCalculaImpostoNumeroContribuinte(){
        Pessoa pessoa = new Pessoa("joão",21,4,4000);
        double imposto = pessoa.calcularImposto();
        Assertions.assertEquals(181.16,imposto,0.1);
    }

}