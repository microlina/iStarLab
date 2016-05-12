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
public class IstarModelingAssistantProviderOfResource2EditPart extends
		IstarModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Resource2EditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(Resource2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(10);
		types.add(IstarElementTypes.Make_4025);
		types.add(IstarElementTypes.Break_4026);
		types.add(IstarElementTypes.Help_4027);
		types.add(IstarElementTypes.Hurt_4028);
		types.add(IstarElementTypes.SomePlus_4029);
		types.add(IstarElementTypes.SomeMinus_4030);
		types.add(IstarElementTypes.And_4031);
		types.add(IstarElementTypes.Or_4032);
		types.add(IstarElementTypes.Unknown_4033);
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
		return doGetRelTypesOnSourceAndTarget(
				(Resource2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			Resource2EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.Make_4025);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.Make_4025);
		}
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.Break_4026);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.Break_4026);
		}
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.Help_4027);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.Help_4027);
		}
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.Hurt_4028);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.Hurt_4028);
		}
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.SomePlus_4029);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.SomePlus_4029);
		}
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.SomeMinus_4030);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.SomeMinus_4030);
		}
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.And_4031);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.And_4031);
		}
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.Or_4032);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.Or_4032);
		}
		if (targetEditPart instanceof SoftgoalEditPart) {
			types.add(IstarElementTypes.Unknown_4033);
		}
		if (targetEditPart instanceof Softgoal2EditPart) {
			types.add(IstarElementTypes.Unknown_4033);
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
		return doGetTypesForTarget((Resource2EditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(Resource2EditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == IstarElementTypes.Make_4025) {
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Softgoal_3007);
		} else if (relationshipType == IstarElementTypes.Break_4026) {
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Softgoal_3007);
		} else if (relationshipType == IstarElementTypes.Help_4027) {
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Softgoal_3007);
		} else if (relationshipType == IstarElementTypes.Hurt_4028) {
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Softgoal_3007);
		} else if (relationshipType == IstarElementTypes.SomePlus_4029) {
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Softgoal_3007);
		} else if (relationshipType == IstarElementTypes.SomeMinus_4030) {
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Softgoal_3007);
		} else if (relationshipType == IstarElementTypes.And_4031) {
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Softgoal_3007);
		} else if (relationshipType == IstarElementTypes.Or_4032) {
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Softgoal_3007);
		} else if (relationshipType == IstarElementTypes.Unknown_4033) {
			types.add(IstarElementTypes.Softgoal_2016);
			types.add(IstarElementTypes.Softgoal_3007);
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
		return doGetRelTypesOnTarget((Resource2EditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(Resource2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.DecompositionLink_4035);
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
		return doGetTypesForSource((Resource2EditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(Resource2EditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == IstarElementTypes.DecompositionLink_4035) {
			types.add(IstarElementTypes.Task_2017);
			types.add(IstarElementTypes.Task_3008);
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
