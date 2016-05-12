/*
 * 
 */
package istar.diagram.edit.commands;

import istar.Actor;
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
public class ISAReorientCommand extends EditElementCommand {

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
	public ISAReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof istar.ISA) {
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
		if (!(oldEnd instanceof Actor && newEnd instanceof Actor)) {
			return false;
		}
		Actor target = getLink().getISAsecondActor();
		if (!(getLink().eContainer() instanceof istar.ISTAR)) {
			return false;
		}
		istar.ISTAR container = (istar.ISTAR) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistISA_4019(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Actor && newEnd instanceof Actor)) {
			return false;
		}
		Actor source = getLink().getISAactor();
		if (!(getLink().eContainer() instanceof istar.ISTAR)) {
			return false;
		}
		istar.ISTAR container = (istar.ISTAR) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistISA_4019(container, getLink(), source, getNewTarget());
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
		getLink().setISAactor(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setISAsecondActor(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected istar.ISA getLink() {
		return (istar.ISA) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Actor getOldSource() {
		return (Actor) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Actor getNewSource() {
		return (Actor) newEnd;
	}

	/**
	 * @generated
	 */
	protected Actor getOldTarget() {
		return (Actor) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Actor getNewTarget() {
		return (Actor) newEnd;
	}
}
