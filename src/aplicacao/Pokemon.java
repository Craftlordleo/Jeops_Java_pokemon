package aplicacao;

public class Pokemon {
    public static final int VAZIO = 0;
    public static final int NORMAL = 1;
    public static final int FIGHTING = 2;
    public static final int FLYING = 3;
    public static final int POISON = 4;
    public static final int GROUND = 5;
    public static final int ROCK = 6;
    public static final int BUG = 7;
    public static final int GHOST = 8;
    public static final int STEEL = 9;
    public static final int FIRE = 10;
    public static final int WATER = 11;
    public static final int GRASS = 12;
    public static final int ELECTRIC = 13;
    public static final int PSYCHIC = 14;
    public static final int ICE = 15;
    public static final int DRAGON = 16;

    private String nome;
    private int id;
    private int tipo1;
    private int tipo2;
    private String image;

    public Pokemon() {
	this.nome = null;
	this.id = 0;
	this.tipo1 = VAZIO;
	this.tipo2 = VAZIO;
	this.image = null;
    }

    public Pokemon(String nome, int id, int tipo1, int tipo2, String image) {
	super();
	this.nome = nome;
	this.id = id;
	this.tipo1 = tipo1;
	this.tipo2 = tipo2;
	this.image = image;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getTipo1() {
	return tipo1;
    }

    public void setTipo1(int tipo1) {
	this.tipo1 = tipo1;
    }

    public int getTipo2() {
	return tipo2;
    }

    public void setTipo2(int tipo2) {
	this.tipo2 = tipo2;
    }

    public String getImage() {
	return image;
    }

    public void setImage(String image) {
	this.image = image;
    }

    public String toString() {
	String string = "";
	string += "Nome: " + this.getNome();
	string += "\nId: " + this.getId();
	string += "\nTipo1: " + this.getTipo1();
	string += "\nTipo2: " + this.getTipo2();
	string += "\nImagem: " + this.getImage();
	return string;
    }

//    public static void main(String[] args) {
//	System.out.println("teste pokemons");
//    }
}
