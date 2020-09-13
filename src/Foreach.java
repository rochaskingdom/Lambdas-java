import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = List.of("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);
    }
}
