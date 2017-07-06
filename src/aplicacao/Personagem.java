package aplicacao;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

public class Personagem {
    public static final int CURADOS = 0;
    public static final int FERIDOS = 1;

    public static final int NORTE = 0;
    public static final int SUL = 1;
    public static final int LESTE = 2;
    public static final int OESTE = 3;

    private int pokebolas;
    private int pokemons;
    private int posX;
    private int posY;
    private int pokebolasTotal;
    private int direcao;
    private int estadoPokemons;
    private int pontuacao;
    private boolean montanha;
    private boolean agua;
    private boolean lava;
    private boolean caverna;

    private TileMap mapa;
    private ILog iLog;

    private BufferedImage[] walkingSprites;
    private Animation animation;
    private int size; // altura e largura da figura na tela

    public Personagem() {
	this.size = 15;
	this.pokebolas = 25;
	this.pokebolasTotal = 25;
	this.pokemons = 0;
	this.posX = 24;
	this.posY = 19;
	this.direcao = SUL;
	this.pontuacao = 0;
	this.estadoPokemons = FERIDOS;
	this.montanha = false;
	this.agua = false;
	this.lava = false;
	this.caverna = false;
	this.mapa = new TileMap();
	animation = new Animation();
	this.iLog = ILog.getInstancia();
	String walking = "\\recurso\\walking.gif";
	String path = System.getProperty("user.dir");

	try {
	    walkingSprites = new BufferedImage[1];
	    walkingSprites[0] = ImageIO.read(new File(path + walking));
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public Personagem(int pokebolas, int pokemons, int posX, int posY,
	    int pokebolasTotal, int direcao, int estadoPokemons,
	    int pontuacao) {
	super();
	this.pokebolas = pokebolas;
	this.pokemons = pokemons;
	this.posX = posX;
	this.posY = posY;
	this.pokebolasTotal = pokebolasTotal;
	this.direcao = direcao;
	this.estadoPokemons = estadoPokemons;
	this.pontuacao = pontuacao;
	this.iLog = ILog.getInstancia();
    }

    public TileMap getMapa() {
	return mapa;
    }

    public void setMapa(TileMap mapa) {
	this.mapa = mapa;
    }

    public BufferedImage[] getWalkingSprites() {
	return walkingSprites;
    }

    public void setWalkingSprites(BufferedImage[] walkingSprites) {
	this.walkingSprites = walkingSprites;
    }

    public Animation getAnimation() {
	return animation;
    }

    public void setAnimation(Animation animation) {
	this.animation = animation;
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    public int getPokebolas() {
	return pokebolas;
    }

    public void setPokebolas(int pokebolas) {
	this.pokebolas = pokebolas;
    }

    public int getPokemons() {
	return pokemons;
    }

    public void setPokemons(int pokemons) {
	this.pokemons = pokemons;
    }

    public int getPosX() {
	return posX;
    }

    public void setPosX(int posX) {
	this.posX = posX;
    }

    public int getPosY() {
	return posY;
    }

    public void setPosY(int posY) {
	this.posY = posY;
    }

    public int getPokebolasTotal() {
	return pokebolasTotal;
    }

    public void setPokebolasTotal(int pokebolasTotal) {
	this.pokebolasTotal = pokebolasTotal;
    }

    public int getDirecao() {
	return direcao;
    }

    public void setDirecao(int direcao) {
	this.direcao = direcao;
    }

    public int getEstadoPokemons() {
	return estadoPokemons;
    }

    public void setEstadoPokemons(int estadoPokemons) {
	this.estadoPokemons = estadoPokemons;
    }

    public int getPontuacao() {
	return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
	this.pontuacao = pontuacao;
    }

    public boolean isMontanha() {
	return montanha;
    }

    public void setMontanha(boolean montanha) {
	this.montanha = montanha;
    }

    public boolean isAgua() {
	return agua;
    }

    public void setAgua(boolean agua) {
	this.agua = agua;
    }

    public boolean isLava() {
	return lava;
    }

    public void setLava(boolean lava) {
	this.lava = lava;
    }

    public boolean isCaverna() {
	return caverna;
    }

    public void setCaverna(boolean caverna) {
	this.caverna = caverna;
    }

    public void incrementaPokebolas(int num) {
	this.pokebolas += num;
	this.pokebolasTotal += num;
    }

    public void pegarPokebolas() {
	this.pontuacao -= 10;
	this.incrementaPokebolas(25);
	iLog.setLog("Pegou pokebolas",
		"pegou 25 pokebolas, agora tem um total de: "
			+ getPokebolasTotal());

    }

    public void andar() {
	this.pontuacao -= 1;

	switch (this.getDirecao()) {
	case Personagem.NORTE:
	    this.posY -= 1;
	    break;
	case Personagem.SUL:
	    this.posY += 1;
	    break;
	case Personagem.OESTE:
	    this.posX -= 1;
	    break;
	case Personagem.LESTE:
	    this.posX += 1;
	    break;
	}

	iLog.setLog("Andou", "para o " + this.getDirecaoString());
    }

    public void pegarPokemon(Pokemon pokemon) {
	if (this.pokemons == 0) {
	    this.estadoPokemons = CURADOS;
	}
	this.pokemons += 1;
	this.pokebolas -= 1;
	this.pontuacao -= 5;
	// verifica primeiro tipo
	switch (pokemon.getTipo1()) {
	case Pokemon.ELECTRIC:
	    this.caverna = true;
	    break;
	case Pokemon.FLYING:
	    this.montanha = true;
	    break;
	case Pokemon.WATER:
	    this.agua = true;
	    break;
	case Pokemon.FIRE:
	    this.lava = true;
	    break;
	}
	// verifica segundo tipo
	switch (pokemon.getTipo2()) {
	case Pokemon.ELECTRIC:
	    this.caverna = true;
	    break;
	case Pokemon.FLYING:
	    this.montanha = true;
	    break;
	case Pokemon.WATER:
	    this.agua = true;
	    break;
	case Pokemon.FIRE:
	    this.lava = true;
	    break;
	}

	iLog.setLog("Pegar Pokemon", "pegou " + pokemon.getNome());

    }

    public void virarDireita() {
	this.pontuacao -= 1;
	switch (this.direcao) {

	case NORTE:
	    this.direcao = LESTE;
	    break;
	case SUL:
	    this.direcao = OESTE;
	    break;
	case LESTE:
	    this.direcao = SUL;
	    break;
	case OESTE:
	    this.direcao = NORTE;
	    break;
	}
	iLog.setLog("Virar a direita",
		"virou a direita, agora esta olhando para o "
			+ getDirecaoString());

    }

    public void virarEsquerda() {
	this.pontuacao -= 1;
	switch (this.direcao) {

	case NORTE:
	    this.direcao = OESTE;
	    break;
	case SUL:
	    this.direcao = LESTE;
	    break;
	case LESTE:
	    this.direcao = NORTE;
	    break;
	case OESTE:
	    this.direcao = SUL;
	    break;
	}
	iLog.setLog("Virar a esquerda",
		"virou a esquerda, agora esta olhando para o "
			+ getDirecaoString());
    }

    public void recuperarPokemon() {
	this.pontuacao -= 100;
	this.estadoPokemons = CURADOS;
	iLog.setLog("Recuperar pokemon", "recuperou os pokemons");
    }

    public void vencerBatalha() {
	this.pontuacao += 150;
	this.estadoPokemons = FERIDOS;
	iLog.setLog("Venceu a batalha",
		"parabens, agora tem " + getPontuacao() + " pontos");
    }

    public void perderBatalha() {
	this.pontuacao -= 1000;
	iLog.setLog("Perdeu a batalha", "melhor sorte na proxima, agora tem "
		+ getPontuacao() + " pontos");
    }

    public String getDirecaoString() {
	String string = "";
	switch (this.direcao) {
	case Personagem.NORTE:
	    string = "Norte";
	    break;
	case Personagem.SUL:
	    string = "Sul";
	    break;
	case Personagem.LESTE:
	    string = "Leste";
	    break;
	case Personagem.OESTE:
	    string = "Oeste";
	    break;
	}
	return string;
    }

    public String toString() {
	String string = "";

	string += "Pontuacao: " + this.getPontuacao();
	string += "\nPokebolas: " + this.getPokebolas();
	string += "\nPokebolas Totais: " + this.getPokebolasTotal();
	string += "\nPokemons: " + this.getPokemons();
	string += "\nPos X: " + this.getPosX();
	string += "\nPos Y: " + this.getPosY();
	string += "\nDirecao: " + this.getDirecaoString();
	string += "\nEstado Pokemons: " + this.getEstadoPokemons();
	string += "\nAgua: " + this.isAgua();
	string += "\nLava: " + this.isLava();
	string += "\nCaverna: " + this.isCaverna();
	string += "\nMontanha: " + this.isMontanha();

	return string;
    }

    public int getProximaPosicao() {
	int auxX = this.posX;
	int auxY = this.posY;

	switch (this.getDirecao()) {
	case Personagem.NORTE:
	    auxY -= 1;
	    break;
	case Personagem.SUL:
	    auxY += 1;
	    break;
	case Personagem.OESTE:
	    auxX -= 1;
	    break;
	case Personagem.LESTE:
	    auxX += 1;
	    break;
	}

	return auxY * 42 + auxX;
    }

    public boolean nextTile() {
	int auxX = this.posX;
	int auxY = this.posY;

	switch (this.getDirecao()) {
	case Personagem.NORTE:
	    auxY -= 1;
	    break;
	case Personagem.SUL:
	    auxY += 1;
	    break;
	case Personagem.OESTE:
	    auxX -= 1;
	    break;
	case Personagem.LESTE:
	    auxX += 1;
	    break;
	}
	if (auxY > 41) {
	    return false;
	} else if (auxY < 0) {
	    return false;
	} else if (auxX > 41) {
	    return false;
	} else if (auxX < 0) {
	    return false;
	}

	return true;
    }

    public static void main(String[] args) {
	Personagem treinador = new Personagem();
	System.out.println(treinador);
	treinador.pegarPokebolas();
	System.out.println(
		"--------------------------------------------------------");
	System.out.println(treinador);
	Pokemon pokemon = new Pokemon("teste", 1, Pokemon.ELECTRIC,
		Pokemon.VAZIO, null);
	treinador.pegarPokemon(pokemon);
	System.out.println(
		"--------------------------------------------------------");
	System.out.println(treinador);
	treinador.vencerBatalha();
	System.out.println(
		"--------------------------------------------------------");
	System.out.println(treinador);
	treinador.recuperarPokemon();
	System.out.println(
		"--------------------------------------------------------");
	System.out.println(treinador);

    }

    public void draw(Graphics2D g) {
	g.drawImage(animation.getImage(), this.posX * size, this.posY * size,
		this.size, this.size, null);
    }

    public void update(TileMap tileMap) {
	Tile tile = tileMap.getTile(getProximaPosicao());

	if (nextTile() && tile.getTerreno() == Tile.GRAMA) {
	    andar();
	} else {
	    Random gerador = new Random();

	    switch (gerador.nextInt(2)) {
	    case 0:
		virarEsquerda();
		break;
	    case 1:
		virarDireita();
		;
		break;
	    }
	    // virarEsquerda();
	}
	animation.setFrames(walkingSprites);
	animation.setDelay(-1);
	animation.update();
    }
}
