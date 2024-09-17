import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gen1 gen1 = new Gen1();
        Scanner scanner = new Scanner(System.in);
        gen1.pokemonsNaLista();

        System.out.println("Bem vindo a Pokedex em Java!");
        System.out.println("As pokedex acessíveis são as seguintes:");


        while (true) {
            System.out.println("NationalDex: Visualizar os pokémons de todas as gerações disponíveis.");
            System.out.println("Gen1: Visualizar todos os pokémons da 1° geração.");
            System.out.println("Você Também pode buscar um pokémon especifico através da opção 'Buscar'.");
            System.out.println("Digite a operação que deseja realizar: ");

            switch (scanner.nextLine().toUpperCase()) {
                case "NATIONALDEX":
                    System.out.println("NationalDex: ");
                    gen1.mostrarPokemons();
                    break;
                case "GEN1":
                    System.out.println("Pokedex da 1° geração: ");
                    gen1.mostrarPokemons();
                    break;
                case "BUSCAR":
                    System.out.println("Digite '1' para buscar pelo nome ou '2' para buscar pelo número do pokémon");
                    int operacao = scanner.nextInt();
                    scanner.nextLine();

                    switch (operacao) {
                        case 1:
                            System.out.println("Digite o nome do Pokémon:");
                            String nome = scanner.nextLine();
                            Pokemon pokemonPorNome = gen1.buscarPokemon(nome);
                            if (pokemonPorNome == null) {
                                System.out.println("Esse pokémon não existe nessa pokedex!!!");
                            } else {
                                System.out.println(pokemonPorNome);
                            }
                            break;
                        case 2:
                            System.out.println("Digite o número do Pokémon:");
                            int numero = scanner.nextInt();
                            scanner.nextLine();
                            Pokemon pokemonPorNumero = gen1.buscarPokemonNumero(numero);
                            if (pokemonPorNumero == null) {
                                System.out.println("O pokémon com essa numeração não existe nessa pokedex!!!");
                            } else {
                                System.out.println(pokemonPorNumero);
                            }
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida. Tente novamente.");
                    break;
            }
            System.out.println("Deseja continuar?");
            String opcao = scanner.nextLine().toUpperCase();
            if (!opcao.equals("SIM")) {
                System.out.println("Finalizado.");
                break;
            }
        }
    }
}