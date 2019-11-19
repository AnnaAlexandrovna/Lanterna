public class Main {
    public static PanelOfCalc view = new PanelOfCalc();

    public static Test4 test4 = new Test4();
    public static Test3 test3 = new Test3();
    public static  Test2 test2 = new Test2();
    //MathPars1 pars = new MathPars1();
    public Model model = new Model();
//    public void update(String s) {
//
//
//            if(model.system.equals("hex")){
//                test4.monitor.setText(model.calc(s));
//
//            }else if(model.system.equals("bin")){
//                test3.monitor.setText(model.calc(s));
//
//            }else if(model.system.equals("dec")){
//                test2.monitor.setText(model.calc(s));
//            }
//
//            if(model.isSystemChanged){
//                if(model.system.equals("hex")){
//                    test4.metod();
//                    model.isSystemChanged = false;
//
//                }else if(model.system.equals("bin")){
//                    test3.metod();
//                    model.isSystemChanged = false;
//
//                }else if(model.system.equals("dec")){
//                    test2.metod();
//                    model.isSystemChanged = false;
//                }
//            }
//
//
//    }

    public void update(String string){
       view.monitor.setText(model.calc(string));


        if(model.isSystemChanged){

            view.sys=string;
            view.getButtonAndPanel();
            model.isSystemChanged = false;

        }

    }

    public static void main(String[] args)  {

        //test2.metod();
        view.getButtonAndPanel();


 }
}
