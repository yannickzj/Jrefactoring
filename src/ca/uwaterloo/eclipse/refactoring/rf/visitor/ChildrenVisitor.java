package ca.uwaterloo.eclipse.refactoring.rf.visitor;

import ca.uwaterloo.eclipse.refactoring.rf.node.RFStatement;
import ca.uwaterloo.eclipse.refactoring.utility.FileLogger;
import org.eclipse.jdt.core.dom.*;
import org.slf4j.Logger;

public class ChildrenVisitor extends RFVisitor {

    private static Logger log = FileLogger.getLogger(ChildrenVisitor.class);

    public ChildrenVisitor() {}

    @Override
    public boolean visit(RFStatement node) {
        //node.describe();
        //System.out.println("childrenVisitor finish visiting");

        /*
        System.out.println();
        log.info("start to navigate the difference");

        RFVisitor visitor = node.selectVisitor();
        int i = 0;
        for (RFNodeDifference diff: node.getNodeDifferences()) {
            System.out.println();
            log.info("difference " + ++i);
            diff.accept(visitor);
        }
        AST ast = node.getTemplate().getAst();
        //System.out.println("copied statement: " + (Statement) ASTNode.copySubtree(ast, node.getStatement1()));
        node.getTemplate().addStatement((Statement)ASTNode.copySubtree(ast, node.getStatement1()));
        System.out.println();
        log.info("finish navigating the difference");
        System.out.println();
        */

        return true;
    }

    @Override
    public void endVisit(RFStatement node) {
        super.endVisit(node);
        //log.info("finish visiting RFStatement [Type: " + node.getStatementTypeString() + "]");
    }

    @Override
    public boolean visit(SimpleName node) {
        System.out.println("visiting SimpleName: " + node);
        node.getParent().accept(this);
        return false;
    }

    @Override
    public boolean visit(SimpleType node) {
        System.out.println("visiting SimpleType: " + node);
        node.getParent().accept(this);
        //System.out.println("Simple Type [" + node + "]'s parent node type: " + node.getParent().getNodeType());
        return false;
    }

}