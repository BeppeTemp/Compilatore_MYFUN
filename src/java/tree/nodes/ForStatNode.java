package tree.nodes;

import java.util.ArrayList;

import symbol_table.ValueType;
import tree.leaves.LeafID;
import visitor.CodeGen_Int_Visitable;
import visitor.CodeGen_Int_Visitor;
import visitor.Semantic_Int_Visitable;
import visitor.Semantic_Int_Visitor;

public class ForStatNode implements Semantic_Int_Visitable, CodeGen_Int_Visitable {
    // Attributi
    public String name = "ForStatNode";
    //Definizione
    public LeafID id;
    public ConstNode constNode;
    // Condizione
    public ExprNode expr;
    // Incremento
    public AssignStatNode assignStatNode;
    // Corpo
    public ArrayList<VarDeclNode> varDeclList;
    public ArrayList<StatNode> statList;

    // Controllo semantico
    public ValueType type = null;

    // Costruttore
    public ForStatNode(LeafID id, ConstNode constNode, ExprNode expr, AssignStatNode assignStatNode, ArrayList<VarDeclNode> varDeclList, ArrayList<StatNode> statList) {
        this.id = id;
        this.constNode = constNode;
        this.expr = expr;
        this.assignStatNode = assignStatNode;
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