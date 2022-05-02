package it.ghellimanca.ast;

import it.ghellimanca.Environment;
import it.ghellimanca.SemanticError;
import it.ghellimanca.ast.Node;
import it.ghellimanca.ast.declaration.DeclarationNode;
import it.ghellimanca.ast.statement.StatementNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Node of the AST for a block
 *
 * @todo: discuss how to manage empty nodes. should we make 1 constructor and call it with null params in case of empty node, OR should we make both empty constructor and 1 with params?
 *
 */
public class BlockNode implements Node{

    final private List<DeclarationNode> declarations;
    final private List<StatementNode> statements;


    /*
    Constructor for an empty block
     */
    public BlockNode() {
        this.declarations = null;
        this.statements = null;
    }

    /*
    Constructor
     */
    public BlockNode(List<DeclarationNode> declarations, List<StatementNode> statements) {
        this.declarations = declarations;
        this.statements = statements;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        return null;
    }

    @Override
    public Node typeCheck() {
        return null;
    }
}
