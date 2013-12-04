// $ANTLR 3.4 C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g 2013-11-27 15:03:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRaetsel3Parser extends DebugParser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "prog", "blockID", "op", "assignLine"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SymbolRaetsel3Parser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SymbolRaetsel3Parser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public SymbolRaetsel3Parser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return SymbolRaetsel3Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:14:1: prog : b11= blockID o11= op b12= blockID ASSIGN b13= blockID o21= op o22= op o23= op b21= blockID o31= op b22= blockID ASSIGN b23= blockID assignLine b31= blockID o41= op b32= blockID ASSIGN b33= blockID -> ^( CALCULATION ^( $o11 $b11 $b12) $b13) ^( CALCULATION ^( $o31 $b21 $b22) $b23) ^( CALCULATION ^( $o41 $b31 $b32) $b33) ^( CALCULATION ^( $o21 $b11 $b21) $b31) ^( CALCULATION ^( $o22 $b12 $b22) $b32) ^( CALCULATION ^( $o23 $b13 $b23) $b33) ;
    public final SymbolRaetsel3Parser.prog_return prog() throws RecognitionException {
        SymbolRaetsel3Parser.prog_return retval = new SymbolRaetsel3Parser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ASSIGN1=null;
        Token ASSIGN2=null;
        Token ASSIGN4=null;
        SymbolRaetsel3Parser.blockID_return b11 =null;

        SymbolRaetsel3Parser.op_return o11 =null;

        SymbolRaetsel3Parser.blockID_return b12 =null;

        SymbolRaetsel3Parser.blockID_return b13 =null;

        SymbolRaetsel3Parser.op_return o21 =null;

        SymbolRaetsel3Parser.op_return o22 =null;

        SymbolRaetsel3Parser.op_return o23 =null;

        SymbolRaetsel3Parser.blockID_return b21 =null;

        SymbolRaetsel3Parser.op_return o31 =null;

        SymbolRaetsel3Parser.blockID_return b22 =null;

        SymbolRaetsel3Parser.blockID_return b23 =null;

        SymbolRaetsel3Parser.blockID_return b31 =null;

        SymbolRaetsel3Parser.op_return o41 =null;

        SymbolRaetsel3Parser.blockID_return b32 =null;

        SymbolRaetsel3Parser.blockID_return b33 =null;

        SymbolRaetsel3Parser.assignLine_return assignLine3 =null;


        CommonTree ASSIGN1_tree=null;
        CommonTree ASSIGN2_tree=null;
        CommonTree ASSIGN4_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_blockID=new RewriteRuleSubtreeStream(adaptor,"rule blockID");
        RewriteRuleSubtreeStream stream_assignLine=new RewriteRuleSubtreeStream(adaptor,"rule assignLine");
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:14:7: (b11= blockID o11= op b12= blockID ASSIGN b13= blockID o21= op o22= op o23= op b21= blockID o31= op b22= blockID ASSIGN b23= blockID assignLine b31= blockID o41= op b32= blockID ASSIGN b33= blockID -> ^( CALCULATION ^( $o11 $b11 $b12) $b13) ^( CALCULATION ^( $o31 $b21 $b22) $b23) ^( CALCULATION ^( $o41 $b31 $b32) $b33) ^( CALCULATION ^( $o21 $b11 $b21) $b31) ^( CALCULATION ^( $o22 $b12 $b22) $b32) ^( CALCULATION ^( $o23 $b13 $b23) $b33) )
            dbg.enterAlt(1);

            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:14:9: b11= blockID o11= op b12= blockID ASSIGN b13= blockID o21= op o22= op o23= op b21= blockID o31= op b22= blockID ASSIGN b23= blockID assignLine b31= blockID o41= op b32= blockID ASSIGN b33= blockID
            {
            dbg.location(14,13);
            pushFollow(FOLLOW_blockID_in_prog48);
            b11=blockID();

            state._fsp--;

            stream_blockID.add(b11.getTree());
            dbg.location(14,27);
            pushFollow(FOLLOW_op_in_prog54);
            o11=op();

            state._fsp--;

            stream_op.add(o11.getTree());
            dbg.location(14,36);
            pushFollow(FOLLOW_blockID_in_prog60);
            b12=blockID();

            state._fsp--;

            stream_blockID.add(b12.getTree());
            dbg.location(14,46);
            ASSIGN1=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_prog62);  
            stream_ASSIGN.add(ASSIGN1);

            dbg.location(14,57);
            pushFollow(FOLLOW_blockID_in_prog68);
            b13=blockID();

            state._fsp--;

            stream_blockID.add(b13.getTree());
            dbg.location(15,8);
            pushFollow(FOLLOW_op_in_prog77);
            o21=op();

            state._fsp--;

            stream_op.add(o21.getTree());
            dbg.location(15,17);
            pushFollow(FOLLOW_op_in_prog83);
            o22=op();

            state._fsp--;

            stream_op.add(o22.getTree());
            dbg.location(15,26);
            pushFollow(FOLLOW_op_in_prog89);
            o23=op();

            state._fsp--;

            stream_op.add(o23.getTree());
            dbg.location(16,8);
            pushFollow(FOLLOW_blockID_in_prog99);
            b21=blockID();

            state._fsp--;

            stream_blockID.add(b21.getTree());
            dbg.location(16,22);
            pushFollow(FOLLOW_op_in_prog105);
            o31=op();

            state._fsp--;

            stream_op.add(o31.getTree());
            dbg.location(16,31);
            pushFollow(FOLLOW_blockID_in_prog111);
            b22=blockID();

            state._fsp--;

            stream_blockID.add(b22.getTree());
            dbg.location(16,41);
            ASSIGN2=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_prog113);  
            stream_ASSIGN.add(ASSIGN2);

            dbg.location(16,52);
            pushFollow(FOLLOW_blockID_in_prog119);
            b23=blockID();

            state._fsp--;

            stream_blockID.add(b23.getTree());
            dbg.location(17,4);
            pushFollow(FOLLOW_assignLine_in_prog125);
            assignLine3=assignLine();

            state._fsp--;

            stream_assignLine.add(assignLine3.getTree());
            dbg.location(18,8);
            pushFollow(FOLLOW_blockID_in_prog135);
            b31=blockID();

            state._fsp--;

            stream_blockID.add(b31.getTree());
            dbg.location(18,22);
            pushFollow(FOLLOW_op_in_prog141);
            o41=op();

            state._fsp--;

            stream_op.add(o41.getTree());
            dbg.location(18,31);
            pushFollow(FOLLOW_blockID_in_prog147);
            b32=blockID();

            state._fsp--;

            stream_blockID.add(b32.getTree());
            dbg.location(18,41);
            ASSIGN4=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_prog149);  
            stream_ASSIGN.add(ASSIGN4);

            dbg.location(18,52);
            pushFollow(FOLLOW_blockID_in_prog155);
            b33=blockID();

            state._fsp--;

            stream_blockID.add(b33.getTree());

            // AST REWRITE
            // elements: b11, o41, b32, o21, o11, b12, b22, b33, b13, o31, b33, b22, b13, b23, b12, b21, b32, o23, b11, b31, o22, b31, b23, b21
            // token labels: 
            // rule labels: retval, o31, o23, o41, o11, o21, o22, b11, b12, b21, b22, b23, b33, b31, b13, b32
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_o31=new RewriteRuleSubtreeStream(adaptor,"rule o31",o31!=null?o31.tree:null);
            RewriteRuleSubtreeStream stream_o23=new RewriteRuleSubtreeStream(adaptor,"rule o23",o23!=null?o23.tree:null);
            RewriteRuleSubtreeStream stream_o41=new RewriteRuleSubtreeStream(adaptor,"rule o41",o41!=null?o41.tree:null);
            RewriteRuleSubtreeStream stream_o11=new RewriteRuleSubtreeStream(adaptor,"rule o11",o11!=null?o11.tree:null);
            RewriteRuleSubtreeStream stream_o21=new RewriteRuleSubtreeStream(adaptor,"rule o21",o21!=null?o21.tree:null);
            RewriteRuleSubtreeStream stream_o22=new RewriteRuleSubtreeStream(adaptor,"rule o22",o22!=null?o22.tree:null);
            RewriteRuleSubtreeStream stream_b11=new RewriteRuleSubtreeStream(adaptor,"rule b11",b11!=null?b11.tree:null);
            RewriteRuleSubtreeStream stream_b12=new RewriteRuleSubtreeStream(adaptor,"rule b12",b12!=null?b12.tree:null);
            RewriteRuleSubtreeStream stream_b21=new RewriteRuleSubtreeStream(adaptor,"rule b21",b21!=null?b21.tree:null);
            RewriteRuleSubtreeStream stream_b22=new RewriteRuleSubtreeStream(adaptor,"rule b22",b22!=null?b22.tree:null);
            RewriteRuleSubtreeStream stream_b23=new RewriteRuleSubtreeStream(adaptor,"rule b23",b23!=null?b23.tree:null);
            RewriteRuleSubtreeStream stream_b33=new RewriteRuleSubtreeStream(adaptor,"rule b33",b33!=null?b33.tree:null);
            RewriteRuleSubtreeStream stream_b31=new RewriteRuleSubtreeStream(adaptor,"rule b31",b31!=null?b31.tree:null);
            RewriteRuleSubtreeStream stream_b13=new RewriteRuleSubtreeStream(adaptor,"rule b13",b13!=null?b13.tree:null);
            RewriteRuleSubtreeStream stream_b32=new RewriteRuleSubtreeStream(adaptor,"rule b32",b32!=null?b32.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 20:4: -> ^( CALCULATION ^( $o11 $b11 $b12) $b13) ^( CALCULATION ^( $o31 $b21 $b22) $b23) ^( CALCULATION ^( $o41 $b31 $b32) $b33) ^( CALCULATION ^( $o21 $b11 $b21) $b31) ^( CALCULATION ^( $o22 $b12 $b22) $b32) ^( CALCULATION ^( $o23 $b13 $b23) $b33)
            {
                dbg.location(20,7);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:20:7: ^( CALCULATION ^( $o11 $b11 $b12) $b13)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(20,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                dbg.location(20,21);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:20:21: ^( $o11 $b11 $b12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(20,24);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o11.nextNode(), root_2);

                dbg.location(20,29);
                adaptor.addChild(root_2, stream_b11.nextTree());
                dbg.location(20,34);
                adaptor.addChild(root_2, stream_b12.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(20,40);
                adaptor.addChild(root_1, stream_b13.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(21,7);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:21:7: ^( CALCULATION ^( $o31 $b21 $b22) $b23)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(21,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                dbg.location(21,21);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:21:21: ^( $o31 $b21 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(21,24);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o31.nextNode(), root_2);

                dbg.location(21,29);
                adaptor.addChild(root_2, stream_b21.nextTree());
                dbg.location(21,34);
                adaptor.addChild(root_2, stream_b22.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(21,40);
                adaptor.addChild(root_1, stream_b23.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(22,7);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:22:7: ^( CALCULATION ^( $o41 $b31 $b32) $b33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(22,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                dbg.location(22,21);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:22:21: ^( $o41 $b31 $b32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(22,24);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o41.nextNode(), root_2);

                dbg.location(22,29);
                adaptor.addChild(root_2, stream_b31.nextTree());
                dbg.location(22,34);
                adaptor.addChild(root_2, stream_b32.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(22,40);
                adaptor.addChild(root_1, stream_b33.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(23,7);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:23:7: ^( CALCULATION ^( $o21 $b11 $b21) $b31)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(23,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                dbg.location(23,21);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:23:21: ^( $o21 $b11 $b21)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(23,24);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o21.nextNode(), root_2);

                dbg.location(23,29);
                adaptor.addChild(root_2, stream_b11.nextTree());
                dbg.location(23,34);
                adaptor.addChild(root_2, stream_b21.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(23,40);
                adaptor.addChild(root_1, stream_b31.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(24,7);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:24:7: ^( CALCULATION ^( $o22 $b12 $b22) $b32)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(24,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                dbg.location(24,21);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:24:21: ^( $o22 $b12 $b22)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(24,24);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o22.nextNode(), root_2);

                dbg.location(24,29);
                adaptor.addChild(root_2, stream_b12.nextTree());
                dbg.location(24,34);
                adaptor.addChild(root_2, stream_b22.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(24,40);
                adaptor.addChild(root_1, stream_b32.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(25,7);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:25:7: ^( CALCULATION ^( $o23 $b13 $b23) $b33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(25,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALCULATION, "CALCULATION")
                , root_1);

                dbg.location(25,21);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:25:21: ^( $o23 $b13 $b23)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(25,24);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_o23.nextNode(), root_2);

                dbg.location(25,29);
                adaptor.addChild(root_2, stream_b13.nextTree());
                dbg.location(25,34);
                adaptor.addChild(root_2, stream_b23.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(25,40);
                adaptor.addChild(root_1, stream_b33.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(25, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"


    public static class assignLine_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignLine"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:27:1: assignLine : ASSIGN ASSIGN ASSIGN ;
    public final SymbolRaetsel3Parser.assignLine_return assignLine() throws RecognitionException {
        SymbolRaetsel3Parser.assignLine_return retval = new SymbolRaetsel3Parser.assignLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ASSIGN5=null;
        Token ASSIGN6=null;
        Token ASSIGN7=null;

        CommonTree ASSIGN5_tree=null;
        CommonTree ASSIGN6_tree=null;
        CommonTree ASSIGN7_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignLine");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:27:12: ( ASSIGN ASSIGN ASSIGN )
            dbg.enterAlt(1);

            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:27:14: ASSIGN ASSIGN ASSIGN
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(27,14);
            ASSIGN5=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignLine311); 
            ASSIGN5_tree = 
            (CommonTree)adaptor.create(ASSIGN5)
            ;
            adaptor.addChild(root_0, ASSIGN5_tree);

            dbg.location(27,21);
            ASSIGN6=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignLine313); 
            ASSIGN6_tree = 
            (CommonTree)adaptor.create(ASSIGN6)
            ;
            adaptor.addChild(root_0, ASSIGN6_tree);

            dbg.location(27,28);
            ASSIGN7=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignLine315); 
            ASSIGN7_tree = 
            (CommonTree)adaptor.create(ASSIGN7)
            ;
            adaptor.addChild(root_0, ASSIGN7_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignLine");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignLine"


    public static class op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:28:1: op : ( ADD | SUB );
    public final SymbolRaetsel3Parser.op_return op() throws RecognitionException {
        SymbolRaetsel3Parser.op_return retval = new SymbolRaetsel3Parser.op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:28:5: ( ADD | SUB )
            dbg.enterAlt(1);

            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(28,5);
            set8=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set8)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(28, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "op"


    public static class blockID_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockID"
    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:29:1: blockID : ( ID )+ -> ^( BLOCK ( ID )+ ) ;
    public final SymbolRaetsel3Parser.blockID_return blockID() throws RecognitionException {
        SymbolRaetsel3Parser.blockID_return retval = new SymbolRaetsel3Parser.blockID_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID9=null;

        CommonTree ID9_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "blockID");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:29:10: ( ( ID )+ -> ^( BLOCK ( ID )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:29:12: ( ID )+
            {
            dbg.location(29,12);
            // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:29:12: ( ID )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:29:12: ID
            	    {
            	    dbg.location(29,12);
            	    ID9=(Token)match(input,ID,FOLLOW_ID_in_blockID335);  
            	    stream_ID.add(ID9);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 30:4: -> ^( BLOCK ( ID )+ )
            {
                dbg.location(30,7);
                // C:\\Users\\Alex\\Documents\\WS_ANTLR\\prak3\\SymbolRaetsel3.g:30:7: ^( BLOCK ( ID )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(30,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                dbg.location(30,15);
                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    dbg.location(30,15);
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(30, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockID");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "blockID"

    // Delegated rules


 

    public static final BitSet FOLLOW_blockID_in_prog48 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_prog54 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_blockID_in_prog60 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_prog62 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_blockID_in_prog68 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_prog77 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_prog83 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_prog89 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_blockID_in_prog99 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_prog105 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_blockID_in_prog111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_prog113 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_blockID_in_prog119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_assignLine_in_prog125 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_blockID_in_prog135 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_op_in_prog141 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_blockID_in_prog147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_prog149 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_blockID_in_prog155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assignLine311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_assignLine313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_assignLine315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_blockID335 = new BitSet(new long[]{0x0000000000000102L});

}