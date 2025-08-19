package menus;

import pet.Pet;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MenuInicial {

    public void exibirMenu(){
        int opcoes,subOpcoes = 0;
        do{
            try{
                FileReader arquivo = new FileReader("formulario.txt");
                Pet pet = new Pet();
                Scanner conteudoArquivo = new Scanner(arquivo);
                Scanner leitor = new Scanner(System.in);
                System.out.println("1- Cadastrar um novo pet\n" +
                        "2 - Alterar os dados do pet cadastrado\n" +
                        "3 - Deletar um pet cadastrado\n" +
                        "4 - Listar todos os pets cadastrados\n" +
                        "5 - Listar pets por algum critério (idade, nome, raça)\n" +
                        "6 - Sair");
                System.out.print("Escolha uma das opções: ");
                opcoes = leitor.nextInt();
                leitor.nextLine();

                do{
                    switch(opcoes){
                        case 1:
                            while (conteudoArquivo.hasNextLine()) {
                                String linhaArquivo = conteudoArquivo.nextLine();
                                System.out.println(linhaArquivo);
                            }
                            System.out.println("Escolha uma das opções: ");
                            subOpcoes = leitor.nextInt();
                            leitor.nextLine();
                            switch(subOpcoes){
                                case 1:
                                    System.out.println("Digite o nome e o Sobrenome do pet: ");
                                    String nomeESobrenome = leitor.nextLine();
                                    pet.setNomeESobrenome(nomeESobrenome);
                                    break;
                                case 2:
                                    System.out.println("Digite o tipo do pet: ");
                                    String tipoDoPet = leitor.nextLine();
                                    pet.setTipoDoPet(tipoDoPet);
                                    break;
                                case 3:
                                    System.out.println("Digite o sexo do animal: ");
                                    pet.setSexoDoAnimal(leitor.nextLine());
                                    break;
                                case 4:
                                    System.out.println("Digite o endereço que o pet foi encontrado: ");
                                    pet.setEnderecoEBairroEncontrado(leitor.nextLine());
                                    break;
                                case 5:
                                    System.out.println("Digite a idade aproximada do pet: ");
                                    pet.setIdadeAproximada(leitor.nextInt());
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Valor inválido, tente novamente!");
                                    break;
                            }
                            break;
                        case 2:

                            break;
                    }
                }while(subOpcoes!=6);
                
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }while(opcoes != 6);
    }
}
