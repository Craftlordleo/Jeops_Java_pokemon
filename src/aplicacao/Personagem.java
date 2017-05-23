package aplicacao;

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

    public Personagem() {
	this.pokebolas = 25;
	this.pokebolasTotal = 25;
	this.pokemons = 0;
	this.posX = 25;
	this.posY = 20;
	this.direcao = SUL;
	this.pontuacao = 0;
	this.estadoPokemons = FERIDOS;
	this.montanha = false;
	this.agua = false;
	this.lava = false;
	this.caverna = false;
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
    }

    public void recuperarPokemon() {
	this.pontuacao -= 100;
	this.estadoPokemons = CURADOS;
    }

    public void vencerBatalha() {
	this.pontuacao += 150;
	this.estadoPokemons = FERIDOS;
    }

    public void perderBatalha() {
	this.pontuacao -= 1000;
    }

    @Override
    public String toString() {
	String string = "";

	string += "Pontuacao: " + this.getPontuacao();
	string += "\nPokebolas: " + this.getPokebolas();
	string += "\nPokebolas Totais: " + this.getPokebolasTotal();
	string += "\nPokemons: " + this.getPokemons();
	string += "\nPos X: " + this.getPosX();
	string += "\nPos Y: " + this.getPosY();
	string += "\nDirecao: " + this.getDirecao();
	string += "\nEstado Pokemons: " + this.getEstadoPokemons();
	string += "\nAgua: " + this.isAgua();
	string += "\nLava: " + this.isLava();
	string += "\nCaverna: " + this.isCaverna();
	string += "\nMontanha: " + this.isMontanha();

	return string;
    }

    public boolean nextTile() {
	// TODO Auto-generated method stub
	return false;
    }

//    public static void main(String[] args) {
//	Personagem treinador = new Personagem();
//	System.out.println(treinador);
//	treinador.pegarPokebolas();
//	System.out.println(
//		"--------------------------------------------------------");
//	System.out.println(treinador);
//	Pokemon pokemon = new Pokemon("teste", 1, Pokemon.ELECTRIC,
//		Pokemon.VAZIO, null);
//	treinador.pegarPokemon(pokemon);
//	System.out.println(
//		"--------------------------------------------------------");
//	System.out.println(treinador);
//	treinador.vencerBatalha();
//	System.out.println(
//		"--------------------------------------------------------");
//	System.out.println(treinador);
//	treinador.recuperarPokemon();
//	System.out.println(
//		"--------------------------------------------------------");
//	System.out.println(treinador);
//
//    }
}
