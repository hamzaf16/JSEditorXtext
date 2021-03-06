/*
* generated by Xtext
*/
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.services.JavaScriptEditorGrammarAccess;

public class JavaScriptEditorParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private JavaScriptEditorGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.mydsl.parser.antlr.internal.InternalJavaScriptEditorParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.mydsl.parser.antlr.internal.InternalJavaScriptEditorParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}
	
	public JavaScriptEditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JavaScriptEditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
