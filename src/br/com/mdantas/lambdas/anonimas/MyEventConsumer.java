package br.com.mdantas.lambdas.anonimas;

/**
 * @author marcelo.dantas
 */

@FunctionalInterface
public interface MyEventConsumer {

    public void consumer(Object value);

    default void calcular() {

    }
}
