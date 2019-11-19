//
//
//import com.googlecode.lanterna.TerminalSize;
//import com.googlecode.lanterna.TextColor;
//import com.googlecode.lanterna.gui2.*;
//import com.googlecode.lanterna.screen.Screen;
//import com.googlecode.lanterna.screen.TerminalScreen;
//import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
//import com.googlecode.lanterna.terminal.Terminal;
//
//import java.io.IOException;
//
//
//
//public class Test4 {
//    Main main = new Main();
//    TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
//            false, 3,       10));
//
//    public void metod() {
//try {
//
//        Terminal terminal = new DefaultTerminalFactory().createTerminal();
//        Screen screen = new TerminalScreen(terminal);
//        screen.startScreen();
//
//        TerminalSize screenSize = screen.getTerminalSize();
//
////        TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
////                false, 3,       10));
//        monitor.setPreferredSize(new TerminalSize(70, 3));
//        Panel screenview = new Panel();
//        screenview.setSize(new TerminalSize(2,2));
//
//        Button cleanAllhex = new Button("cleanAll", new Runnable() {
//            @Override
//            public void run() {
//                monitor.setText("");
//            }
//        });
//        Button cleanhex = new Button("clean", new Runnable() {
//            @Override
//            public void run() {
//                main.update("clean");
//            }
//        });
//        Button decdechex = new Button("dec", new Runnable() {
//            @Override
//            public void run() {
//                main.update("dec");
//            }
//        });
////        Button hexdechex = new Button("hex", new Runnable() {
////            @Override
////            public void run() {
////                main.update("hex");
////            }
////        });
//        Button bindechex = new Button("bin", new Runnable() {
//            @Override
//            public void run() {
//                main.update("bin");
//            }
//        });
//
//        Panel officialOperation = new Panel();
//        officialOperation.addComponent(cleanhex);
//        officialOperation.addComponent(cleanAllhex);
//        officialOperation.addComponent(decdechex);
//        //officialOperation.addComponent(hexdechex);
//        officialOperation.addComponent(bindechex);
//
//        Button zerohex = new Button("0", new Runnable() {
//            @Override
//            public void run() {
//                main.update("0");
//            }
//        });
//        Button onehex = new Button("1", new Runnable() {
//            @Override
//            public void run() {
//                main.update("1");
//            }
//        });
//        Button twohex = new Button("2", new Runnable() {
//            @Override
//            public void run() { main.update("2");
//            }
//        });
//        Button treehex = new Button("3", new Runnable() {
//            @Override
//            public void run() {
//                main.update("3");
//            }
//        });
//        Button fourhex = new Button("4", new Runnable() {
//            @Override
//            public void run() {
//                main.update("4");
//            }
//        });
//        Button fivehex = new Button("5", new Runnable() {
//            @Override
//            public void run() {
//                main.update("5");
//            }
//        });
//        Button sixhex = new Button("6", new Runnable() {
//            @Override
//            public void run() {
//                main.update("6");
//            }
//        });
//        Button sevenhex = new Button("7", new Runnable() {
//            @Override
//            public void run() {
//                main.update("7");
//            }
//        });
//        Button eighthex = new Button("8", new Runnable() {
//            @Override
//            public void run() {
//                main.update("8");
//            }
//        });
//        Button ninehex = new Button("9", new Runnable() {
//            @Override
//            public void run() {
//                main.update("9");
//            }
//        });
//        Button ahex = new Button("A", new Runnable() {
//            @Override
//            public void run() {
//                main.update("A");
//            }
//        });
//        Button bhex = new Button("B", new Runnable() {
//            @Override
//            public void run() {
//                main.update("B");
//            }
//        });
//        Button chex = new Button("C", new Runnable() {
//            @Override
//            public void run() {
//                main.update("C");
//            }
//        });
//        Button dhex = new Button("D", new Runnable() {
//            @Override
//            public void run() {
//                main.update("D");
//            }
//        });
//        Button ehex = new Button("E", new Runnable() {
//            @Override
//            public void run() {
//                main.update("E");
//            }
//        });
//        Button fhex = new Button("F", new Runnable() {
//            @Override
//            public void run() {
//                main.update("F");
//            }
//        });
//
//        Button plushex = new Button("+", new Runnable() {
//            @Override
//            public void run() {
//                main.update("+");
//            }
//        });
//        Button minushex = new Button("-", new Runnable() {
//            @Override
//            public void run() {
//                main.update("-");
//            }
//        });
//        Button andhex = new Button("AND", new Runnable() {
//            @Override
//            public void run() {
//                main.update("and");
//            }
//        });
//        Button orhex = new Button("OR", new Runnable() {
//            @Override
//            public void run() {
//                main.update("or");
//            }
//        });
//        Button xorhex = new Button("XOR", new Runnable() {
//            @Override
//            public void run() {
//                main.update("xor");
//            }
//        });
//        Button nothex = new Button("NOT", new Runnable() {
//            @Override
//            public void run() {
//                main.update("not");
//            }
//        });
//        Button openhex = new Button("(", new Runnable() {
//            @Override
//            public void run() {
//                main.update("(");
//
//            }
//        });
//        Button closehex = new Button(")", new Runnable() {
//            @Override
//            public void run() {
//                main.update(")");
//            }
//        });
//        Button equalhex= new Button("=", new Runnable() {
//            @Override
//            public void run() {
//                main.update("=");
//            }
//        });
//
//        Panel numbers = new Panel( new GridLayout(3));
//        numbers.addComponent(zerohex);
//        numbers.addComponent(onehex);
//        numbers.addComponent(twohex);
//        numbers.addComponent(treehex);
//        numbers.addComponent(fourhex);
//        numbers.addComponent(fivehex);
//        numbers.addComponent(sixhex);
//        numbers.addComponent(sevenhex);
//        numbers.addComponent(eighthex);
//        numbers.addComponent(ninehex);
//        numbers.addComponent(ahex);
//        numbers.addComponent(bhex);
//        numbers.addComponent(chex);
//        numbers.addComponent(dhex);
//        numbers.addComponent(ehex);
//        numbers.addComponent(fhex);
//
//        Panel operations = new Panel( new GridLayout(3));
//        operations.addComponent(plushex);
//        operations.addComponent(minushex);
//        operations.addComponent(andhex);
//        operations.addComponent(orhex);
//        operations.addComponent(xorhex);
//        operations.addComponent(nothex);
//        operations.addComponent(openhex);
//        operations.addComponent(closehex);
//        operations.addComponent(equalhex);
//
//        Panel numbersAndOperation = new Panel(new GridLayout(3));
//        numbersAndOperation.addComponent(numbers);
//        numbersAndOperation.addComponent(operations);
//        numbersAndOperation.addComponent(officialOperation);
//
////        TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
////                false, 3,       10));
////        monitor.setPreferredSize(new TerminalSize(70, 3));
////        Panel screenview = new Panel();
////        screenview.setSize(new TerminalSize(2,2));
//
//        screenview.addComponent(monitor);
//        screenview.addComponent(numbersAndOperation);
//
//
//        // Create window to hold the panel
//        BasicWindow window = new BasicWindow();
//        window.setComponent(screenview);
//
//
//        // Create gui and start gui
//        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
//        gui.addWindowAndWait(window);
//    }catch (Exception e){e.printStackTrace();}}
//}
//
//
