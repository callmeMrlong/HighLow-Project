public class HighLowController {

    static HighLowGUI view = new HighLowGUI();
    static HighLowEngine engine = new HighLowEngine();

    public static void main(String[] args){
        view = new HighLowGUI();
        view.createAndShowGUI();

        engine = new HighLowEngine();

    }
}
