package security.xtext.bmpn.simple.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import security.xtext.bmpn.simple.services.BPSecDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBPSecDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(BPSecDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePolicy"
    // InternalBPSecDsl.g:53:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // InternalBPSecDsl.g:54:1: ( rulePolicy EOF )
            // InternalBPSecDsl.g:55:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalBPSecDsl.g:62:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:66:2: ( ( ( rule__Policy__Group__0 ) ) )
            // InternalBPSecDsl.g:67:2: ( ( rule__Policy__Group__0 ) )
            {
            // InternalBPSecDsl.g:67:2: ( ( rule__Policy__Group__0 ) )
            // InternalBPSecDsl.g:68:3: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // InternalBPSecDsl.g:69:3: ( rule__Policy__Group__0 )
            // InternalBPSecDsl.g:69:4: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleDeclaration"
    // InternalBPSecDsl.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalBPSecDsl.g:79:1: ( ruleDeclaration EOF )
            // InternalBPSecDsl.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalBPSecDsl.g:87:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:91:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalBPSecDsl.g:92:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalBPSecDsl.g:92:2: ( ( rule__Declaration__Group__0 ) )
            // InternalBPSecDsl.g:93:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalBPSecDsl.g:94:3: ( rule__Declaration__Group__0 )
            // InternalBPSecDsl.g:94:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleProcess"
    // InternalBPSecDsl.g:103:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalBPSecDsl.g:104:1: ( ruleProcess EOF )
            // InternalBPSecDsl.g:105:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalBPSecDsl.g:112:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:116:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalBPSecDsl.g:117:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalBPSecDsl.g:117:2: ( ( rule__Process__Group__0 ) )
            // InternalBPSecDsl.g:118:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalBPSecDsl.g:119:3: ( rule__Process__Group__0 )
            // InternalBPSecDsl.g:119:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleTask"
    // InternalBPSecDsl.g:128:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalBPSecDsl.g:129:1: ( ruleTask EOF )
            // InternalBPSecDsl.g:130:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalBPSecDsl.g:137:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:141:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalBPSecDsl.g:142:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalBPSecDsl.g:142:2: ( ( rule__Task__Group__0 ) )
            // InternalBPSecDsl.g:143:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalBPSecDsl.g:144:3: ( rule__Task__Group__0 )
            // InternalBPSecDsl.g:144:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleUser"
    // InternalBPSecDsl.g:153:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalBPSecDsl.g:154:1: ( ruleUser EOF )
            // InternalBPSecDsl.g:155:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalBPSecDsl.g:162:1: ruleUser : ( ( rule__User__NameAssignment ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:166:2: ( ( ( rule__User__NameAssignment ) ) )
            // InternalBPSecDsl.g:167:2: ( ( rule__User__NameAssignment ) )
            {
            // InternalBPSecDsl.g:167:2: ( ( rule__User__NameAssignment ) )
            // InternalBPSecDsl.g:168:3: ( rule__User__NameAssignment )
            {
             before(grammarAccess.getUserAccess().getNameAssignment()); 
            // InternalBPSecDsl.g:169:3: ( rule__User__NameAssignment )
            // InternalBPSecDsl.g:169:4: rule__User__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "rule__Policy__Group__0"
    // InternalBPSecDsl.g:177:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:181:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // InternalBPSecDsl.g:182:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // InternalBPSecDsl.g:189:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:193:1: ( ( 'policy' ) )
            // InternalBPSecDsl.g:194:1: ( 'policy' )
            {
            // InternalBPSecDsl.g:194:1: ( 'policy' )
            // InternalBPSecDsl.g:195:2: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // InternalBPSecDsl.g:204:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:208:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // InternalBPSecDsl.g:209:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // InternalBPSecDsl.g:216:1: rule__Policy__Group__1__Impl : ( ( rule__Policy__NameAssignment_1 ) ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:220:1: ( ( ( rule__Policy__NameAssignment_1 ) ) )
            // InternalBPSecDsl.g:221:1: ( ( rule__Policy__NameAssignment_1 ) )
            {
            // InternalBPSecDsl.g:221:1: ( ( rule__Policy__NameAssignment_1 ) )
            // InternalBPSecDsl.g:222:2: ( rule__Policy__NameAssignment_1 )
            {
             before(grammarAccess.getPolicyAccess().getNameAssignment_1()); 
            // InternalBPSecDsl.g:223:2: ( rule__Policy__NameAssignment_1 )
            // InternalBPSecDsl.g:223:3: rule__Policy__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Policy__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // InternalBPSecDsl.g:231:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:235:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // InternalBPSecDsl.g:236:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Policy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // InternalBPSecDsl.g:243:1: rule__Policy__Group__2__Impl : ( 'declarations:' ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:247:1: ( ( 'declarations:' ) )
            // InternalBPSecDsl.g:248:1: ( 'declarations:' )
            {
            // InternalBPSecDsl.g:248:1: ( 'declarations:' )
            // InternalBPSecDsl.g:249:2: 'declarations:'
            {
             before(grammarAccess.getPolicyAccess().getDeclarationsKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getDeclarationsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // InternalBPSecDsl.g:258:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:262:1: ( rule__Policy__Group__3__Impl )
            // InternalBPSecDsl.g:263:2: rule__Policy__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Policy__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // InternalBPSecDsl.g:269:1: rule__Policy__Group__3__Impl : ( ( ( rule__Policy__DeclarationsAssignment_3 ) ) ( ( rule__Policy__DeclarationsAssignment_3 )* ) ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:273:1: ( ( ( ( rule__Policy__DeclarationsAssignment_3 ) ) ( ( rule__Policy__DeclarationsAssignment_3 )* ) ) )
            // InternalBPSecDsl.g:274:1: ( ( ( rule__Policy__DeclarationsAssignment_3 ) ) ( ( rule__Policy__DeclarationsAssignment_3 )* ) )
            {
            // InternalBPSecDsl.g:274:1: ( ( ( rule__Policy__DeclarationsAssignment_3 ) ) ( ( rule__Policy__DeclarationsAssignment_3 )* ) )
            // InternalBPSecDsl.g:275:2: ( ( rule__Policy__DeclarationsAssignment_3 ) ) ( ( rule__Policy__DeclarationsAssignment_3 )* )
            {
            // InternalBPSecDsl.g:275:2: ( ( rule__Policy__DeclarationsAssignment_3 ) )
            // InternalBPSecDsl.g:276:3: ( rule__Policy__DeclarationsAssignment_3 )
            {
             before(grammarAccess.getPolicyAccess().getDeclarationsAssignment_3()); 
            // InternalBPSecDsl.g:277:3: ( rule__Policy__DeclarationsAssignment_3 )
            // InternalBPSecDsl.g:277:4: rule__Policy__DeclarationsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Policy__DeclarationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getDeclarationsAssignment_3()); 

            }

            // InternalBPSecDsl.g:280:2: ( ( rule__Policy__DeclarationsAssignment_3 )* )
            // InternalBPSecDsl.g:281:3: ( rule__Policy__DeclarationsAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getDeclarationsAssignment_3()); 
            // InternalBPSecDsl.g:282:3: ( rule__Policy__DeclarationsAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBPSecDsl.g:282:4: rule__Policy__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Policy__DeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getDeclarationsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalBPSecDsl.g:292:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:296:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalBPSecDsl.g:297:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalBPSecDsl.g:304:1: rule__Declaration__Group__0__Impl : ( ( ( rule__Declaration__ProcessesAssignment_0 ) ) ( ( rule__Declaration__ProcessesAssignment_0 )* ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:308:1: ( ( ( ( rule__Declaration__ProcessesAssignment_0 ) ) ( ( rule__Declaration__ProcessesAssignment_0 )* ) ) )
            // InternalBPSecDsl.g:309:1: ( ( ( rule__Declaration__ProcessesAssignment_0 ) ) ( ( rule__Declaration__ProcessesAssignment_0 )* ) )
            {
            // InternalBPSecDsl.g:309:1: ( ( ( rule__Declaration__ProcessesAssignment_0 ) ) ( ( rule__Declaration__ProcessesAssignment_0 )* ) )
            // InternalBPSecDsl.g:310:2: ( ( rule__Declaration__ProcessesAssignment_0 ) ) ( ( rule__Declaration__ProcessesAssignment_0 )* )
            {
            // InternalBPSecDsl.g:310:2: ( ( rule__Declaration__ProcessesAssignment_0 ) )
            // InternalBPSecDsl.g:311:3: ( rule__Declaration__ProcessesAssignment_0 )
            {
             before(grammarAccess.getDeclarationAccess().getProcessesAssignment_0()); 
            // InternalBPSecDsl.g:312:3: ( rule__Declaration__ProcessesAssignment_0 )
            // InternalBPSecDsl.g:312:4: rule__Declaration__ProcessesAssignment_0
            {
            pushFollow(FOLLOW_6);
            rule__Declaration__ProcessesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getProcessesAssignment_0()); 

            }

            // InternalBPSecDsl.g:315:2: ( ( rule__Declaration__ProcessesAssignment_0 )* )
            // InternalBPSecDsl.g:316:3: ( rule__Declaration__ProcessesAssignment_0 )*
            {
             before(grammarAccess.getDeclarationAccess().getProcessesAssignment_0()); 
            // InternalBPSecDsl.g:317:3: ( rule__Declaration__ProcessesAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBPSecDsl.g:317:4: rule__Declaration__ProcessesAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Declaration__ProcessesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDeclarationAccess().getProcessesAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalBPSecDsl.g:326:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:330:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalBPSecDsl.g:331:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalBPSecDsl.g:338:1: rule__Declaration__Group__1__Impl : ( 'users' ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:342:1: ( ( 'users' ) )
            // InternalBPSecDsl.g:343:1: ( 'users' )
            {
            // InternalBPSecDsl.g:343:1: ( 'users' )
            // InternalBPSecDsl.g:344:2: 'users'
            {
             before(grammarAccess.getDeclarationAccess().getUsersKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getUsersKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // InternalBPSecDsl.g:353:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:357:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // InternalBPSecDsl.g:358:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // InternalBPSecDsl.g:365:1: rule__Declaration__Group__2__Impl : ( ( rule__Declaration__UsersAssignment_2 ) ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:369:1: ( ( ( rule__Declaration__UsersAssignment_2 ) ) )
            // InternalBPSecDsl.g:370:1: ( ( rule__Declaration__UsersAssignment_2 ) )
            {
            // InternalBPSecDsl.g:370:1: ( ( rule__Declaration__UsersAssignment_2 ) )
            // InternalBPSecDsl.g:371:2: ( rule__Declaration__UsersAssignment_2 )
            {
             before(grammarAccess.getDeclarationAccess().getUsersAssignment_2()); 
            // InternalBPSecDsl.g:372:2: ( rule__Declaration__UsersAssignment_2 )
            // InternalBPSecDsl.g:372:3: rule__Declaration__UsersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__UsersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getUsersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__3"
    // InternalBPSecDsl.g:380:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:384:1: ( rule__Declaration__Group__3__Impl )
            // InternalBPSecDsl.g:385:2: rule__Declaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3"


    // $ANTLR start "rule__Declaration__Group__3__Impl"
    // InternalBPSecDsl.g:391:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__Group_3__0 )* ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:395:1: ( ( ( rule__Declaration__Group_3__0 )* ) )
            // InternalBPSecDsl.g:396:1: ( ( rule__Declaration__Group_3__0 )* )
            {
            // InternalBPSecDsl.g:396:1: ( ( rule__Declaration__Group_3__0 )* )
            // InternalBPSecDsl.g:397:2: ( rule__Declaration__Group_3__0 )*
            {
             before(grammarAccess.getDeclarationAccess().getGroup_3()); 
            // InternalBPSecDsl.g:398:2: ( rule__Declaration__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBPSecDsl.g:398:3: rule__Declaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Declaration__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3__Impl"


    // $ANTLR start "rule__Declaration__Group_3__0"
    // InternalBPSecDsl.g:407:1: rule__Declaration__Group_3__0 : rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1 ;
    public final void rule__Declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:411:1: ( rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1 )
            // InternalBPSecDsl.g:412:2: rule__Declaration__Group_3__0__Impl rule__Declaration__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Declaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_3__0"


    // $ANTLR start "rule__Declaration__Group_3__0__Impl"
    // InternalBPSecDsl.g:419:1: rule__Declaration__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:423:1: ( ( ',' ) )
            // InternalBPSecDsl.g:424:1: ( ',' )
            {
            // InternalBPSecDsl.g:424:1: ( ',' )
            // InternalBPSecDsl.g:425:2: ','
            {
             before(grammarAccess.getDeclarationAccess().getCommaKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Declaration__Group_3__1"
    // InternalBPSecDsl.g:434:1: rule__Declaration__Group_3__1 : rule__Declaration__Group_3__1__Impl ;
    public final void rule__Declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:438:1: ( rule__Declaration__Group_3__1__Impl )
            // InternalBPSecDsl.g:439:2: rule__Declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_3__1"


    // $ANTLR start "rule__Declaration__Group_3__1__Impl"
    // InternalBPSecDsl.g:445:1: rule__Declaration__Group_3__1__Impl : ( ( rule__Declaration__UsersAssignment_3_1 ) ) ;
    public final void rule__Declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:449:1: ( ( ( rule__Declaration__UsersAssignment_3_1 ) ) )
            // InternalBPSecDsl.g:450:1: ( ( rule__Declaration__UsersAssignment_3_1 ) )
            {
            // InternalBPSecDsl.g:450:1: ( ( rule__Declaration__UsersAssignment_3_1 ) )
            // InternalBPSecDsl.g:451:2: ( rule__Declaration__UsersAssignment_3_1 )
            {
             before(grammarAccess.getDeclarationAccess().getUsersAssignment_3_1()); 
            // InternalBPSecDsl.g:452:2: ( rule__Declaration__UsersAssignment_3_1 )
            // InternalBPSecDsl.g:452:3: rule__Declaration__UsersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__UsersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getUsersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Process__Group__0"
    // InternalBPSecDsl.g:461:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:465:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalBPSecDsl.g:466:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalBPSecDsl.g:473:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:477:1: ( ( 'process' ) )
            // InternalBPSecDsl.g:478:1: ( 'process' )
            {
            // InternalBPSecDsl.g:478:1: ( 'process' )
            // InternalBPSecDsl.g:479:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalBPSecDsl.g:488:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:492:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalBPSecDsl.g:493:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalBPSecDsl.g:500:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:504:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalBPSecDsl.g:505:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalBPSecDsl.g:505:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalBPSecDsl.g:506:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalBPSecDsl.g:507:2: ( rule__Process__NameAssignment_1 )
            // InternalBPSecDsl.g:507:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalBPSecDsl.g:515:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:519:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalBPSecDsl.g:520:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalBPSecDsl.g:527:1: rule__Process__Group__2__Impl : ( 'mapsTo' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:531:1: ( ( 'mapsTo' ) )
            // InternalBPSecDsl.g:532:1: ( 'mapsTo' )
            {
            // InternalBPSecDsl.g:532:1: ( 'mapsTo' )
            // InternalBPSecDsl.g:533:2: 'mapsTo'
            {
             before(grammarAccess.getProcessAccess().getMapsToKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getMapsToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalBPSecDsl.g:542:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:546:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalBPSecDsl.g:547:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalBPSecDsl.g:554:1: rule__Process__Group__3__Impl : ( ( rule__Process__RefProcessAssignment_3 ) ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:558:1: ( ( ( rule__Process__RefProcessAssignment_3 ) ) )
            // InternalBPSecDsl.g:559:1: ( ( rule__Process__RefProcessAssignment_3 ) )
            {
            // InternalBPSecDsl.g:559:1: ( ( rule__Process__RefProcessAssignment_3 ) )
            // InternalBPSecDsl.g:560:2: ( rule__Process__RefProcessAssignment_3 )
            {
             before(grammarAccess.getProcessAccess().getRefProcessAssignment_3()); 
            // InternalBPSecDsl.g:561:2: ( rule__Process__RefProcessAssignment_3 )
            // InternalBPSecDsl.g:561:3: rule__Process__RefProcessAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Process__RefProcessAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getRefProcessAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalBPSecDsl.g:569:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:573:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalBPSecDsl.g:574:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalBPSecDsl.g:581:1: rule__Process__Group__4__Impl : ( '{' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:585:1: ( ( '{' ) )
            // InternalBPSecDsl.g:586:1: ( '{' )
            {
            // InternalBPSecDsl.g:586:1: ( '{' )
            // InternalBPSecDsl.g:587:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalBPSecDsl.g:596:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:600:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalBPSecDsl.g:601:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalBPSecDsl.g:608:1: rule__Process__Group__5__Impl : ( ( ( rule__Process__TasksAssignment_5 ) ) ( ( rule__Process__TasksAssignment_5 )* ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:612:1: ( ( ( ( rule__Process__TasksAssignment_5 ) ) ( ( rule__Process__TasksAssignment_5 )* ) ) )
            // InternalBPSecDsl.g:613:1: ( ( ( rule__Process__TasksAssignment_5 ) ) ( ( rule__Process__TasksAssignment_5 )* ) )
            {
            // InternalBPSecDsl.g:613:1: ( ( ( rule__Process__TasksAssignment_5 ) ) ( ( rule__Process__TasksAssignment_5 )* ) )
            // InternalBPSecDsl.g:614:2: ( ( rule__Process__TasksAssignment_5 ) ) ( ( rule__Process__TasksAssignment_5 )* )
            {
            // InternalBPSecDsl.g:614:2: ( ( rule__Process__TasksAssignment_5 ) )
            // InternalBPSecDsl.g:615:3: ( rule__Process__TasksAssignment_5 )
            {
             before(grammarAccess.getProcessAccess().getTasksAssignment_5()); 
            // InternalBPSecDsl.g:616:3: ( rule__Process__TasksAssignment_5 )
            // InternalBPSecDsl.g:616:4: rule__Process__TasksAssignment_5
            {
            pushFollow(FOLLOW_14);
            rule__Process__TasksAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getTasksAssignment_5()); 

            }

            // InternalBPSecDsl.g:619:2: ( ( rule__Process__TasksAssignment_5 )* )
            // InternalBPSecDsl.g:620:3: ( rule__Process__TasksAssignment_5 )*
            {
             before(grammarAccess.getProcessAccess().getTasksAssignment_5()); 
            // InternalBPSecDsl.g:621:3: ( rule__Process__TasksAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBPSecDsl.g:621:4: rule__Process__TasksAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Process__TasksAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getTasksAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalBPSecDsl.g:630:1: rule__Process__Group__6 : rule__Process__Group__6__Impl ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:634:1: ( rule__Process__Group__6__Impl )
            // InternalBPSecDsl.g:635:2: rule__Process__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalBPSecDsl.g:641:1: rule__Process__Group__6__Impl : ( '}' ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:645:1: ( ( '}' ) )
            // InternalBPSecDsl.g:646:1: ( '}' )
            {
            // InternalBPSecDsl.g:646:1: ( '}' )
            // InternalBPSecDsl.g:647:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalBPSecDsl.g:657:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:661:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalBPSecDsl.g:662:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalBPSecDsl.g:669:1: rule__Task__Group__0__Impl : ( 'task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:673:1: ( ( 'task' ) )
            // InternalBPSecDsl.g:674:1: ( 'task' )
            {
            // InternalBPSecDsl.g:674:1: ( 'task' )
            // InternalBPSecDsl.g:675:2: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalBPSecDsl.g:684:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:688:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalBPSecDsl.g:689:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalBPSecDsl.g:696:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:700:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalBPSecDsl.g:701:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalBPSecDsl.g:701:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalBPSecDsl.g:702:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalBPSecDsl.g:703:2: ( rule__Task__NameAssignment_1 )
            // InternalBPSecDsl.g:703:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalBPSecDsl.g:711:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:715:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalBPSecDsl.g:716:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalBPSecDsl.g:723:1: rule__Task__Group__2__Impl : ( 'mapsTo' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:727:1: ( ( 'mapsTo' ) )
            // InternalBPSecDsl.g:728:1: ( 'mapsTo' )
            {
            // InternalBPSecDsl.g:728:1: ( 'mapsTo' )
            // InternalBPSecDsl.g:729:2: 'mapsTo'
            {
             before(grammarAccess.getTaskAccess().getMapsToKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getMapsToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalBPSecDsl.g:738:1: rule__Task__Group__3 : rule__Task__Group__3__Impl ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:742:1: ( rule__Task__Group__3__Impl )
            // InternalBPSecDsl.g:743:2: rule__Task__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalBPSecDsl.g:749:1: rule__Task__Group__3__Impl : ( ( rule__Task__RefTaskAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:753:1: ( ( ( rule__Task__RefTaskAssignment_3 ) ) )
            // InternalBPSecDsl.g:754:1: ( ( rule__Task__RefTaskAssignment_3 ) )
            {
            // InternalBPSecDsl.g:754:1: ( ( rule__Task__RefTaskAssignment_3 ) )
            // InternalBPSecDsl.g:755:2: ( rule__Task__RefTaskAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getRefTaskAssignment_3()); 
            // InternalBPSecDsl.g:756:2: ( rule__Task__RefTaskAssignment_3 )
            // InternalBPSecDsl.g:756:3: rule__Task__RefTaskAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Task__RefTaskAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getRefTaskAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Policy__NameAssignment_1"
    // InternalBPSecDsl.g:765:1: rule__Policy__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Policy__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:769:1: ( ( RULE_ID ) )
            // InternalBPSecDsl.g:770:2: ( RULE_ID )
            {
            // InternalBPSecDsl.g:770:2: ( RULE_ID )
            // InternalBPSecDsl.g:771:3: RULE_ID
            {
             before(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__NameAssignment_1"


    // $ANTLR start "rule__Policy__DeclarationsAssignment_3"
    // InternalBPSecDsl.g:780:1: rule__Policy__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Policy__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:784:1: ( ( ruleDeclaration ) )
            // InternalBPSecDsl.g:785:2: ( ruleDeclaration )
            {
            // InternalBPSecDsl.g:785:2: ( ruleDeclaration )
            // InternalBPSecDsl.g:786:3: ruleDeclaration
            {
             before(grammarAccess.getPolicyAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Policy__DeclarationsAssignment_3"


    // $ANTLR start "rule__Declaration__ProcessesAssignment_0"
    // InternalBPSecDsl.g:795:1: rule__Declaration__ProcessesAssignment_0 : ( ruleProcess ) ;
    public final void rule__Declaration__ProcessesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:799:1: ( ( ruleProcess ) )
            // InternalBPSecDsl.g:800:2: ( ruleProcess )
            {
            // InternalBPSecDsl.g:800:2: ( ruleProcess )
            // InternalBPSecDsl.g:801:3: ruleProcess
            {
             before(grammarAccess.getDeclarationAccess().getProcessesProcessParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getProcessesProcessParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ProcessesAssignment_0"


    // $ANTLR start "rule__Declaration__UsersAssignment_2"
    // InternalBPSecDsl.g:810:1: rule__Declaration__UsersAssignment_2 : ( ruleUser ) ;
    public final void rule__Declaration__UsersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:814:1: ( ( ruleUser ) )
            // InternalBPSecDsl.g:815:2: ( ruleUser )
            {
            // InternalBPSecDsl.g:815:2: ( ruleUser )
            // InternalBPSecDsl.g:816:3: ruleUser
            {
             before(grammarAccess.getDeclarationAccess().getUsersUserParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getUsersUserParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UsersAssignment_2"


    // $ANTLR start "rule__Declaration__UsersAssignment_3_1"
    // InternalBPSecDsl.g:825:1: rule__Declaration__UsersAssignment_3_1 : ( ruleUser ) ;
    public final void rule__Declaration__UsersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:829:1: ( ( ruleUser ) )
            // InternalBPSecDsl.g:830:2: ( ruleUser )
            {
            // InternalBPSecDsl.g:830:2: ( ruleUser )
            // InternalBPSecDsl.g:831:3: ruleUser
            {
             before(grammarAccess.getDeclarationAccess().getUsersUserParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getUsersUserParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__UsersAssignment_3_1"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalBPSecDsl.g:840:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:844:1: ( ( RULE_ID ) )
            // InternalBPSecDsl.g:845:2: ( RULE_ID )
            {
            // InternalBPSecDsl.g:845:2: ( RULE_ID )
            // InternalBPSecDsl.g:846:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__RefProcessAssignment_3"
    // InternalBPSecDsl.g:855:1: rule__Process__RefProcessAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Process__RefProcessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:859:1: ( ( ( RULE_ID ) ) )
            // InternalBPSecDsl.g:860:2: ( ( RULE_ID ) )
            {
            // InternalBPSecDsl.g:860:2: ( ( RULE_ID ) )
            // InternalBPSecDsl.g:861:3: ( RULE_ID )
            {
             before(grammarAccess.getProcessAccess().getRefProcessProcessCrossReference_3_0()); 
            // InternalBPSecDsl.g:862:3: ( RULE_ID )
            // InternalBPSecDsl.g:863:4: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getRefProcessProcessIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRefProcessProcessIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getProcessAccess().getRefProcessProcessCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__RefProcessAssignment_3"


    // $ANTLR start "rule__Process__TasksAssignment_5"
    // InternalBPSecDsl.g:874:1: rule__Process__TasksAssignment_5 : ( ruleTask ) ;
    public final void rule__Process__TasksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:878:1: ( ( ruleTask ) )
            // InternalBPSecDsl.g:879:2: ( ruleTask )
            {
            // InternalBPSecDsl.g:879:2: ( ruleTask )
            // InternalBPSecDsl.g:880:3: ruleTask
            {
             before(grammarAccess.getProcessAccess().getTasksTaskParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getTasksTaskParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__TasksAssignment_5"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalBPSecDsl.g:889:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:893:1: ( ( RULE_ID ) )
            // InternalBPSecDsl.g:894:2: ( RULE_ID )
            {
            // InternalBPSecDsl.g:894:2: ( RULE_ID )
            // InternalBPSecDsl.g:895:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__RefTaskAssignment_3"
    // InternalBPSecDsl.g:904:1: rule__Task__RefTaskAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Task__RefTaskAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:908:1: ( ( ( RULE_ID ) ) )
            // InternalBPSecDsl.g:909:2: ( ( RULE_ID ) )
            {
            // InternalBPSecDsl.g:909:2: ( ( RULE_ID ) )
            // InternalBPSecDsl.g:910:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getRefTaskActivityCrossReference_3_0()); 
            // InternalBPSecDsl.g:911:3: ( RULE_ID )
            // InternalBPSecDsl.g:912:4: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getRefTaskActivityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRefTaskActivityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getRefTaskActivityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__RefTaskAssignment_3"


    // $ANTLR start "rule__User__NameAssignment"
    // InternalBPSecDsl.g:923:1: rule__User__NameAssignment : ( RULE_ID ) ;
    public final void rule__User__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBPSecDsl.g:927:1: ( ( RULE_ID ) )
            // InternalBPSecDsl.g:928:2: ( RULE_ID )
            {
            // InternalBPSecDsl.g:928:2: ( RULE_ID )
            // InternalBPSecDsl.g:929:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});

}