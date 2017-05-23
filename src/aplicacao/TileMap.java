package aplicacao;

import java.util.ArrayList;
import java.util.Random;

public class TileMap {
    private int treinadores;
    private int centros;
    private int lojas;
    private int pokemons;
    private int maxX;
    private int maxY;

    private ArrayList<Tile> tiles = new ArrayList<>();

    public TileMap() {
	super();
	this.treinadores = 50;
	this.centros = 20;
	this.lojas = 15;
	this.pokemons = 151;
	this.maxX = 42;
	this.maxY = 42;
    }

    public TileMap(int treinadores, int centros, int lojas, int pokemons) {
	super();
	this.treinadores = treinadores;
	this.centros = centros;
	this.lojas = lojas;
	this.pokemons = pokemons;
    }

    public void geraTiles() {
	Random gerador = new Random();
	for (int i = 0; i < this.maxX; i++) {
	    for (int j = 0; j < this.maxY; j++) {
		Tile tile = new Tile();
		tile.setTerreno(gerador.nextInt(5));
		this.tiles.add(tile);
	    }
	}
    }

    public void espalhaTreinadores() {
	Random gerador = new Random();
	int trainers = this.treinadores;
	Tile tile = null;

	while (trainers > 0) {
	    int index = gerador.nextInt(maxX * maxY);
	    tile = tiles.get(index);
	    if (tile.getOcupado() == Tile.VAZIO) {
		tile.setOcupado(Tile.TREINADOR);
		trainers--;
		tiles.set(index, tile);
	    }
	}
    }

    public void espalhaCentros() {
	Random gerador = new Random();
	Tile tile = null;
	int center = this.centros;

	while (center > 0) {
	    int index = gerador.nextInt(maxX * maxY);
	    tile = tiles.get(index);
	    if (tile.getOcupado() == Tile.VAZIO) {
		tile.setOcupado(Tile.CENTRO);
		center--;
		tiles.set(index, tile);
	    }
	}

    }

    public void espalhaLojas() {
	Random gerador = new Random();
	Tile tile = null;
	int shop = this.lojas;

	while (shop > 0) {
	    int index = gerador.nextInt(maxX * maxY);
	    tile = tiles.get(index);
	    if (tile.getOcupado() == Tile.VAZIO) {
		tile.setOcupado(Tile.LOJA);
		shop--;
		tiles.set(index, tile);
	    }
	}
    }

    public void espalhaPokemons() {
	System.out.println("Implementar apos criar pokemons");
    }

    // Faltam os pokemons
    public void geraElementos() {
	this.espalhaCentros();
	this.espalhaLojas();
	this.espalhaTreinadores();

    }

    public Tile getTile(int x, int y) {
	Tile tile = null;
	tile = this.tiles.get(x * this.maxX + y);
	return tile;
    }

    public int getTerrenoAt(int x, int y) {
	return this.getTile(x, y).getTerreno();
    }

    public int getTreinadores() {
	return treinadores;
    }

    public void setTreinadores(int treinadores) {
	this.treinadores = treinadores;
    }

    public int getCentros() {
	return centros;
    }

    public void setCentros(int centros) {
	this.centros = centros;
    }

    public int getLojas() {
	return lojas;
    }

    public void setLojas(int lojas) {
	this.lojas = lojas;
    }

    public int getPokemons() {
	return pokemons;
    }

    public void setPokemons(int pokemons) {
	this.pokemons = pokemons;
    }

    public int getMaxX() {
	return maxX;
    }

    public void setMaxX(int maxX) {
	this.maxX = maxX;
    }

    public int getMaxY() {
	return maxY;
    }

    public void setMaxY(int maxY) {
	this.maxY = maxY;
    }

    public ArrayList<Tile> getTiles() {
	return tiles;
    }

    public void setTiles(ArrayList<Tile> tiles) {
	this.tiles = tiles;
    }

    public String toString() {
	String string = "";

	for (int i = 0; i < this.maxX; i++) {
	    for (int j = 0; j < this.maxY; j++) {
		Tile tile = tiles.get(i * maxX + j);
		string += tile.getTerreno() + "|" + tile.getOcupado() + " ";
	    }
	    string += "\n";
	}
	return string;
    }

    public static void main(String[] args) {
	TileMap map = new TileMap();
	map.geraTiles();
	map.geraElementos();
	System.out.println(map.toString());
	// System.out.println(map.getTile(25, 20).toString());
    }
}
