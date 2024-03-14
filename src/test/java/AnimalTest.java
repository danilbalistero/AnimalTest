import org.example.Animal;
import org.example.CadastroAnimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AnimalTest {


    //validação com campos validos
    @Test
    public void cadastrarAnimal() {
        CadastroAnimal cadastroAnimal = new CadastroAnimal();

        Animal animal1 = new Animal(1, "Maguila", "Rottweiler", "grande", "curta", 50.00);
        cadastroAnimal.cadastrarAnimal(animal1);

        List<Animal> animalCadastrado = cadastroAnimal.listarAnimais();
        Assertions.assertTrue(animalCadastrado.contains(animal1));

    }

    //validação com campos vazios
    @Test
    public void cadastrarAnimalVazio() {
        CadastroAnimal cadastroAnimal = new CadastroAnimal();

        Animal animal2 = new Animal(2, "", "", "", "", 0);
        cadastroAnimal.cadastrarAnimal(animal2);

        List<Animal> animalCadastrado = cadastroAnimal.listarAnimais();
        Assertions.assertFalse(animalCadastrado.contains(animal2));
    }

    //consulta de animal por ID
    @Test
    public void consultarAnimal(){
        CadastroAnimal cadastroAnimal = new CadastroAnimal();

        Animal animal3 = new Animal(3, "Marcelina", "Pinscher", "Pequeno", "Curta", 6.00);
        cadastroAnimal.cadastrarAnimal(animal3);

        Animal animalConsultado = cadastroAnimal.consultarAnimal(3);

        //verificando se foi o mesmo cadastrado
        Assertions.assertEquals(animal3, animalConsultado);
    }

    //consulta de animal por ID invalido
    @Test
    public void consultarAnimalInvalido(){
        CadastroAnimal cadastroAnimal = new CadastroAnimal();

        Animal animal4 = new Animal(0, "Marcelina", "Pinscher", "Pequeno", "Curta", 6.00);
        cadastroAnimal.cadastrarAnimal(animal4);

        Animal animalConsultado = cadastroAnimal.consultarAnimal(0);

        //verificando se foi o mesmo cadastrado
        Assertions.assertNull(animalConsultado);

    }




}
