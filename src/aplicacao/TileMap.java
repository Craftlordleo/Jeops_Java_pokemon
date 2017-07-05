package aplicacao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import com.sun.javafx.geom.Ellipse2D;

public class TileMap {
    private int treinadores;
    private int centros;
    private int lojas;
    private int pokemons;
    private int maxX;
    private int maxY;
    private int tileSize;
    private long horaInicial;
    private Pokedex pokedex;

    private BufferedImage[] lojaImagem;
    private BufferedImage[] pokemonImagem;
    private BufferedImage[] treinadorImagem;
    private BufferedImage[] centroImagem;
    private Animation animation;

    private ArrayList<Tile> tiles = new ArrayList<>();

    public TileMap() {
	super();
	this.pokedex = new Pokedex();
	this.horaInicial = System.nanoTime();
	this.treinadores = 50;
	this.centros = 20;
	this.lojas = 15;
	this.pokemons = 151;
	this.maxX = 42;
	this.maxY = 42;
	this.tileSize = 15;
	this.animation = new Animation();
	this.reader(
		"C:/Users/Carlos/Dropbox/Work/PokemonJeopsWeb/recurso/testmap.txt",
		15);
	try {
	    lojaImagem = new BufferedImage[1];
	    lojaImagem[0] = ImageIO.read(new File(
		    "C:/Users/Carlos/Dropbox/Work/PokemonJeopsWeb/recurso/loja.gif"));

	    pokemonImagem = new BufferedImage[1];
	    pokemonImagem[0] = ImageIO.read(new File(
		    "C:/Users/Carlos/Dropbox/Work/PokemonJeopsWeb/recurso/pokemon.gif"));

	    centroImagem = new BufferedImage[1];
	    centroImagem[0] = ImageIO.read(new File(
		    "C:/Users/Carlos/Dropbox/Work/PokemonJeopsWeb/recurso/centro.gif"));

	    treinadorImagem = new BufferedImage[1];
	    treinadorImagem[0] = ImageIO.read(new File(
		    "C:/Users/Carlos/Dropbox/Work/PokemonJeopsWeb/recurso/treinador.gif"));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public TileMap(int treinadores, int centros, int lojas, int pokemons) {
	super();
	this.pokedex = new Pokedex();
	this.horaInicial = System.nanoTime();
	this.treinadores = treinadores;
	this.centros = centros;
	this.lojas = lojas;
	this.pokemons = pokemons;
	this.reader(
		"C:/Users/Carlos/Dropbox/Work/PokemonJeopsWeb/recurso/testmap.txt",
		15);

    }

    public void reader(String s, int tileSize) {

	try {
	    BufferedReader br = new BufferedReader(new FileReader(s));
	    this.maxX = Integer.parseInt(br.readLine());
	    this.maxY = Integer.parseInt(br.readLine());
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
	    // br.close();
	    System.out.println(this.tiles.isEmpty());
	} catch (Exception e) {
	    e.getStackTrace();
	}
    }

    public int getTileSize() {
	return tileSize;
    }

    public void setTileSize(int tileSize) {
	this.tileSize = tileSize;
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
	    if (tile.getOcupado() == Tile.VAZIO && verificaEstado(index)) {
		tile.setOcupado(valor);
		quantidade--;
		tiles.set(index, tile);
		espalhaPercepcao(index, valor);
	    }
	}
    }

    public boolean verificaEstado(int posicao) {
	boolean b = true;
	Tile tile = null;

	if (posicao == 0) { // canto superior esquerdo
	    tile = tiles.get(posicao + 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;
	    }

	    tile = tiles.get(posicao + maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	} else if (posicao == maxX - 1) { // canto superior direito
	    tile = tiles.get(posicao - 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao + maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }

	} else if (posicao == maxX * maxY - 1) { // canto inferior direito
	    tile = tiles.get(posicao - 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao - maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	} else if (posicao == maxX * (maxY - 1)) { // canto inferior esquerdo
	    tile = tiles.get(posicao + 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao - maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	} else if (posicao % maxX == 0) { // esquerdo
	    tile = tiles.get(posicao + 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao - maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao + maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }

	} else if (posicao < maxX) { // superior
	    tile = tiles.get(posicao + 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao - 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao + maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	} else if (posicao % maxX == maxY - 1) { // direito
	    tile = tiles.get(posicao - 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao - maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao + maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	} else if (posicao / maxX >= maxY - 1) { // inferior
	    tile = tiles.get(posicao + 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao - 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao - maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	} else {
	    tile = tiles.get(posicao - 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao + 1);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao + maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	    tile = tiles.get(posicao - maxX);
	    if (!tile.getPercepcoes().isEmpty()
		    || tile.getOcupado() != Tile.VAZIO) {
		return false;

	    }
	}

	return b;
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
	    // removePercepcao(posicao, Tile.LOJA);
	    break;
	default:
	    tile.setOcupado(Tile.VAZIO);
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
	    if (tile.getOcupado() == Tile.VAZIO && verificaEstado(index)) {
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

	// System.out.println("Gerando as Coisas!!");
	this.espalhaThing(this.getCentros(), Tile.CENTRO);
	// System.out.println("gerou Centros!!");
	this.espalhaThing(this.getLojas(), Tile.LOJA);
	// System.out.println("gerou Lojas!!");
	this.espalhaThing(this.getTreinadores(), Tile.TREINADOR);
	// System.out.println("gerou Treinadores!!");
	this.espalhaPokemons();
	// System.out.println("gerou Pokemons!!");
    }

    public Tile getTile(int x, int y) {
	Tile tile = null;
	tile = this.tiles.get(y * this.maxX + x);
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

    public void update() {

    }

    @SuppressWarnings("deprecation")
    public void draw(Graphics2D graphics2d, Personagem personagem) {

	Polygon triangle = new Polygon();
	triangle.addPoint(0, 0);
	triangle.addPoint(5, 5);
	triangle.addPoint(5, 0);

	Color limite = new Color(0, 0, 0);
	Color grama = new Color(146, 208, 80);
	Color montanha = new Color(158, 138, 84);
	Color agua = new Color(84, 141, 212);
	Color lava = new Color(227, 108, 10);
	Color caverna = new Color(166, 166, 166);

	for (int row = 0; row < maxY; row++) {
	    for (int col = 0; col < maxX; col++) {

		Tile tileDraw = tiles.get(row * maxX + col);

		switch (tileDraw.getTerreno()) {
		case Tile.GRAMA:
		    graphics2d.setColor(grama);
		    break;
		case Tile.AGUA:
		    graphics2d.setColor(agua);
		    break;
		case Tile.CAVERNA:
		    graphics2d.setColor(caverna);
		    break;
		case Tile.MONTANHA:
		    graphics2d.setColor(montanha);
		    break;
		case Tile.LAVA:
		    graphics2d.setColor(lava);
		    break;
		}
		graphics2d.fillRect(col * tileSize, row * tileSize, tileSize,
			tileSize);
		switch (tileDraw.getOcupado()) {
		case Tile.LOJA:
		    animation.setFrames(lojaImagem);
		    break;
		case Tile.CENTRO:
		    animation.setFrames(centroImagem);
		    break;
		case Tile.TREINADOR:
		    animation.setFrames(treinadorImagem);
		    break;
		case Tile.LOJA_VAZIA:
		    graphics2d.setColor(Color.GRAY);
		    animation.setFrames(lojaImagem);
		    break;
		case Tile.VAZIO:
		    continue;
		default:
		    animation.setFrames(pokemonImagem);
		    break;
		}
		if (tileDraw.getOcupado() != Tile.VAZIO
			&& tileDraw.getOcupado() != Tile.TREINADOR_DERROTADO) {
		    animation.setDelay(-1);
		    animation.update();
		    graphics2d.drawImage(animation.getImage(), col * tileSize,
			    row * tileSize, tileSize, tileSize, null);
		    // graphics2d.fillRect(col * tileSize, row * tileSize,
		    // tileSize, tileSize);
		}
	    }

	}

	int posInicialRectX = 660;
	int posInicialStatusX = posInicialRectX + 2;
	int posInicialRectY = 16;
	int posInicialStatusY = posInicialRectY + 15;
	int distanciaStatus = 20;

	long duration = System.nanoTime() - this.horaInicial;
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	Date hora = new Date(duration / 1000000);
	hora.setHours(0);
	String dataFormatada = sdf.format(hora);

	String infoPokedex = "";
	Pokemon pokemon = null;
	Tile tile = getTile(personagem.getPosX(), personagem.getPosY());
	if (tile.getOcupado() > 0) {
	    pokemon = pokedex.getPokemon(tile.getOcupado());
	    infoPokedex += pokemon.getId() + " | " + pokemon.getNome();
	}

	graphics2d.setColor(Color.WHITE);
	graphics2d.fillRect(posInicialRectX, posInicialRectY, 325, 200);
	graphics2d.setFont(new Font("Serif", Font.PLAIN, 20));
	graphics2d.setColor(Color.BLACK);

	graphics2d.drawString("Tempo: " + dataFormatada, posInicialStatusX,
		posInicialStatusY);
	graphics2d.drawString("Score: " + personagem.getPontuacao(),
		posInicialStatusX, posInicialStatusY + (distanciaStatus * 1));
	graphics2d.drawString("Pontos Descontados: " + 0, posInicialStatusX,
		posInicialStatusY + (distanciaStatus * 2));
	graphics2d.drawString(
		"Pokemons Capturados: " + personagem.getPokemons(),
		posInicialStatusX, posInicialStatusY + (distanciaStatus * 3));
	graphics2d.drawString(
		"Pokebolas Disponiveis: " + personagem.getPokebolas(),
		posInicialStatusX, posInicialStatusY + (distanciaStatus * 4));
	graphics2d.drawString(
		"Direcao Personagem: " + personagem.getDirecaoString(),
		posInicialStatusX, posInicialStatusY + (distanciaStatus * 5));
	graphics2d.drawString("Pokedex: " + infoPokedex, posInicialStatusX,
		posInicialStatusY + (distanciaStatus * 6));
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
