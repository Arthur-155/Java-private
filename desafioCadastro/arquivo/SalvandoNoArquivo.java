package arquivo;

import pet.Pet;

import java.io.FileWriter;

public class SalvandoNoArquivo {

    public void salvarArquivo(Pet pet){
        try(FileWriter fw = new FileWriter("C:\\Users\\Gustavo\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt",true)){
            fw.write(pet.getNomeESobrenome());
            fw.write(pet.getIdadeAproximada());
            fw.write(pet.getTipoDoPet());
            fw.write(pet.getSexoDoAnimal());
            fw.write(pet.getEnderecoEBairroEncontrado());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
