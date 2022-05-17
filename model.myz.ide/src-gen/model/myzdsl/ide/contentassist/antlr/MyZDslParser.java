/*
 * generated by Xtext 2.25.0
 */
package model.myzdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import model.myzdsl.ide.contentassist.antlr.internal.InternalMyZDslParser;
import model.myzdsl.services.MyZDslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyZDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyZDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyZDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSystemStateSpaceAccess().getAlternatives_0(), "rule__SystemStateSpace__Alternatives_0");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getAlternatives_1(), "rule__SystemStateSpace__Alternatives_1");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getAlternatives(), "rule__SystemStateSpacePredicate__Alternatives");
			builder.put(grammarAccess.getNNAccess().getAlternatives(), "rule__NN__Alternatives");
			builder.put(grammarAccess.getVBZAccess().getAlternatives(), "rule__VBZ__Alternatives");
			builder.put(grammarAccess.getNNSAccess().getAlternatives(), "rule__NNS__Alternatives");
			builder.put(grammarAccess.getVBPAccess().getAlternatives(), "rule__VBP__Alternatives");
			builder.put(grammarAccess.getJJAccess().getAlternatives(), "rule__JJ__Alternatives");
			builder.put(grammarAccess.getInitialStateAccess().getAlternatives_4(), "rule__InitialState__Alternatives_4");
			builder.put(grammarAccess.getInitialStateAccess().getAlternatives_7(), "rule__InitialState__Alternatives_7");
			builder.put(grammarAccess.getSchemaAccess().getAlternatives_3(), "rule__Schema__Alternatives_3");
			builder.put(grammarAccess.getSchemaAccess().getAlternatives_6(), "rule__Schema__Alternatives_6");
			builder.put(grammarAccess.getCCAccess().getAlternatives(), "rule__CC__Alternatives");
			builder.put(grammarAccess.getMDAccess().getAlternatives(), "rule__MD__Alternatives");
			builder.put(grammarAccess.getVBGAccess().getAlternatives(), "rule__VBG__Alternatives");
			builder.put(grammarAccess.getPredicateAccess().getAlternatives_0(), "rule__Predicate__Alternatives_0");
			builder.put(grammarAccess.getPredicateAccess().getAlternatives_4(), "rule__Predicate__Alternatives_4");
			builder.put(grammarAccess.getPredicateAccess().getAlternatives_6(), "rule__Predicate__Alternatives_6");
			builder.put(grammarAccess.getSchemaStateAccess().getAlternatives(), "rule__SchemaState__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getBelongsStateAccess().getAlternatives(), "rule__BelongsState__Alternatives");
			builder.put(grammarAccess.getFunctionListAccess().getAlternatives(), "rule__FunctionList__Alternatives");
			builder.put(grammarAccess.getMyZModelAccess().getGroup(), "rule__MyZModel__Group__0");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getGroup(), "rule__SystemStateSpace__Group__0");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getGroup_0_0(), "rule__SystemStateSpace__Group_0_0__0");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getGroup_0_1(), "rule__SystemStateSpace__Group_0_1__0");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getGroup_1_0(), "rule__SystemStateSpace__Group_1_0__0");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getGroup_1_1(), "rule__SystemStateSpace__Group_1_1__0");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getGroup_3(), "rule__SystemStateSpace__Group_3__0");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getGroup_0(), "rule__SystemStateSpacePredicate__Group_0__0");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getGroup_0_5(), "rule__SystemStateSpacePredicate__Group_0_5__0");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getGroup_1(), "rule__SystemStateSpacePredicate__Group_1__0");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getGroup_1_4(), "rule__SystemStateSpacePredicate__Group_1_4__0");
			builder.put(grammarAccess.getInitialStateAccess().getGroup(), "rule__InitialState__Group__0");
			builder.put(grammarAccess.getInitialStateAccess().getGroup_4_0(), "rule__InitialState__Group_4_0__0");
			builder.put(grammarAccess.getInitialStateAccess().getGroup_4_1(), "rule__InitialState__Group_4_1__0");
			builder.put(grammarAccess.getInitialStateAccess().getGroup_6(), "rule__InitialState__Group_6__0");
			builder.put(grammarAccess.getInitialStateAccess().getGroup_7_0(), "rule__InitialState__Group_7_0__0");
			builder.put(grammarAccess.getInitialStateAccess().getGroup_7_1(), "rule__InitialState__Group_7_1__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup(), "rule__Schema__Group__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_0(), "rule__Schema__Group_0__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_3_0(), "rule__Schema__Group_3_0__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_3_1(), "rule__Schema__Group_3_1__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_5(), "rule__Schema__Group_5__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_6_0(), "rule__Schema__Group_6_0__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_6_1(), "rule__Schema__Group_6_1__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_8(), "rule__Schema__Group_8__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup_0_0(), "rule__Predicate__Group_0_0__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup_0_1(), "rule__Predicate__Group_0_1__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup_4_0(), "rule__Predicate__Group_4_0__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup_4_1(), "rule__Predicate__Group_4_1__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup_6_0(), "rule__Predicate__Group_6_0__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup_6_1(), "rule__Predicate__Group_6_1__0");
			builder.put(grammarAccess.getPredicateAccess().getGroup_6_2(), "rule__Predicate__Group_6_2__0");
			builder.put(grammarAccess.getPredicatePostCondition1Access().getGroup(), "rule__PredicatePostCondition1__Group__0");
			builder.put(grammarAccess.getPredicatePostCondition1Access().getGroup_6(), "rule__PredicatePostCondition1__Group_6__0");
			builder.put(grammarAccess.getPredicatePostCondition2Access().getGroup(), "rule__PredicatePostCondition2__Group__0");
			builder.put(grammarAccess.getPredicatePostCondition2Access().getGroup_5(), "rule__PredicatePostCondition2__Group_5__0");
			builder.put(grammarAccess.getMyZModelAccess().getSystemstatespaceAssignment_0(), "rule__MyZModel__SystemstatespaceAssignment_0");
			builder.put(grammarAccess.getMyZModelAccess().getInitialstateAssignment_1(), "rule__MyZModel__InitialstateAssignment_1");
			builder.put(grammarAccess.getMyZModelAccess().getSchemasAssignment_2(), "rule__MyZModel__SchemasAssignment_2");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getNameAssignment_0_0_4(), "rule__SystemStateSpace__NameAssignment_0_0_4");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getNameAssignment_0_1_0(), "rule__SystemStateSpace__NameAssignment_0_1_0");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getVariablesAssignment_2(), "rule__SystemStateSpace__VariablesAssignment_2");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getVariablesAssignment_3_1(), "rule__SystemStateSpace__VariablesAssignment_3_1");
			builder.put(grammarAccess.getSystemStateSpaceAccess().getPredicateAssignment_4(), "rule__SystemStateSpace__PredicateAssignment_4");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getVasAssignment_0_4(), "rule__SystemStateSpacePredicate__VasAssignment_0_4");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getVasAssignment_0_5_1(), "rule__SystemStateSpacePredicate__VasAssignment_0_5_1");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getFunctionAssignment_0_6(), "rule__SystemStateSpacePredicate__FunctionAssignment_0_6");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getPredicateVarAssignment_0_7(), "rule__SystemStateSpacePredicate__PredicateVarAssignment_0_7");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getVasAssignment_1_3(), "rule__SystemStateSpacePredicate__VasAssignment_1_3");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getVasAssignment_1_4_1(), "rule__SystemStateSpacePredicate__VasAssignment_1_4_1");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getFunctionAssignment_1_5(), "rule__SystemStateSpacePredicate__FunctionAssignment_1_5");
			builder.put(grammarAccess.getSystemStateSpacePredicateAccess().getPredicateVarAssignment_1_6(), "rule__SystemStateSpacePredicate__PredicateVarAssignment_1_6");
			builder.put(grammarAccess.getInitialStateAccess().getNameAssignment_3(), "rule__InitialState__NameAssignment_3");
			builder.put(grammarAccess.getInitialStateAccess().getVariablesAssignment_5(), "rule__InitialState__VariablesAssignment_5");
			builder.put(grammarAccess.getInitialStateAccess().getVariablesAssignment_6_1(), "rule__InitialState__VariablesAssignment_6_1");
			builder.put(grammarAccess.getInitialStateAccess().getPredAssignment_8(), "rule__InitialState__PredAssignment_8");
			builder.put(grammarAccess.getSchemaAccess().getNameAssignment_0_4(), "rule__Schema__NameAssignment_0_4");
			builder.put(grammarAccess.getSchemaAccess().getStateAssignment_1(), "rule__Schema__StateAssignment_1");
			builder.put(grammarAccess.getSchemaAccess().getNameSchemaAssignment_2(), "rule__Schema__NameSchemaAssignment_2");
			builder.put(grammarAccess.getSchemaAccess().getVarsInputAssignment_4(), "rule__Schema__VarsInputAssignment_4");
			builder.put(grammarAccess.getSchemaAccess().getVarsInputAssignment_5_1(), "rule__Schema__VarsInputAssignment_5_1");
			builder.put(grammarAccess.getSchemaAccess().getVarsOutputAssignment_7(), "rule__Schema__VarsOutputAssignment_7");
			builder.put(grammarAccess.getSchemaAccess().getVarsOutputAssignment_8_1(), "rule__Schema__VarsOutputAssignment_8_1");
			builder.put(grammarAccess.getSchemaAccess().getPredicatesAssignment_9(), "rule__Schema__PredicatesAssignment_9");
			builder.put(grammarAccess.getPredicateAccess().getVasInputAssignment_1(), "rule__Predicate__VasInputAssignment_1");
			builder.put(grammarAccess.getPredicateAccess().getBelongsAssignment_2(), "rule__Predicate__BelongsAssignment_2");
			builder.put(grammarAccess.getPredicateAccess().getBelongsVariableAssignment_3(), "rule__Predicate__BelongsVariableAssignment_3");
			builder.put(grammarAccess.getPredicateAccess().getVasOutputAssignment_5(), "rule__Predicate__VasOutputAssignment_5");
			builder.put(grammarAccess.getPredicateAccess().getVasStateChangeAssignment_7(), "rule__Predicate__VasStateChangeAssignment_7");
			builder.put(grammarAccess.getVariablesAccess().getNameAssignment(), "rule__Variables__NameAssignment");
			builder.put(grammarAccess.getPredicatePostCondition1Access().getCondition11Assignment_0(), "rule__PredicatePostCondition1__Condition11Assignment_0");
			builder.put(grammarAccess.getPredicatePostCondition1Access().getCondition12Assignment_3(), "rule__PredicatePostCondition1__Condition12Assignment_3");
			builder.put(grammarAccess.getPredicatePostCondition1Access().getCondition13Assignment_5(), "rule__PredicatePostCondition1__Condition13Assignment_5");
			builder.put(grammarAccess.getPredicatePostCondition1Access().getCondition13Assignment_6_1(), "rule__PredicatePostCondition1__Condition13Assignment_6_1");
			builder.put(grammarAccess.getPredicatePostCondition2Access().getCondition21Assignment_0(), "rule__PredicatePostCondition2__Condition21Assignment_0");
			builder.put(grammarAccess.getPredicatePostCondition2Access().getCondition22Assignment_2(), "rule__PredicatePostCondition2__Condition22Assignment_2");
			builder.put(grammarAccess.getPredicatePostCondition2Access().getCondition23Assignment_4(), "rule__PredicatePostCondition2__Condition23Assignment_4");
			builder.put(grammarAccess.getPredicatePostCondition2Access().getCondition23Assignment_5_1(), "rule__PredicatePostCondition2__Condition23Assignment_5_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyZDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyZDslParser createParser() {
		InternalMyZDslParser result = new InternalMyZDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyZDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyZDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
