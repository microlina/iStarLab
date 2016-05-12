/*
 * 
 */
package istar.diagram.edit.commands;

import istar.Agent;
import istar.Occupies;
import istar.Position;
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
public class OccupiesReorientCommand extends EditElementCommand {

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
	public OccupiesReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Occupies) {
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
		Position target = getLink().getOccupiesPosition();
		if (!(getLink().eContainer() instanceof istar.ISTAR)) {
			return false;
		}
		istar.ISTAR container = (istar.ISTAR) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistOccupies_4023(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Position && newEnd instanceof Position)) {
			return false;
		}
		Agent source = getLink().getOccupiesAgent();
		if (!(getLink().eContainer() instanceof istar.ISTAR)) {
			return false;
		}
		istar.ISTAR container = (istar.ISTAR) getLink().eContainer();
		return IstarBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistOccupies_4023(container, getLink(), source,
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
		getLink().setOccupiesAgent(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setOccupiesPosition(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Occupies getLink() {
		return (Occupies) getElementToEdit();
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
	protected Position getOldTarget() {
		return (Position) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Position getNewTarget() {
		return (Position) newEnd;
	}
}
