/*
 * 
 */
package istar.diagram.providers.assistants;

import istar.diagram.edit.parts.ActorEditPart;
import istar.diagram.edit.parts.AgentEditPart;
import istar.diagram.edit.parts.Belief2EditPart;
import istar.diagram.edit.parts.BeliefEditPart;
import istar.diagram.edit.parts.Goal2EditPart;
import istar.diagram.edit.parts.GoalEditPart;
import istar.diagram.edit.parts.PositionEditPart;
import istar.diagram.edit.parts.Resource2EditPart;
import istar.diagram.edit.parts.ResourceEditPart;
import istar.diagram.edit.parts.RoleEditPart;
import istar.diagram.edit.parts.Softgoal2EditPart;
import istar.diagram.edit.parts.SoftgoalEditPart;
import istar.diagram.edit.parts.Task2EditPart;
import istar.diagram.edit.parts.TaskEditPart;
import istar.diagram.providers.IstarElementTypes;
import istar.diagram.providers.IstarModelingAssistantProvider;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class IstarModelingAssistantProviderOfActorEditPart extends
		IstarModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ActorEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ActorEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(IstarElementTypes.ISA_4019);
		types.add(IstarElementTypes.IsPartOf_4020);
		types.add(IstarElementTypes.DependencyLink_4036);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ActorEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ActorEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ActorEditPart) {
			types.add(IstarElementTypes.ISA_4019);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(IstarElementTypes.IsPartOf_4020);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof AgentEditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof PositionEditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof GoalEditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof TaskEditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof ResourceEditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof BeliefEditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof Goal2EditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof Task2EditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof Resource2EditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		if (targetEditPart instanceof Belief2EditPart) {
			types.add(IstarElementTypes.DependencyLink_4036);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ActorEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ActorEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == IstarElementTypes.ISA_4019) {
			types.add(IstarElementTypes.Actor_2011);
		} else if (relationshipType == IstarElementTypes.IsPartOf_4020) {
			types.add(IstarElementTypes.Actor_2011);
		} else if (relationshipType == IstarElementTypes.DependencyLink_4036) {
			types.add(IstarElementTypes.Actor_2011);
			types.add(IstarElementTypes.Agent_2012);
			types.add(IstarElementTypes.Position_2013);
			types.add(IstarElementTypes.Role_2014);
			types.add(IstarElementTypes.Goal_2015);
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Task_2017);
			types.add(IstarElementTypes.Resource_2018);
			types.add(IstarElementTypes.Belief_2019);
			types.add(IstarElementTypes.Goal_3006);
			types.add(IstarElementTypes.Softgoal_3007);
			types.add(IstarElementTypes.Task_3008);
			types.add(IstarElementTypes.Resource_3009);
			types.add(IstarElementTypes.Belief_3010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ActorEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ActorEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(IstarElementTypes.ISA_4019);
		types.add(IstarElementTypes.IsPartOf_4020);
		types.add(IstarElementTypes.DependencyLink_4036);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ActorEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ActorEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == IstarElementTypes.ISA_4019) {
			types.add(IstarElementTypes.Actor_2011);
		} else if (relationshipType == IstarElementTypes.IsPartOf_4020) {
			types.add(IstarElementTypes.Actor_2011);
		} else if (relationshipType == IstarElementTypes.DependencyLink_4036) {
			types.add(IstarElementTypes.Actor_2011);
			types.add(IstarElementTypes.Agent_2012);
			types.add(IstarElementTypes.Position_2013);
			types.add(IstarElementTypes.Role_2014);
			types.add(IstarElementTypes.Goal_2015);
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Task_2017);
			types.add(IstarElementTypes.Resource_2018);
			types.add(IstarElementTypes.Belief_2019);
			types.add(IstarElementTypes.Goal_3006);
			types.add(IstarElementTypes.Softgoal_3007);
			types.add(IstarElementTypes.Task_3008);
			types.add(IstarElementTypes.Resource_3009);
			types.add(IstarElementTypes.Belief_3010);
		}
		return types;
	}

}
