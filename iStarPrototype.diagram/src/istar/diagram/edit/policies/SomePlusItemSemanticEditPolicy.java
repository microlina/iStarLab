/*
 * 
 */
package istar.diagram.edit.policies;

import istar.diagram.providers.IstarElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class SomePlusItemSemanticEditPolicy extends
		IstarBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SomePlusItemSemanticEditPolicy() {
		super(IstarElementTypes.SomePlus_4029);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
