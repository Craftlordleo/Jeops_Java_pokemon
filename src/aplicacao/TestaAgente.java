package aplicacao;

public class TestaAgente {

    public static void main(String args[]) {
	Agente base = new Agente();
	TileMap tileMap = new TileMap();
	tileMap.geraElementos();
	Personagem personagem = new Personagem();
	Pokemon pokemon = new Pokemon();

	base.tell(tileMap);
	base.tell(personagem);

	base.run();
    }
}
