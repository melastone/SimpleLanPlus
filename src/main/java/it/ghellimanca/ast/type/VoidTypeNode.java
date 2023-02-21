package it.ghellimanca.ast.type;

import it.ghellimanca.semanticanalysis.*;

import java.util.ArrayList;

public class VoidTypeNode extends TypeNode {

    @Override
    public String toPrint(String indent) {
        return "\n" + indent + "TYPE: " + "void";
    }

    @Override
    public TypeNode typeCheck() { return null; }

    @Override
    public String codeGeneration() {
        return "";
    }

    @Override
    public ArrayList<SemanticWarning> checkSemantics(Environment env) throws MultipleDeclarationException, MissingDeclarationException, MissingInitializationException, ParametersCountException {
        return new ArrayList<>();
    }
}
