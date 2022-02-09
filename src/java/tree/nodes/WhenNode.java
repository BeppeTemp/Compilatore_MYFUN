package tree.nodes;

import java.util.ArrayList;

import symbol_table.ValueType;
import visitor.CodeGen_Int_Visitable;
import visitor.CodeGen_Int_Visitor;
import visitor.Semantic_Int_Visitable;
import visitor.Semantic_Int_Visitor;

public class WhenNode implements Semantic_Int_Visitable, CodeGen_Int_Visitable {
    // Attributi
    public String name = "WhenNode";
    public ExprNode expr;
    public ArrayList<VarDeclNode> varDeclList;
    public ArrayList<StatNode> statList;

    // Tipo
    public ValueType type = null;

    // Costruttore
    public WhenNode(ExprNode expr, ArrayList<VarDeclNode> varDeclList, ArrayList<StatNode> statList) {
        this.expr = expr;
        this.varDeclList = varDeclList;
        this.statList = statList;
    }



    // Metodi polimorfi per i visitor
    @Override
    public void accept(Semantic_Int_Visitor v) {
        v.visit(this);
    }

    @Override
    public void accept(CodeGen_Int_Visitor v) {
        v.visit(this);
    }
}