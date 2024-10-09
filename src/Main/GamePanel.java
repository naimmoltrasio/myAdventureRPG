package Main;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    //Screen settings

    final int originalTileSize = 16; //16x16 tile
    final int scale = 3;

    final int tileSize = originalTileSize * scale; //48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenwidth = tileSize * maxScreenCol; //768 pixels
    final int screenHeight = tileSize * maxScreenRow; //576 pixels

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenwidth, screenHeight));
        this.setBackground(Color.WHITE);
        this.setDoubleBuffered(true);

    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

    }
}
