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
//public class Test3 {
//    Main main = new Main();
//
//    TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
//            false, 3,       10));
//
//    public void metod() {
//        try {
//
//            Terminal terminal = new DefaultTerminalFactory().createTerminal();
//            Screen screen = new TerminalScreen(terminal);
//            screen.startScreen();
//
//            TerminalSize screenSize = screen.getTerminalSize();
//
////        TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
////                false, 3,       10));
//            monitor.setPreferredSize(new TerminalSize(70, 3));
//            Panel screenview = new Panel();
//            screenview.setSize(new TerminalSize(2, 2));
//
//            Button cleanAllbin = new Button("cleanAll", new Runnable() {
//                @Override
//                public void run() {
//                    monitor.setText("");
//                }
//            });
//            Button cleanbin = new Button("clean", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("clean");
//                }
//            });
//            Button decbin = new Button("dec", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("dec");
//                }
//            });
//            Button hexbin = new Button("hex", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("hex");
//                }
//            });
////            Button binbin = new Button("bin", new Runnable() {
////                @Override
////                public void run() {
////
////                }
////            });
//
//            Panel officialOperation = new Panel();
//            officialOperation.addComponent(cleanbin);
//            officialOperation.addComponent(cleanAllbin);
//            officialOperation.addComponent(decbin);
//            officialOperation.addComponent(hexbin);
//            //officialOperation.addComponent(binbin);
//
//
//            Button zerobin = new Button("0", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("0");
//                }
//            });
//            Button onebin = new Button("1", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("1");
//                }
//            });
//
//
//            Button plusbin = new Button("+", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("+");
//                }
//            });
//            Button minusbin = new Button("-", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("-");
//                }
//            });
//            Button andbin = new Button("AND", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("and");
//                }
//            });
//            Button orbin = new Button("OR", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("oor");
//                }
//            });
//            Button xorbin = new Button("XOR", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("xor");
//                }
//            });
//            Button notbin = new Button("NOT", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("not");
//                }
//            });
//            Button openbin = new Button("(", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("(");
//                }
//            });
//            Button closebin = new Button(")", new Runnable() {
//                @Override
//                public void run() {
//                    main.update(")");
//                }
//            });
//            Button equalsbin = new Button("=", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("=");
//                }
//            });
//
//            Panel numbers = new Panel(new GridLayout(3));
//            numbers.addComponent(zerobin);
//            numbers.addComponent(onebin);
//
//
//            Panel operations = new Panel(new GridLayout(3));
//            operations.addComponent(plusbin);
//            operations.addComponent(minusbin);
//            operations.addComponent(andbin);
//            operations.addComponent(orbin);
//            operations.addComponent(xorbin);
//            operations.addComponent(notbin);
//            operations.addComponent(openbin);
//            operations.addComponent(closebin);
//            operations.addComponent(equalsbin);
//
//
//            Panel numbersAndOperation = new Panel(new GridLayout(3));
//            numbersAndOperation.addComponent(numbers);
//            numbersAndOperation.addComponent(operations);
//            numbersAndOperation.addComponent(officialOperation);
//
////        TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
////                false, 3,       10));
////        monitor.setPreferredSize(new TerminalSize(70, 3));
////        Panel screenview = new Panel();
////        screenview.setSize(new TerminalSize(2,2));
//
//            screenview.addComponent(monitor);
//            screenview.addComponent(numbersAndOperation);
//
//
//            // Create window to hold the panel
//            BasicWindow window = new BasicWindow();
//            window.setComponent(screenview);
//
//
//            // Create gui and start gui
//            MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
//            gui.addWindowAndWait(window);
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//    }
//}
//
//
