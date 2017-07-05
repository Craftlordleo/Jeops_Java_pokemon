package aplicacao;

import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.FileReader;
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

    public void reader(String s, int tileSize) {

	try {
	    BufferedReader br = new BufferedReader(new FileReader(s));
	    this.maxX = Integer.parseInt(br.readLine());
	    this.maxY = Integer.parseInt(br.readLine());
	    // map = new int[mapHeight][mapWidth];
	    String delimiters = " ";
	    for (int row = 0; row < this.maxY; row++) {
		String line = br.readLine();
		String[] tokens = line.split(delimiters);
		for (int col = 0; col < this.maxX; col++) {
		    Tile tile = new Tile();
		    tile.setTerreno(Integer.parseInt(tokens[col]));
		    this.tiles.add(tile);
		}
	    }
	}

	catch (Exception e) {
	    System.out.println(e.getStackTrace());
	}

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

    public void apagaTreinador() {

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

    public void espalhaThing(int quantidade, int valor) {
	Random gerador = new Random();
	Tile tile = null;

	while (quantidade > 0) {
	    int index = gerador.nextInt(maxX * maxY);
	    tile = tiles.get(index);
	    if (tile.getOcupado() == Tile.VAZIO) {
		tile.setOcupado(valor);
		quantidade--;
		tiles.set(index, tile);
		espalhaPercepcao(index, valor);
	    }
	}
    }

    public void espalhaPercepcao(int posicao, int valor) {
	if (posicao == 0) { // canto superior esquerdo
	    tiles.get(posicao + 1).adicionaPercepcao(valor);
	    tiles.get(posicao + maxX).adicionaPercepcao(valor);

	} else if (posicao == maxX - 1) { // canto superior direito
	    tiles.get(posicao - 1).adicionaPercepcao(valor);
	    tiles.get(posicao + maxX).adicionaPercepcao(valor);

	} else if (posicao == maxX * maxY - 1) { // canto inferior direito
	    tiles.get(posicao - 1).adicionaPercepcao(valor);
	    tiles.get(posicao - maxX).adicionaPercepcao(valor);

	} else if (posicao == maxX * (maxY - 1)) { // canto inferior esquerdo
	    tiles.get(posicao + 1).adicionaPercepcao(valor);
	    tiles.get(posicao - maxX).adicionaPercepcao(valor);

	} else if (posicao % maxX == 0) { // esquerdo
	    tiles.get(posicao + 1).adicionaPercepcao(valor);
	    tiles.get(posicao - maxX).adicionaPercepcao(valor);
	    tiles.get(posicao + maxX).adicionaPercepcao(valor);

	} else if (posicao < maxX) { // superior
	    tiles.get(posicao + 1).adicionaPercepcao(valor);
	    tiles.get(posicao - 1).adicionaPercepcao(valor);
	    tiles.get(posicao + maxX).adicionaPercepcao(valor);

	} else if (posicao % maxX == maxY - 1) { // direito
	    tiles.get(posicao - 1).adicionaPercepcao(valor);
	    tiles.get(posicao - maxX).adicionaPercepcao(valor);
	    tiles.get(posicao + maxX).adicionaPercepcao(valor);

	} else if (posicao / maxX >= maxY - 1) { // inferior
	    tiles.get(posicao + 1).adicionaPercepcao(valor);
	    tiles.get(posicao - 1).adicionaPercepcao(valor);
	    tiles.get(posicao - maxX).adicionaPercepcao(valor);

	} else {
	    tiles.get(posicao - 1).adicionaPercepcao(valor);
	    tiles.get(posicao + 1).adicionaPercepcao(valor);
	    tiles.get(posicao + maxX).adicionaPercepcao(valor);
	    tiles.get(posicao - maxX).adicionaPercepcao(valor);
	}
    }

    public void removeThing(int valor, int posicao) {
	Tile tile = this.tiles.get(posicao);

	switch (valor) {
	case Tile.TREINADOR:
	    tile.setOcupado(Tile.TREINADOR_DERROTADO);
	    removePercepcao(posicao, Tile.TREINADOR);
	    break;
	case Tile.LOJA:
	    tile.setOcupado(Tile.LOJA_VAZIA);
//	    removePercepcao(posicao, Tile.LOJA);	    
	    break;
	}
    }

    public void removePercepcao(int posicao, int valor) {
	if (posicao == 0) { // canto superior esquerdo
	    tiles.get(posicao + 1).removePercepcao(valor);
	    tiles.get(posicao + maxX).removePercepcao(valor);

	} else if (posicao == maxX - 1) { // canto superior direito
	    tiles.get(posicao - 1).removePercepcao(valor);
	    tiles.get(posicao + maxX).removePercepcao(valor);

	} else if (posicao == maxX * maxY - 1) { // canto inferior direito
	    tiles.get(posicao - 1).removePercepcao(valor);
	    tiles.get(posicao - maxX).removePercepcao(valor);

	} else if (posicao == maxX * (maxY - 1)) { // canto inferior esquerdo
	    tiles.get(posicao + 1).removePercepcao(valor);
	    tiles.get(posicao - maxX).removePercepcao(valor);

	} else if (posicao % maxX == 0) { // esquerdo
	    tiles.get(posicao + 1).removePercepcao(valor);
	    tiles.get(posicao - maxX).removePercepcao(valor);
	    tiles.get(posicao + maxX).removePercepcao(valor);

	} else if (posicao < maxX) { // superior
	    tiles.get(posicao + 1).removePercepcao(valor);
	    tiles.get(posicao - 1).removePercepcao(valor);
	    tiles.get(posicao + maxX).removePercepcao(valor);

	} else if (posicao % maxX == maxY - 1) { // direito
	    tiles.get(posicao - 1).removePercepcao(valor);
	    tiles.get(posicao - maxX).removePercepcao(valor);
	    tiles.get(posicao + maxX).removePercepcao(valor);

	} else if (posicao / maxX >= maxY - 1) { // inferior
	    tiles.get(posicao + 1).removePercepcao(valor);
	    tiles.get(posicao - 1).removePercepcao(valor);
	    tiles.get(posicao - maxX).removePercepcao(valor);

	} else {
	    tiles.get(posicao - 1).removePercepcao(valor);
	    tiles.get(posicao + 1).removePercepcao(valor);
	    tiles.get(posicao + maxX).removePercepcao(valor);
	    tiles.get(posicao - maxX).removePercepcao(valor);
	}
    }

    public void espalhaPokemons() {
	Random gerador = new Random();
	Tile tile = null;
	int pokemons = this.pokemons;

	while (pokemons > 0) {
	    int index = gerador.nextInt(maxX * maxY);
	    tile = tiles.get(index);
	    if (tile.getOcupado() == Tile.VAZIO) {
		tile.setOcupado(pokemons);
		pokemons--;
		tiles.set(index, tile);
	    }
	}
    }

    // Faltam os pokemons
    public void geraElementos() {
	// this.espalhaCentros();
	// this.espalhaLojas();
	// this.espalhaTreinadores();
	this.espalhaThing(this.getCentros(), Tile.CENTRO);
	this.espalhaThing(this.getLojas(), Tile.LOJA);
	this.espalhaThing(this.getTreinadores(), Tile.TREINADOR);
	this.espalhaPokemons();
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

    public String getConfiguracao() {
	String string = "";
	string += "Treinadores: " + this.getTreinadores();
	string += "\nCentros: " + this.getCentros();
	string += "\nLojas: " + this.getLojas();
	string += "\nPokemons: " + this.getPokemons();
	string += "\nMaxX: " + this.getMaxX();
	string += "\nMaxY: " + this.getMaxY();
	return string;
    }

    public static void main(String[] args) {
	TileMap map = new TileMap();
	// map.geraTiles();
	map.reader(
		"C:\\Users\\Carlos\\Dropbox\\Work\\PokemonJeopsWeb\\build\\classes\\aplicacao\\testmap.txt",
		20);
	map.geraElementos();
	System.out.println(map.toString());
	System.out.println(map.getConfiguracao());
	System.out.println(map.getTile(25, 20).toString());
	System.out.println(
		"============================================================");
	System.out.println(map.getTile(20, 25).toString());
    }
}
