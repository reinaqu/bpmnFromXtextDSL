/*
 * generated by Xtext 2.26.0
 */
package security.xtext.bmpn.simple.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BPSecDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("security/xtext/bmpn/simple/parser/antlr/internal/InternalBPSecDsl.tokens");
	}
}
