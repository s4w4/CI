// $ANTLR 3.4 C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g 2013-11-27 15:03:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRaetsel3Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int ASSIGN=5;
    public static final int BLOCK=6;
    public static final int CALCULATION=7;
    public static final int ID=8;
    public static final int SUB=9;
    public static final int WS=10;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SymbolRaetsel3Lexer() {} 
    public SymbolRaetsel3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolRaetsel3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g"; }

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:32:4: ( ( 'A' .. 'Z' ) )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:34:5: ( '+' )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:34:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:35:5: ( '-' )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:35:7: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:36:8: ( '=' )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:36:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:37:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:37:8: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:37:8: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:1:8: ( ID | ADD | SUB | ASSIGN | WS )
        int alt2=5;
        switch ( input.LA(1) ) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt2=1;
            }
            break;
        case '+':
            {
            alt2=2;
            }
            break;
        case '-':
            {
            alt2=3;
            }
            break;
        case '=':
            {
            alt2=4;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:1:10: ID
                {
                mID(); 


                }
                break;
            case 2 :
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:1:13: ADD
                {
                mADD(); 


                }
                break;
            case 3 :
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:1:17: SUB
                {
                mSUB(); 


                }
                break;
            case 4 :
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:1:21: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 5 :
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:1:28: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}