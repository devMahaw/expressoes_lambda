package br.com.mdantas.lambdas.anonimas;

/**
 * @author marcelo.dantas
 */
public class QuandoUtilizarParenteses {

    public static void main(String[] args) {
        MyEventConsumer myEvent = (Object s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvent1 = (s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvent2 = (s) -> System.out.println(s);

        MyEventConsumer myEvent3 = s -> System.out.println(s);
    }
}
