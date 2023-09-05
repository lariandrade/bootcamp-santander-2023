package ExerciciosCollections.List.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(numerosAscendente);
        }
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
        }
        return numerosAscendente;
    }

    public void exibirNumeros() {
        System.out.println(this.numeros);
    }

}
