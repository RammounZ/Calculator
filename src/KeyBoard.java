import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyBoard extends KeyAdapter{
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_NUMPAD0 || key == KeyEvent.VK_0) Window.num0();
        if (key == KeyEvent.VK_NUMPAD1 || key == KeyEvent.VK_1) Window.num1();
        if (key == KeyEvent.VK_NUMPAD2 || key == KeyEvent.VK_2) Window.num2();
        if (key == KeyEvent.VK_NUMPAD3 || key == KeyEvent.VK_3) Window.num3();
        if (key == KeyEvent.VK_NUMPAD4 || key == KeyEvent.VK_4) Window.num4();
        if (key == KeyEvent.VK_NUMPAD5 || key == KeyEvent.VK_5) Window.num5();
        if (key == KeyEvent.VK_NUMPAD6 || key == KeyEvent.VK_6) Window.num6();
        if (key == KeyEvent.VK_NUMPAD7 || key == KeyEvent.VK_7) Window.num7();
        if (key == KeyEvent.VK_NUMPAD8 || key == KeyEvent.VK_8) Window.num8();
        if (key == KeyEvent.VK_NUMPAD9 || key == KeyEvent.VK_9) Window.num9();
        if (key == KeyEvent.VK_BACK_SPACE) Window.backSpace();
        if (key == KeyEvent.VK_PLUS) Window.setPlus();
        if (key == KeyEvent.VK_ENTER) Window.setSumm();
        if (key == KeyEvent.VK_MINUS) Window.setMinus();
        if (key == KeyEvent.VK_MULTIPLY) Window.setMulti();





    }
}
