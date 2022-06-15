import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

public class Tradutor extends GramaticaBaseListener {
    private static HashMap<String, String> varList = new HashMap<String, String>();

    public static boolean checkVariables(String var) {
        for (String key : varList.keySet()) {
            if (key.equals(var)) {
                return true;
            }
        }
        return false;
    }

    private void checkType(String varType, String[] token) {
        String currentType = "";

        if (token[1].charAt(0) == '"') {
            currentType = "text";
        }
        else if (token[1].charAt(0) == 't' || token[1].charAt(0) == 'f') {
            currentType = "boolean";
        }
        else if (token[1].matches("\\d+")) {
            currentType = "integer";
        }
        else if (token[1].matches("\\d+.\\d+")) {
            currentType = "decimal";
        }
        else {
            System.out.println("// TIPO INVALIDO");
        }

        if (!currentType.equals("")) {
            if (!varType.equals(currentType)) {
                System.out.println("// TIPOS INCOMPATIVEIS");
            }
        }
    }

    @Override
    public void enterInit(GramaticaParser.InitContext ctx) {
        System.out.println("import java.util.Scanner;");
        System.out.println("public class Main {");
    }

    @Override
    public void exitInit(GramaticaParser.InitContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterStart(GramaticaParser.StartContext ctx) {
        System.out.println("public static void main(String[] args){");
        System.out.println("Scanner scanner = new Scanner(System.in);");
    }


    @Override
    public void exitFinish(GramaticaParser.FinishContext ctx) {
        System.out.println("}");
    }


    @Override
    public void enterDeclare_variable(GramaticaParser.Declare_variableContext ctx) {
        if(!checkVariables(ctx.id().getText())) {
            varList.put(ctx.id().getText(), ctx.type_var().getText());
        } else {
            System.out.print("// VARIAVEL JA EXISTE : ");
            return;
        }

        String varType = ctx.type_var().getText();
        String[] arrayToken = ctx.getText().split("=");

        checkType(varType, arrayToken);
    }

    @Override
    public void enterAssign_value(GramaticaParser.Assign_valueContext ctx) {
        if(ctx.id() != null && !checkVariables(ctx.id().getText())) {
            System.out.println("// VARIAVEL NÃO EXISTE : ");
            return;
        }

        String varType = varList.get(ctx.id().getText());
        String[] varArray = ctx.getText().split("=");

        checkType(varType, varArray);
    }

    @Override
    public void enterReserved(GramaticaParser.ReservedContext ctx) {
        if(ctx.id() != null && !checkVariables(ctx.id().getText())) {
            System.out.print("// VARIAVEL NÃO EXISTE : ");
        }
    }


    @Override
    public void exitIncrementer_for(GramaticaParser.Incrementer_forContext ctx) {
        if(ctx.id() != null && !checkVariables(ctx.id().getText())) {
            System.out.print("// VARIAVEL NÃO EXISTE : ");
            return;
        }

        String tipoVar = varList.get(ctx.id().getText());

        if (!tipoVar.equals("inteiro")) {
            System.out.println("// VARIAVEL NAO É UM INTEIRO");
            return;
        }

        System.out.print(ctx.incrementer_type().getText());
    }

    @Override
    public void enterPrint_function(GramaticaParser.Print_functionContext ctx) {
        System.out.print("System.out.println");
    }

    @Override
    public void enterType_var(GramaticaParser.Type_varContext ctx) {
        switch (ctx.getText()) {
            case "integer" -> System.out.print("int");
            case "boolean" -> System.out.print("boolean");
            case "text" -> System.out.print("String");
            case "decimal" -> System.out.print("double");
            default -> {
            }
        }
    }

    @Override
    public void exitType_var(GramaticaParser.Type_varContext ctx) {
            System.out.print(" ");
    }

    @Override
    public void enterEnd_line(GramaticaParser.End_lineContext ctx) {
        System.out.print(";");
    }

    @Override
    public void exitEnd_line(GramaticaParser.End_lineContext ctx) {
        System.out.println("");
    }

    @Override
    public void enterAssignment_signal(GramaticaParser.Assignment_signalContext ctx) {
        System.out.print(ctx.getText());
    }

    @Override
    public void enterMult(GramaticaParser.MultContext ctx) {
        System.out.print("*");
    }

    @Override
    public void exitMult(GramaticaParser.MultContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterDiv(GramaticaParser.DivContext ctx) {
        System.out.print("/");
    }

    @Override
    public void exitDiv(GramaticaParser.DivContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterSum(GramaticaParser.SumContext ctx) {
        System.out.print("+");
    }

    @Override
    public void exitSum(GramaticaParser.SumContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterSub(GramaticaParser.SubContext ctx) {
        System.out.print("-");
    }

    @Override
    public void exitSub(GramaticaParser.SubContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterNull_type(GramaticaParser.Null_typeContext ctx) {
        System.out.print("NULL");
    }

    @Override
    public void exitNull_type(GramaticaParser.Null_typeContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterNot(GramaticaParser.NotContext ctx) {
        System.out.print("!");
    }

    @Override
    public void exitNot(GramaticaParser.NotContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterOpen_parenthesis(GramaticaParser.Open_parenthesisContext ctx) {
        System.out.print("(");
    }



    @Override
    public void enterClose_parenthesis(GramaticaParser.Close_parenthesisContext ctx) {
        System.out.print(")");
    }



    @Override
    public void enterOpen_bracket(GramaticaParser.Open_bracketContext ctx) {
        System.out.print("{");
    }

    @Override
    public void exitOpen_bracket(GramaticaParser.Open_bracketContext ctx) {
        System.out.println("");
    }

    @Override
    public void enterClose_bracket(GramaticaParser.Close_bracketContext ctx) {
        System.out.print("}");
    }

    @Override
    public void exitClose_bracket(GramaticaParser.Close_bracketContext ctx) {
        System.out.println("");
    }

    @Override
    public void enterLesser_equal(GramaticaParser.Lesser_equalContext ctx) {
        System.out.print("<=");
    }

    @Override
    public void exitLesser_equal(GramaticaParser.Lesser_equalContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterGreater_equal(GramaticaParser.Greater_equalContext ctx) {
        System.out.print(">=");
    }

    @Override
    public void exitGreater_equal(GramaticaParser.Greater_equalContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterLesser(GramaticaParser.LesserContext ctx) {
        System.out.print("<");
    }

    @Override
    public void exitLesser(GramaticaParser.LesserContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterGreater(GramaticaParser.GreaterContext ctx) {
        System.out.print(">");
    }

    @Override
    public void exitGreater(GramaticaParser.GreaterContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterEqual(GramaticaParser.EqualContext ctx) {
        System.out.print("==");
    }

    @Override
    public void exitEqual(GramaticaParser.EqualContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterNot_equal(GramaticaParser.Not_equalContext ctx) {
        System.out.print("!=");
    }

    @Override
    public void exitNot_equal(GramaticaParser.Not_equalContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterAnd(GramaticaParser.AndContext ctx) {
        System.out.print("&&");
    }

    @Override
    public void exitAnd(GramaticaParser.AndContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterOr(GramaticaParser.OrContext ctx) {
        System.out.print("||");
    }

    @Override
    public void exitOr(GramaticaParser.OrContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterIf_stmt(GramaticaParser.If_stmtContext ctx) {
        System.out.print("if");
    }

    @Override
    public void exitIf_stmt(GramaticaParser.If_stmtContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterElse_stmt(GramaticaParser.Else_stmtContext ctx) {
        System.out.println("else");
    }

    @Override
    public void exitElse_stmt(GramaticaParser.Else_stmtContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterTrue_type(GramaticaParser.True_typeContext ctx) {
        System.out.print("true");
    }

    @Override
    public void exitTrue_type(GramaticaParser.True_typeContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterFalse_type(GramaticaParser.False_typeContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void exitFalse_type(GramaticaParser.False_typeContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterText(GramaticaParser.TextContext ctx) {
        System.out.print(ctx.getText());
    }

    @Override
    public void exitText(GramaticaParser.TextContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterWhile_stmt(GramaticaParser.While_stmtContext ctx) {
        System.out.print("while");
    }

    @Override
    public void exitWhile_stmt(GramaticaParser.While_stmtContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterAttribute_separator(GramaticaParser.Attribute_separatorContext ctx) {
        System.out.print(";");
    }

    @Override
    public void exitAttribute_separator(GramaticaParser.Attribute_separatorContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterRead(GramaticaParser.ReadContext ctx) {
        System.out.print("scanner.nextLine");
    }

    @Override
    public void enterFor_stmt(GramaticaParser.For_stmtContext ctx) {
        System.out.print("for");
    }

    @Override
    public void exitFor_stmt(GramaticaParser.For_stmtContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterId(GramaticaParser.IdContext ctx) {
        System.out.print(ctx.ID().getText());
    }

    @Override
    public void enterDecimal(GramaticaParser.DecimalContext ctx) {
        System.out.print(ctx.getText());
    }

    @Override
    public void exitDecimal(GramaticaParser.DecimalContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterInteger(GramaticaParser.IntegerContext ctx) {
        System.out.print(ctx.getText());
    }

    @Override
    public void exitInteger(GramaticaParser.IntegerContext ctx) {
        System.out.print(" ");
    }

}
