import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.util.ArrayList;

public class PanelOfCalc {
    Main main = new Main();
    TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
            false, 3,       10));

    ArrayList listOfOperationButton = new ArrayList();
    ArrayList listOfCommandButton = new ArrayList();
    ArrayList listOfNumberButton = new ArrayList();
    String sys = "dec";
    boolean isSysCh = false;



    public void getButtonAndPanel(){
        getButtons();
        getPanelCalc();
    }

    public void getButtons(){
        listOfCommandButton.clear();
        listOfOperationButton.clear();
        listOfNumberButton.clear();
        if(sys.equals("dec")){
            getNumberDec();
            getCommandDec();
            getOperationDec();
        }else if(sys.equals("bin")){
            getNumberBin();
            getCommandBin();
            getOperationBin();
        }else if(sys.equals("hex")){
            getNumberHex();
            getCommandHex();
            getOperationBin();
        }
    }

    public void getPanelCalc() {
        try {
            Panel numbers = new Panel(new GridLayout(3));
            Panel numbersAndOperation = new Panel(new GridLayout(3));
            numbers.removeAllComponents();
            numbersAndOperation.removeAllComponents();
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            Screen screen = new TerminalScreen(terminal);
            screen.startScreen();

            TerminalSize screenSize = screen.getTerminalSize();
            Panel officialOperation = new Panel();
            for (int i = 0; i <listOfCommandButton.size(); i++){
                officialOperation.addComponent((Button)listOfCommandButton.get(i));
            }
            Panel operations = new Panel(new GridLayout(3));
            for (int i = 0; i <listOfOperationButton.size(); i++){
                operations.addComponent((Button)listOfOperationButton.get(i));
            }

            for (int i = 0; i <listOfNumberButton.size(); i++){
                numbers.addComponent((Button)listOfNumberButton.get(i));
            }
            numbersAndOperation.addComponent(numbers);
            numbersAndOperation.addComponent(operations);
            numbersAndOperation.addComponent(officialOperation);

//        TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
//                false, 3,       10));
            monitor.setPreferredSize(new TerminalSize(70, 3));
            Panel screenview = new Panel();
            screenview.setSize(new TerminalSize(2, 2));
            screenview.addComponent(monitor);
            screenview.addComponent(numbersAndOperation);


            // Create window to hold the panel
            BasicWindow window = new BasicWindow();
            window.setComponent(screenview);


            // Create gui and start gui
            MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
            gui.addWindowAndWait(window);
        } catch (Exception e){e.printStackTrace();}
    }

    public void getOperationDec(){
        Button plusdec = new Button("+", new Runnable() {
            @Override
            public void run() {
                try {
                    main.update("+");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Button minusdec = new Button("-", new Runnable() {
            @Override
            public void run() {
                main.update("-");
            }
        });
        Button devidedec = new Button("/", new Runnable() {
            @Override
            public void run() {
                main.update("/");
            }
        });
        Button multiplaydec = new Button("*", new Runnable() {
            @Override
            public void run() {
                main.update("*");
            }
        });
        Button sqrdec = new Button("√", new Runnable() {
            @Override
            public void run() {
                main.update("sqrt");
            }
        });
        Button cosdec = new Button("cos", new Runnable() {
            @Override
            public void run() {
                main.update("cos");
            }
        });
        Button sindec = new Button("sin", new Runnable() {
            @Override
            public void run() {
                main.update("sin");
            }
        });

        Button tandec = new Button("tan", new Runnable() {
            @Override
            public void run() {
                main.update("tan");
            }
        });
        Button lndec = new Button("ln", new Runnable() {
            @Override
            public void run() {
                main.update("ln");
            }
        });

        Button dotdec = new Button(".", new Runnable() {
            @Override
            public void run() {
                main.update(".");
            }
        });
        Button opendec = new Button("(", new Runnable() {
            @Override
            public void run() {
                main.update("(");
            }
        });
        Button closedec = new Button(")", new Runnable() {
            @Override
            public void run() {
                main.update(")");
            }
        });
        Button equalsdec = new Button("=", new Runnable() {
            @Override
            public void run() {
                try {
                    main.update("=");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        listOfOperationButton.add(plusdec);
        listOfOperationButton.add(minusdec);
        listOfOperationButton.add(devidedec);
        listOfOperationButton.add(multiplaydec);
        listOfOperationButton.add(sqrdec);
        listOfOperationButton.add(sindec);
        listOfOperationButton.add(cosdec);
        listOfOperationButton.add(tandec);
        listOfOperationButton.add(lndec);
        listOfOperationButton.add(dotdec);
        listOfOperationButton.add(opendec);
        listOfOperationButton.add(closedec);
        listOfOperationButton.add(equalsdec);
    }

    public void getNumberDec(){
        Button onedec = new Button("1", new Runnable() {
            @Override
            public void run() {

                try {
                    main.update("1");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Button twodec = new Button("2", new Runnable() {
            @Override
            public void run() {
                main.update("2");
            }
        });
        Button treedec = new Button("3", new Runnable() {
            @Override
            public void run() {
                main.update("3");
            }
        });
        Button fourdec = new Button("4", new Runnable() {
            @Override
            public void run() {
                main.update("4");
            }
        });
        Button fivedec = new Button("5", new Runnable() {
            @Override
            public void run() {
                main.update("5");
            }
        });
        Button sixdec = new Button("6", new Runnable() {
            @Override
            public void run() {
                main.update("6");
            }
        });
        Button sevendec = new Button("7", new Runnable() {
            @Override
            public void run() {
                main.update("7");
            }
        });
        Button eightdec = new Button("8", new Runnable() {
            @Override
            public void run() {
                main.update("8");
            }
        });
        Button ninedec = new Button("9", new Runnable() {
            @Override
            public void run() {
                main.update("9");
            }
        });

        Button zerodec = new Button("0", new Runnable() {
            @Override
            public void run() {
                try {
                    main.update("0");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        listOfNumberButton.add(onedec);
        listOfNumberButton.add(twodec);
        listOfNumberButton.add(treedec);
        listOfNumberButton.add(fourdec);
        listOfNumberButton.add(fivedec);
        listOfNumberButton.add(sixdec);
        listOfNumberButton.add(sevendec);
        listOfNumberButton.add(eightdec);
        listOfNumberButton.add(ninedec);
        listOfNumberButton.add(zerodec);
    }

    public void getOperationBin(){
        Button plusbin = new Button("+", new Runnable() {
            @Override
            public void run() {
                main.update("+");
            }
        });
        Button minusbin = new Button("-", new Runnable() {
            @Override
            public void run() {
                main.update("-");
            }
        });
        Button andbin = new Button("AND", new Runnable() {
            @Override
            public void run() {
                main.update("and");
            }
        });
        Button orbin = new Button("OR", new Runnable() {
            @Override
            public void run() {
                main.update("oor");
            }
        });
        Button xorbin = new Button("XOR", new Runnable() {
            @Override
            public void run() {
                main.update("xor");
            }
        });
        Button notbin = new Button("NOT", new Runnable() {
            @Override
            public void run() {
                main.update("not");
            }
        });
        Button openbin = new Button("(", new Runnable() {
            @Override
            public void run() {
                main.update("(");
            }
        });
        Button closebin = new Button(")", new Runnable() {
            @Override
            public void run() {
                main.update(")");
            }
        });
        Button equalsbin = new Button("=", new Runnable() {
            @Override
            public void run() {
                main.update("=");
            }
        });

        listOfOperationButton.add(plusbin);
        listOfOperationButton.add(minusbin);
        listOfOperationButton.add(andbin);
        listOfOperationButton.add(xorbin);
        listOfOperationButton.add(orbin);
        listOfOperationButton.add(notbin);
        listOfOperationButton.add(openbin);
        listOfOperationButton.add(closebin);
        listOfOperationButton.add(equalsbin);
    }

    public void getNumberBin(){
        Button zerobin = new Button("0", new Runnable() {
            @Override
            public void run() {
                main.update("0");
            }
        });
        Button onebin = new Button("1", new Runnable() {
            @Override
            public void run() {
                main.update("1");
            }
        });
        listOfNumberButton.add(onebin);
        listOfNumberButton.add(zerobin);
    }

    public void getNumberHex(){
        getNumberDec();

        Button ahex = new Button("A", new Runnable() {
            @Override
            public void run() {
                main.update("A");
            }
        });
        Button bhex = new Button("B", new Runnable() {
            @Override
            public void run() {
                main.update("B");
            }
        });
        Button chex = new Button("C", new Runnable() {
            @Override
            public void run() {
                main.update("C");
            }
        });
        Button dhex = new Button("D", new Runnable() {
            @Override
            public void run() {
                main.update("D");
            }
        });
        Button ehex = new Button("E", new Runnable() {
            @Override
            public void run() {
                main.update("E");
            }
        });
        Button fhex = new Button("F", new Runnable() {
            @Override
            public void run() {
                main.update("F");
            }
        });

        listOfNumberButton.add(ahex);
        listOfNumberButton.add(bhex);
        listOfNumberButton.add(chex);
        listOfNumberButton.add(dhex);
        listOfNumberButton.add(ehex);
        listOfNumberButton.add(fhex);
    }
    public void getCommandDec(){
        Button cleanAllhex = new Button("cleanAll", new Runnable() {
            @Override
            public void run() {
                monitor.setText("");
            }
        });
        Button cleanhex = new Button("clean", new Runnable() {
            @Override
            public void run() {
                main.update("clean");
            }
        });
        Button hexdechex = new Button("hex", new Runnable() {
                        @Override
            public void run() {
                main.update("hex");
            }
        });
            Button bindechex = new Button("bin", new Runnable() {
                @Override
                public void run() {
                    main.update("bin");
                }
            });
        listOfCommandButton.add(cleanAllhex);
        listOfCommandButton.add(cleanhex);
        listOfCommandButton.add(hexdechex);
        listOfCommandButton.add(bindechex);
    }
    public void getCommandBin(){
        Button cleanAllhex = new Button("cleanAll", new Runnable() {
            @Override
            public void run() {
                monitor.setText("");
            }
        });
        Button cleanhex = new Button("clean", new Runnable() {
            @Override
            public void run() {
                main.update("clean");
            }
        });
        Button decdechex = new Button("dec", new Runnable() {
            @Override
            public void run() {
                main.update("dec");
            }
        });
        Button hexdechex = new Button("hex", new Runnable() {
            @Override
            public void run() {
                main.update("hex");
            }
        });
        listOfCommandButton.add(cleanAllhex);
        listOfCommandButton.add(cleanhex);
        listOfCommandButton.add(decdechex);
        listOfCommandButton.add(hexdechex);
    }
    public void getCommandHex(){        Button cleanAllhex = new Button("cleanAll", new Runnable() {
        @Override
        public void run() {
            monitor.setText("");
        }
    });
        Button cleanhex = new Button("clean", new Runnable() {
            @Override
            public void run() {
                main.update("clean");
            }
        });
        Button decdechex = new Button("dec", new Runnable() {
            @Override
            public void run() {
                main.update("dec");
            }
        });
        Button bindechex = new Button("bin", new Runnable() {
            @Override
            public void run() {
                main.update("bin");
            }
        });
        listOfCommandButton.add(cleanAllhex);
        listOfCommandButton.add(cleanhex);
        listOfCommandButton.add(decdechex);
        listOfCommandButton.add(bindechex);}
}
