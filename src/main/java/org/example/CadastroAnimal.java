package org.example;

import java.util.ArrayList;
import java.util.List;

public class CadastroAnimal {
    private List<Animal> animais;

    public CadastroAnimal() {
        this.animais = new ArrayList<>();
    }

    public void cadastrarAnimal(Animal animal) {
        if (animal.isValid()) {
            animais.add(animal);
        } else {
            System.out.println("Erro: Animal com campos vazios. Não foi possível cadastrar.");
        }
    }

    public void editarAnimal(String nomeAntigo, Animal novoAnimal) {
        if (novoAnimal.isValid()) {
            for (int i = 0; i < animais.size(); i++) {
                Animal animal = animais.get(i);
                if (animal.getNome().equals(nomeAntigo)) {
                    animais.set(i, novoAnimal);
                    return;
                }
            }
            System.out.println("Erro: Animal não encontrado. Não foi possível editar.");
        } else {
            System.out.println("Erro: Novo animal inválido. Não foi possível editar.");
        }
    }

    public void excluirAnimal(int id) {
        animais.removeIf(animal -> animal.getId() == id);
    }

    public Animal consultarAnimal(int id) {
        if (id <= 0) {
            System.out.println("Erro: ID inválido.");
            return null;
        }
        for (Animal animal : animais) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }

    public List<Animal> listarAnimais() {
        return new ArrayList<>(animais);
    }
}