package it.ghellimanca.ast.statement;

import it.ghellimanca.Environment;
import it.ghellimanca.SemanticError;
import it.ghellimanca.ast.IdNode;
import it.ghellimanca.ast.Node;

import java.util.ArrayList;

/**
 * Node of the AST for the deletion statement
 *
 * A deletion has the form:
 * 'delete' ID
 *
 */
public class DeletionNode implements Node {

    final private IdNode id;


    public DeletionNode(IdNode id) {
        this.id = id;
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
