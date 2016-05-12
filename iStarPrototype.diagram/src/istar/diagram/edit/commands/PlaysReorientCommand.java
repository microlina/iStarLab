/*
 * 
 */
package istar.diagram.edit.commands;

import istar.Agent;
import istar.Plays;
import istar.Role;
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
public class PlaysReorientCommand extends EditElementCommand {

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
	public PlaysReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Plays) {
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
		if (!(oldEnd instanceof Agent && newEnd instanceof Agent)) {
			return false;
		}
		Role target = getLink().getPlaysRole();
		if (!(getLink().eContainer() instanceof istar.ISTAR)) {
			return false;
		}
		istar.ISTAR container = (istar.ISTAR) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPlays_4021(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Role && newEnd instanceof Role)) {
			return false;
		}
		Agent source = getLink().getPlaysAgent();
		if (!(getLink().eContainer() instanceof istar.ISTAR)) {
			return false;
		}
		istar.ISTAR container = (istar.ISTAR) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPlays_4021(container, getLink(), source,
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
		getLink().setPlaysAgent(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setPlaysRole(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Plays getLink() {
		return (Plays) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Agent getOldSource() {
		return (Agent) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Agent getNewSource() {
		return (Agent) newEnd;
	}

	/**
	 * @generated
	 */
	protected Role getOldTarget() {
		return (Role) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Role getNewTarget() {
		return (Role) newEnd;
	}
}
