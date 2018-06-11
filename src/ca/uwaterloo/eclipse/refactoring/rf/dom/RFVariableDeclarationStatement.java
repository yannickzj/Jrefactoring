package ca.uwaterloo.eclipse.refactoring.rf.dom;

import gr.uom.java.ast.decomposition.StatementType;
import org.eclipse.jdt.core.dom.Statement;

public class RFVariableDeclarationStatement extends RFStatement {

    public RFVariableDeclarationStatement(
            StatementType statementType,
            Statement statement1,
            Statement statement2,
            java.util.List<RFNodeDifference> mapping) {
        super(statementType, statement1, statement2, mapping);
    }
}