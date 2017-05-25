package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Pokedex {
	private HashMap<Integer, Pokemon> lista_pokemons;

	public Pokedex() {
		lista_pokemons = new HashMap<Integer, Pokemon>();
		this.lerArquivoNomes();
		this.lerArquivoTipos();
	}

	public HashMap<Integer, Pokemon> getListaPokemons() {
		return lista_pokemons;
	}

	public void setListaPokemons(HashMap<Integer, Pokemon> pokemons) {
		this.lista_pokemons = pokemons;
	}

	public Pokemon getPokemon(int id) {
		return this.lista_pokemons.get(id);
	}

	public void addPokemon(Pokemon pokemon) {
		// if(this.lista_pokemons.containsKey(pokemon.getId())){
		// this.lista_pokemons.
		// }else{
		// this.lista_pokemons.put(pokemon.getId(), pokemon);
		// }
		this.lista_pokemons.put(pokemon.getId(), pokemon);
	}

	public void lerArquivoNomes() {
		String csvFile = "/src/aplicacao/Lista_nomes.csv";
		String path = System.getProperty("user.dir");
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		try {
			br = new BufferedReader(new FileReader(path + csvFile));
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
		String csvFile = "/src/aplicacao/Lista_tipos.csv";
		String path = System.getProperty("user.dir");
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		Pokemon pokemon = null;

		try {
			br = new BufferedReader(new FileReader(path + csvFile));
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
		System.out.println(pokedex.getPokemon(6));
		System.out.println(pokedex.getPokemon(1));
		System.out.println(pokedex.getPokemon(151));
	}

}
