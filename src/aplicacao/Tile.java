package aplicacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tile {
    public static final int GRAMA = 0;
    public static final int LAVA = 1;
    public static final int AGUA = 2;
    public static final int MONTANHA = 3;
    public static final int CAVERNA = 4;

    public static final int VAZIO = 0;
    public static final int CENTRO = -1;
    public static final int LOJA = -2;
    public static final int LOJA_VAZIA = -3;
    public static final int TREINADOR = -4;
    public static final int TREINADOR_DERROTADO = -5;
    // public static final int POKEMON = 1;// id dos 151??
    // pokemons vai usar o propio id

    public static final int PERFUME = -1;
    public static final int VENDEDOR = -2;
    public static final int GRITO_TREINADOR = -3;

    private int ocupado = Tile.VAZIO;
    private int terreno = Tile.GRAMA;
    private List<Integer> percepcoes = new ArrayList<Integer>();

    public Tile() {
	this.ocupado = Tile.VAZIO;
	this.terreno = Tile.GRAMA;
    }

    public Tile(int ocupado, int terreno) {
	super();
	this.ocupado = ocupado;
	this.terreno = terreno;
    }

    public int getOcupado() {
	return ocupado;
    }

    public void setOcupado(int ocupado) {
	this.ocupado = ocupado;
    }

    public int getTerreno() {
	return terreno;
    }

    public void setTerreno(int terreno) {
	this.terreno = terreno;
    }

    public String getTerrenoString() {
	String string = "";
	switch (this.terreno) {
	case GRAMA:
	    string = "Grama";
	    break;
	case LAVA:
	    string = "LAVA";
	    break;
	case AGUA:
	    string = "AGUA";
	    break;
	case CAVERNA:
	    string = "CAVERNA";
	    break;
	case MONTANHA:
	    string = "MONTANHA";
	    break;
	}
	return string;
    }

    public String getOcupadoString() {
	String string = "";

	switch (this.ocupado) {
	case VAZIO:
	    string = "Vazio";
	    break;
	case CENTRO:
	    string = "CENTRO";
	    break;
	case LOJA:
	    string = "LOJA";
	    break;
	case TREINADOR:
	    string = "TREINADOR";
	    break;
	default:
	    string = "Pokemon - "
		    + new Pokedex().getPokemon(this.getOcupado()).getNome();
	    break;
	}
	return string;
    }

    public List<Integer> getPercepcoes() {
	return percepcoes;
    }

    public void setPercepcoes(List<Integer> percepcoes) {
	this.percepcoes = percepcoes;
    }

    public void adicionaPercepcao(int percepcao) {
	percepcoes.add(percepcao);
    }

    public void removePercepcao(int percepcao) {
	Iterator it = percepcoes.iterator();
	while (it.hasNext()) {
	    Integer valor = (Integer) it.next();
	    if (valor == percepcao) {
		percepcoes.remove(percepcao);
		break;
	    }
	}
    }

    public String toString() {
	String string = "";
	string += "Terreno: ";
	string += this.getTerrenoString();
	string += "\nOcupado: ";
	string += this.getOcupadoString();
	return string;
    }

    public static void main(String[] args) {
	System.out.println("teste Tile");
    }
}
