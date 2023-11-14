import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface InformacaoPessoa {
    String nome();
    int idade();
    String cidade();
}

@InformacaoPessoa(nome = "João", idade = 25, cidade = "São Paulo")
class Pessoa {
}
