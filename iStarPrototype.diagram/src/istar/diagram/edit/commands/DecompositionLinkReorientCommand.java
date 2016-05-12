/*
 * 
 */
package istar.diagram.edit.commands;

import istar.DecompositionLink;
import istar.Element;
import istar.Task;
import istar.diagram.edit.policies.IstarBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class DecompositionLinkReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public DecompositionLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof DecompositionLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Task && newEnd instanceof Task)) {
			return false;
		}
		Element target = getLink().getDecompositionElement();
		if (!(getLink().eContainer() instanceof istar.ISTAR)) {
			return false;
		}
		istar.ISTAR container = (istar.ISTAR) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDecompositionLink_4035(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Element && newEnd instanceof Element)) {
			return false;
		}
		Task source = getLink().getDecompositionTask();
		if (!(getLink().eContainer() instanceof istar.ISTAR)) {
			return false;
		}
		istar.ISTAR container = (istar.ISTAR) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistDecompositionLink_4035(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setDecompositionTask(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDecompositionElement(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected DecompositionLink getLink() {
		return (DecompositionLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Task getOldSource() {
		return (Task) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Task getNewSource() {
		return (Task) newEnd;
	}

	/**
	 * @generated
	 */
	protected Element getOldTarget() {
		return (Element) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Element getNewTarget() {
		return (Element) newEnd;
	}
}
