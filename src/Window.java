import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Window extends JFrame {

    public static JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9,
            plus, minus, division, multiplication, summ, dis, clear, backspace, n666;

    public static double displayButton = 0;
    public static double finalSumm = 0;
    public static double corrent = 0;
    public static ArrayList<Integer> currentARL = new ArrayList<>();

    public static boolean p = true;
    public static boolean mi = false;
    public static boolean mu = false;
    public static boolean de = false;

    public Window(String s) {
        super(s);
        setFocusable(true);

        Font bold = new Font("a", Font.BOLD, 25);
        Font font = new Font("Verdana", Font.PLAIN, 12);

        Color c2 = new Color(210, 210, 210);
        Color c1 = new Color(243, 243, 243);


        JMenuBar menuBar = new JMenuBar();

        JMenu help = new JMenu("Help");
        help.setFont(font);

        JMenuItem about = new JMenuItem("About");
        about.setFont(font);
        help.add(about);

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Autor: Овчинников Даниил");
            }
        });

        help.addSeparator();

        JMenuItem exit = new JMenuItem("Exit");
        exit.setFont(font);
        help.add(exit);

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(help);
        menuBar.setBounds(1 , 1 , 40, 25);


        n0 = new JButton("0");
        n0.setFont(bold);
        n0.setBackground(c1);
        n0.setBounds(7, 360, 165, 50);
        n0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num0();
            }
        });

        n666 = new JButton("666");
        n666.setBounds(5, 250, 50, 20);
        n666.setVisible(false);

        n1 = new JButton("1");
        n1.setFont(bold);
        n1.setBackground(c1);
        n1.setBounds(7, 305, 50, 50);
        n1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1();
            }
        });


        n2 = new JButton("2");
        n2.setFont(bold);
        n2.setBackground(c1);
        n2.setBounds(65, 305, 50, 50);
        n2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2();
            }
        });

        n3 = new JButton("3");
        n3.setFont(bold);
        n3.setBackground(c1);
        n3.setBounds(122, 305, 50, 50);
        n3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num3();
            }
        });

        n4 = new JButton("4");
        n4.setFont(bold);
        n4.setBackground(c1);
        n4.setBounds(7, 250, 50, 50);
        n4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num4();
            }
        });

        n5 = new JButton("5");
        n5.setFont(bold);
        n5.setBackground(c1);
        n5.setBounds(65, 250, 50, 50);
        n5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num5();
            }
        });

        n6 = new JButton("6");
        n6.setFont(bold);
        n6.setBackground(c1);
        n6.setBounds(122, 250, 50, 50);
        n6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num6();
            }
        });

        n7 = new JButton("7");
        n7.setFont(bold);
        n7.setBackground(c1);
        n7.setBounds(7, 195, 50, 50);
        n7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num7();
            }
        });

        n8 = new JButton("8");
        n8.setFont(bold);
        n8.setBackground(c1);
        n8.setBounds(65, 195, 50, 50);
        n8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num8();
            }
        });

        n9 = new JButton("9");
        n9.setFont(bold);
        n9.setBackground(c1);
        n9.setBounds(122, 195, 50, 50);
        n9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num9();
            }
        });

        plus = new JButton("+");
        plus.setBounds(180, 195, 50, 105);
        plus.setFont(new Font("a", Font.BOLD, 20));
        plus.setBackground(c2);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPlus();
            }
        });

        minus = new JButton("-");
        minus.setFont(bold);
        minus.setBounds(180, 140, 50, 50);
        minus.setBackground(c2);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMinus();
            }
        });

        division = new JButton("/");
        division.setFont(bold);
        division.setBounds(65, 140, 50, 50);
        division.setBackground(c2);
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setDevi();
            }
        });

        multiplication = new JButton("*");
        multiplication.setFont(bold);
        multiplication.setBackground(c2);
        multiplication.setBounds(122, 140, 50, 50);
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMulti();
            }
        });

        /*String c = n1.getPreferredSize().toString();*/
        summ = new JButton("=");
        summ.setBounds(180, 305, 50, 105);
        summ.setBackground(new Color(72, 137, 240));
        summ.setFont(bold);
        summ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSumm();
            }
        });

        dis = new JButton("0");
        dis.setEnabled(false);
        dis.setBounds(5, 30, 228, 50);
        dis.setFont(bold);

        clear = new JButton("Очистить");
        clear.setBounds(5, 85, 228, 50);
        clear.setBackground(new Color(255, 59, 48));
        clear.setFont(bold);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteAll();
            }
        });

        backspace = new JButton("c");
        backspace.setBounds(7, 140, 50, 50);
        backspace.setFont(bold);
        backspace.setBackground(c1);
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backSpace();
            }
        });

        add(menuBar);
        add(dis);
        add(clear);
        add(backspace);
        add(division);
        add(multiplication);
        add(minus);
        add(n7);
        add(n8);
        add(n9);
        add(plus);
        add(n4);
        add(n5);
        add(n6);
        add(n1);
        add(n2);
        add(n3);
        add(summ);
        add(n0);
        add(n666);

        addKeyListener(new KeyBoard());
    }

    public static void num0() {
        try {
            if (currentARL.get(0) != 0 && currentARL.size() != 0 && currentARL.size() < 9) {
                currentARL.add(0);
                corrent = Integer.parseInt(rework(currentARL));
                displayButton = corrent;
                print();
            }
        } catch (Exception e) { }
    }

    public static void num1() {
        if (currentARL.size() < 9) {
            currentARL.add(1);
            corrent = Integer.parseInt(rework(currentARL));
            displayButton = corrent;
            print();
        }
    }

    public static void num2() {
        if (currentARL.size() < 9) {
            currentARL.add(2);
            corrent = Integer.parseInt(rework(currentARL));
            displayButton = corrent;
            print();
        }
    }

    public static void num3() {
        if (currentARL.size() < 9) {
            currentARL.add(3);
            corrent = Integer.parseInt(rework(currentARL));
            displayButton = corrent;
            print();
        }
    }

    public static void num4() {
        if (currentARL.size() < 9) {
            currentARL.add(4);
            corrent = Integer.parseInt(rework(currentARL));
            displayButton = corrent;
            print();
        }
    }

    public static void num5() {
        if (currentARL.size() < 9) {
            currentARL.add(5);
            corrent = Integer.parseInt(rework(currentARL));
            displayButton = corrent;
            print();
        }
    }

    public static void num6() {
        if (currentARL.size() < 9) {
            currentARL.add(6);
            corrent = Integer.parseInt(rework(currentARL));
            displayButton = corrent;
            print();
        }
    }

    public static void num7() {
        if (currentARL.size() < 9) {
            currentARL.add(7);
            corrent = Integer.parseInt(rework(currentARL));
            displayButton = corrent;
            print();
        }
    }

    public static void num8() {
        if (currentARL.size() < 9) {
            currentARL.add(8);
            corrent = Integer.parseInt(rework(currentARL));
            displayButton = corrent;
            print();
        }
    }

    public static void num9() {
        if (currentARL.size() < 9) {
            currentARL.add(9);
            corrent = Integer.parseInt(rework(currentARL));
            displayButton = corrent;
            print();
        }
    }

    public static void backSpace() {
        try {
            currentARL.remove(currentARL.size() - 1);

            if (currentARL.size() == 0 && corrent != 0) {
                print0();
            } else {
                corrent = Integer.parseInt(rework(currentARL));
                displayButton = corrent;
                print();
            }
        } catch (Exception e) {}
    }

    public static void setPlus() {
        if (!p) {
            setSumm();
            boolp();
        }
        if (p) {
            finalSumm += corrent;
            corrent = 0;
            displayButton = finalSumm;
            clearARL(currentARL);
            print();
        }
    }

    public static void setMinus() {
        if (!mi) {
            setSumm();
            boolmi();
        }

        if (mi) {
            finalSumm -= corrent;
            corrent = 0;
            clearARL(currentARL);
            displayButton = finalSumm;
            print();
            boolmi();
        }
    }

    public static void setMulti() {
        if (mu) {
            finalSumm = finalSumm * corrent;
            corrent = 0;
            displayButton = finalSumm;
            clearARL(currentARL);
            print();
            boolmu();
        }

        if (!mu) {
            setSumm();
            boolmu();
        }
    }

    public static void setDevi() {
        if (de) {
            finalSumm = finalSumm / corrent;
            corrent = 0;
            displayButton = finalSumm;
            clearARL(currentARL);
            print();
            boolde();
        }

        if (!de) {
            setSumm();
            boolde();
        }
    }

    public static void setSumm() {
        if (p) {
            finalSumm += corrent;
            corrent = 0;
            displayButton = finalSumm;
            clearARL(currentARL);
            print();
            nothing();
        }

        if (mi) {
            finalSumm -= corrent;
            corrent = 0;
            displayButton = finalSumm;
            clearARL(currentARL);
            print();
            nothing();
        }

        if (mu) {
            finalSumm = finalSumm * corrent;
            corrent = 0;
            displayButton = finalSumm;
            clearARL(currentARL);
            print();
            nothing();
        }

        if (de) {
            finalSumm = finalSumm / corrent;
            corrent = 0;
            displayButton = finalSumm;
            clearARL(currentARL);
            print();
            nothing();
        }
    }

    public static void clearARL(ArrayList a) {
        a.clear();
    }

    public static void deleteAll() {
        print0();
        clearARL(currentARL);
        displayButton = 0;
        finalSumm = 0;
        corrent = 0;
        boolp();
    }

    public static void print() {
        dis.setText(String.valueOf(displayButton));

    }

    public static void print0() {
        dis.setText("0");
    }

    public static void boolp() {
        p = true;
        mi = false;
        mu = false;
        de = false;
    }

    public static void boolmi() {
        p = false;
        mi = true;
        mu = false;
        de = false;
    }

    public static void boolmu() {
        p = false;
        mi = false;
        mu = true;
        de = false;
    }

    public static void boolde() {
        p = false;
        mi = false;
        mu = false;
        de = true;
    }

    public static void nothing() {
        p = false;
        mi = false;
        mu = false;
        de = false;
    }

    public static String rework(ArrayList a) {
        return a.toString().replaceAll("\\[|\\]", "").replaceAll(", ", "");
    }
}
