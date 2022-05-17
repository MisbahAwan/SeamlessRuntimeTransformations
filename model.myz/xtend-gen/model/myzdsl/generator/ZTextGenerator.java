package model.myzdsl.generator;

import model.myzdsl.myZDsl.InitialState;
import model.myzdsl.myZDsl.MyZModel;
import model.myzdsl.myZDsl.Predicate;
import model.myzdsl.myZDsl.PredicatePostCondition1;
import model.myzdsl.myZDsl.PredicatePostCondition2;
import model.myzdsl.myZDsl.Schema;
import model.myzdsl.myZDsl.SystemStateSpace;
import model.myzdsl.myZDsl.SystemStateSpacePredicate;
import model.myzdsl.myZDsl.Variables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ZTextGenerator {
  public static CharSequence toText(final MyZModel zmodel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<SystemStateSpace> _systemstatespace = zmodel.getSystemstatespace();
      for(final SystemStateSpace p : _systemstatespace) {
        _builder.append("_____");
        String _name = p.getName();
        _builder.append(_name);
        _builder.append("_________________\n");
        _builder.newLineIfNotEmpty();
        {
          EList<Variables> _variables = p.getVariables();
          for(final Variables q : _variables) {
            String _name_1 = q.getName();
            _builder.append(_name_1);
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("_________________________________");
        _builder.newLineIfNotEmpty();
        {
          EList<SystemStateSpacePredicate> _predicate = p.getPredicate();
          for(final SystemStateSpacePredicate r : _predicate) {
            {
              EList<Variables> _vas = r.getVas();
              for(final Variables s : _vas) {
                String _name_2 = s.getName();
                _builder.append(_name_2);
                _builder.append(" = ");
                String _function = r.getFunction();
                _builder.append(_function);
                _builder.append(" ");
                String _name_3 = r.getPredicateVar().getName();
                _builder.append(_name_3);
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("_________________________________");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("*");
    _builder.newLine();
    _builder.newLine();
    {
      EList<InitialState> _initialstate = zmodel.getInitialstate();
      for(final InitialState p_1 : _initialstate) {
        _builder.append("_____");
        String _name_4 = p_1.getName();
        _builder.append(_name_4);
        _builder.append("____________\n");
        _builder.newLineIfNotEmpty();
        {
          EList<Variables> _variables_1 = p_1.getVariables();
          for(final Variables q_1 : _variables_1) {
            String _name_5 = q_1.getName();
            _builder.append(_name_5);
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("_________________________________");
        _builder.newLineIfNotEmpty();
        {
          EList<Variables> _pred = p_1.getPred();
          for(final Variables r_1 : _pred) {
            String _name_6 = r_1.getName();
            _builder.append(_name_6);
            _builder.append(" = EMPTY ");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("_________________________________");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("*");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Schema> _schemas = zmodel.getSchemas();
      for(final Schema p_2 : _schemas) {
        _builder.append("_____");
        String _name_7 = p_2.getName();
        _builder.append(_name_7);
        _builder.append("_________________\n");
        _builder.newLineIfNotEmpty();
        String _state = p_2.getState();
        _builder.append(_state);
        _builder.append(" in ");
        String _nameSchema = p_2.getNameSchema();
        _builder.append(_nameSchema);
        _builder.append("\n");
        _builder.newLineIfNotEmpty();
        {
          EList<Variables> _varsInput = p_2.getVarsInput();
          for(final Variables q_2 : _varsInput) {
            String _name_8 = q_2.getName();
            _builder.append(_name_8);
            _builder.append("? : ");
            String _upperCase = q_2.getName().toUpperCase();
            _builder.append(_upperCase);
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<Variables> _varsOutput = p_2.getVarsOutput();
          for(final Variables q_3 : _varsOutput) {
            String _name_9 = q_3.getName();
            _builder.append(_name_9);
            _builder.append("! : ");
            String _upperCase_1 = q_3.getName().toUpperCase();
            _builder.append(_upperCase_1);
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("_________________________________");
        _builder.newLineIfNotEmpty();
        {
          EList<Predicate> _predicates = p_2.getPredicates();
          for(final Predicate r_2 : _predicates) {
            {
              EList<Variables> _vasInput = r_2.getVasInput();
              for(final Variables s_1 : _vasInput) {
                String _name_10 = s_1.getName();
                _builder.append(_name_10);
                _builder.append("? ");
                String _belongs = r_2.getBelongs();
                _builder.append(_belongs);
                _builder.append(" ");
                String _name_11 = r_2.getBelongsVariable().getName();
                _builder.append(_name_11);
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              EList<PredicatePostCondition2> _vasOutput = r_2.getVasOutput();
              for(final PredicatePostCondition2 s_2 : _vasOutput) {
                String _name_12 = s_2.getCondition21().getName();
                _builder.append(_name_12);
                _builder.append("! = ");
                String _name_13 = s_2.getCondition23().getName();
                _builder.append(_name_13);
                _builder.append(" (");
                String _name_14 = s_2.getCondition22().getName();
                _builder.append(_name_14);
                _builder.append("?)");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              EList<PredicatePostCondition1> _vasStateChange = r_2.getVasStateChange();
              for(final PredicatePostCondition1 s_3 : _vasStateChange) {
                String _name_15 = s_3.getCondition11().getName();
                _builder.append(_name_15);
                _builder.append("\'= ");
                String _name_16 = s_3.getCondition11().getName();
                _builder.append(_name_16);
                _builder.append(" U {");
                String _name_17 = s_3.getCondition12().getName();
                _builder.append(_name_17);
                _builder.append("? ->");
                String _name_18 = s_3.getCondition13().getName();
                _builder.append(_name_18);
                _builder.append("?}");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("_________________________________");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        _builder.append("*");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.newLine();
    return _builder;
  }
}
