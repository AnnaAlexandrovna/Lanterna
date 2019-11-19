//import com.googlecode.lanterna.TerminalPosition;
//import com.googlecode.lanterna.TerminalSize;
//import com.googlecode.lanterna.TextColor;
//import com.googlecode.lanterna.gui2.*;
//import com.googlecode.lanterna.gui2.dialogs.MessageDialog;
//import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
//import com.googlecode.lanterna.screen.Screen;
//import com.googlecode.lanterna.screen.TerminalScreen;
//import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
//import com.googlecode.lanterna.terminal.Terminal;
//
//import java.io.IOException;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//
//public class Test2 {
//    ArrayList listOfOperationButton = new ArrayList();
//    ArrayList listOfCommandButton = new ArrayList();
//    ArrayList listOfNumberButton = new ArrayList();
//    TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
//            false, 3,       10));
//    Main main = new Main();
//
//   // public static void main(String[] args) throws IOException {
//    public void metod() {
//
//
//        try {Terminal terminal = new DefaultTerminalFactory().createTerminal();
//             Screen screen = new TerminalScreen(terminal);
//            screen.startScreen();
////        TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
////                false, 3,       10));
//            monitor.setPreferredSize(new TerminalSize(70, 3));
//
//            TerminalSize screenSize = screen.getTerminalSize();
//
//            Button cleanAlldec = new Button("cleanAll", new Runnable() {
//                @Override
//                public void run() {
//                    monitor.setText("");
//                }
//            });
//            Button cleandec = new Button("clean", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("clean");
//                }
//            });
////        Button decdec = new Button("dec", new Runnable() {
////            @Override
////            public void run() {
////
////            }
////        });
//            Button hexdec = new Button("hex", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("hex");
//                }
//            });
//            Button bindec = new Button("bin", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("bin");
//                }
//            });
//
//            Panel officialOperation = new Panel();
//            officialOperation.addComponent(cleandec);
//            officialOperation.addComponent(cleanAlldec);
////      officialOperation.addComponent(decdec);
//            officialOperation.addComponent(hexdec);
//            officialOperation.addComponent(bindec);
//
//            Button zerodec = new Button("0", new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        main.update("0");
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            Button onedec = new Button("1", new Runnable() {
//                @Override
//                public void run() {
//
//                    try {
//                        main.update("1");
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            Button twodec = new Button("2", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("2");
//                }
//            });
//            Button treedec = new Button("3", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("3");
//                }
//            });
//            Button fourdec = new Button("4", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("4");
//                }
//            });
//            Button fivedec = new Button("5", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("5");
//                }
//            });
//            Button sixdec = new Button("6", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("6");
//                }
//            });
//            Button sevendec = new Button("7", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("7");
//                }
//            });
//            Button eightdec = new Button("8", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("8");
//                }
//            });
//            Button ninedec = new Button("9", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("9");
//                }
//            });
//
//            Button plusdec = new Button("+", new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        main.update("+");
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            Button minusdec = new Button("-", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("-");
//                }
//            });
//            Button devidedec = new Button("/", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("/");
//                }
//            });
//            Button multiplaydec = new Button("*", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("*");
//                }
//            });
//            Button powdoubledec = new Button("^2", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("sqr");
//                }
//            });
//            Button powrandom = new Button("^x", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("pow");
//                }
//            });
//            Button sqrdec = new Button("√", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("sqrt");
//                }
//            });
//            Button cosdec = new Button("cos", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("cos");
//                }
//            });
//            Button sindec = new Button("sin", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("sin");
//                }
//            });
//
//            Button tandec = new Button("tan", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("tan");
//                }
//            });
//            Button ctandec = new Button("ctan", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("ctan");
//                }
//            });
//            Button lndec = new Button("ln", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("ln");
//                }
//            });
//            Button edec = new Button("e", new Runnable() {
//                @Override
//                public void run() {
//
//                    main.update("e");
//                }
//            });
//            Button pidec = new Button("pi", new Runnable() {
//                @Override
//                public void run() {
//
//                    main.update("pi");
//                }
//            });
//            Button dotdec = new Button(".", new Runnable() {
//                @Override
//                public void run() {
//                    main.update(".");
//                }
//            });
//            Button opendec = new Button("(", new Runnable() {
//                @Override
//                public void run() {
//                    main.update("(");
//                }
//            });
//            Button closedec = new Button(")", new Runnable() {
//                @Override
//                public void run() {
//                    main.update(")");
//                }
//            });
//            Button equalsdec = new Button("=", new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        main.update("=");
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//
//            Panel numbers = new Panel(new GridLayout(3));
//            numbers.addComponent(zerodec);
//            numbers.addComponent(onedec);
//            numbers.addComponent(twodec);
//            numbers.addComponent(treedec);
//            numbers.addComponent(fourdec);
//            numbers.addComponent(fivedec);
//            numbers.addComponent(sixdec);
//            numbers.addComponent(sevendec);
//            numbers.addComponent(eightdec);
//            numbers.addComponent(ninedec);
//
//            Panel operations = new Panel(new GridLayout(3));
//            operations.addComponent(plusdec);
//            operations.addComponent(minusdec);
//            operations.addComponent(devidedec);
//            operations.addComponent(multiplaydec);
//            //operations.addComponent(powdoubledec);
//            //operations.addComponent(powrandom);
//            operations.addComponent(sindec);
//            operations.addComponent(cosdec);
//            operations.addComponent(tandec);
//            //operations.addComponent(ctandec);
//            operations.addComponent(lndec);
//            //operations.addComponent(edec);
//            //operations.addComponent(pidec);
//            operations.addComponent(opendec);
//            operations.addComponent(closedec);
//            operations.addComponent(dotdec);
//            operations.addComponent(equalsdec);
//            operations.addComponent(sqrdec);
//
//            Panel numbersAndOperation = new Panel(new GridLayout(3));
//            numbersAndOperation.addComponent(numbers);
//            numbersAndOperation.addComponent(operations);
//            numbersAndOperation.addComponent(officialOperation);
//
////        TextBox monitor = new TextBox().setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.BEGINNING, GridLayout.Alignment.CENTER,  true,
////                false, 3,       10));
////        monitor.setPreferredSize(new TerminalSize(70, 3));
//            Panel screenview = new Panel();
//            screenview.setSize(new TerminalSize(2, 2));
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
//        }
//    catch (Exception ex){ex.printStackTrace();}
//    }
//
//    public void update(String stringToDisplay){
//        monitor.setText(stringToDisplay);
//    }
//}
//
//
