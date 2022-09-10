package it.ghellimanca.ast.exp;

import it.ghellimanca.semanticanalysis.Environment;
import it.ghellimanca.semanticanalysis.SemanticError;
import it.ghellimanca.ast.Node;
import it.ghellimanca.ast.type.TypeNode;

import java.util.ArrayList;

/**
 * Represents the new operator 'new' type node in the AST.
 */
public class NewExpNode extends ExpNode {

    final TypeNode type;


    public NewExpNode(TypeNode type) {
        this.type = type;
    }


    @Override
    public String toPrint(String indent) {
        return "\n" + indent + "NEW_EXP" + type.toPrint(indent + "\t");
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        return new ArrayList<>();
    }

    @Override
    public Node typeCheck() {
        return null;
    }
}
