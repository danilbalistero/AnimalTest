import org.example.Animal;
import org.example.CadastroAnimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AnimalTest {


    @Test
    public void cadastrarAnimal() {
        CadastroAnimal cadastroAnimal = new CadastroAnimal();

        Animal animal1 = new Animal(1, "Maguila", "Rottweiler", "grande", "curta", 50.00);
        cadastroAnimal.cadastrarAnimal(animal1);

        List<Animal> animalCadastrado = cadastroAnimal.listarAnimais();
        Assertions.assertTrue(animalCadastrado.contains(animal1));

    }
}
