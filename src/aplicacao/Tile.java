package aplicacao;

public class Tile {
    public static final int GRAMA = 0;
    public static final int LAVA = 1;
    public static final int AGUA = 2;
    public static final int MONTANHA = 3;
    public static final int CAVERNA = 4;

    public static final int VAZIO = 0;
    public static final int CENTRO = -1;
    public static final int LOJA = -2;
    public static final int TREINADOR = -3;
    public static final int POKEMON = 1;// id dos 151??

    private int ocupado = Tile.VAZIO;
    private int terreno = Tile.GRAMA;

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
	case POKEMON:
	    string = "POKEMON";
	    break;
	}
	return string;
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
