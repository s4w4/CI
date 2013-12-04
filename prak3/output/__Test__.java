import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        SymbolRaetsel3Lexer lex = new SymbolRaetsel3Lexer(new ANTLRFileStream("C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel_Input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SymbolRaetsel3Parser g = new SymbolRaetsel3Parser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}