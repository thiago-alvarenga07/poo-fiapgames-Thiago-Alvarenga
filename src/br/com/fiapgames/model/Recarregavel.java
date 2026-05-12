package br.com.fiapgames.model;

public interface Recarregavel {
    // Método para recarregar um dispositivo, como um controle ou mouse sem fio
    void recarregar(int porcentagem);

    int CargaMaxima = 100; // Carga máxima para recarga, constante
    int CargaMinima = 0;   // Carga mínima para recarga, constante
}
