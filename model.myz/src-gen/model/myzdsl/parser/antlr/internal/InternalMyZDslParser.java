package model.myzdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import model.myzdsl.services.MyZDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyZDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'system'", "'state'", "'space'", "'initial'", "'predicate'", "'variable'", "'variables'", "'schema'", "'operation'", "'function'", "'input'", "'output'", "'name'", "'is'", "'are'", "'The'", "'parameters'", "'features'", "'parameter'", "'feature'", "'include'", "'includes'", "'postcondition'", "'post condition'", "'will'", "'changing'", "'change'", "'CHANGE'", "'NOT CHANGE'", "'BELONGS TO'", "'DOES NOT BELONG TO'", "'dom'", "'range'", "'with'", "'new'", "'and '", "'where'", "'BELONG TO'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyZDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyZDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyZDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyZDsl.g"; }



     	private MyZDslGrammarAccess grammarAccess;

        public InternalMyZDslParser(TokenStream input, MyZDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MyZModel";
       	}

       	@Override
       	protected MyZDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMyZModel"
    // InternalMyZDsl.g:64:1: entryRuleMyZModel returns [EObject current=null] : iv_ruleMyZModel= ruleMyZModel EOF ;
    public final EObject entryRuleMyZModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyZModel = null;


        try {
            // InternalMyZDsl.g:64:49: (iv_ruleMyZModel= ruleMyZModel EOF )
            // InternalMyZDsl.g:65:2: iv_ruleMyZModel= ruleMyZModel EOF
            {
             newCompositeNode(grammarAccess.getMyZModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyZModel=ruleMyZModel();

            state._fsp--;

             current =iv_ruleMyZModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyZModel"


    // $ANTLR start "ruleMyZModel"
    // InternalMyZDsl.g:71:1: ruleMyZModel returns [EObject current=null] : ( ( (lv_systemstatespace_0_0= ruleSystemStateSpace ) ) ( (lv_initialstate_1_0= ruleInitialState ) ) ( (lv_schemas_2_0= ruleSchema ) )* ) ;
    public final EObject ruleMyZModel() throws RecognitionException {
        EObject current = null;

        EObject lv_systemstatespace_0_0 = null;

        EObject lv_initialstate_1_0 = null;

        EObject lv_schemas_2_0 = null;



        	enterRule();

        try {
            // InternalMyZDsl.g:77:2: ( ( ( (lv_systemstatespace_0_0= ruleSystemStateSpace ) ) ( (lv_initialstate_1_0= ruleInitialState ) ) ( (lv_schemas_2_0= ruleSchema ) )* ) )
            // InternalMyZDsl.g:78:2: ( ( (lv_systemstatespace_0_0= ruleSystemStateSpace ) ) ( (lv_initialstate_1_0= ruleInitialState ) ) ( (lv_schemas_2_0= ruleSchema ) )* )
            {
            // InternalMyZDsl.g:78:2: ( ( (lv_systemstatespace_0_0= ruleSystemStateSpace ) ) ( (lv_initialstate_1_0= ruleInitialState ) ) ( (lv_schemas_2_0= ruleSchema ) )* )
            // InternalMyZDsl.g:79:3: ( (lv_systemstatespace_0_0= ruleSystemStateSpace ) ) ( (lv_initialstate_1_0= ruleInitialState ) ) ( (lv_schemas_2_0= ruleSchema ) )*
            {
            // InternalMyZDsl.g:79:3: ( (lv_systemstatespace_0_0= ruleSystemStateSpace ) )
            // InternalMyZDsl.g:80:4: (lv_systemstatespace_0_0= ruleSystemStateSpace )
            {
            // InternalMyZDsl.g:80:4: (lv_systemstatespace_0_0= ruleSystemStateSpace )
            // InternalMyZDsl.g:81:5: lv_systemstatespace_0_0= ruleSystemStateSpace
            {

            					newCompositeNode(grammarAccess.getMyZModelAccess().getSystemstatespaceSystemStateSpaceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_systemstatespace_0_0=ruleSystemStateSpace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMyZModelRule());
            					}
            					add(
            						current,
            						"systemstatespace",
            						lv_systemstatespace_0_0,
            						"model.myzdsl.MyZDsl.SystemStateSpace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:98:3: ( (lv_initialstate_1_0= ruleInitialState ) )
            // InternalMyZDsl.g:99:4: (lv_initialstate_1_0= ruleInitialState )
            {
            // InternalMyZDsl.g:99:4: (lv_initialstate_1_0= ruleInitialState )
            // InternalMyZDsl.g:100:5: lv_initialstate_1_0= ruleInitialState
            {

            					newCompositeNode(grammarAccess.getMyZModelAccess().getInitialstateInitialStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_initialstate_1_0=ruleInitialState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMyZModelRule());
            					}
            					add(
            						current,
            						"initialstate",
            						lv_initialstate_1_0,
            						"model.myzdsl.MyZDsl.InitialState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:117:3: ( (lv_schemas_2_0= ruleSchema ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyZDsl.g:118:4: (lv_schemas_2_0= ruleSchema )
            	    {
            	    // InternalMyZDsl.g:118:4: (lv_schemas_2_0= ruleSchema )
            	    // InternalMyZDsl.g:119:5: lv_schemas_2_0= ruleSchema
            	    {

            	    					newCompositeNode(grammarAccess.getMyZModelAccess().getSchemasSchemaParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_schemas_2_0=ruleSchema();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMyZModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"schemas",
            	    						lv_schemas_2_0,
            	    						"model.myzdsl.MyZDsl.Schema");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyZModel"


    // $ANTLR start "entryRuleSystemStateSpace"
    // InternalMyZDsl.g:140:1: entryRuleSystemStateSpace returns [EObject current=null] : iv_ruleSystemStateSpace= ruleSystemStateSpace EOF ;
    public final EObject entryRuleSystemStateSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemStateSpace = null;


        try {
            // InternalMyZDsl.g:140:57: (iv_ruleSystemStateSpace= ruleSystemStateSpace EOF )
            // InternalMyZDsl.g:141:2: iv_ruleSystemStateSpace= ruleSystemStateSpace EOF
            {
             newCompositeNode(grammarAccess.getSystemStateSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemStateSpace=ruleSystemStateSpace();

            state._fsp--;

             current =iv_ruleSystemStateSpace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemStateSpace"


    // $ANTLR start "ruleSystemStateSpace"
    // InternalMyZDsl.g:147:1: ruleSystemStateSpace returns [EObject current=null] : ( ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ) | ( ( (lv_name_5_0= RULE_ID ) ) ruleVBZ ruleNN ruleNN ruleNN ) ) ( ( ruleDT ruleNNS ruleVBP ) | ( ruleNNS ruleVBP ) | ruleNNS ) ( (lv_variables_16_0= ruleVariables ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariables ) ) )* ( (lv_predicate_19_0= ruleSystemStateSpacePredicate ) ) ) ;
    public final EObject ruleSystemStateSpace() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_17=null;
        EObject lv_variables_16_0 = null;

        EObject lv_variables_18_0 = null;

        EObject lv_predicate_19_0 = null;



        	enterRule();

        try {
            // InternalMyZDsl.g:153:2: ( ( ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ) | ( ( (lv_name_5_0= RULE_ID ) ) ruleVBZ ruleNN ruleNN ruleNN ) ) ( ( ruleDT ruleNNS ruleVBP ) | ( ruleNNS ruleVBP ) | ruleNNS ) ( (lv_variables_16_0= ruleVariables ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariables ) ) )* ( (lv_predicate_19_0= ruleSystemStateSpacePredicate ) ) ) )
            // InternalMyZDsl.g:154:2: ( ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ) | ( ( (lv_name_5_0= RULE_ID ) ) ruleVBZ ruleNN ruleNN ruleNN ) ) ( ( ruleDT ruleNNS ruleVBP ) | ( ruleNNS ruleVBP ) | ruleNNS ) ( (lv_variables_16_0= ruleVariables ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariables ) ) )* ( (lv_predicate_19_0= ruleSystemStateSpacePredicate ) ) )
            {
            // InternalMyZDsl.g:154:2: ( ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ) | ( ( (lv_name_5_0= RULE_ID ) ) ruleVBZ ruleNN ruleNN ruleNN ) ) ( ( ruleDT ruleNNS ruleVBP ) | ( ruleNNS ruleVBP ) | ruleNNS ) ( (lv_variables_16_0= ruleVariables ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariables ) ) )* ( (lv_predicate_19_0= ruleSystemStateSpacePredicate ) ) )
            // InternalMyZDsl.g:155:3: ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ) | ( ( (lv_name_5_0= RULE_ID ) ) ruleVBZ ruleNN ruleNN ruleNN ) ) ( ( ruleDT ruleNNS ruleVBP ) | ( ruleNNS ruleVBP ) | ruleNNS ) ( (lv_variables_16_0= ruleVariables ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleVariables ) ) )* ( (lv_predicate_19_0= ruleSystemStateSpacePredicate ) )
            {
            // InternalMyZDsl.g:155:3: ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ) | ( ( (lv_name_5_0= RULE_ID ) ) ruleVBZ ruleNN ruleNN ruleNN ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=24)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyZDsl.g:156:4: ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // InternalMyZDsl.g:156:4: ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) )
                    // InternalMyZDsl.g:157:5: ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) )
                    {

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getNNParserRuleCall_0_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getNNParserRuleCall_0_0_1());
                    				
                    pushFollow(FOLLOW_5);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getNNParserRuleCall_0_0_2());
                    				
                    pushFollow(FOLLOW_6);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getVBZParserRuleCall_0_0_3());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBZ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    // InternalMyZDsl.g:185:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalMyZDsl.g:186:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalMyZDsl.g:186:6: (lv_name_4_0= RULE_ID )
                    // InternalMyZDsl.g:187:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    							newLeafNode(lv_name_4_0, grammarAccess.getSystemStateSpaceAccess().getNameIDTerminalRuleCall_0_0_4_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSystemStateSpaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_4_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:205:4: ( ( (lv_name_5_0= RULE_ID ) ) ruleVBZ ruleNN ruleNN ruleNN )
                    {
                    // InternalMyZDsl.g:205:4: ( ( (lv_name_5_0= RULE_ID ) ) ruleVBZ ruleNN ruleNN ruleNN )
                    // InternalMyZDsl.g:206:5: ( (lv_name_5_0= RULE_ID ) ) ruleVBZ ruleNN ruleNN ruleNN
                    {
                    // InternalMyZDsl.g:206:5: ( (lv_name_5_0= RULE_ID ) )
                    // InternalMyZDsl.g:207:6: (lv_name_5_0= RULE_ID )
                    {
                    // InternalMyZDsl.g:207:6: (lv_name_5_0= RULE_ID )
                    // InternalMyZDsl.g:208:7: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    							newLeafNode(lv_name_5_0, grammarAccess.getSystemStateSpaceAccess().getNameIDTerminalRuleCall_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSystemStateSpaceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_5_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getVBZParserRuleCall_0_1_1());
                    				
                    pushFollow(FOLLOW_5);
                    ruleVBZ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getNNParserRuleCall_0_1_2());
                    				
                    pushFollow(FOLLOW_5);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getNNParserRuleCall_0_1_3());
                    				
                    pushFollow(FOLLOW_5);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getNNParserRuleCall_0_1_4());
                    				
                    pushFollow(FOLLOW_8);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:254:3: ( ( ruleDT ruleNNS ruleVBP ) | ( ruleNNS ruleVBP ) | ruleNNS )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyZDsl.g:255:4: ( ruleDT ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:255:4: ( ruleDT ruleNNS ruleVBP )
                    // InternalMyZDsl.g:256:5: ruleDT ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getDTParserRuleCall_1_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    ruleDT();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getNNSParserRuleCall_1_0_1());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getVBPParserRuleCall_1_0_2());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:279:4: ( ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:279:4: ( ruleNNS ruleVBP )
                    // InternalMyZDsl.g:280:5: ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getNNSParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getVBPParserRuleCall_1_1_1());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalMyZDsl.g:296:4: ruleNNS
                    {

                    				newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getNNSParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_7);
                    ruleNNS();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMyZDsl.g:304:3: ( (lv_variables_16_0= ruleVariables ) )
            // InternalMyZDsl.g:305:4: (lv_variables_16_0= ruleVariables )
            {
            // InternalMyZDsl.g:305:4: (lv_variables_16_0= ruleVariables )
            // InternalMyZDsl.g:306:5: lv_variables_16_0= ruleVariables
            {

            					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getVariablesVariablesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_variables_16_0=ruleVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemStateSpaceRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_16_0,
            						"model.myzdsl.MyZDsl.Variables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:323:3: (otherlv_17= ',' ( (lv_variables_18_0= ruleVariables ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyZDsl.g:324:4: otherlv_17= ',' ( (lv_variables_18_0= ruleVariables ) )
            	    {
            	    otherlv_17=(Token)match(input,11,FOLLOW_7); 

            	    				newLeafNode(otherlv_17, grammarAccess.getSystemStateSpaceAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMyZDsl.g:328:4: ( (lv_variables_18_0= ruleVariables ) )
            	    // InternalMyZDsl.g:329:5: (lv_variables_18_0= ruleVariables )
            	    {
            	    // InternalMyZDsl.g:329:5: (lv_variables_18_0= ruleVariables )
            	    // InternalMyZDsl.g:330:6: lv_variables_18_0= ruleVariables
            	    {

            	    						newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getVariablesVariablesParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_variables_18_0=ruleVariables();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSystemStateSpaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_18_0,
            	    							"model.myzdsl.MyZDsl.Variables");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyZDsl.g:348:3: ( (lv_predicate_19_0= ruleSystemStateSpacePredicate ) )
            // InternalMyZDsl.g:349:4: (lv_predicate_19_0= ruleSystemStateSpacePredicate )
            {
            // InternalMyZDsl.g:349:4: (lv_predicate_19_0= ruleSystemStateSpacePredicate )
            // InternalMyZDsl.g:350:5: lv_predicate_19_0= ruleSystemStateSpacePredicate
            {

            					newCompositeNode(grammarAccess.getSystemStateSpaceAccess().getPredicateSystemStateSpacePredicateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_19_0=ruleSystemStateSpacePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemStateSpaceRule());
            					}
            					add(
            						current,
            						"predicate",
            						lv_predicate_19_0,
            						"model.myzdsl.MyZDsl.SystemStateSpacePredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemStateSpace"


    // $ANTLR start "entryRuleSystemStateSpacePredicate"
    // InternalMyZDsl.g:371:1: entryRuleSystemStateSpacePredicate returns [EObject current=null] : iv_ruleSystemStateSpacePredicate= ruleSystemStateSpacePredicate EOF ;
    public final EObject entryRuleSystemStateSpacePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemStateSpacePredicate = null;


        try {
            // InternalMyZDsl.g:371:66: (iv_ruleSystemStateSpacePredicate= ruleSystemStateSpacePredicate EOF )
            // InternalMyZDsl.g:372:2: iv_ruleSystemStateSpacePredicate= ruleSystemStateSpacePredicate EOF
            {
             newCompositeNode(grammarAccess.getSystemStateSpacePredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemStateSpacePredicate=ruleSystemStateSpacePredicate();

            state._fsp--;

             current =iv_ruleSystemStateSpacePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemStateSpacePredicate"


    // $ANTLR start "ruleSystemStateSpacePredicate"
    // InternalMyZDsl.g:378:1: ruleSystemStateSpacePredicate returns [EObject current=null] : ( ( ruleDT ruleJJ ruleNNS ruleVBP ( (lv_vas_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_vas_6_0= ruleVariables ) ) )* ( (lv_function_7_0= ruleFunctionList ) ) ( (lv_predicateVar_8_0= ruleVariables ) ) ) | ( ruleJJ ruleNNS ruleVBP ( (lv_vas_12_0= ruleVariables ) ) (otherlv_13= ',' ( (lv_vas_14_0= ruleVariables ) ) )* ( (lv_function_15_0= ruleFunctionList ) ) ( (lv_predicateVar_16_0= ruleVariables ) ) ) ) ;
    public final EObject ruleSystemStateSpacePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_13=null;
        EObject lv_vas_4_0 = null;

        EObject lv_vas_6_0 = null;

        AntlrDatatypeRuleToken lv_function_7_0 = null;

        EObject lv_predicateVar_8_0 = null;

        EObject lv_vas_12_0 = null;

        EObject lv_vas_14_0 = null;

        AntlrDatatypeRuleToken lv_function_15_0 = null;

        EObject lv_predicateVar_16_0 = null;



        	enterRule();

        try {
            // InternalMyZDsl.g:384:2: ( ( ( ruleDT ruleJJ ruleNNS ruleVBP ( (lv_vas_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_vas_6_0= ruleVariables ) ) )* ( (lv_function_7_0= ruleFunctionList ) ) ( (lv_predicateVar_8_0= ruleVariables ) ) ) | ( ruleJJ ruleNNS ruleVBP ( (lv_vas_12_0= ruleVariables ) ) (otherlv_13= ',' ( (lv_vas_14_0= ruleVariables ) ) )* ( (lv_function_15_0= ruleFunctionList ) ) ( (lv_predicateVar_16_0= ruleVariables ) ) ) ) )
            // InternalMyZDsl.g:385:2: ( ( ruleDT ruleJJ ruleNNS ruleVBP ( (lv_vas_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_vas_6_0= ruleVariables ) ) )* ( (lv_function_7_0= ruleFunctionList ) ) ( (lv_predicateVar_8_0= ruleVariables ) ) ) | ( ruleJJ ruleNNS ruleVBP ( (lv_vas_12_0= ruleVariables ) ) (otherlv_13= ',' ( (lv_vas_14_0= ruleVariables ) ) )* ( (lv_function_15_0= ruleFunctionList ) ) ( (lv_predicateVar_16_0= ruleVariables ) ) ) )
            {
            // InternalMyZDsl.g:385:2: ( ( ruleDT ruleJJ ruleNNS ruleVBP ( (lv_vas_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_vas_6_0= ruleVariables ) ) )* ( (lv_function_7_0= ruleFunctionList ) ) ( (lv_predicateVar_8_0= ruleVariables ) ) ) | ( ruleJJ ruleNNS ruleVBP ( (lv_vas_12_0= ruleVariables ) ) (otherlv_13= ',' ( (lv_vas_14_0= ruleVariables ) ) )* ( (lv_function_15_0= ruleFunctionList ) ) ( (lv_predicateVar_16_0= ruleVariables ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=15 && LA7_0<=16)||(LA7_0>=34 && LA7_0<=35)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyZDsl.g:386:3: ( ruleDT ruleJJ ruleNNS ruleVBP ( (lv_vas_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_vas_6_0= ruleVariables ) ) )* ( (lv_function_7_0= ruleFunctionList ) ) ( (lv_predicateVar_8_0= ruleVariables ) ) )
                    {
                    // InternalMyZDsl.g:386:3: ( ruleDT ruleJJ ruleNNS ruleVBP ( (lv_vas_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_vas_6_0= ruleVariables ) ) )* ( (lv_function_7_0= ruleFunctionList ) ) ( (lv_predicateVar_8_0= ruleVariables ) ) )
                    // InternalMyZDsl.g:387:4: ruleDT ruleJJ ruleNNS ruleVBP ( (lv_vas_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_vas_6_0= ruleVariables ) ) )* ( (lv_function_7_0= ruleFunctionList ) ) ( (lv_predicateVar_8_0= ruleVariables ) )
                    {

                    				newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getDTParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_3);
                    ruleDT();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getJJParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    ruleJJ();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getNNSParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getVBPParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyZDsl.g:415:4: ( (lv_vas_4_0= ruleVariables ) )
                    // InternalMyZDsl.g:416:5: (lv_vas_4_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:416:5: (lv_vas_4_0= ruleVariables )
                    // InternalMyZDsl.g:417:6: lv_vas_4_0= ruleVariables
                    {

                    						newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getVasVariablesParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_vas_4_0=ruleVariables();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemStateSpacePredicateRule());
                    						}
                    						add(
                    							current,
                    							"vas",
                    							lv_vas_4_0,
                    							"model.myzdsl.MyZDsl.Variables");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyZDsl.g:434:4: (otherlv_5= ',' ( (lv_vas_6_0= ruleVariables ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==11) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyZDsl.g:435:5: otherlv_5= ',' ( (lv_vas_6_0= ruleVariables ) )
                    	    {
                    	    otherlv_5=(Token)match(input,11,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSystemStateSpacePredicateAccess().getCommaKeyword_0_5_0());
                    	    				
                    	    // InternalMyZDsl.g:439:5: ( (lv_vas_6_0= ruleVariables ) )
                    	    // InternalMyZDsl.g:440:6: (lv_vas_6_0= ruleVariables )
                    	    {
                    	    // InternalMyZDsl.g:440:6: (lv_vas_6_0= ruleVariables )
                    	    // InternalMyZDsl.g:441:7: lv_vas_6_0= ruleVariables
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getVasVariablesParserRuleCall_0_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_vas_6_0=ruleVariables();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemStateSpacePredicateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vas",
                    	    								lv_vas_6_0,
                    	    								"model.myzdsl.MyZDsl.Variables");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalMyZDsl.g:459:4: ( (lv_function_7_0= ruleFunctionList ) )
                    // InternalMyZDsl.g:460:5: (lv_function_7_0= ruleFunctionList )
                    {
                    // InternalMyZDsl.g:460:5: (lv_function_7_0= ruleFunctionList )
                    // InternalMyZDsl.g:461:6: lv_function_7_0= ruleFunctionList
                    {

                    						newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getFunctionFunctionListParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_function_7_0=ruleFunctionList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemStateSpacePredicateRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_7_0,
                    							"model.myzdsl.MyZDsl.FunctionList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyZDsl.g:478:4: ( (lv_predicateVar_8_0= ruleVariables ) )
                    // InternalMyZDsl.g:479:5: (lv_predicateVar_8_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:479:5: (lv_predicateVar_8_0= ruleVariables )
                    // InternalMyZDsl.g:480:6: lv_predicateVar_8_0= ruleVariables
                    {

                    						newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getPredicateVarVariablesParserRuleCall_0_7_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_predicateVar_8_0=ruleVariables();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemStateSpacePredicateRule());
                    						}
                    						set(
                    							current,
                    							"predicateVar",
                    							lv_predicateVar_8_0,
                    							"model.myzdsl.MyZDsl.Variables");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:499:3: ( ruleJJ ruleNNS ruleVBP ( (lv_vas_12_0= ruleVariables ) ) (otherlv_13= ',' ( (lv_vas_14_0= ruleVariables ) ) )* ( (lv_function_15_0= ruleFunctionList ) ) ( (lv_predicateVar_16_0= ruleVariables ) ) )
                    {
                    // InternalMyZDsl.g:499:3: ( ruleJJ ruleNNS ruleVBP ( (lv_vas_12_0= ruleVariables ) ) (otherlv_13= ',' ( (lv_vas_14_0= ruleVariables ) ) )* ( (lv_function_15_0= ruleFunctionList ) ) ( (lv_predicateVar_16_0= ruleVariables ) ) )
                    // InternalMyZDsl.g:500:4: ruleJJ ruleNNS ruleVBP ( (lv_vas_12_0= ruleVariables ) ) (otherlv_13= ',' ( (lv_vas_14_0= ruleVariables ) ) )* ( (lv_function_15_0= ruleFunctionList ) ) ( (lv_predicateVar_16_0= ruleVariables ) )
                    {

                    				newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getJJParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_9);
                    ruleJJ();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getNNSParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getVBPParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyZDsl.g:521:4: ( (lv_vas_12_0= ruleVariables ) )
                    // InternalMyZDsl.g:522:5: (lv_vas_12_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:522:5: (lv_vas_12_0= ruleVariables )
                    // InternalMyZDsl.g:523:6: lv_vas_12_0= ruleVariables
                    {

                    						newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getVasVariablesParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_vas_12_0=ruleVariables();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemStateSpacePredicateRule());
                    						}
                    						add(
                    							current,
                    							"vas",
                    							lv_vas_12_0,
                    							"model.myzdsl.MyZDsl.Variables");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyZDsl.g:540:4: (otherlv_13= ',' ( (lv_vas_14_0= ruleVariables ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==11) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyZDsl.g:541:5: otherlv_13= ',' ( (lv_vas_14_0= ruleVariables ) )
                    	    {
                    	    otherlv_13=(Token)match(input,11,FOLLOW_7); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSystemStateSpacePredicateAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalMyZDsl.g:545:5: ( (lv_vas_14_0= ruleVariables ) )
                    	    // InternalMyZDsl.g:546:6: (lv_vas_14_0= ruleVariables )
                    	    {
                    	    // InternalMyZDsl.g:546:6: (lv_vas_14_0= ruleVariables )
                    	    // InternalMyZDsl.g:547:7: lv_vas_14_0= ruleVariables
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getVasVariablesParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_vas_14_0=ruleVariables();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemStateSpacePredicateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"vas",
                    	    								lv_vas_14_0,
                    	    								"model.myzdsl.MyZDsl.Variables");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalMyZDsl.g:565:4: ( (lv_function_15_0= ruleFunctionList ) )
                    // InternalMyZDsl.g:566:5: (lv_function_15_0= ruleFunctionList )
                    {
                    // InternalMyZDsl.g:566:5: (lv_function_15_0= ruleFunctionList )
                    // InternalMyZDsl.g:567:6: lv_function_15_0= ruleFunctionList
                    {

                    						newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getFunctionFunctionListParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_function_15_0=ruleFunctionList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemStateSpacePredicateRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_15_0,
                    							"model.myzdsl.MyZDsl.FunctionList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyZDsl.g:584:4: ( (lv_predicateVar_16_0= ruleVariables ) )
                    // InternalMyZDsl.g:585:5: (lv_predicateVar_16_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:585:5: (lv_predicateVar_16_0= ruleVariables )
                    // InternalMyZDsl.g:586:6: lv_predicateVar_16_0= ruleVariables
                    {

                    						newCompositeNode(grammarAccess.getSystemStateSpacePredicateAccess().getPredicateVarVariablesParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_predicateVar_16_0=ruleVariables();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemStateSpacePredicateRule());
                    						}
                    						set(
                    							current,
                    							"predicateVar",
                    							lv_predicateVar_16_0,
                    							"model.myzdsl.MyZDsl.Variables");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemStateSpacePredicate"


    // $ANTLR start "entryRuleNN"
    // InternalMyZDsl.g:608:1: entryRuleNN returns [String current=null] : iv_ruleNN= ruleNN EOF ;
    public final String entryRuleNN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNN = null;


        try {
            // InternalMyZDsl.g:608:42: (iv_ruleNN= ruleNN EOF )
            // InternalMyZDsl.g:609:2: iv_ruleNN= ruleNN EOF
            {
             newCompositeNode(grammarAccess.getNNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNN=ruleNN();

            state._fsp--;

             current =iv_ruleNN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNN"


    // $ANTLR start "ruleNN"
    // InternalMyZDsl.g:615:1: ruleNN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'system' | kw= 'state' | kw= 'space' | kw= 'initial' | kw= 'predicate' | kw= 'variable' | kw= 'variables' | kw= 'schema' | kw= 'operation' | kw= 'function' | kw= 'input' | kw= 'output' | kw= 'name' ) ;
    public final AntlrDatatypeRuleToken ruleNN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:621:2: ( (kw= 'system' | kw= 'state' | kw= 'space' | kw= 'initial' | kw= 'predicate' | kw= 'variable' | kw= 'variables' | kw= 'schema' | kw= 'operation' | kw= 'function' | kw= 'input' | kw= 'output' | kw= 'name' ) )
            // InternalMyZDsl.g:622:2: (kw= 'system' | kw= 'state' | kw= 'space' | kw= 'initial' | kw= 'predicate' | kw= 'variable' | kw= 'variables' | kw= 'schema' | kw= 'operation' | kw= 'function' | kw= 'input' | kw= 'output' | kw= 'name' )
            {
            // InternalMyZDsl.g:622:2: (kw= 'system' | kw= 'state' | kw= 'space' | kw= 'initial' | kw= 'predicate' | kw= 'variable' | kw= 'variables' | kw= 'schema' | kw= 'operation' | kw= 'function' | kw= 'input' | kw= 'output' | kw= 'name' )
            int alt8=13;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            case 17:
                {
                alt8=6;
                }
                break;
            case 18:
                {
                alt8=7;
                }
                break;
            case 19:
                {
                alt8=8;
                }
                break;
            case 20:
                {
                alt8=9;
                }
                break;
            case 21:
                {
                alt8=10;
                }
                break;
            case 22:
                {
                alt8=11;
                }
                break;
            case 23:
                {
                alt8=12;
                }
                break;
            case 24:
                {
                alt8=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyZDsl.g:623:3: kw= 'system'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getSystemKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:629:3: kw= 'state'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getStateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyZDsl.g:635:3: kw= 'space'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getSpaceKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyZDsl.g:641:3: kw= 'initial'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getInitialKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyZDsl.g:647:3: kw= 'predicate'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getPredicateKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyZDsl.g:653:3: kw= 'variable'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getVariableKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyZDsl.g:659:3: kw= 'variables'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getVariablesKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyZDsl.g:665:3: kw= 'schema'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getSchemaKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyZDsl.g:671:3: kw= 'operation'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getOperationKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyZDsl.g:677:3: kw= 'function'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getFunctionKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyZDsl.g:683:3: kw= 'input'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getInputKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyZDsl.g:689:3: kw= 'output'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getOutputKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyZDsl.g:695:3: kw= 'name'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNAccess().getNameKeyword_12());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNN"


    // $ANTLR start "entryRuleVBZ"
    // InternalMyZDsl.g:704:1: entryRuleVBZ returns [String current=null] : iv_ruleVBZ= ruleVBZ EOF ;
    public final String entryRuleVBZ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVBZ = null;


        try {
            // InternalMyZDsl.g:704:43: (iv_ruleVBZ= ruleVBZ EOF )
            // InternalMyZDsl.g:705:2: iv_ruleVBZ= ruleVBZ EOF
            {
             newCompositeNode(grammarAccess.getVBZRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVBZ=ruleVBZ();

            state._fsp--;

             current =iv_ruleVBZ.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVBZ"


    // $ANTLR start "ruleVBZ"
    // InternalMyZDsl.g:711:1: ruleVBZ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'is' | kw= 'are' ) ;
    public final AntlrDatatypeRuleToken ruleVBZ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:717:2: ( (kw= 'is' | kw= 'are' ) )
            // InternalMyZDsl.g:718:2: (kw= 'is' | kw= 'are' )
            {
            // InternalMyZDsl.g:718:2: (kw= 'is' | kw= 'are' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyZDsl.g:719:3: kw= 'is'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVBZAccess().getIsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:725:3: kw= 'are'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVBZAccess().getAreKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVBZ"


    // $ANTLR start "entryRuleDT"
    // InternalMyZDsl.g:734:1: entryRuleDT returns [String current=null] : iv_ruleDT= ruleDT EOF ;
    public final String entryRuleDT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDT = null;


        try {
            // InternalMyZDsl.g:734:42: (iv_ruleDT= ruleDT EOF )
            // InternalMyZDsl.g:735:2: iv_ruleDT= ruleDT EOF
            {
             newCompositeNode(grammarAccess.getDTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDT=ruleDT();

            state._fsp--;

             current =iv_ruleDT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDT"


    // $ANTLR start "ruleDT"
    // InternalMyZDsl.g:741:1: ruleDT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'The' ;
    public final AntlrDatatypeRuleToken ruleDT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:747:2: (kw= 'The' )
            // InternalMyZDsl.g:748:2: kw= 'The'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDTAccess().getTheKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDT"


    // $ANTLR start "entryRuleNNS"
    // InternalMyZDsl.g:756:1: entryRuleNNS returns [String current=null] : iv_ruleNNS= ruleNNS EOF ;
    public final String entryRuleNNS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNNS = null;


        try {
            // InternalMyZDsl.g:756:43: (iv_ruleNNS= ruleNNS EOF )
            // InternalMyZDsl.g:757:2: iv_ruleNNS= ruleNNS EOF
            {
             newCompositeNode(grammarAccess.getNNSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNNS=ruleNNS();

            state._fsp--;

             current =iv_ruleNNS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNNS"


    // $ANTLR start "ruleNNS"
    // InternalMyZDsl.g:763:1: ruleNNS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'variables' | kw= 'parameters' | kw= 'features' | kw= 'variable' | kw= 'parameter' | kw= 'feature' ) ;
    public final AntlrDatatypeRuleToken ruleNNS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:769:2: ( (kw= 'variables' | kw= 'parameters' | kw= 'features' | kw= 'variable' | kw= 'parameter' | kw= 'feature' ) )
            // InternalMyZDsl.g:770:2: (kw= 'variables' | kw= 'parameters' | kw= 'features' | kw= 'variable' | kw= 'parameter' | kw= 'feature' )
            {
            // InternalMyZDsl.g:770:2: (kw= 'variables' | kw= 'parameters' | kw= 'features' | kw= 'variable' | kw= 'parameter' | kw= 'feature' )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            case 17:
                {
                alt10=4;
                }
                break;
            case 30:
                {
                alt10=5;
                }
                break;
            case 31:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyZDsl.g:771:3: kw= 'variables'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNSAccess().getVariablesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:777:3: kw= 'parameters'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNSAccess().getParametersKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyZDsl.g:783:3: kw= 'features'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNSAccess().getFeaturesKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyZDsl.g:789:3: kw= 'variable'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNSAccess().getVariableKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyZDsl.g:795:3: kw= 'parameter'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNSAccess().getParameterKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyZDsl.g:801:3: kw= 'feature'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNNSAccess().getFeatureKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNNS"


    // $ANTLR start "entryRuleVBP"
    // InternalMyZDsl.g:810:1: entryRuleVBP returns [String current=null] : iv_ruleVBP= ruleVBP EOF ;
    public final String entryRuleVBP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVBP = null;


        try {
            // InternalMyZDsl.g:810:43: (iv_ruleVBP= ruleVBP EOF )
            // InternalMyZDsl.g:811:2: iv_ruleVBP= ruleVBP EOF
            {
             newCompositeNode(grammarAccess.getVBPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVBP=ruleVBP();

            state._fsp--;

             current =iv_ruleVBP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVBP"


    // $ANTLR start "ruleVBP"
    // InternalMyZDsl.g:817:1: ruleVBP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'include' | kw= 'includes' | kw= 'is' | kw= 'are' ) ;
    public final AntlrDatatypeRuleToken ruleVBP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:823:2: ( (kw= 'include' | kw= 'includes' | kw= 'is' | kw= 'are' ) )
            // InternalMyZDsl.g:824:2: (kw= 'include' | kw= 'includes' | kw= 'is' | kw= 'are' )
            {
            // InternalMyZDsl.g:824:2: (kw= 'include' | kw= 'includes' | kw= 'is' | kw= 'are' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyZDsl.g:825:3: kw= 'include'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVBPAccess().getIncludeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:831:3: kw= 'includes'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVBPAccess().getIncludesKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyZDsl.g:837:3: kw= 'is'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVBPAccess().getIsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyZDsl.g:843:3: kw= 'are'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVBPAccess().getAreKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVBP"


    // $ANTLR start "entryRuleJJ"
    // InternalMyZDsl.g:852:1: entryRuleJJ returns [String current=null] : iv_ruleJJ= ruleJJ EOF ;
    public final String entryRuleJJ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJJ = null;


        try {
            // InternalMyZDsl.g:852:42: (iv_ruleJJ= ruleJJ EOF )
            // InternalMyZDsl.g:853:2: iv_ruleJJ= ruleJJ EOF
            {
             newCompositeNode(grammarAccess.getJJRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJJ=ruleJJ();

            state._fsp--;

             current =iv_ruleJJ.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJJ"


    // $ANTLR start "ruleJJ"
    // InternalMyZDsl.g:859:1: ruleJJ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'predicate' | kw= 'initial' | kw= 'postcondition' | kw= 'post condition' ) ;
    public final AntlrDatatypeRuleToken ruleJJ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:865:2: ( (kw= 'predicate' | kw= 'initial' | kw= 'postcondition' | kw= 'post condition' ) )
            // InternalMyZDsl.g:866:2: (kw= 'predicate' | kw= 'initial' | kw= 'postcondition' | kw= 'post condition' )
            {
            // InternalMyZDsl.g:866:2: (kw= 'predicate' | kw= 'initial' | kw= 'postcondition' | kw= 'post condition' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt12=1;
                }
                break;
            case 15:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            case 35:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyZDsl.g:867:3: kw= 'predicate'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJJAccess().getPredicateKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:873:3: kw= 'initial'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJJAccess().getInitialKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyZDsl.g:879:3: kw= 'postcondition'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJJAccess().getPostconditionKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyZDsl.g:885:3: kw= 'post condition'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJJAccess().getPostConditionKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJJ"


    // $ANTLR start "entryRuleInitialState"
    // InternalMyZDsl.g:894:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalMyZDsl.g:894:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalMyZDsl.g:895:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalMyZDsl.g:901:1: ruleInitialState returns [EObject current=null] : ( ruleJJ ruleNN ruleVBZ ( (lv_name_3_0= RULE_ID ) ) ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_variables_11_0= ruleVariables ) ) (otherlv_12= ',' ( (lv_variables_13_0= ruleVariables ) ) )* ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_pred_21_0= ruleVariables ) ) ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_12=null;
        EObject lv_variables_11_0 = null;

        EObject lv_variables_13_0 = null;

        EObject lv_pred_21_0 = null;



        	enterRule();

        try {
            // InternalMyZDsl.g:907:2: ( ( ruleJJ ruleNN ruleVBZ ( (lv_name_3_0= RULE_ID ) ) ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_variables_11_0= ruleVariables ) ) (otherlv_12= ',' ( (lv_variables_13_0= ruleVariables ) ) )* ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_pred_21_0= ruleVariables ) ) ) )
            // InternalMyZDsl.g:908:2: ( ruleJJ ruleNN ruleVBZ ( (lv_name_3_0= RULE_ID ) ) ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_variables_11_0= ruleVariables ) ) (otherlv_12= ',' ( (lv_variables_13_0= ruleVariables ) ) )* ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_pred_21_0= ruleVariables ) ) )
            {
            // InternalMyZDsl.g:908:2: ( ruleJJ ruleNN ruleVBZ ( (lv_name_3_0= RULE_ID ) ) ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_variables_11_0= ruleVariables ) ) (otherlv_12= ',' ( (lv_variables_13_0= ruleVariables ) ) )* ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_pred_21_0= ruleVariables ) ) )
            // InternalMyZDsl.g:909:3: ruleJJ ruleNN ruleVBZ ( (lv_name_3_0= RULE_ID ) ) ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_variables_11_0= ruleVariables ) ) (otherlv_12= ',' ( (lv_variables_13_0= ruleVariables ) ) )* ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) ) ( (lv_pred_21_0= ruleVariables ) )
            {

            			newCompositeNode(grammarAccess.getInitialStateAccess().getJJParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            ruleJJ();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getInitialStateAccess().getNNParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            ruleNN();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getInitialStateAccess().getVBZParserRuleCall_2());
            		
            pushFollow(FOLLOW_7);
            ruleVBZ();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyZDsl.g:930:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyZDsl.g:931:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyZDsl.g:931:4: (lv_name_3_0= RULE_ID )
            // InternalMyZDsl.g:932:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_3_0, grammarAccess.getInitialStateAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyZDsl.g:948:3: ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=15 && LA13_0<=16)||(LA13_0>=34 && LA13_0<=35)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyZDsl.g:949:4: ( ruleDT ruleJJ ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:949:4: ( ruleDT ruleJJ ruleNNS ruleVBP )
                    // InternalMyZDsl.g:950:5: ruleDT ruleJJ ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getDTParserRuleCall_4_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleDT();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getJJParserRuleCall_4_0_1());
                    				
                    pushFollow(FOLLOW_9);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getNNSParserRuleCall_4_0_2());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getVBPParserRuleCall_4_0_3());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:980:4: ( ruleJJ ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:980:4: ( ruleJJ ruleNNS ruleVBP )
                    // InternalMyZDsl.g:981:5: ruleJJ ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getJJParserRuleCall_4_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getNNSParserRuleCall_4_1_1());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getVBPParserRuleCall_4_1_2());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1004:3: ( (lv_variables_11_0= ruleVariables ) )
            // InternalMyZDsl.g:1005:4: (lv_variables_11_0= ruleVariables )
            {
            // InternalMyZDsl.g:1005:4: (lv_variables_11_0= ruleVariables )
            // InternalMyZDsl.g:1006:5: lv_variables_11_0= ruleVariables
            {

            					newCompositeNode(grammarAccess.getInitialStateAccess().getVariablesVariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_variables_11_0=ruleVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStateRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_11_0,
            						"model.myzdsl.MyZDsl.Variables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:1023:3: (otherlv_12= ',' ( (lv_variables_13_0= ruleVariables ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==11) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyZDsl.g:1024:4: otherlv_12= ',' ( (lv_variables_13_0= ruleVariables ) )
            	    {
            	    otherlv_12=(Token)match(input,11,FOLLOW_7); 

            	    				newLeafNode(otherlv_12, grammarAccess.getInitialStateAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyZDsl.g:1028:4: ( (lv_variables_13_0= ruleVariables ) )
            	    // InternalMyZDsl.g:1029:5: (lv_variables_13_0= ruleVariables )
            	    {
            	    // InternalMyZDsl.g:1029:5: (lv_variables_13_0= ruleVariables )
            	    // InternalMyZDsl.g:1030:6: lv_variables_13_0= ruleVariables
            	    {

            	    						newCompositeNode(grammarAccess.getInitialStateAccess().getVariablesVariablesParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_variables_13_0=ruleVariables();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInitialStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_13_0,
            	    							"model.myzdsl.MyZDsl.Variables");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalMyZDsl.g:1048:3: ( ( ruleDT ruleJJ ruleNNS ruleVBP ) | ( ruleJJ ruleNNS ruleVBP ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=15 && LA15_0<=16)||(LA15_0>=34 && LA15_0<=35)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyZDsl.g:1049:4: ( ruleDT ruleJJ ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:1049:4: ( ruleDT ruleJJ ruleNNS ruleVBP )
                    // InternalMyZDsl.g:1050:5: ruleDT ruleJJ ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getDTParserRuleCall_7_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleDT();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getJJParserRuleCall_7_0_1());
                    				
                    pushFollow(FOLLOW_9);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getNNSParserRuleCall_7_0_2());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getVBPParserRuleCall_7_0_3());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1080:4: ( ruleJJ ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:1080:4: ( ruleJJ ruleNNS ruleVBP )
                    // InternalMyZDsl.g:1081:5: ruleJJ ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getJJParserRuleCall_7_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getNNSParserRuleCall_7_1_1());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getInitialStateAccess().getVBPParserRuleCall_7_1_2());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1104:3: ( (lv_pred_21_0= ruleVariables ) )
            // InternalMyZDsl.g:1105:4: (lv_pred_21_0= ruleVariables )
            {
            // InternalMyZDsl.g:1105:4: (lv_pred_21_0= ruleVariables )
            // InternalMyZDsl.g:1106:5: lv_pred_21_0= ruleVariables
            {

            					newCompositeNode(grammarAccess.getInitialStateAccess().getPredVariablesParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_pred_21_0=ruleVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStateRule());
            					}
            					add(
            						current,
            						"pred",
            						lv_pred_21_0,
            						"model.myzdsl.MyZDsl.Variables");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleSchema"
    // InternalMyZDsl.g:1127:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalMyZDsl.g:1127:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalMyZDsl.g:1128:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalMyZDsl.g:1134:1: ruleSchema returns [EObject current=null] : ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ruleNN ruleNN ruleMD ) ( (lv_state_8_0= ruleSchemaState ) ) ( (lv_nameSchema_9_0= ruleEString ) ) ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsInput_17_0= ruleVariables ) ) (otherlv_18= ',' ( (lv_varsInput_19_0= ruleVariables ) ) )* ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsOutput_27_0= ruleVariables ) ) (otherlv_28= ',' ( (lv_varsOutput_29_0= ruleVariables ) ) )* ( (lv_predicates_30_0= rulePredicate ) ) ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Token otherlv_18=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_state_8_0 = null;

        AntlrDatatypeRuleToken lv_nameSchema_9_0 = null;

        EObject lv_varsInput_17_0 = null;

        EObject lv_varsInput_19_0 = null;

        EObject lv_varsOutput_27_0 = null;

        EObject lv_varsOutput_29_0 = null;

        EObject lv_predicates_30_0 = null;



        	enterRule();

        try {
            // InternalMyZDsl.g:1140:2: ( ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ruleNN ruleNN ruleMD ) ( (lv_state_8_0= ruleSchemaState ) ) ( (lv_nameSchema_9_0= ruleEString ) ) ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsInput_17_0= ruleVariables ) ) (otherlv_18= ',' ( (lv_varsInput_19_0= ruleVariables ) ) )* ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsOutput_27_0= ruleVariables ) ) (otherlv_28= ',' ( (lv_varsOutput_29_0= ruleVariables ) ) )* ( (lv_predicates_30_0= rulePredicate ) ) ) )
            // InternalMyZDsl.g:1141:2: ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ruleNN ruleNN ruleMD ) ( (lv_state_8_0= ruleSchemaState ) ) ( (lv_nameSchema_9_0= ruleEString ) ) ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsInput_17_0= ruleVariables ) ) (otherlv_18= ',' ( (lv_varsInput_19_0= ruleVariables ) ) )* ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsOutput_27_0= ruleVariables ) ) (otherlv_28= ',' ( (lv_varsOutput_29_0= ruleVariables ) ) )* ( (lv_predicates_30_0= rulePredicate ) ) )
            {
            // InternalMyZDsl.g:1141:2: ( ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ruleNN ruleNN ruleMD ) ( (lv_state_8_0= ruleSchemaState ) ) ( (lv_nameSchema_9_0= ruleEString ) ) ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsInput_17_0= ruleVariables ) ) (otherlv_18= ',' ( (lv_varsInput_19_0= ruleVariables ) ) )* ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsOutput_27_0= ruleVariables ) ) (otherlv_28= ',' ( (lv_varsOutput_29_0= ruleVariables ) ) )* ( (lv_predicates_30_0= rulePredicate ) ) )
            // InternalMyZDsl.g:1142:3: ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ruleNN ruleNN ruleMD ) ( (lv_state_8_0= ruleSchemaState ) ) ( (lv_nameSchema_9_0= ruleEString ) ) ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsInput_17_0= ruleVariables ) ) (otherlv_18= ',' ( (lv_varsInput_19_0= ruleVariables ) ) )* ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) ) ( (lv_varsOutput_27_0= ruleVariables ) ) (otherlv_28= ',' ( (lv_varsOutput_29_0= ruleVariables ) ) )* ( (lv_predicates_30_0= rulePredicate ) )
            {
            // InternalMyZDsl.g:1142:3: ( ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ruleNN ruleNN ruleMD )
            // InternalMyZDsl.g:1143:4: ruleNN ruleNN ruleNN ruleVBZ ( (lv_name_4_0= RULE_ID ) ) ruleNN ruleNN ruleMD
            {

            				newCompositeNode(grammarAccess.getSchemaAccess().getNNParserRuleCall_0_0());
            			
            pushFollow(FOLLOW_5);
            ruleNN();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            				newCompositeNode(grammarAccess.getSchemaAccess().getNNParserRuleCall_0_1());
            			
            pushFollow(FOLLOW_5);
            ruleNN();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            				newCompositeNode(grammarAccess.getSchemaAccess().getNNParserRuleCall_0_2());
            			
            pushFollow(FOLLOW_6);
            ruleNN();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            				newCompositeNode(grammarAccess.getSchemaAccess().getVBZParserRuleCall_0_3());
            			
            pushFollow(FOLLOW_7);
            ruleVBZ();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			
            // InternalMyZDsl.g:1171:4: ( (lv_name_4_0= RULE_ID ) )
            // InternalMyZDsl.g:1172:5: (lv_name_4_0= RULE_ID )
            {
            // InternalMyZDsl.g:1172:5: (lv_name_4_0= RULE_ID )
            // InternalMyZDsl.g:1173:6: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            						newLeafNode(lv_name_4_0, grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_0_4_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getSchemaRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_4_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }


            				newCompositeNode(grammarAccess.getSchemaAccess().getNNParserRuleCall_0_5());
            			
            pushFollow(FOLLOW_5);
            ruleNN();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            				newCompositeNode(grammarAccess.getSchemaAccess().getNNParserRuleCall_0_6());
            			
            pushFollow(FOLLOW_14);
            ruleNN();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            				newCompositeNode(grammarAccess.getSchemaAccess().getMDParserRuleCall_0_7());
            			
            pushFollow(FOLLOW_15);
            ruleMD();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }

            // InternalMyZDsl.g:1211:3: ( (lv_state_8_0= ruleSchemaState ) )
            // InternalMyZDsl.g:1212:4: (lv_state_8_0= ruleSchemaState )
            {
            // InternalMyZDsl.g:1212:4: (lv_state_8_0= ruleSchemaState )
            // InternalMyZDsl.g:1213:5: lv_state_8_0= ruleSchemaState
            {

            					newCompositeNode(grammarAccess.getSchemaAccess().getStateSchemaStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_state_8_0=ruleSchemaState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_8_0,
            						"model.myzdsl.MyZDsl.SchemaState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:1230:3: ( (lv_nameSchema_9_0= ruleEString ) )
            // InternalMyZDsl.g:1231:4: (lv_nameSchema_9_0= ruleEString )
            {
            // InternalMyZDsl.g:1231:4: (lv_nameSchema_9_0= ruleEString )
            // InternalMyZDsl.g:1232:5: lv_nameSchema_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSchemaAccess().getNameSchemaEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_nameSchema_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaRule());
            					}
            					set(
            						current,
            						"nameSchema",
            						lv_nameSchema_9_0,
            						"model.myzdsl.MyZDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:1249:3: ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=12 && LA16_0<=24)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyZDsl.g:1250:4: ( ruleDT ruleNN ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:1250:4: ( ruleDT ruleNN ruleNNS ruleVBP )
                    // InternalMyZDsl.g:1251:5: ruleDT ruleNN ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getSchemaAccess().getDTParserRuleCall_3_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    ruleDT();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getNNParserRuleCall_3_0_1());
                    				
                    pushFollow(FOLLOW_9);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getNNSParserRuleCall_3_0_2());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getVBPParserRuleCall_3_0_3());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1281:4: ( ruleNN ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:1281:4: ( ruleNN ruleNNS ruleVBP )
                    // InternalMyZDsl.g:1282:5: ruleNN ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getSchemaAccess().getNNParserRuleCall_3_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getNNSParserRuleCall_3_1_1());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getVBPParserRuleCall_3_1_2());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1305:3: ( (lv_varsInput_17_0= ruleVariables ) )
            // InternalMyZDsl.g:1306:4: (lv_varsInput_17_0= ruleVariables )
            {
            // InternalMyZDsl.g:1306:4: (lv_varsInput_17_0= ruleVariables )
            // InternalMyZDsl.g:1307:5: lv_varsInput_17_0= ruleVariables
            {

            					newCompositeNode(grammarAccess.getSchemaAccess().getVarsInputVariablesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_varsInput_17_0=ruleVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaRule());
            					}
            					add(
            						current,
            						"varsInput",
            						lv_varsInput_17_0,
            						"model.myzdsl.MyZDsl.Variables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:1324:3: (otherlv_18= ',' ( (lv_varsInput_19_0= ruleVariables ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==11) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyZDsl.g:1325:4: otherlv_18= ',' ( (lv_varsInput_19_0= ruleVariables ) )
            	    {
            	    otherlv_18=(Token)match(input,11,FOLLOW_7); 

            	    				newLeafNode(otherlv_18, grammarAccess.getSchemaAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyZDsl.g:1329:4: ( (lv_varsInput_19_0= ruleVariables ) )
            	    // InternalMyZDsl.g:1330:5: (lv_varsInput_19_0= ruleVariables )
            	    {
            	    // InternalMyZDsl.g:1330:5: (lv_varsInput_19_0= ruleVariables )
            	    // InternalMyZDsl.g:1331:6: lv_varsInput_19_0= ruleVariables
            	    {

            	    						newCompositeNode(grammarAccess.getSchemaAccess().getVarsInputVariablesParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_varsInput_19_0=ruleVariables();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varsInput",
            	    							lv_varsInput_19_0,
            	    							"model.myzdsl.MyZDsl.Variables");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalMyZDsl.g:1349:3: ( ( ruleDT ruleNN ruleNNS ruleVBP ) | ( ruleNN ruleNNS ruleVBP ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=12 && LA18_0<=24)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyZDsl.g:1350:4: ( ruleDT ruleNN ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:1350:4: ( ruleDT ruleNN ruleNNS ruleVBP )
                    // InternalMyZDsl.g:1351:5: ruleDT ruleNN ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getSchemaAccess().getDTParserRuleCall_6_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    ruleDT();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getNNParserRuleCall_6_0_1());
                    				
                    pushFollow(FOLLOW_9);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getNNSParserRuleCall_6_0_2());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getVBPParserRuleCall_6_0_3());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1381:4: ( ruleNN ruleNNS ruleVBP )
                    {
                    // InternalMyZDsl.g:1381:4: ( ruleNN ruleNNS ruleVBP )
                    // InternalMyZDsl.g:1382:5: ruleNN ruleNNS ruleVBP
                    {

                    					newCompositeNode(grammarAccess.getSchemaAccess().getNNParserRuleCall_6_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getNNSParserRuleCall_6_1_1());
                    				
                    pushFollow(FOLLOW_10);
                    ruleNNS();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getSchemaAccess().getVBPParserRuleCall_6_1_2());
                    				
                    pushFollow(FOLLOW_7);
                    ruleVBP();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1405:3: ( (lv_varsOutput_27_0= ruleVariables ) )
            // InternalMyZDsl.g:1406:4: (lv_varsOutput_27_0= ruleVariables )
            {
            // InternalMyZDsl.g:1406:4: (lv_varsOutput_27_0= ruleVariables )
            // InternalMyZDsl.g:1407:5: lv_varsOutput_27_0= ruleVariables
            {

            					newCompositeNode(grammarAccess.getSchemaAccess().getVarsOutputVariablesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_19);
            lv_varsOutput_27_0=ruleVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaRule());
            					}
            					add(
            						current,
            						"varsOutput",
            						lv_varsOutput_27_0,
            						"model.myzdsl.MyZDsl.Variables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:1424:3: (otherlv_28= ',' ( (lv_varsOutput_29_0= ruleVariables ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==11) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyZDsl.g:1425:4: otherlv_28= ',' ( (lv_varsOutput_29_0= ruleVariables ) )
            	    {
            	    otherlv_28=(Token)match(input,11,FOLLOW_7); 

            	    				newLeafNode(otherlv_28, grammarAccess.getSchemaAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMyZDsl.g:1429:4: ( (lv_varsOutput_29_0= ruleVariables ) )
            	    // InternalMyZDsl.g:1430:5: (lv_varsOutput_29_0= ruleVariables )
            	    {
            	    // InternalMyZDsl.g:1430:5: (lv_varsOutput_29_0= ruleVariables )
            	    // InternalMyZDsl.g:1431:6: lv_varsOutput_29_0= ruleVariables
            	    {

            	    						newCompositeNode(grammarAccess.getSchemaAccess().getVarsOutputVariablesParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_varsOutput_29_0=ruleVariables();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varsOutput",
            	    							lv_varsOutput_29_0,
            	    							"model.myzdsl.MyZDsl.Variables");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalMyZDsl.g:1449:3: ( (lv_predicates_30_0= rulePredicate ) )
            // InternalMyZDsl.g:1450:4: (lv_predicates_30_0= rulePredicate )
            {
            // InternalMyZDsl.g:1450:4: (lv_predicates_30_0= rulePredicate )
            // InternalMyZDsl.g:1451:5: lv_predicates_30_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getSchemaAccess().getPredicatesPredicateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicates_30_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSchemaRule());
            					}
            					add(
            						current,
            						"predicates",
            						lv_predicates_30_0,
            						"model.myzdsl.MyZDsl.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleMD"
    // InternalMyZDsl.g:1472:1: entryRuleMD returns [String current=null] : iv_ruleMD= ruleMD EOF ;
    public final String entryRuleMD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMD = null;


        try {
            // InternalMyZDsl.g:1472:42: (iv_ruleMD= ruleMD EOF )
            // InternalMyZDsl.g:1473:2: iv_ruleMD= ruleMD EOF
            {
             newCompositeNode(grammarAccess.getMDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMD=ruleMD();

            state._fsp--;

             current =iv_ruleMD.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMD"


    // $ANTLR start "ruleMD"
    // InternalMyZDsl.g:1479:1: ruleMD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'will' | kw= 'are' ) ;
    public final AntlrDatatypeRuleToken ruleMD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:1485:2: ( (kw= 'will' | kw= 'are' ) )
            // InternalMyZDsl.g:1486:2: (kw= 'will' | kw= 'are' )
            {
            // InternalMyZDsl.g:1486:2: (kw= 'will' | kw= 'are' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            else if ( (LA20_0==26) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyZDsl.g:1487:3: kw= 'will'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMDAccess().getWillKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1493:3: kw= 'are'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMDAccess().getAreKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMD"


    // $ANTLR start "entryRuleVBG"
    // InternalMyZDsl.g:1502:1: entryRuleVBG returns [String current=null] : iv_ruleVBG= ruleVBG EOF ;
    public final String entryRuleVBG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVBG = null;


        try {
            // InternalMyZDsl.g:1502:43: (iv_ruleVBG= ruleVBG EOF )
            // InternalMyZDsl.g:1503:2: iv_ruleVBG= ruleVBG EOF
            {
             newCompositeNode(grammarAccess.getVBGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVBG=ruleVBG();

            state._fsp--;

             current =iv_ruleVBG.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVBG"


    // $ANTLR start "ruleVBG"
    // InternalMyZDsl.g:1509:1: ruleVBG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'changing' | kw= 'change' ) ;
    public final AntlrDatatypeRuleToken ruleVBG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:1515:2: ( (kw= 'changing' | kw= 'change' ) )
            // InternalMyZDsl.g:1516:2: (kw= 'changing' | kw= 'change' )
            {
            // InternalMyZDsl.g:1516:2: (kw= 'changing' | kw= 'change' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyZDsl.g:1517:3: kw= 'changing'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVBGAccess().getChangingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1523:3: kw= 'change'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVBGAccess().getChangeKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVBG"


    // $ANTLR start "entryRulePredicate"
    // InternalMyZDsl.g:1532:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalMyZDsl.g:1532:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalMyZDsl.g:1533:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalMyZDsl.g:1539:1: rulePredicate returns [EObject current=null] : ( ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasInput_9_0= ruleVariables ) )? ( (lv_belongs_10_0= ruleBelongsState ) )? ( (lv_belongsVariable_11_0= ruleVariables ) )? ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasOutput_21_0= rulePredicatePostCondition2 ) )? ( ( ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) | ( ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) )? ( (lv_vasStateChange_35_0= rulePredicatePostCondition1 ) )? ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject lv_vasInput_9_0 = null;

        AntlrDatatypeRuleToken lv_belongs_10_0 = null;

        EObject lv_belongsVariable_11_0 = null;

        EObject lv_vasOutput_21_0 = null;

        EObject lv_vasStateChange_35_0 = null;



        	enterRule();

        try {
            // InternalMyZDsl.g:1545:2: ( ( ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasInput_9_0= ruleVariables ) )? ( (lv_belongs_10_0= ruleBelongsState ) )? ( (lv_belongsVariable_11_0= ruleVariables ) )? ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasOutput_21_0= rulePredicatePostCondition2 ) )? ( ( ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) | ( ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) )? ( (lv_vasStateChange_35_0= rulePredicatePostCondition1 ) )? ) )
            // InternalMyZDsl.g:1546:2: ( ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasInput_9_0= ruleVariables ) )? ( (lv_belongs_10_0= ruleBelongsState ) )? ( (lv_belongsVariable_11_0= ruleVariables ) )? ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasOutput_21_0= rulePredicatePostCondition2 ) )? ( ( ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) | ( ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) )? ( (lv_vasStateChange_35_0= rulePredicatePostCondition1 ) )? )
            {
            // InternalMyZDsl.g:1546:2: ( ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasInput_9_0= ruleVariables ) )? ( (lv_belongs_10_0= ruleBelongsState ) )? ( (lv_belongsVariable_11_0= ruleVariables ) )? ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasOutput_21_0= rulePredicatePostCondition2 ) )? ( ( ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) | ( ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) )? ( (lv_vasStateChange_35_0= rulePredicatePostCondition1 ) )? )
            // InternalMyZDsl.g:1547:3: ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasInput_9_0= ruleVariables ) )? ( (lv_belongs_10_0= ruleBelongsState ) )? ( (lv_belongsVariable_11_0= ruleVariables ) )? ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )? ( (lv_vasOutput_21_0= rulePredicatePostCondition2 ) )? ( ( ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) | ( ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) )? ( (lv_vasStateChange_35_0= rulePredicatePostCondition1 ) )?
            {
            // InternalMyZDsl.g:1547:3: ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )?
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalMyZDsl.g:1548:4: ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ )
                    {
                    // InternalMyZDsl.g:1548:4: ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ )
                    // InternalMyZDsl.g:1549:5: ruleDT ruleJJ ruleNN ruleNN ruleVBZ
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getDTParserRuleCall_0_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleDT();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getJJParserRuleCall_0_0_1());
                    				
                    pushFollow(FOLLOW_5);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_0_0_2());
                    				
                    pushFollow(FOLLOW_5);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_0_0_3());
                    				
                    pushFollow(FOLLOW_6);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVBZParserRuleCall_0_0_4());
                    				
                    pushFollow(FOLLOW_20);
                    ruleVBZ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1586:4: ( ruleJJ ruleNN ruleNN ruleVBZ )
                    {
                    // InternalMyZDsl.g:1586:4: ( ruleJJ ruleNN ruleNN ruleVBZ )
                    // InternalMyZDsl.g:1587:5: ruleJJ ruleNN ruleNN ruleVBZ
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getJJParserRuleCall_0_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_0_1_1());
                    				
                    pushFollow(FOLLOW_5);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_0_1_2());
                    				
                    pushFollow(FOLLOW_6);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVBZParserRuleCall_0_1_3());
                    				
                    pushFollow(FOLLOW_20);
                    ruleVBZ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1617:3: ( (lv_vasInput_9_0= ruleVariables ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyZDsl.g:1618:4: (lv_vasInput_9_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:1618:4: (lv_vasInput_9_0= ruleVariables )
                    // InternalMyZDsl.g:1619:5: lv_vasInput_9_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVasInputVariablesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_vasInput_9_0=ruleVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicateRule());
                    					}
                    					add(
                    						current,
                    						"vasInput",
                    						lv_vasInput_9_0,
                    						"model.myzdsl.MyZDsl.Variables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1636:3: ( (lv_belongs_10_0= ruleBelongsState ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=41 && LA24_0<=42)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyZDsl.g:1637:4: (lv_belongs_10_0= ruleBelongsState )
                    {
                    // InternalMyZDsl.g:1637:4: (lv_belongs_10_0= ruleBelongsState )
                    // InternalMyZDsl.g:1638:5: lv_belongs_10_0= ruleBelongsState
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getBelongsBelongsStateParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_belongs_10_0=ruleBelongsState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicateRule());
                    					}
                    					set(
                    						current,
                    						"belongs",
                    						lv_belongs_10_0,
                    						"model.myzdsl.MyZDsl.BelongsState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1655:3: ( (lv_belongsVariable_11_0= ruleVariables ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyZDsl.g:1656:4: (lv_belongsVariable_11_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:1656:4: (lv_belongsVariable_11_0= ruleVariables )
                    // InternalMyZDsl.g:1657:5: lv_belongsVariable_11_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getBelongsVariableVariablesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_belongsVariable_11_0=ruleVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicateRule());
                    					}
                    					set(
                    						current,
                    						"belongsVariable",
                    						lv_belongsVariable_11_0,
                    						"model.myzdsl.MyZDsl.Variables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1674:3: ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )?
            int alt26=3;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalMyZDsl.g:1675:4: ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ )
                    {
                    // InternalMyZDsl.g:1675:4: ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ )
                    // InternalMyZDsl.g:1676:5: ruleDT ruleJJ ruleNN ruleNN ruleVBZ
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getDTParserRuleCall_4_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleDT();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getJJParserRuleCall_4_0_1());
                    				
                    pushFollow(FOLLOW_5);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_4_0_2());
                    				
                    pushFollow(FOLLOW_5);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_4_0_3());
                    				
                    pushFollow(FOLLOW_6);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVBZParserRuleCall_4_0_4());
                    				
                    pushFollow(FOLLOW_21);
                    ruleVBZ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1713:4: ( ruleJJ ruleNN ruleNN ruleVBZ )
                    {
                    // InternalMyZDsl.g:1713:4: ( ruleJJ ruleNN ruleNN ruleVBZ )
                    // InternalMyZDsl.g:1714:5: ruleJJ ruleNN ruleNN ruleVBZ
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getJJParserRuleCall_4_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_4_1_1());
                    				
                    pushFollow(FOLLOW_5);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_4_1_2());
                    				
                    pushFollow(FOLLOW_6);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVBZParserRuleCall_4_1_3());
                    				
                    pushFollow(FOLLOW_21);
                    ruleVBZ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1744:3: ( (lv_vasOutput_21_0= rulePredicatePostCondition2 ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||(LA27_0>=48 && LA27_0<=49)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyZDsl.g:1745:4: (lv_vasOutput_21_0= rulePredicatePostCondition2 )
                    {
                    // InternalMyZDsl.g:1745:4: (lv_vasOutput_21_0= rulePredicatePostCondition2 )
                    // InternalMyZDsl.g:1746:5: lv_vasOutput_21_0= rulePredicatePostCondition2
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVasOutputPredicatePostCondition2ParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_vasOutput_21_0=rulePredicatePostCondition2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicateRule());
                    					}
                    					add(
                    						current,
                    						"vasOutput",
                    						lv_vasOutput_21_0,
                    						"model.myzdsl.MyZDsl.PredicatePostCondition2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1763:3: ( ( ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) | ( ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) )?
            int alt28=4;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalMyZDsl.g:1764:4: ( ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ )
                    {
                    // InternalMyZDsl.g:1764:4: ( ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ )
                    // InternalMyZDsl.g:1765:5: ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getDTParserRuleCall_6_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleDT();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getJJParserRuleCall_6_0_1());
                    				
                    pushFollow(FOLLOW_5);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_6_0_2());
                    				
                    pushFollow(FOLLOW_23);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVBGParserRuleCall_6_0_3());
                    				
                    pushFollow(FOLLOW_5);
                    ruleVBG();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_6_0_4());
                    				
                    pushFollow(FOLLOW_6);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVBZParserRuleCall_6_0_5());
                    				
                    pushFollow(FOLLOW_24);
                    ruleVBZ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1809:4: ( ruleNN ruleVBZ )
                    {
                    // InternalMyZDsl.g:1809:4: ( ruleNN ruleVBZ )
                    // InternalMyZDsl.g:1810:5: ruleNN ruleVBZ
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_6_1_0());
                    				
                    pushFollow(FOLLOW_6);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVBZParserRuleCall_6_1_1());
                    				
                    pushFollow(FOLLOW_24);
                    ruleVBZ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalMyZDsl.g:1826:4: ( ruleJJ ruleNN ruleVBG ruleNN ruleVBZ )
                    {
                    // InternalMyZDsl.g:1826:4: ( ruleJJ ruleNN ruleVBG ruleNN ruleVBZ )
                    // InternalMyZDsl.g:1827:5: ruleJJ ruleNN ruleVBG ruleNN ruleVBZ
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getJJParserRuleCall_6_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    ruleJJ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_6_2_1());
                    				
                    pushFollow(FOLLOW_23);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVBGParserRuleCall_6_2_2());
                    				
                    pushFollow(FOLLOW_5);
                    ruleVBG();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getNNParserRuleCall_6_2_3());
                    				
                    pushFollow(FOLLOW_6);
                    ruleNN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVBZParserRuleCall_6_2_4());
                    				
                    pushFollow(FOLLOW_24);
                    ruleVBZ();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:1864:3: ( (lv_vasStateChange_35_0= rulePredicatePostCondition1 ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||(LA29_0>=45 && LA29_0<=47)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyZDsl.g:1865:4: (lv_vasStateChange_35_0= rulePredicatePostCondition1 )
                    {
                    // InternalMyZDsl.g:1865:4: (lv_vasStateChange_35_0= rulePredicatePostCondition1 )
                    // InternalMyZDsl.g:1866:5: lv_vasStateChange_35_0= rulePredicatePostCondition1
                    {

                    					newCompositeNode(grammarAccess.getPredicateAccess().getVasStateChangePredicatePostCondition1ParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_vasStateChange_35_0=rulePredicatePostCondition1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicateRule());
                    					}
                    					add(
                    						current,
                    						"vasStateChange",
                    						lv_vasStateChange_35_0,
                    						"model.myzdsl.MyZDsl.PredicatePostCondition1");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleSchemaState"
    // InternalMyZDsl.g:1887:1: entryRuleSchemaState returns [String current=null] : iv_ruleSchemaState= ruleSchemaState EOF ;
    public final String entryRuleSchemaState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSchemaState = null;


        try {
            // InternalMyZDsl.g:1887:51: (iv_ruleSchemaState= ruleSchemaState EOF )
            // InternalMyZDsl.g:1888:2: iv_ruleSchemaState= ruleSchemaState EOF
            {
             newCompositeNode(grammarAccess.getSchemaStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchemaState=ruleSchemaState();

            state._fsp--;

             current =iv_ruleSchemaState.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaState"


    // $ANTLR start "ruleSchemaState"
    // InternalMyZDsl.g:1894:1: ruleSchemaState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CHANGE' | kw= 'NOT CHANGE' ) ;
    public final AntlrDatatypeRuleToken ruleSchemaState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:1900:2: ( (kw= 'CHANGE' | kw= 'NOT CHANGE' ) )
            // InternalMyZDsl.g:1901:2: (kw= 'CHANGE' | kw= 'NOT CHANGE' )
            {
            // InternalMyZDsl.g:1901:2: (kw= 'CHANGE' | kw= 'NOT CHANGE' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            else if ( (LA30_0==40) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyZDsl.g:1902:3: kw= 'CHANGE'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSchemaStateAccess().getCHANGEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1908:3: kw= 'NOT CHANGE'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSchemaStateAccess().getNOTCHANGEKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaState"


    // $ANTLR start "entryRuleVariables"
    // InternalMyZDsl.g:1917:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalMyZDsl.g:1917:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalMyZDsl.g:1918:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalMyZDsl.g:1924:1: ruleVariables returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:1930:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyZDsl.g:1931:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyZDsl.g:1931:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyZDsl.g:1932:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyZDsl.g:1932:3: (lv_name_0_0= RULE_ID )
            // InternalMyZDsl.g:1933:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariablesAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariablesRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleEString"
    // InternalMyZDsl.g:1952:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyZDsl.g:1952:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyZDsl.g:1953:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyZDsl.g:1959:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:1965:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyZDsl.g:1966:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyZDsl.g:1966:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyZDsl.g:1967:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:1975:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBelongsState"
    // InternalMyZDsl.g:1986:1: entryRuleBelongsState returns [String current=null] : iv_ruleBelongsState= ruleBelongsState EOF ;
    public final String entryRuleBelongsState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBelongsState = null;


        try {
            // InternalMyZDsl.g:1986:52: (iv_ruleBelongsState= ruleBelongsState EOF )
            // InternalMyZDsl.g:1987:2: iv_ruleBelongsState= ruleBelongsState EOF
            {
             newCompositeNode(grammarAccess.getBelongsStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBelongsState=ruleBelongsState();

            state._fsp--;

             current =iv_ruleBelongsState.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBelongsState"


    // $ANTLR start "ruleBelongsState"
    // InternalMyZDsl.g:1993:1: ruleBelongsState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BELONGS TO' | kw= 'DOES NOT BELONG TO' ) ;
    public final AntlrDatatypeRuleToken ruleBelongsState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:1999:2: ( (kw= 'BELONGS TO' | kw= 'DOES NOT BELONG TO' ) )
            // InternalMyZDsl.g:2000:2: (kw= 'BELONGS TO' | kw= 'DOES NOT BELONG TO' )
            {
            // InternalMyZDsl.g:2000:2: (kw= 'BELONGS TO' | kw= 'DOES NOT BELONG TO' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            else if ( (LA32_0==42) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyZDsl.g:2001:3: kw= 'BELONGS TO'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBelongsStateAccess().getBELONGSTOKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:2007:3: kw= 'DOES NOT BELONG TO'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBelongsStateAccess().getDOESNOTBELONGTOKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBelongsState"


    // $ANTLR start "entryRuleFunctionList"
    // InternalMyZDsl.g:2016:1: entryRuleFunctionList returns [String current=null] : iv_ruleFunctionList= ruleFunctionList EOF ;
    public final String entryRuleFunctionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionList = null;


        try {
            // InternalMyZDsl.g:2016:52: (iv_ruleFunctionList= ruleFunctionList EOF )
            // InternalMyZDsl.g:2017:2: iv_ruleFunctionList= ruleFunctionList EOF
            {
             newCompositeNode(grammarAccess.getFunctionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionList=ruleFunctionList();

            state._fsp--;

             current =iv_ruleFunctionList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionList"


    // $ANTLR start "ruleFunctionList"
    // InternalMyZDsl.g:2023:1: ruleFunctionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'dom' | kw= 'range' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyZDsl.g:2029:2: ( (kw= 'dom' | kw= 'range' ) )
            // InternalMyZDsl.g:2030:2: (kw= 'dom' | kw= 'range' )
            {
            // InternalMyZDsl.g:2030:2: (kw= 'dom' | kw= 'range' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            else if ( (LA33_0==44) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyZDsl.g:2031:3: kw= 'dom'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionListAccess().getDomKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyZDsl.g:2037:3: kw= 'range'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionListAccess().getRangeKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionList"


    // $ANTLR start "entryRulePredicatePostCondition1"
    // InternalMyZDsl.g:2046:1: entryRulePredicatePostCondition1 returns [EObject current=null] : iv_rulePredicatePostCondition1= rulePredicatePostCondition1 EOF ;
    public final EObject entryRulePredicatePostCondition1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatePostCondition1 = null;


        try {
            // InternalMyZDsl.g:2046:64: (iv_rulePredicatePostCondition1= rulePredicatePostCondition1 EOF )
            // InternalMyZDsl.g:2047:2: iv_rulePredicatePostCondition1= rulePredicatePostCondition1 EOF
            {
             newCompositeNode(grammarAccess.getPredicatePostCondition1Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicatePostCondition1=rulePredicatePostCondition1();

            state._fsp--;

             current =iv_rulePredicatePostCondition1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicatePostCondition1"


    // $ANTLR start "rulePredicatePostCondition1"
    // InternalMyZDsl.g:2053:1: rulePredicatePostCondition1 returns [EObject current=null] : ( ( (lv_condition11_0_0= ruleVariables ) )? (otherlv_1= 'with' )? (otherlv_2= 'new' )? ( (lv_condition12_3_0= ruleVariables ) )? (otherlv_4= 'and ' )? ( (lv_condition13_5_0= ruleVariables ) ) (otherlv_6= ',' ( (lv_condition13_7_0= ruleVariables ) ) )? ) ;
    public final EObject rulePredicatePostCondition1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition11_0_0 = null;

        EObject lv_condition12_3_0 = null;

        EObject lv_condition13_5_0 = null;

        EObject lv_condition13_7_0 = null;



        	enterRule();

        try {
            // InternalMyZDsl.g:2059:2: ( ( ( (lv_condition11_0_0= ruleVariables ) )? (otherlv_1= 'with' )? (otherlv_2= 'new' )? ( (lv_condition12_3_0= ruleVariables ) )? (otherlv_4= 'and ' )? ( (lv_condition13_5_0= ruleVariables ) ) (otherlv_6= ',' ( (lv_condition13_7_0= ruleVariables ) ) )? ) )
            // InternalMyZDsl.g:2060:2: ( ( (lv_condition11_0_0= ruleVariables ) )? (otherlv_1= 'with' )? (otherlv_2= 'new' )? ( (lv_condition12_3_0= ruleVariables ) )? (otherlv_4= 'and ' )? ( (lv_condition13_5_0= ruleVariables ) ) (otherlv_6= ',' ( (lv_condition13_7_0= ruleVariables ) ) )? )
            {
            // InternalMyZDsl.g:2060:2: ( ( (lv_condition11_0_0= ruleVariables ) )? (otherlv_1= 'with' )? (otherlv_2= 'new' )? ( (lv_condition12_3_0= ruleVariables ) )? (otherlv_4= 'and ' )? ( (lv_condition13_5_0= ruleVariables ) ) (otherlv_6= ',' ( (lv_condition13_7_0= ruleVariables ) ) )? )
            // InternalMyZDsl.g:2061:3: ( (lv_condition11_0_0= ruleVariables ) )? (otherlv_1= 'with' )? (otherlv_2= 'new' )? ( (lv_condition12_3_0= ruleVariables ) )? (otherlv_4= 'and ' )? ( (lv_condition13_5_0= ruleVariables ) ) (otherlv_6= ',' ( (lv_condition13_7_0= ruleVariables ) ) )?
            {
            // InternalMyZDsl.g:2061:3: ( (lv_condition11_0_0= ruleVariables ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyZDsl.g:2062:4: (lv_condition11_0_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:2062:4: (lv_condition11_0_0= ruleVariables )
                    // InternalMyZDsl.g:2063:5: lv_condition11_0_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getPredicatePostCondition1Access().getCondition11VariablesParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_condition11_0_0=ruleVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicatePostCondition1Rule());
                    					}
                    					set(
                    						current,
                    						"condition11",
                    						lv_condition11_0_0,
                    						"model.myzdsl.MyZDsl.Variables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:2080:3: (otherlv_1= 'with' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyZDsl.g:2081:4: otherlv_1= 'with'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getPredicatePostCondition1Access().getWithKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyZDsl.g:2086:3: (otherlv_2= 'new' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyZDsl.g:2087:4: otherlv_2= 'new'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredicatePostCondition1Access().getNewKeyword_2());
                    			

                    }
                    break;

            }

            // InternalMyZDsl.g:2092:3: ( (lv_condition12_3_0= ruleVariables ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_ID||LA37_1==47) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalMyZDsl.g:2093:4: (lv_condition12_3_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:2093:4: (lv_condition12_3_0= ruleVariables )
                    // InternalMyZDsl.g:2094:5: lv_condition12_3_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getPredicatePostCondition1Access().getCondition12VariablesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_condition12_3_0=ruleVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicatePostCondition1Rule());
                    					}
                    					set(
                    						current,
                    						"condition12",
                    						lv_condition12_3_0,
                    						"model.myzdsl.MyZDsl.Variables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:2111:3: (otherlv_4= 'and ' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyZDsl.g:2112:4: otherlv_4= 'and '
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getPredicatePostCondition1Access().getAndKeyword_4());
                    			

                    }
                    break;

            }

            // InternalMyZDsl.g:2117:3: ( (lv_condition13_5_0= ruleVariables ) )
            // InternalMyZDsl.g:2118:4: (lv_condition13_5_0= ruleVariables )
            {
            // InternalMyZDsl.g:2118:4: (lv_condition13_5_0= ruleVariables )
            // InternalMyZDsl.g:2119:5: lv_condition13_5_0= ruleVariables
            {

            					newCompositeNode(grammarAccess.getPredicatePostCondition1Access().getCondition13VariablesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_condition13_5_0=ruleVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicatePostCondition1Rule());
            					}
            					set(
            						current,
            						"condition13",
            						lv_condition13_5_0,
            						"model.myzdsl.MyZDsl.Variables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:2136:3: (otherlv_6= ',' ( (lv_condition13_7_0= ruleVariables ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==11) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyZDsl.g:2137:4: otherlv_6= ',' ( (lv_condition13_7_0= ruleVariables ) )
                    {
                    otherlv_6=(Token)match(input,11,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getPredicatePostCondition1Access().getCommaKeyword_6_0());
                    			
                    // InternalMyZDsl.g:2141:4: ( (lv_condition13_7_0= ruleVariables ) )
                    // InternalMyZDsl.g:2142:5: (lv_condition13_7_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:2142:5: (lv_condition13_7_0= ruleVariables )
                    // InternalMyZDsl.g:2143:6: lv_condition13_7_0= ruleVariables
                    {

                    						newCompositeNode(grammarAccess.getPredicatePostCondition1Access().getCondition13VariablesParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition13_7_0=ruleVariables();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredicatePostCondition1Rule());
                    						}
                    						set(
                    							current,
                    							"condition13",
                    							lv_condition13_7_0,
                    							"model.myzdsl.MyZDsl.Variables");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicatePostCondition1"


    // $ANTLR start "entryRulePredicatePostCondition2"
    // InternalMyZDsl.g:2165:1: entryRulePredicatePostCondition2 returns [EObject current=null] : iv_rulePredicatePostCondition2= rulePredicatePostCondition2 EOF ;
    public final EObject entryRulePredicatePostCondition2() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicatePostCondition2 = null;


        try {
            // InternalMyZDsl.g:2165:64: (iv_rulePredicatePostCondition2= rulePredicatePostCondition2 EOF )
            // InternalMyZDsl.g:2166:2: iv_rulePredicatePostCondition2= rulePredicatePostCondition2 EOF
            {
             newCompositeNode(grammarAccess.getPredicatePostCondition2Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicatePostCondition2=rulePredicatePostCondition2();

            state._fsp--;

             current =iv_rulePredicatePostCondition2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicatePostCondition2"


    // $ANTLR start "rulePredicatePostCondition2"
    // InternalMyZDsl.g:2172:1: rulePredicatePostCondition2 returns [EObject current=null] : ( ( (lv_condition21_0_0= ruleVariables ) )? (otherlv_1= 'where' )? ( (lv_condition22_2_0= ruleVariables ) )? (otherlv_3= 'BELONG TO' )? ( (lv_condition23_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_condition23_6_0= ruleVariables ) ) )? ) ;
    public final EObject rulePredicatePostCondition2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition21_0_0 = null;

        EObject lv_condition22_2_0 = null;

        EObject lv_condition23_4_0 = null;

        EObject lv_condition23_6_0 = null;



        	enterRule();

        try {
            // InternalMyZDsl.g:2178:2: ( ( ( (lv_condition21_0_0= ruleVariables ) )? (otherlv_1= 'where' )? ( (lv_condition22_2_0= ruleVariables ) )? (otherlv_3= 'BELONG TO' )? ( (lv_condition23_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_condition23_6_0= ruleVariables ) ) )? ) )
            // InternalMyZDsl.g:2179:2: ( ( (lv_condition21_0_0= ruleVariables ) )? (otherlv_1= 'where' )? ( (lv_condition22_2_0= ruleVariables ) )? (otherlv_3= 'BELONG TO' )? ( (lv_condition23_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_condition23_6_0= ruleVariables ) ) )? )
            {
            // InternalMyZDsl.g:2179:2: ( ( (lv_condition21_0_0= ruleVariables ) )? (otherlv_1= 'where' )? ( (lv_condition22_2_0= ruleVariables ) )? (otherlv_3= 'BELONG TO' )? ( (lv_condition23_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_condition23_6_0= ruleVariables ) ) )? )
            // InternalMyZDsl.g:2180:3: ( (lv_condition21_0_0= ruleVariables ) )? (otherlv_1= 'where' )? ( (lv_condition22_2_0= ruleVariables ) )? (otherlv_3= 'BELONG TO' )? ( (lv_condition23_4_0= ruleVariables ) ) (otherlv_5= ',' ( (lv_condition23_6_0= ruleVariables ) ) )?
            {
            // InternalMyZDsl.g:2180:3: ( (lv_condition21_0_0= ruleVariables ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyZDsl.g:2181:4: (lv_condition21_0_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:2181:4: (lv_condition21_0_0= ruleVariables )
                    // InternalMyZDsl.g:2182:5: lv_condition21_0_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getPredicatePostCondition2Access().getCondition21VariablesParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_condition21_0_0=ruleVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicatePostCondition2Rule());
                    					}
                    					set(
                    						current,
                    						"condition21",
                    						lv_condition21_0_0,
                    						"model.myzdsl.MyZDsl.Variables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:2199:3: (otherlv_1= 'where' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyZDsl.g:2200:4: otherlv_1= 'where'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getPredicatePostCondition2Access().getWhereKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyZDsl.g:2205:3: ( (lv_condition22_2_0= ruleVariables ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==49) ) {
                    alt42=1;
                }
                else if ( (LA42_1==RULE_ID) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalMyZDsl.g:2206:4: (lv_condition22_2_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:2206:4: (lv_condition22_2_0= ruleVariables )
                    // InternalMyZDsl.g:2207:5: lv_condition22_2_0= ruleVariables
                    {

                    					newCompositeNode(grammarAccess.getPredicatePostCondition2Access().getCondition22VariablesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_condition22_2_0=ruleVariables();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredicatePostCondition2Rule());
                    					}
                    					set(
                    						current,
                    						"condition22",
                    						lv_condition22_2_0,
                    						"model.myzdsl.MyZDsl.Variables");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyZDsl.g:2224:3: (otherlv_3= 'BELONG TO' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyZDsl.g:2225:4: otherlv_3= 'BELONG TO'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPredicatePostCondition2Access().getBELONGTOKeyword_3());
                    			

                    }
                    break;

            }

            // InternalMyZDsl.g:2230:3: ( (lv_condition23_4_0= ruleVariables ) )
            // InternalMyZDsl.g:2231:4: (lv_condition23_4_0= ruleVariables )
            {
            // InternalMyZDsl.g:2231:4: (lv_condition23_4_0= ruleVariables )
            // InternalMyZDsl.g:2232:5: lv_condition23_4_0= ruleVariables
            {

            					newCompositeNode(grammarAccess.getPredicatePostCondition2Access().getCondition23VariablesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_condition23_4_0=ruleVariables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicatePostCondition2Rule());
            					}
            					set(
            						current,
            						"condition23",
            						lv_condition23_4_0,
            						"model.myzdsl.MyZDsl.Variables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyZDsl.g:2249:3: (otherlv_5= ',' ( (lv_condition23_6_0= ruleVariables ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==11) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyZDsl.g:2250:4: otherlv_5= ',' ( (lv_condition23_6_0= ruleVariables ) )
                    {
                    otherlv_5=(Token)match(input,11,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getPredicatePostCondition2Access().getCommaKeyword_5_0());
                    			
                    // InternalMyZDsl.g:2254:4: ( (lv_condition23_6_0= ruleVariables ) )
                    // InternalMyZDsl.g:2255:5: (lv_condition23_6_0= ruleVariables )
                    {
                    // InternalMyZDsl.g:2255:5: (lv_condition23_6_0= ruleVariables )
                    // InternalMyZDsl.g:2256:6: lv_condition23_6_0= ruleVariables
                    {

                    						newCompositeNode(grammarAccess.getPredicatePostCondition2Access().getCondition23VariablesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition23_6_0=ruleVariables();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredicatePostCondition2Rule());
                    						}
                    						set(
                    							current,
                    							"condition23",
                    							lv_condition23_6_0,
                    							"model.myzdsl.MyZDsl.Variables");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicatePostCondition2"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\21\1\uffff\6\4\2\uffff";
    static final String dfa_3s = "\1\37\1\uffff\6\41\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\6\uffff\1\2\1\3";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\2\10\uffff\1\1\1\3\1\4\1\6\1\7",
            "",
            "\1\11\24\uffff\2\10\5\uffff\2\10",
            "\1\11\24\uffff\2\10\5\uffff\2\10",
            "\1\11\24\uffff\2\10\5\uffff\2\10",
            "\1\11\24\uffff\2\10\5\uffff\2\10",
            "\1\11\24\uffff\2\10\5\uffff\2\10",
            "\1\11\24\uffff\2\10\5\uffff\2\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "254:3: ( ( ruleDT ruleNNS ruleVBP ) | ( ruleNNS ruleVBP ) | ruleNNS )";
        }
    }
    static final String dfa_7s = "\137\uffff";
    static final String dfa_8s = "\1\6\136\uffff";
    static final String dfa_9s = "\1\4\1\17\4\14\1\uffff\53\14\47\31\6\uffff";
    static final String dfa_10s = "\1\61\1\43\2\32\2\30\1\uffff\4\30\47\46\47\32\6\uffff";
    static final String dfa_11s = "\6\uffff\1\3\122\uffff\4\2\2\1";
    static final String dfa_12s = "\137\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\7\uffff\3\6\1\3\1\2\10\6\2\uffff\1\1\6\uffff\1\4\1\5\5\uffff\2\6\2\uffff\5\6",
            "\1\10\1\7\21\uffff\1\11\1\12",
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\2\6",
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\2\6",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44",
            "",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\14\uffff\2\6",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\131\1\132",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\133\1\134",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "\1\135\1\136",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1547:3: ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )?";
        }
    }
    static final String dfa_14s = "\153\uffff";
    static final String dfa_15s = "\1\6\100\uffff\3\77\47\uffff";
    static final String dfa_16s = "\1\4\1\17\4\14\1\uffff\53\14\15\31\2\uffff\3\4\47\14";
    static final String dfa_17s = "\1\61\1\43\2\32\2\30\1\uffff\4\30\47\46\15\32\2\uffff\3\61\15\32\15\44\15\46";
    static final String dfa_18s = "\6\uffff\1\3\70\uffff\1\2\1\1\52\uffff";
    static final String dfa_19s = "\153\uffff}>";
    static final String[] dfa_20s = {
            "\1\6\7\uffff\3\6\1\3\1\2\10\6\2\uffff\1\1\6\uffff\1\4\1\5\11\uffff\5\6",
            "\1\10\1\7\21\uffff\1\11\1\12",
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\2\6",
            "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\2\6",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44",
            "",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\77\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\15\100\14\uffff\2\6",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\101\1\102",
            "",
            "",
            "\1\103\7\uffff\15\77\2\uffff\1\77\6\uffff\2\77\11\uffff\5\77",
            "\1\103\7\uffff\15\77\2\uffff\1\77\6\uffff\2\77\11\uffff\5\77",
            "\1\77\6\uffff\1\77\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\2\uffff\1\77\6\uffff\2\77\11\uffff\5\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\2\77",
            "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77",
            "\15\77\1\uffff\1\6\11\uffff\1\6\2\77"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1674:3: ( ( ruleDT ruleJJ ruleNN ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleNN ruleVBZ ) )?";
        }
    }
    static final String dfa_21s = "\37\uffff";
    static final String dfa_22s = "\1\20\36\uffff";
    static final String dfa_23s = "\1\4\1\uffff\15\14\3\uffff\15\14";
    static final String dfa_24s = "\1\57\1\uffff\15\32\3\uffff\15\46";
    static final String dfa_25s = "\1\uffff\1\1\15\uffff\1\3\1\4\1\2\15\uffff";
    static final String dfa_26s = "\37\uffff}>";
    static final String[] dfa_27s = {
            "\1\20\7\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\2\uffff\1\1\6\uffff\2\17\11\uffff\3\20",
            "",
            "\15\20\2\21",
            "\15\20\2\21",
            "\15\20\2\21",
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\2\21",
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\2\21",
            "\15\20\2\21",
            "\15\20\2\21",
            "\15\20\2\21",
            "\15\20\2\21",
            "\15\20\2\21",
            "\15\20\2\21",
            "\15\20\2\21",
            "\15\20\2\21",
            "",
            "",
            "",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17",
            "\15\20\14\uffff\2\17"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "1763:3: ( ( ruleDT ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) | ( ruleNN ruleVBZ ) | ( ruleJJ ruleNN ruleVBG ruleNN ruleVBZ ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000C00018000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001FFF002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001FFF000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000F8060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000F0060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000306000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000C08018800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000180000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000C08018000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000009FFF000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000009FFF800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0003E60C09FFF810L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0003E60C09FFF012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0003E00C09FFF012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000E00C09FFF012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000E00000000012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000E00000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000C00000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0003000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000010L});

}