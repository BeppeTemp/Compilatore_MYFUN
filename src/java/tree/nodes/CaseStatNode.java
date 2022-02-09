package tree.nodes;

import java.util.ArrayList;

import symbol_table.ValueType;
import visitor.CodeGen_Int_Visitable;
import visitor.CodeGen_Int_Visitor;
import visitor.Semantic_Int_Visitable;
import visitor.Semantic_Int_Visitor;

public class CaseStatNode implements Semantic_Int_Visitable, CodeGen_Int_Visitable {
    // Attributi
    public String name = "CaseStatNode";
    public ExprNode expr;
    public ArrayList<WhenNode> whenList;
    public ElseNode elseNode = null;

    // Tipo
    public ValueType type = null;

    // Costruttore
    public CaseStatNode(ExprNode expr, ArrayList<WhenNode> whenList, ElseNode elseNode) {
        this.expr = expr;
        this.whenList = whenList;
        this.elseNode = elseNode;
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