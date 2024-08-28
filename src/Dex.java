import java.util.ArrayList;

public abstract class Dex {
    protected ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();

    public Pokemon buscarPokemon(String nome) {
        for (Pokemon pokemonNaLista : pokemonArrayList) {
            if (pokemonNaLista.getNome().equalsIgnoreCase(nome)) {
                return pokemonNaLista;
            }
        }
        return null;
    }

    public Pokemon buscarPokemonNumero(int numero) {
        for (Pokemon pokemonNaLista : pokemonArrayList) {
            if (pokemonNaLista.getNumeroDex() == numero) {
                return pokemonNaLista;
            }
        }
        return null;
    }

    public void mostrarPokemons() {
        for (Pokemon pokemon : pokemonArrayList) {
            if (pokemon.getTipo2() != null) {
                System.out.println("N°" + pokemon.getNumeroDex() + ": " + pokemon.getNome() + ", " + pokemon.getTipo1().toUpperCase() + " " + pokemon.getTipo2().toUpperCase());
            } else {
                System.out.println("N°" + pokemon.getNumeroDex() + ": " + pokemon.getNome() + ", " + pokemon.getTipo1().toUpperCase());
            }
        }
    }
}
