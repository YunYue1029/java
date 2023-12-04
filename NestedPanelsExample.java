import javax.swing.*;
import java.awt.*;

public class NestedPanelsExample extends JFrame {
    public NestedPanelsExample() {
        // 基础面板
        JPanel basePanel = new JPanel(new BorderLayout());

        // 嵌套面板
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.BLUE);
        topPanel.add(new JLabel("顶部面板"));

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.GREEN);
        bottomPanel.add(new JButton("底部按钮"));

        // 将嵌套面板添加到基础面板
        basePanel.add(topPanel, BorderLayout.NORTH);
        basePanel.add(bottomPanel, BorderLayout.SOUTH);

        // 将基础面板添加到 JFrame
        this.add(basePanel);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new NestedPanelsExample();
    }
}

