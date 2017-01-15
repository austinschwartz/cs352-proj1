import java.io.InputStream;
import java.io.InputStreamReader;

class FloatParser {
    public static void main(String args[]) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java FloatParser value");
            System.exit(1);
        }
        double val = myParseFloat(args[0]);
        System.out.println("Value=" + val);
    }

    public static double myParseFloat(String s) throws Exception {
        // Based on the code in DecimalParser.java, write a finite state machine that parses
        // a floating point number of the form
        //             [-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?
        return 0;
    }
}


