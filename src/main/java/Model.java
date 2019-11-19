import java.util.ArrayList;

public class Model {

    public ArrayList list = new ArrayList();
    MathPars1 mathPars1 = new MathPars1();
    MathPars2 mathPars2 = new MathPars2();
    String system = "dec";
    Boolean isSystemChanged = false;

    public String workWithString(String s){
        String string = list.toString();
        string= string.replace("[","");
        string = string.replace("]","");
        string = string.replace(",","");
        string = string.replace(" ","");
        return string;
    }

    public String calc(String stringFromUI) {
        System.out.println("calc");
        String result = "";
       // double result=0;
       // String resultBin = "";
        if(stringFromUI.equals("clean")){
           list.remove(list.size()-1);
            System.out.println("123");
        }
        else if(stringFromUI.equals("dec")|| stringFromUI.equals("bin")||stringFromUI.equals("hex")){
            System.out.println("choose");
        //    if (!system.equals(stringFromUI)){
                list.clear();
                system = stringFromUI;
                isSystemChanged = true;

                System.out.println("system changed " + isSystemChanged);
       //     }

        }
        else if (stringFromUI.equals("=")) {
            if(system.equals("dec")) {
                result = Double.toString(mathPars1.calculate(workWithString(list.toString())));
            } else if (system.equals("bin")){
                result = mathPars2.calculate((workWithString(list.toString())));
            }else if(system.equals("hex")){

            }
            list.clear();
            list.add(result);
        } else {
            list.add(stringFromUI);
        }
        //System.out.println("i add element"+list.toString());
        return workWithString(list.toString());

    }
}
