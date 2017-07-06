package aplicacao;

public class TestaMiniAgente {
    public static void main(String args[]) {
	MiniAgente base = new MiniAgente();

	TileMap tileMap = new TileMap();
	Personagem personagem = new Personagem();
	Pokemon pokemon = new Pokemon();
	Tile tile = new Tile();

	tileMap.geraElementos();

	base.tell(tile);
	base.tell(tileMap);
	base.tell(personagem);
	base.tell(pokemon);
	base.run();
    }
}