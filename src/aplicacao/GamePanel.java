package aplicacao;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements Runnable, KeyListener {

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 660;

    private Thread thread;
    private boolean running;

    private BufferedImage image;
    private Graphics2D g;

    private int FPS = 60;
    private int targetTime = 1000 / FPS;

    private TileMap tileMap;
    private Personagem personagem;
    // private Player player;

    public GamePanel() {
	super();
	setPreferredSize(new Dimension(WIDTH, HEIGHT));
	setFocusable(true);
	requestFocus();
    }

    public void addNotify() {
	super.addNotify();
	if (thread == null) {
	    thread = new Thread(this);
	    thread.start();
	}
	addKeyListener(this);
    }

    public void run() {

	init();

	long startTime;
	long urdTime;
	long waitTime;

	while (running) {

	    startTime = System.nanoTime();

	    update();
	    render();
	    draw();

	    urdTime = (System.nanoTime() - startTime) / 1000000;
	    waitTime = targetTime - urdTime;

	    try {
		Thread.sleep(waitTime);
	    } catch (Exception e) {
	    }

	}

    }

    private void init() {

	running = true;

	image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	g = (Graphics2D) image.getGraphics();

	tileMap = new TileMap();
	tileMap.geraElementos();
	personagem = new Personagem();
	// player = new Player(tileMap);
	// player.setx(510);
	// player.sety(410);

    }

    //////////////////////////////////////////////////////////////////////////////////

    private void update() {
	try {
	    Thread.sleep(1000);
	    tileMap.update();
	    personagem.update(tileMap);
	    // player.update();
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    private void render() {

	tileMap.draw(g, personagem);
	personagem.draw(g);
	// player.draw(g);

    }

    private void draw() {
	Graphics g2 = getGraphics();
	g2.drawImage(image, 0, 0, null);
	g2.dispose();
    }

    public void keyTyped(KeyEvent key) {
    }

    public void keyPressed(KeyEvent key) {

	int code = key.getKeyCode();

	// if (code == KeyEvent.VK_NUMPAD4) {
	// player.setLeft(true);
	// } else if (code == KeyEvent.VK_NUMPAD6) {
	// player.setRight(true);
	// } else if (code == KeyEvent.VK_NUMPAD8) {
	// // player.setJumping(true);
	// player.setUp(true);
	// } else if (code == KeyEvent.VK_NUMPAD5) {
	// player.setDown(true);
	// } else if (code == KeyEvent.VK_ESCAPE) {
	if (code == KeyEvent.VK_ESCAPE) {
	    System.exit(0);
	}
    }

    public void keyReleased(KeyEvent key) {

	int code = key.getKeyCode();

	// if (code == KeyEvent.VK_NUMPAD4) {
	// player.setLeft(false);
	// }
	// if (code == KeyEvent.VK_NUMPAD6) {
	// player.setRight(false);
	// }
	// if (code == KeyEvent.VK_NUMPAD8) {
	// player.setUp(false);
	// }
	// if (code == KeyEvent.VK_NUMPAD5) {
	// player.setDown(false);
	// }
    }
}