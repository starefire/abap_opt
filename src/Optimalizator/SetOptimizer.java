// Generated from C:/Users/Honza/Desktop/Skola/DP/DP_ABAP_compiler/DP_ABAP_compiler\optimalizator.g4 by ANTLR 4.8

package Optimalizator;

import Optimalizator.gen.optimalizatorBaseVisitor;
import Optimalizator.gen.optimalizatorParser;
import Optimalizator.gen.optimalizatorVisitor;

/**
 * This class provides an empty implementation of {@link optimalizatorVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class SetOptimizer<T> extends optimalizatorBaseVisitor<T> implements optimalizatorVisitor<T> {

	@Override
	public T visitRead(optimalizatorParser.ReadContext ctx) {
		Optimalizator optimalizator = Optimalizator.getINSTANCE();
		optimalizator.set_opt_read();

		return null;
	}

	@Override
	public T visitPrefix(optimalizatorParser.PrefixContext ctx) {
		Optimalizator optimalizator = Optimalizator.getINSTANCE();
		optimalizator.set_opt_var(ctx.prf.getText());

		return null;
	}

	@Override
	public T visitSelectOpt(optimalizatorParser.SelectOptContext ctx) {
		Optimalizator optimalizator = Optimalizator.getINSTANCE();
		optimalizator.set_opt_select();

		return null;
	}



}