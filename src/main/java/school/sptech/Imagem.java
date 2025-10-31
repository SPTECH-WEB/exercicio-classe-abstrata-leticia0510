package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double somaAreas = 0.0;
        for (Figura figura : figuras) {
            somaAreas += figura.calcularArea();
        }
        return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> maior20 = new ArrayList<>();
        for (int i = 0; i < figuras.size(); i++) {
            if(figuras.get(i).calcularArea() > 20){
                maior20.add(figuras.get(i));
            }
        }
        return maior20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> listaQuadrado = new ArrayList<>();
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i) instanceof Quadrado){
                listaQuadrado.add(figuras.get(i));
            }
        }
        return listaQuadrado;
    }
}
