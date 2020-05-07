// Generated from Dimensions.g4 by ANTLR 4.8

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DimensionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DimensionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Prog}
	 * labeled alternative in {@link DimensionsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DimensionsParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Stat}
	 * labeled alternative in {@link DimensionsParser#stats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(DimensionsParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declar}
	 * labeled alternative in {@link DimensionsParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclar(DimensionsParser.DeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeNormal}
	 * labeled alternative in {@link DimensionsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNormal(DimensionsParser.TypeNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeVars}
	 * labeled alternative in {@link DimensionsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVars(DimensionsParser.TypeVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimensionsParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(DimensionsParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unitCheck}
	 * labeled alternative in {@link DimensionsParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitCheck(DimensionsParser.UnitCheckContext ctx);
}