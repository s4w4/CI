// $ANTLR 3.4 C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g 2013-11-27 15:04:59

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class Normalize extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ASSIGN", "BLOCK", "CALCULATION", "ID", "SUB", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int ASSIGN=5;
    public static final int BLOCK=6;
    public static final int CALCULATION=7;
    public static final int ID=8;
    public static final int SUB=9;
    public static final int WS=10;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public Normalize(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Normalize(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return Normalize.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:10:1: prog : zblock zblock zblock zblock zblock zblock ;
    public final Normalize.prog_return prog() throws RecognitionException {
        Normalize.prog_return retval = new Normalize.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Normalize.zblock_return zblock1 =null;

        Normalize.zblock_return zblock2 =null;

        Normalize.zblock_return zblock3 =null;

        Normalize.zblock_return zblock4 =null;

        Normalize.zblock_return zblock5 =null;

        Normalize.zblock_return zblock6 =null;



        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:10:6: ( zblock zblock zblock zblock zblock zblock )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:10:8: zblock zblock zblock zblock zblock zblock
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_zblock_in_prog41);
            zblock1=zblock();

            state._fsp--;

            adaptor.addChild(root_0, zblock1.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_zblock_in_prog43);
            zblock2=zblock();

            state._fsp--;

            adaptor.addChild(root_0, zblock2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_zblock_in_prog45);
            zblock3=zblock();

            state._fsp--;

            adaptor.addChild(root_0, zblock3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_zblock_in_prog47);
            zblock4=zblock();

            state._fsp--;

            adaptor.addChild(root_0, zblock4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_zblock_in_prog49);
            zblock5=zblock();

            state._fsp--;

            adaptor.addChild(root_0, zblock5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_zblock_in_prog51);
            zblock6=zblock();

            state._fsp--;

            adaptor.addChild(root_0, zblock6.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class zblock_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "zblock"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:12:1: zblock : ( ^( CALCULATION ^( ADD first second ) equal ) | ^( CALCULATION ^( SUB first second ) equal ) -> ^( CALCULATION ^( ADD[\"+\"] equal second ) first ) );
    public final Normalize.zblock_return zblock() throws RecognitionException {
        Normalize.zblock_return retval = new Normalize.zblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CALCULATION7=null;
        CommonTree ADD8=null;
        CommonTree CALCULATION12=null;
        CommonTree SUB13=null;
        Normalize.first_return first9 =null;

        Normalize.second_return second10 =null;

        Normalize.equal_return equal11 =null;

        Normalize.first_return first14 =null;

        Normalize.second_return second15 =null;

        Normalize.equal_return equal16 =null;


        CommonTree CALCULATION7_tree=null;
        CommonTree ADD8_tree=null;
        CommonTree CALCULATION12_tree=null;
        CommonTree SUB13_tree=null;
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_CALCULATION=new RewriteRuleNodeStream(adaptor,"token CALCULATION");
        RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second");
        RewriteRuleSubtreeStream stream_equal=new RewriteRuleSubtreeStream(adaptor,"rule equal");
        RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first");
        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:12:8: ( ^( CALCULATION ^( ADD first second ) equal ) | ^( CALCULATION ^( SUB first second ) equal ) -> ^( CALCULATION ^( ADD[\"+\"] equal second ) first ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==CALCULATION) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==ADD) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==SUB) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:12:10: ^( CALCULATION ^( ADD first second ) equal )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CALCULATION7=(CommonTree)match(input,CALCULATION,FOLLOW_CALCULATION_in_zblock60); 
                    CALCULATION7_tree = (CommonTree)adaptor.dupNode(CALCULATION7);


                    root_1 = (CommonTree)adaptor.becomeRoot(CALCULATION7_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ADD8=(CommonTree)match(input,ADD,FOLLOW_ADD_in_zblock63); 
                    ADD8_tree = (CommonTree)adaptor.dupNode(ADD8);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD8_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_first_in_zblock65);
                    first9=first();

                    state._fsp--;

                    adaptor.addChild(root_2, first9.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_second_in_zblock67);
                    second10=second();

                    state._fsp--;

                    adaptor.addChild(root_2, second10.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_equal_in_zblock70);
                    equal11=equal();

                    state._fsp--;

                    adaptor.addChild(root_1, equal11.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:13:8: ^( CALCULATION ^( SUB first second ) equal )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CALCULATION12=(CommonTree)match(input,CALCULATION,FOLLOW_CALCULATION_in_zblock81);  
                    stream_CALCULATION.add(CALCULATION12);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUB13=(CommonTree)match(input,SUB,FOLLOW_SUB_in_zblock84);  
                    stream_SUB.add(SUB13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_first_in_zblock86);
                    first14=first();

                    state._fsp--;

                    stream_first.add(first14.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_second_in_zblock88);
                    second15=second();

                    state._fsp--;

                    stream_second.add(second15.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_equal_in_zblock91);
                    equal16=equal();

                    state._fsp--;

                    stream_equal.add(equal16.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: first, second, CALCULATION, equal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 13:49: -> ^( CALCULATION ^( ADD[\"+\"] equal second ) first )
                    {
                        // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:13:52: ^( CALCULATION ^( ADD[\"+\"] equal second ) first )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_CALCULATION.nextNode()
                        , root_1);

                        // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:13:66: ^( ADD[\"+\"] equal second )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        adaptor.addChild(root_2, stream_equal.nextTree());

                        adaptor.addChild(root_2, stream_second.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_first.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "zblock"


    public static class blockID_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockID"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:15:1: blockID : ( ID )+ ;
    public final Normalize.blockID_return blockID() throws RecognitionException {
        Normalize.blockID_return retval = new Normalize.blockID_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID17=null;

        CommonTree ID17_tree=null;

        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:15:9: ( ( ID )+ )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:15:11: ( ID )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:15:11: ( ID )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:15:11: ID
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    ID17=(CommonTree)match(input,ID,FOLLOW_ID_in_blockID123); 
            	    ID17_tree = (CommonTree)adaptor.dupNode(ID17);


            	    adaptor.addChild(root_0, ID17_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blockID"


    public static class first_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "first"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:17:1: first : number ;
    public final Normalize.first_return first() throws RecognitionException {
        Normalize.first_return retval = new Normalize.first_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Normalize.number_return number18 =null;



        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:17:7: ( number )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:17:9: number
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_first137);
            number18=number();

            state._fsp--;

            adaptor.addChild(root_0, number18.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "first"


    public static class second_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "second"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:18:1: second : number ;
    public final Normalize.second_return second() throws RecognitionException {
        Normalize.second_return retval = new Normalize.second_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Normalize.number_return number19 =null;



        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:18:8: ( number )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:18:10: number
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_second144);
            number19=number();

            state._fsp--;

            adaptor.addChild(root_0, number19.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "second"


    public static class equal_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equal"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:19:1: equal : number ;
    public final Normalize.equal_return equal() throws RecognitionException {
        Normalize.equal_return retval = new Normalize.equal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Normalize.number_return number20 =null;



        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:19:7: ( number )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:19:9: number
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_number_in_equal151);
            number20=number();

            state._fsp--;

            adaptor.addChild(root_0, number20.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equal"


    public static class number_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:21:1: number : ^( BLOCK ( ID )+ ) ;
    public final Normalize.number_return number() throws RecognitionException {
        Normalize.number_return retval = new Normalize.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLOCK21=null;
        CommonTree ID22=null;

        CommonTree BLOCK21_tree=null;
        CommonTree ID22_tree=null;

        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:21:8: ( ^( BLOCK ( ID )+ ) )
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:21:10: ^( BLOCK ( ID )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            BLOCK21=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_number160); 
            BLOCK21_tree = (CommonTree)adaptor.dupNode(BLOCK21);


            root_1 = (CommonTree)adaptor.becomeRoot(BLOCK21_tree, root_1);


            match(input, Token.DOWN, null); 
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:21:18: ( ID )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\Normalize.g:21:18: ID
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    ID22=(CommonTree)match(input,ID,FOLLOW_ID_in_number162); 
            	    ID22_tree = (CommonTree)adaptor.dupNode(ID22);


            	    adaptor.addChild(root_1, ID22_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_zblock_in_prog41 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_zblock_in_prog43 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_zblock_in_prog45 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_zblock_in_prog47 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_zblock_in_prog49 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_zblock_in_prog51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALCULATION_in_zblock60 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_zblock63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_first_in_zblock65 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_second_in_zblock67 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_equal_in_zblock70 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALCULATION_in_zblock81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_zblock84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_first_in_zblock86 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_second_in_zblock88 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_equal_in_zblock91 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_blockID123 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_number_in_first137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_second144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_equal151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_number160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_number162 = new BitSet(new long[]{0x0000000000000108L});

}