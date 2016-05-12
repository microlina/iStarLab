/*
 * 
 */
package istar.diagram.part;

import istar.Actor;
import istar.Agent;
import istar.And;
import istar.Belief;
import istar.Break;
import istar.Covers;
import istar.DecompositionLink;
import istar.DependencyLink;
import istar.Element;
import istar.Goal;
import istar.Help;
import istar.Hurt;
import istar.IsPartOf;
import istar.IstarPackage;
import istar.Make;
import istar.MeansEnd;
import istar.Node;
import istar.Occupies;
import istar.Or;
import istar.Plays;
import istar.Position;
import istar.Resource;
import istar.Role;
import istar.Softgoal;
import istar.SomeMinus;
import istar.SomePlus;
import istar.Task;
import istar.Unknown;
import istar.diagram.edit.parts.ActorActorHasElementCompartmentEditPart;
import istar.diagram.edit.parts.ActorEditPart;
import istar.diagram.edit.parts.AgentAgentHasElementCompartmentEditPart;
import istar.diagram.edit.parts.AgentEditPart;
import istar.diagram.edit.parts.AndEditPart;
import istar.diagram.edit.parts.Belief2EditPart;
import istar.diagram.edit.parts.BeliefEditPart;
import istar.diagram.edit.parts.BreakEditPart;
import istar.diagram.edit.parts.CoversEditPart;
import istar.diagram.edit.parts.DecompositionLinkEditPart;
import istar.diagram.edit.parts.DependencyLinkEditPart;
import istar.diagram.edit.parts.Goal2EditPart;
import istar.diagram.edit.parts.GoalEditPart;
import istar.diagram.edit.parts.HelpEditPart;
import istar.diagram.edit.parts.HurtEditPart;
import istar.diagram.edit.parts.INSEditPart;
import istar.diagram.edit.parts.ISAEditPart;
import istar.diagram.edit.parts.ISTAREditPart;
import istar.diagram.edit.parts.IsPartOfEditPart;
import istar.diagram.edit.parts.MakeEditPart;
import istar.diagram.edit.parts.MeansEndEditPart;
import istar.diagram.edit.parts.OccupiesEditPart;
import istar.diagram.edit.parts.OrEditPart;
import istar.diagram.edit.parts.PlaysEditPart;
import istar.diagram.edit.parts.PositionEditPart;
import istar.diagram.edit.parts.PositionPositionHasElementCompartmentEditPart;
import istar.diagram.edit.parts.Resource2EditPart;
import istar.diagram.edit.parts.ResourceEditPart;
import istar.diagram.edit.parts.RoleEditPart;
import istar.diagram.edit.parts.RoleRoleHasElementCompartmentEditPart;
import istar.diagram.edit.parts.Softgoal2EditPart;
import istar.diagram.edit.parts.SoftgoalEditPart;
import istar.diagram.edit.parts.SomeMinusEditPart;
import istar.diagram.edit.parts.SomePlusEditPart;
import istar.diagram.edit.parts.Task2EditPart;
import istar.diagram.edit.parts.TaskEditPart;
import istar.diagram.edit.parts.UnknownEditPart;
import istar.diagram.providers.IstarElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class IstarDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<IstarNodeDescriptor> getSemanticChildren(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case ISTAREditPart.VISUAL_ID:
			return getISTAR_1000SemanticChildren(view);
		case ActorActorHasElementCompartmentEditPart.VISUAL_ID:
			return getActorActorHasElementCompartment_7005SemanticChildren(view);
		case AgentAgentHasElementCompartmentEditPart.VISUAL_ID:
			return getAgentAgentHasElementCompartment_7006SemanticChildren(view);
		case PositionPositionHasElementCompartmentEditPart.VISUAL_ID:
			return getPositionPositionHasElementCompartment_7007SemanticChildren(view);
		case RoleRoleHasElementCompartmentEditPart.VISUAL_ID:
			return getRoleRoleHasElementCompartment_7008SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarNodeDescriptor> getISTAR_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		istar.ISTAR modelElement = (istar.ISTAR) view.getElement();
		LinkedList<IstarNodeDescriptor> result = new LinkedList<IstarNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasNode().iterator(); it
				.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = IstarVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AgentEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PositionEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GoalEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SoftgoalEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TaskEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ResourceEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BeliefEditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarNodeDescriptor> getActorActorHasElementCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Actor modelElement = (Actor) containerView.getElement();
		LinkedList<IstarNodeDescriptor> result = new LinkedList<IstarNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasElement().iterator(); it
				.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = IstarVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Goal2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Softgoal2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Task2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Resource2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Belief2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarNodeDescriptor> getAgentAgentHasElementCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Agent modelElement = (Agent) containerView.getElement();
		LinkedList<IstarNodeDescriptor> result = new LinkedList<IstarNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasElement().iterator(); it
				.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = IstarVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Goal2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Softgoal2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Task2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Resource2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Belief2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarNodeDescriptor> getPositionPositionHasElementCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Position modelElement = (Position) containerView.getElement();
		LinkedList<IstarNodeDescriptor> result = new LinkedList<IstarNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasElement().iterator(); it
				.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = IstarVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Goal2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Softgoal2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Task2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Resource2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Belief2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarNodeDescriptor> getRoleRoleHasElementCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Role modelElement = (Role) containerView.getElement();
		LinkedList<IstarNodeDescriptor> result = new LinkedList<IstarNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasElement().iterator(); it
				.hasNext();) {
			Element childElement = (Element) it.next();
			int visualID = IstarVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Goal2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Softgoal2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Task2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Resource2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Belief2EditPart.VISUAL_ID) {
				result.add(new IstarNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getContainedLinks(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case ISTAREditPart.VISUAL_ID:
			return getISTAR_1000ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2011ContainedLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2012ContainedLinks(view);
		case PositionEditPart.VISUAL_ID:
			return getPosition_2013ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2014ContainedLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2015ContainedLinks(view);
		case SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2016ContainedLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2017ContainedLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2018ContainedLinks(view);
		case BeliefEditPart.VISUAL_ID:
			return getBelief_2019ContainedLinks(view);
		case Goal2EditPart.VISUAL_ID:
			return getGoal_3006ContainedLinks(view);
		case Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3007ContainedLinks(view);
		case Task2EditPart.VISUAL_ID:
			return getTask_3008ContainedLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3009ContainedLinks(view);
		case Belief2EditPart.VISUAL_ID:
			return getBelief_3010ContainedLinks(view);
		case ISAEditPart.VISUAL_ID:
			return getISA_4019ContainedLinks(view);
		case IsPartOfEditPart.VISUAL_ID:
			return getIsPartOf_4020ContainedLinks(view);
		case PlaysEditPart.VISUAL_ID:
			return getPlays_4021ContainedLinks(view);
		case CoversEditPart.VISUAL_ID:
			return getCovers_4022ContainedLinks(view);
		case OccupiesEditPart.VISUAL_ID:
			return getOccupies_4023ContainedLinks(view);
		case INSEditPart.VISUAL_ID:
			return getINS_4024ContainedLinks(view);
		case MakeEditPart.VISUAL_ID:
			return getMake_4025ContainedLinks(view);
		case BreakEditPart.VISUAL_ID:
			return getBreak_4026ContainedLinks(view);
		case HelpEditPart.VISUAL_ID:
			return getHelp_4027ContainedLinks(view);
		case HurtEditPart.VISUAL_ID:
			return getHurt_4028ContainedLinks(view);
		case SomePlusEditPart.VISUAL_ID:
			return getSomePlus_4029ContainedLinks(view);
		case SomeMinusEditPart.VISUAL_ID:
			return getSomeMinus_4030ContainedLinks(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_4031ContainedLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_4032ContainedLinks(view);
		case UnknownEditPart.VISUAL_ID:
			return getUnknown_4033ContainedLinks(view);
		case MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_4034ContainedLinks(view);
		case DecompositionLinkEditPart.VISUAL_ID:
			return getDecompositionLink_4035ContainedLinks(view);
		case DependencyLinkEditPart.VISUAL_ID:
			return getDependencyLink_4036ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIncomingLinks(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_2011IncomingLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2012IncomingLinks(view);
		case PositionEditPart.VISUAL_ID:
			return getPosition_2013IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2014IncomingLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2015IncomingLinks(view);
		case SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2016IncomingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2017IncomingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2018IncomingLinks(view);
		case BeliefEditPart.VISUAL_ID:
			return getBelief_2019IncomingLinks(view);
		case Goal2EditPart.VISUAL_ID:
			return getGoal_3006IncomingLinks(view);
		case Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3007IncomingLinks(view);
		case Task2EditPart.VISUAL_ID:
			return getTask_3008IncomingLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3009IncomingLinks(view);
		case Belief2EditPart.VISUAL_ID:
			return getBelief_3010IncomingLinks(view);
		case ISAEditPart.VISUAL_ID:
			return getISA_4019IncomingLinks(view);
		case IsPartOfEditPart.VISUAL_ID:
			return getIsPartOf_4020IncomingLinks(view);
		case PlaysEditPart.VISUAL_ID:
			return getPlays_4021IncomingLinks(view);
		case CoversEditPart.VISUAL_ID:
			return getCovers_4022IncomingLinks(view);
		case OccupiesEditPart.VISUAL_ID:
			return getOccupies_4023IncomingLinks(view);
		case INSEditPart.VISUAL_ID:
			return getINS_4024IncomingLinks(view);
		case MakeEditPart.VISUAL_ID:
			return getMake_4025IncomingLinks(view);
		case BreakEditPart.VISUAL_ID:
			return getBreak_4026IncomingLinks(view);
		case HelpEditPart.VISUAL_ID:
			return getHelp_4027IncomingLinks(view);
		case HurtEditPart.VISUAL_ID:
			return getHurt_4028IncomingLinks(view);
		case SomePlusEditPart.VISUAL_ID:
			return getSomePlus_4029IncomingLinks(view);
		case SomeMinusEditPart.VISUAL_ID:
			return getSomeMinus_4030IncomingLinks(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_4031IncomingLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_4032IncomingLinks(view);
		case UnknownEditPart.VISUAL_ID:
			return getUnknown_4033IncomingLinks(view);
		case MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_4034IncomingLinks(view);
		case DecompositionLinkEditPart.VISUAL_ID:
			return getDecompositionLink_4035IncomingLinks(view);
		case DependencyLinkEditPart.VISUAL_ID:
			return getDependencyLink_4036IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getOutgoingLinks(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_2011OutgoingLinks(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2012OutgoingLinks(view);
		case PositionEditPart.VISUAL_ID:
			return getPosition_2013OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2014OutgoingLinks(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2015OutgoingLinks(view);
		case SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2016OutgoingLinks(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2017OutgoingLinks(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2018OutgoingLinks(view);
		case BeliefEditPart.VISUAL_ID:
			return getBelief_2019OutgoingLinks(view);
		case Goal2EditPart.VISUAL_ID:
			return getGoal_3006OutgoingLinks(view);
		case Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3007OutgoingLinks(view);
		case Task2EditPart.VISUAL_ID:
			return getTask_3008OutgoingLinks(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3009OutgoingLinks(view);
		case Belief2EditPart.VISUAL_ID:
			return getBelief_3010OutgoingLinks(view);
		case ISAEditPart.VISUAL_ID:
			return getISA_4019OutgoingLinks(view);
		case IsPartOfEditPart.VISUAL_ID:
			return getIsPartOf_4020OutgoingLinks(view);
		case PlaysEditPart.VISUAL_ID:
			return getPlays_4021OutgoingLinks(view);
		case CoversEditPart.VISUAL_ID:
			return getCovers_4022OutgoingLinks(view);
		case OccupiesEditPart.VISUAL_ID:
			return getOccupies_4023OutgoingLinks(view);
		case INSEditPart.VISUAL_ID:
			return getINS_4024OutgoingLinks(view);
		case MakeEditPart.VISUAL_ID:
			return getMake_4025OutgoingLinks(view);
		case BreakEditPart.VISUAL_ID:
			return getBreak_4026OutgoingLinks(view);
		case HelpEditPart.VISUAL_ID:
			return getHelp_4027OutgoingLinks(view);
		case HurtEditPart.VISUAL_ID:
			return getHurt_4028OutgoingLinks(view);
		case SomePlusEditPart.VISUAL_ID:
			return getSomePlus_4029OutgoingLinks(view);
		case SomeMinusEditPart.VISUAL_ID:
			return getSomeMinus_4030OutgoingLinks(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_4031OutgoingLinks(view);
		case OrEditPart.VISUAL_ID:
			return getOr_4032OutgoingLinks(view);
		case UnknownEditPart.VISUAL_ID:
			return getUnknown_4033OutgoingLinks(view);
		case MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_4034OutgoingLinks(view);
		case DecompositionLinkEditPart.VISUAL_ID:
			return getDecompositionLink_4035OutgoingLinks(view);
		case DependencyLinkEditPart.VISUAL_ID:
			return getDependencyLink_4036OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getISTAR_1000ContainedLinks(
			View view) {
		istar.ISTAR modelElement = (istar.ISTAR) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ISA_4019(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_IsPartOf_4020(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Plays_4021(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Covers_4022(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Occupies_4023(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_INS_4024(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MeansEnd_4034(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DecompositionLink_4035(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getActor_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getAgent_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getPosition_2013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getRole_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getGoal_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSoftgoal_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getTask_2017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getResource_2018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getBelief_2019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getGoal_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSoftgoal_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getTask_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getResource_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getBelief_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getISA_4019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIsPartOf_4020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getPlays_4021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getCovers_4022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getOccupies_4023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getINS_4024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getMake_4025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getBreak_4026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getHelp_4027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getHurt_4028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSomePlus_4029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSomeMinus_4030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getAnd_4031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getOr_4032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getUnknown_4033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getMeansEnd_4034ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getDecompositionLink_4035ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getDependencyLink_4036ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getActor_2011IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ISA_4019(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IsPartOf_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getAgent_2012IncomingLinks(View view) {
		Agent modelElement = (Agent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_INS_4024(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getPosition_2013IncomingLinks(
			View view) {
		Position modelElement = (Position) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Occupies_4023(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getRole_2014IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Plays_4021(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Covers_4022(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getGoal_2015IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4034(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSoftgoal_2016IncomingLinks(
			View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Make_4025(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Break_4026(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Help_4027(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Hurt_4028(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlus_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomeMinus_4030(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_And_4031(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Or_4032(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Unknown_4033(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getTask_2017IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getResource_2018IncomingLinks(
			View view) {
		Resource modelElement = (Resource) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getBelief_2019IncomingLinks(
			View view) {
		Belief modelElement = (Belief) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getGoal_3006IncomingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_4034(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSoftgoal_3007IncomingLinks(
			View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Make_4025(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Break_4026(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Help_4027(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Hurt_4028(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlus_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomeMinus_4030(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_And_4031(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Or_4032(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Unknown_4033(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getTask_3008IncomingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getResource_3009IncomingLinks(
			View view) {
		Resource modelElement = (Resource) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getBelief_3010IncomingLinks(
			View view) {
		Belief modelElement = (Belief) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DecompositionLink_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DependencyLink_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getISA_4019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIsPartOf_4020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getPlays_4021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getCovers_4022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getOccupies_4023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getINS_4024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getMake_4025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getBreak_4026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getHelp_4027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getHurt_4028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSomePlus_4029IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSomeMinus_4030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getAnd_4031IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getOr_4032IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getUnknown_4033IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getMeansEnd_4034IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getDecompositionLink_4035IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getDependencyLink_4036IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getActor_2011OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ISA_4019(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_IsPartOf_4020(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getAgent_2012OutgoingLinks(View view) {
		Agent modelElement = (Agent) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Plays_4021(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Occupies_4023(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_INS_4024(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getPosition_2013OutgoingLinks(
			View view) {
		Position modelElement = (Position) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Covers_4022(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getRole_2014OutgoingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getGoal_2015OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSoftgoal_2016OutgoingLinks(
			View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getTask_2017OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4034(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DecompositionLink_4035(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getResource_2018OutgoingLinks(
			View view) {
		Resource modelElement = (Resource) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getBelief_2019OutgoingLinks(
			View view) {
		Belief modelElement = (Belief) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getGoal_3006OutgoingLinks(View view) {
		Goal modelElement = (Goal) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSoftgoal_3007OutgoingLinks(
			View view) {
		Softgoal modelElement = (Softgoal) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getTask_3008OutgoingLinks(View view) {
		Task modelElement = (Task) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_4034(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DecompositionLink_4035(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getResource_3009OutgoingLinks(
			View view) {
		Resource modelElement = (Resource) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getBelief_3010OutgoingLinks(
			View view) {
		Belief modelElement = (Belief) view.getElement();
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Make_4025(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Break_4026(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Help_4027(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Hurt_4028(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomePlus_4029(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SomeMinus_4030(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_And_4031(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Or_4032(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Unknown_4033(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DependencyLink_4036(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getISA_4019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getIsPartOf_4020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getPlays_4021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getCovers_4022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getOccupies_4023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getINS_4024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getMake_4025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getBreak_4026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getHelp_4027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getHurt_4028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSomePlus_4029OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getSomeMinus_4030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getAnd_4031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getOr_4032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getUnknown_4033OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getMeansEnd_4034OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getDecompositionLink_4035OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<IstarLinkDescriptor> getDependencyLink_4036OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_ISA_4019(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof istar.ISA) {
				continue;
			}
			istar.ISA link = (istar.ISA) linkObject;
			if (ISAEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getISAsecondActor();
			Actor src = link.getISAactor();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.ISA_4019, ISAEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_IsPartOf_4020(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IsPartOf) {
				continue;
			}
			IsPartOf link = (IsPartOf) linkObject;
			if (IsPartOfEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getIsPartOfSecondActor();
			Actor src = link.getIsPartOfActor();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IsPartOf_4020, IsPartOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_Plays_4021(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Plays) {
				continue;
			}
			Plays link = (Plays) linkObject;
			if (PlaysEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getPlaysRole();
			Agent src = link.getPlaysAgent();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Plays_4021, PlaysEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_Covers_4022(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Covers) {
				continue;
			}
			Covers link = (Covers) linkObject;
			if (CoversEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getCoversRole();
			Position src = link.getCoversPosition();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Covers_4022, CoversEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_Occupies_4023(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Occupies) {
				continue;
			}
			Occupies link = (Occupies) linkObject;
			if (OccupiesEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Position dst = link.getOccupiesPosition();
			Agent src = link.getOccupiesAgent();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Occupies_4023, OccupiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_INS_4024(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof istar.INS) {
				continue;
			}
			istar.INS link = (istar.INS) linkObject;
			if (INSEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Agent dst = link.getINSsecondAgent();
			Agent src = link.getINSagent();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.INS_4024, INSEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_Make_4025(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Make) {
				continue;
			}
			Make link = (Make) linkObject;
			if (MakeEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Make_4025, MakeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_Break_4026(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Break) {
				continue;
			}
			Break link = (Break) linkObject;
			if (BreakEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Break_4026, BreakEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_Help_4027(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Help) {
				continue;
			}
			Help link = (Help) linkObject;
			if (HelpEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Help_4027, HelpEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_Hurt_4028(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Hurt) {
				continue;
			}
			Hurt link = (Hurt) linkObject;
			if (HurtEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Hurt_4028, HurtEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_SomePlus_4029(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SomePlus) {
				continue;
			}
			SomePlus link = (SomePlus) linkObject;
			if (SomePlusEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.SomePlus_4029, SomePlusEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_SomeMinus_4030(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SomeMinus) {
				continue;
			}
			SomeMinus link = (SomeMinus) linkObject;
			if (SomeMinusEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.SomeMinus_4030,
					SomeMinusEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_And_4031(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof And) {
				continue;
			}
			And link = (And) linkObject;
			if (AndEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.And_4031, AndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_Or_4032(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Or) {
				continue;
			}
			Or link = (Or) linkObject;
			if (OrEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Or_4032, OrEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_Unknown_4033(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Unknown) {
				continue;
			}
			Unknown link = (Unknown) linkObject;
			if (UnknownEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Unknown_4033, UnknownEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_MeansEnd_4034(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MeansEnd) {
				continue;
			}
			MeansEnd link = (MeansEnd) linkObject;
			if (MeansEndEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Goal dst = link.getMeansEndGoal();
			Task src = link.getMeansEndTask();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.MeansEnd_4034, MeansEndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_DecompositionLink_4035(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DecompositionLink) {
				continue;
			}
			DecompositionLink link = (DecompositionLink) linkObject;
			if (DecompositionLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getDecompositionElement();
			Task src = link.getDecompositionTask();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.DecompositionLink_4035,
					DecompositionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getContainedTypeModelFacetLinks_DependencyLink_4036(
			istar.ISTAR container) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DependencyLink) {
				continue;
			}
			DependencyLink link = (DependencyLink) linkObject;
			if (DependencyLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getDependencySecondNode();
			Node src = link.getDependencyNode();
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.DependencyLink_4036,
					DependencyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_ISA_4019(
			Actor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getISA_ISAsecondActor()
					|| false == setting.getEObject() instanceof istar.ISA) {
				continue;
			}
			istar.ISA link = (istar.ISA) setting.getEObject();
			if (ISAEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor src = link.getISAactor();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.ISA_4019, ISAEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_IsPartOf_4020(
			Actor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getIsPartOf_IsPartOfSecondActor()
					|| false == setting.getEObject() instanceof IsPartOf) {
				continue;
			}
			IsPartOf link = (IsPartOf) setting.getEObject();
			if (IsPartOfEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor src = link.getIsPartOfActor();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.IsPartOf_4020, IsPartOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_Plays_4021(
			Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getPlays_PlaysRole()
					|| false == setting.getEObject() instanceof Plays) {
				continue;
			}
			Plays link = (Plays) setting.getEObject();
			if (PlaysEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Agent src = link.getPlaysAgent();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.Plays_4021, PlaysEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_Covers_4022(
			Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getCovers_CoversRole()
					|| false == setting.getEObject() instanceof Covers) {
				continue;
			}
			Covers link = (Covers) setting.getEObject();
			if (CoversEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Position src = link.getCoversPosition();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.Covers_4022, CoversEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_Occupies_4023(
			Position target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getOccupies_OccupiesPosition()
					|| false == setting.getEObject() instanceof Occupies) {
				continue;
			}
			Occupies link = (Occupies) setting.getEObject();
			if (OccupiesEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Agent src = link.getOccupiesAgent();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.Occupies_4023, OccupiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_INS_4024(
			Agent target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getINS_INSsecondAgent()
					|| false == setting.getEObject() instanceof istar.INS) {
				continue;
			}
			istar.INS link = (istar.INS) setting.getEObject();
			if (INSEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Agent src = link.getINSagent();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.INS_4024, INSEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_Make_4025(
			Softgoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getContributionLink_ContributionSoftgoal()
					|| false == setting.getEObject() instanceof Make) {
				continue;
			}
			Make link = (Make) setting.getEObject();
			if (MakeEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.Make_4025, MakeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_Break_4026(
			Softgoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getContributionLink_ContributionSoftgoal()
					|| false == setting.getEObject() instanceof Break) {
				continue;
			}
			Break link = (Break) setting.getEObject();
			if (BreakEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.Break_4026, BreakEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_Help_4027(
			Softgoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getContributionLink_ContributionSoftgoal()
					|| false == setting.getEObject() instanceof Help) {
				continue;
			}
			Help link = (Help) setting.getEObject();
			if (HelpEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.Help_4027, HelpEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_Hurt_4028(
			Softgoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getContributionLink_ContributionSoftgoal()
					|| false == setting.getEObject() instanceof Hurt) {
				continue;
			}
			Hurt link = (Hurt) setting.getEObject();
			if (HurtEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.Hurt_4028, HurtEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_SomePlus_4029(
			Softgoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getContributionLink_ContributionSoftgoal()
					|| false == setting.getEObject() instanceof SomePlus) {
				continue;
			}
			SomePlus link = (SomePlus) setting.getEObject();
			if (SomePlusEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.SomePlus_4029, SomePlusEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_SomeMinus_4030(
			Softgoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getContributionLink_ContributionSoftgoal()
					|| false == setting.getEObject() instanceof SomeMinus) {
				continue;
			}
			SomeMinus link = (SomeMinus) setting.getEObject();
			if (SomeMinusEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.SomeMinus_4030,
					SomeMinusEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_And_4031(
			Softgoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getContributionLink_ContributionSoftgoal()
					|| false == setting.getEObject() instanceof And) {
				continue;
			}
			And link = (And) setting.getEObject();
			if (AndEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.And_4031, AndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_Or_4032(
			Softgoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getContributionLink_ContributionSoftgoal()
					|| false == setting.getEObject() instanceof Or) {
				continue;
			}
			Or link = (Or) setting.getEObject();
			if (OrEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.Or_4032, OrEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_Unknown_4033(
			Softgoal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getContributionLink_ContributionSoftgoal()
					|| false == setting.getEObject() instanceof Unknown) {
				continue;
			}
			Unknown link = (Unknown) setting.getEObject();
			if (UnknownEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element src = link.getContributionElement();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.Unknown_4033, UnknownEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_MeansEnd_4034(
			Goal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getMeansEnd_MeansEndGoal()
					|| false == setting.getEObject() instanceof MeansEnd) {
				continue;
			}
			MeansEnd link = (MeansEnd) setting.getEObject();
			if (MeansEndEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getMeansEndTask();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.MeansEnd_4034, MeansEndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_DecompositionLink_4035(
			Element target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getDecompositionLink_DecompositionElement()
					|| false == setting.getEObject() instanceof DecompositionLink) {
				continue;
			}
			DecompositionLink link = (DecompositionLink) setting.getEObject();
			if (DecompositionLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task src = link.getDecompositionTask();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.DecompositionLink_4035,
					DecompositionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getIncomingTypeModelFacetLinks_DependencyLink_4036(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != IstarPackage.eINSTANCE
					.getDependencyLink_DependencySecondNode()
					|| false == setting.getEObject() instanceof DependencyLink) {
				continue;
			}
			DependencyLink link = (DependencyLink) setting.getEObject();
			if (DependencyLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getDependencyNode();
			result.add(new IstarLinkDescriptor(src, target, link,
					IstarElementTypes.DependencyLink_4036,
					DependencyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_ISA_4019(
			Actor source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof istar.ISA) {
				continue;
			}
			istar.ISA link = (istar.ISA) linkObject;
			if (ISAEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getISAsecondActor();
			Actor src = link.getISAactor();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.ISA_4019, ISAEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_IsPartOf_4020(
			Actor source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof IsPartOf) {
				continue;
			}
			IsPartOf link = (IsPartOf) linkObject;
			if (IsPartOfEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getIsPartOfSecondActor();
			Actor src = link.getIsPartOfActor();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.IsPartOf_4020, IsPartOfEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_Plays_4021(
			Agent source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Plays) {
				continue;
			}
			Plays link = (Plays) linkObject;
			if (PlaysEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getPlaysRole();
			Agent src = link.getPlaysAgent();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Plays_4021, PlaysEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_Covers_4022(
			Position source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Covers) {
				continue;
			}
			Covers link = (Covers) linkObject;
			if (CoversEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getCoversRole();
			Position src = link.getCoversPosition();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Covers_4022, CoversEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_Occupies_4023(
			Agent source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Occupies) {
				continue;
			}
			Occupies link = (Occupies) linkObject;
			if (OccupiesEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Position dst = link.getOccupiesPosition();
			Agent src = link.getOccupiesAgent();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Occupies_4023, OccupiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_INS_4024(
			Agent source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof istar.INS) {
				continue;
			}
			istar.INS link = (istar.INS) linkObject;
			if (INSEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Agent dst = link.getINSsecondAgent();
			Agent src = link.getINSagent();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.INS_4024, INSEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_Make_4025(
			Element source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Make) {
				continue;
			}
			Make link = (Make) linkObject;
			if (MakeEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Make_4025, MakeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_Break_4026(
			Element source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Break) {
				continue;
			}
			Break link = (Break) linkObject;
			if (BreakEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Break_4026, BreakEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_Help_4027(
			Element source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Help) {
				continue;
			}
			Help link = (Help) linkObject;
			if (HelpEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Help_4027, HelpEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_Hurt_4028(
			Element source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Hurt) {
				continue;
			}
			Hurt link = (Hurt) linkObject;
			if (HurtEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Hurt_4028, HurtEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_SomePlus_4029(
			Element source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SomePlus) {
				continue;
			}
			SomePlus link = (SomePlus) linkObject;
			if (SomePlusEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.SomePlus_4029, SomePlusEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_SomeMinus_4030(
			Element source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SomeMinus) {
				continue;
			}
			SomeMinus link = (SomeMinus) linkObject;
			if (SomeMinusEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.SomeMinus_4030,
					SomeMinusEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_And_4031(
			Element source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof And) {
				continue;
			}
			And link = (And) linkObject;
			if (AndEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.And_4031, AndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_Or_4032(
			Element source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Or) {
				continue;
			}
			Or link = (Or) linkObject;
			if (OrEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Or_4032, OrEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_Unknown_4033(
			Element source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Unknown) {
				continue;
			}
			Unknown link = (Unknown) linkObject;
			if (UnknownEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Softgoal dst = link.getContributionSoftgoal();
			Element src = link.getContributionElement();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.Unknown_4033, UnknownEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_MeansEnd_4034(
			Task source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MeansEnd) {
				continue;
			}
			MeansEnd link = (MeansEnd) linkObject;
			if (MeansEndEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Goal dst = link.getMeansEndGoal();
			Task src = link.getMeansEndTask();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.MeansEnd_4034, MeansEndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_DecompositionLink_4035(
			Task source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DecompositionLink) {
				continue;
			}
			DecompositionLink link = (DecompositionLink) linkObject;
			if (DecompositionLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Element dst = link.getDecompositionElement();
			Task src = link.getDecompositionTask();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.DecompositionLink_4035,
					DecompositionLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<IstarLinkDescriptor> getOutgoingTypeModelFacetLinks_DependencyLink_4036(
			Node source) {
		istar.ISTAR container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof istar.ISTAR) {
				container = (istar.ISTAR) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<IstarLinkDescriptor> result = new LinkedList<IstarLinkDescriptor>();
		for (Iterator<?> links = container.getHasRelationship().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DependencyLink) {
				continue;
			}
			DependencyLink link = (DependencyLink) linkObject;
			if (DependencyLinkEditPart.VISUAL_ID != IstarVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getDependencySecondNode();
			Node src = link.getDependencyNode();
			if (src != source) {
				continue;
			}
			result.add(new IstarLinkDescriptor(src, dst, link,
					IstarElementTypes.DependencyLink_4036,
					DependencyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<IstarNodeDescriptor> getSemanticChildren(View view) {
			return IstarDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<IstarLinkDescriptor> getContainedLinks(View view) {
			return IstarDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<IstarLinkDescriptor> getIncomingLinks(View view) {
			return IstarDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<IstarLinkDescriptor> getOutgoingLinks(View view) {
			return IstarDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
