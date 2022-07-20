package security.xtext.bmpn.simple.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import security.xtext.bmpn.simple.services.BPSecDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBPSecDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'policy'", "'declarations:'", "'users'", "','", "'process'", "'mapsTo'", "'{'", "'}'", "'task'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalBPSecDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBPSecDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBPSecDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBPSecDsl.g"; }



     	private BPSecDslGrammarAccess grammarAccess;

        public InternalBPSecDslParser(TokenStream input, BPSecDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Policy";
       	}

       	@Override
       	protected BPSecDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePolicy"
    // InternalBPSecDsl.g:64:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalBPSecDsl.g:64:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalBPSecDsl.g:65:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
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
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalBPSecDsl.g:71:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'declarations:' ( (lv_declarations_3_0= ruleDeclaration ) )+ ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_declarations_3_0 = null;



        	enterRule();

        try {
            // InternalBPSecDsl.g:77:2: ( (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'declarations:' ( (lv_declarations_3_0= ruleDeclaration ) )+ ) )
            // InternalBPSecDsl.g:78:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'declarations:' ( (lv_declarations_3_0= ruleDeclaration ) )+ )
            {
            // InternalBPSecDsl.g:78:2: (otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'declarations:' ( (lv_declarations_3_0= ruleDeclaration ) )+ )
            // InternalBPSecDsl.g:79:3: otherlv_0= 'policy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'declarations:' ( (lv_declarations_3_0= ruleDeclaration ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
            		
            // InternalBPSecDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBPSecDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBPSecDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalBPSecDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolicyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPolicyAccess().getDeclarationsKeyword_2());
            		
            // InternalBPSecDsl.g:105:3: ( (lv_declarations_3_0= ruleDeclaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBPSecDsl.g:106:4: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalBPSecDsl.g:106:4: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalBPSecDsl.g:107:5: lv_declarations_3_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getPolicyAccess().getDeclarationsDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_3_0,
            	    						"security.xtext.bmpn.simple.BPSecDsl.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleDeclaration"
    // InternalBPSecDsl.g:128:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalBPSecDsl.g:128:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalBPSecDsl.g:129:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalBPSecDsl.g:135:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_processes_0_0= ruleProcess ) )+ otherlv_1= 'users' ( (lv_users_2_0= ruleUser ) ) (otherlv_3= ',' ( (lv_users_4_0= ruleUser ) ) )* ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_processes_0_0 = null;

        EObject lv_users_2_0 = null;

        EObject lv_users_4_0 = null;



        	enterRule();

        try {
            // InternalBPSecDsl.g:141:2: ( ( ( (lv_processes_0_0= ruleProcess ) )+ otherlv_1= 'users' ( (lv_users_2_0= ruleUser ) ) (otherlv_3= ',' ( (lv_users_4_0= ruleUser ) ) )* ) )
            // InternalBPSecDsl.g:142:2: ( ( (lv_processes_0_0= ruleProcess ) )+ otherlv_1= 'users' ( (lv_users_2_0= ruleUser ) ) (otherlv_3= ',' ( (lv_users_4_0= ruleUser ) ) )* )
            {
            // InternalBPSecDsl.g:142:2: ( ( (lv_processes_0_0= ruleProcess ) )+ otherlv_1= 'users' ( (lv_users_2_0= ruleUser ) ) (otherlv_3= ',' ( (lv_users_4_0= ruleUser ) ) )* )
            // InternalBPSecDsl.g:143:3: ( (lv_processes_0_0= ruleProcess ) )+ otherlv_1= 'users' ( (lv_users_2_0= ruleUser ) ) (otherlv_3= ',' ( (lv_users_4_0= ruleUser ) ) )*
            {
            // InternalBPSecDsl.g:143:3: ( (lv_processes_0_0= ruleProcess ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBPSecDsl.g:144:4: (lv_processes_0_0= ruleProcess )
            	    {
            	    // InternalBPSecDsl.g:144:4: (lv_processes_0_0= ruleProcess )
            	    // InternalBPSecDsl.g:145:5: lv_processes_0_0= ruleProcess
            	    {

            	    					newCompositeNode(grammarAccess.getDeclarationAccess().getProcessesProcessParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_processes_0_0=ruleProcess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processes",
            	    						lv_processes_0_0,
            	    						"security.xtext.bmpn.simple.BPSecDsl.Process");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getUsersKeyword_1());
            		
            // InternalBPSecDsl.g:166:3: ( (lv_users_2_0= ruleUser ) )
            // InternalBPSecDsl.g:167:4: (lv_users_2_0= ruleUser )
            {
            // InternalBPSecDsl.g:167:4: (lv_users_2_0= ruleUser )
            // InternalBPSecDsl.g:168:5: lv_users_2_0= ruleUser
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getUsersUserParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_users_2_0=ruleUser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					add(
            						current,
            						"users",
            						lv_users_2_0,
            						"security.xtext.bmpn.simple.BPSecDsl.User");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBPSecDsl.g:185:3: (otherlv_3= ',' ( (lv_users_4_0= ruleUser ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBPSecDsl.g:186:4: otherlv_3= ',' ( (lv_users_4_0= ruleUser ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalBPSecDsl.g:190:4: ( (lv_users_4_0= ruleUser ) )
            	    // InternalBPSecDsl.g:191:5: (lv_users_4_0= ruleUser )
            	    {
            	    // InternalBPSecDsl.g:191:5: (lv_users_4_0= ruleUser )
            	    // InternalBPSecDsl.g:192:6: lv_users_4_0= ruleUser
            	    {

            	    						newCompositeNode(grammarAccess.getDeclarationAccess().getUsersUserParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_users_4_0=ruleUser();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"users",
            	    							lv_users_4_0,
            	    							"security.xtext.bmpn.simple.BPSecDsl.User");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleProcess"
    // InternalBPSecDsl.g:214:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalBPSecDsl.g:214:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalBPSecDsl.g:215:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalBPSecDsl.g:221:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )+ otherlv_6= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tasks_5_0 = null;



        	enterRule();

        try {
            // InternalBPSecDsl.g:227:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )+ otherlv_6= '}' ) )
            // InternalBPSecDsl.g:228:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )+ otherlv_6= '}' )
            {
            // InternalBPSecDsl.g:228:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )+ otherlv_6= '}' )
            // InternalBPSecDsl.g:229:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalBPSecDsl.g:233:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBPSecDsl.g:234:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBPSecDsl.g:234:4: (lv_name_1_0= RULE_ID )
            // InternalBPSecDsl.g:235:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getMapsToKeyword_2());
            		
            // InternalBPSecDsl.g:255:3: ( (otherlv_3= RULE_ID ) )
            // InternalBPSecDsl.g:256:4: (otherlv_3= RULE_ID )
            {
            // InternalBPSecDsl.g:256:4: (otherlv_3= RULE_ID )
            // InternalBPSecDsl.g:257:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getRefProcessProcessCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBPSecDsl.g:272:3: ( (lv_tasks_5_0= ruleTask ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBPSecDsl.g:273:4: (lv_tasks_5_0= ruleTask )
            	    {
            	    // InternalBPSecDsl.g:273:4: (lv_tasks_5_0= ruleTask )
            	    // InternalBPSecDsl.g:274:5: lv_tasks_5_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getTasksTaskParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_tasks_5_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_5_0,
            	    						"security.xtext.bmpn.simple.BPSecDsl.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleTask"
    // InternalBPSecDsl.g:299:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalBPSecDsl.g:299:45: (iv_ruleTask= ruleTask EOF )
            // InternalBPSecDsl.g:300:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalBPSecDsl.g:306:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBPSecDsl.g:312:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBPSecDsl.g:313:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBPSecDsl.g:313:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) ) )
            // InternalBPSecDsl.g:314:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'mapsTo' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalBPSecDsl.g:318:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBPSecDsl.g:319:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBPSecDsl.g:319:4: (lv_name_1_0= RULE_ID )
            // InternalBPSecDsl.g:320:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getMapsToKeyword_2());
            		
            // InternalBPSecDsl.g:340:3: ( (otherlv_3= RULE_ID ) )
            // InternalBPSecDsl.g:341:4: (otherlv_3= RULE_ID )
            {
            // InternalBPSecDsl.g:341:4: (otherlv_3= RULE_ID )
            // InternalBPSecDsl.g:342:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getRefTaskActivityCrossReference_3_0());
            				

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleUser"
    // InternalBPSecDsl.g:357:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalBPSecDsl.g:357:45: (iv_ruleUser= ruleUser EOF )
            // InternalBPSecDsl.g:358:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalBPSecDsl.g:364:1: ruleUser returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBPSecDsl.g:370:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBPSecDsl.g:371:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBPSecDsl.g:371:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBPSecDsl.g:372:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBPSecDsl.g:372:3: (lv_name_0_0= RULE_ID )
            // InternalBPSecDsl.g:373:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUserRule());
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
    // $ANTLR end "ruleUser"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});

}