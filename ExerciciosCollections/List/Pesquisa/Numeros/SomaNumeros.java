package ExerciciosCollections.List.Pesquisa.Numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int totalSoma = 0;
        for (Integer num : numeros) {
            totalSoma += num;
        }
        return totalSoma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero=Integer.MIN_VALUE;
        if(!numeros.isEmpty()) {
            for (Integer num : numeros) {
                if(num >= maiorNumero) {
                    maiorNumero = num;
                }
            }
        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero() {
        int menorNumero=Integer.MAX_VALUE;
        if(!numeros.isEmpty()) {
            for (Integer num : numeros) {
                if(num <= menorNumero) {
                    menorNumero = num;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
       System.out.println(numeros);
    }

}
