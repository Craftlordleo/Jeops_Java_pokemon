package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> lista_pokemons;

    public Pokedex() {
	lista_pokemons = new ArrayList<Pokemon>();
	lista_pokemons.add(new Pokemon());
    }

    public ArrayList<Pokemon> getListaPokemons() {
	return lista_pokemons;
    }

    public void setListaPokemons(ArrayList<Pokemon> pokemons) {
	this.lista_pokemons = pokemons;
    }

    public Pokemon getPokemon(int id) {
	return this.lista_pokemons.get(id);
    }

    public void addPokemon(Pokemon pokemon) {
	if (this.getPokemon(pokemon.getId()) == null) {
	    this.lista_pokemons.add(pokemon.getId(), pokemon);
	}
    }

    public void updatePokemon(Pokemon pokemon) {
	this.lista_pokemons.add(pokemon.getId(), pokemon);
    }

    public void lerArquivoNomes() {
	String csvFile = "C:/Users/Carlos/Dropbox/Work/PokemonJeopsWeb/src/aplicacao/Lista_nomes.csv";
	BufferedReader br = null;
	String line = "";
	String csvSplitBy = ",";
	try {
	    br = new BufferedReader(new FileReader(csvFile));
	    while ((line = br.readLine()) != null) {
		String[] poke = line.split(csvSplitBy);
		Pokemon pokemon = new Pokemon();
		pokemon.setId(Integer.parseInt(poke[0]));
		pokemon.setNome(poke[1]);
		// System.out.println("-------------------------------------");
		// // System.out.println("|" + poke[0] + "|" + poke[1]);
		// System.out.println(pokemon.toString());
		// this.lista_pokemons.add(pokemon);
		this.addPokemon(pokemon);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
	try {
	    br.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public void lerArquivoTipos() {
	String csvFile = "C:/Users/Carlos/Dropbox/Work/PokemonJeopsWeb/src/aplicacao/Lista_tipos.csv";
	BufferedReader br = null;
	String line = "";
	String csvSplitBy = ",";
	Pokemon pokemon = null;

	try {
	    br = new BufferedReader(new FileReader(csvFile));
	    while ((line = br.readLine()) != null) {
		String[] poke = line.split(csvSplitBy);
		pokemon = this.lista_pokemons.get(Integer.parseInt(poke[0]));

		switch (Integer.parseInt(poke[2])) {
		case 1:
		    pokemon.setTipo1(Integer.parseInt(poke[1]));
		    break;
		case 2:
		    pokemon.setTipo2(Integer.parseInt(poke[1]));
		    break;
		}

		this.addPokemon(pokemon);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
	try {
	    br.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void main(String[] args) {
	Pokedex pokedex = new Pokedex();
	pokedex.lerArquivoNomes();
	pokedex.lerArquivoTipos();

    }

}
