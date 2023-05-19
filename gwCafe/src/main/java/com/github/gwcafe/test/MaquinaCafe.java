// Generated by GraphWalker (http://www.graphwalker.org)
package com.github.gwcafe.test;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "com/github/gwcafe/MaquinaCafe.json")
public interface MaquinaCafe {

    @Edge()
    void iniciar();

    @Edge()
    void moeda_diferente_erro();

    @Edge()
    void pedir_cafe_sucesso();

    @Vertex()
    void dois_reais();

    @Vertex()
    void cafe_liberado();

    @Vertex()
    void inicial();

    @Vertex()
    void um_real();

    @Edge()
    void moeda_1_erro();

    @Edge()
    void moeda_1() throws Exception;

    @Vertex()
    void sem_moedas();

    @Edge()
    void pedir_cafe_erro();
}