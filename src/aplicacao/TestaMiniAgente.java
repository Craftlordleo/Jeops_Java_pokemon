package aplicacao;

public class TestaMiniAgente {
    public static void main(String args[]) {
	MiniAgente base = new MiniAgente();
	Tile t = new Tile();
	base.tell(t);
	base.run();
    }
}