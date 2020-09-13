import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        Supplier<List<String>> listSupplier = () -> List.of("Ana", "Bia", "Lia", "Gui");
        System.out.println(listSupplier.get());
    }
}
