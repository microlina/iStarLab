/*
 * 
 */
package istar.diagram.providers;

import istar.IstarPackage;
import istar.diagram.edit.parts.ActorNodeNameEditPart;
import istar.diagram.edit.parts.AgentNodeNameEditPart;
import istar.diagram.edit.parts.AndRelationshipNameEditPart;
import istar.diagram.edit.parts.BeliefNodeName2EditPart;
import istar.diagram.edit.parts.BeliefNodeNameEditPart;
import istar.diagram.edit.parts.BreakRelationshipNameEditPart;
import istar.diagram.edit.parts.CoversRelationshipNameEditPart;
import istar.diagram.edit.parts.DependencyLinkDependencyNameEditPart;
import istar.diagram.edit.parts.GoalNodeName2EditPart;
import istar.diagram.edit.parts.GoalNodeNameEditPart;
import istar.diagram.edit.parts.HelpRelationshipNameEditPart;
import istar.diagram.edit.parts.HurtRelationshipNameEditPart;
import istar.diagram.edit.parts.INSRelationshipNameEditPart;
import istar.diagram.edit.parts.ISARelationshipNameEditPart;
import istar.diagram.edit.parts.IsPartOfRelationshipNameEditPart;
import istar.diagram.edit.parts.MakeRelationshipNameEditPart;
import istar.diagram.edit.parts.OccupiesRelationshipNameEditPart;
import istar.diagram.edit.parts.OrRelationshipNameEditPart;
import istar.diagram.edit.parts.PlaysRelationshipNameEditPart;
import istar.diagram.edit.parts.PositionNodeNameEditPart;
import istar.diagram.edit.parts.ResourceNodeName2EditPart;
import istar.diagram.edit.parts.ResourceNodeNameEditPart;
import istar.diagram.edit.parts.RoleNodeNameEditPart;
import istar.diagram.edit.parts.SoftgoalNodeName2EditPart;
import istar.diagram.edit.parts.SoftgoalNodeNameEditPart;
import istar.diagram.edit.parts.SomeMinusRelationshipNameEditPart;
import istar.diagram.edit.parts.SomePlusRelationshipNameEditPart;
import istar.diagram.edit.parts.TaskNodeName2EditPart;
import istar.diagram.edit.parts.TaskNodeNameEditPart;
import istar.diagram.edit.parts.UnknownRelationshipNameEditPart;
import istar.diagram.parsers.MessageFormatParser;
import istar.diagram.part.IstarVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class IstarParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser actorNodeName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getActorNodeName_5021Parser() {
		if (actorNodeName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorNodeName_5021Parser = parser;
		}
		return actorNodeName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser agentNodeName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getAgentNodeName_5022Parser() {
		if (agentNodeName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			agentNodeName_5022Parser = parser;
		}
		return agentNodeName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser positionNodeName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getPositionNodeName_5023Parser() {
		if (positionNodeName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			positionNodeName_5023Parser = parser;
		}
		return positionNodeName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleNodeName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getRoleNodeName_5024Parser() {
		if (roleNodeName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			roleNodeName_5024Parser = parser;
		}
		return roleNodeName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalNodeName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getGoalNodeName_5025Parser() {
		if (goalNodeName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			goalNodeName_5025Parser = parser;
		}
		return goalNodeName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalNodeName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalNodeName_5026Parser() {
		if (softgoalNodeName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			softgoalNodeName_5026Parser = parser;
		}
		return softgoalNodeName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskNodeName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getTaskNodeName_5027Parser() {
		if (taskNodeName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskNodeName_5027Parser = parser;
		}
		return taskNodeName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceNodeName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getResourceNodeName_5028Parser() {
		if (resourceNodeName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resourceNodeName_5028Parser = parser;
		}
		return resourceNodeName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser beliefNodeName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getBeliefNodeName_5029Parser() {
		if (beliefNodeName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			beliefNodeName_5029Parser = parser;
		}
		return beliefNodeName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalNodeName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getGoalNodeName_5016Parser() {
		if (goalNodeName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			goalNodeName_5016Parser = parser;
		}
		return goalNodeName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalNodeName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalNodeName_5017Parser() {
		if (softgoalNodeName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			softgoalNodeName_5017Parser = parser;
		}
		return softgoalNodeName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskNodeName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getTaskNodeName_5018Parser() {
		if (taskNodeName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			taskNodeName_5018Parser = parser;
		}
		return taskNodeName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceNodeName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getResourceNodeName_5019Parser() {
		if (resourceNodeName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resourceNodeName_5019Parser = parser;
		}
		return resourceNodeName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser beliefNodeName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getBeliefNodeName_5020Parser() {
		if (beliefNodeName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getNode_NodeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			beliefNodeName_5020Parser = parser;
		}
		return beliefNodeName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser iSARelationshipName_6017Parser;

	/**
	 * @generated
	 */
	private IParser getISARelationshipName_6017Parser() {
		if (iSARelationshipName_6017Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iSARelationshipName_6017Parser = parser;
		}
		return iSARelationshipName_6017Parser;
	}

	/**
	 * @generated
	 */
	private IParser isPartOfRelationshipName_6018Parser;

	/**
	 * @generated
	 */
	private IParser getIsPartOfRelationshipName_6018Parser() {
		if (isPartOfRelationshipName_6018Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			isPartOfRelationshipName_6018Parser = parser;
		}
		return isPartOfRelationshipName_6018Parser;
	}

	/**
	 * @generated
	 */
	private IParser playsRelationshipName_6019Parser;

	/**
	 * @generated
	 */
	private IParser getPlaysRelationshipName_6019Parser() {
		if (playsRelationshipName_6019Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			playsRelationshipName_6019Parser = parser;
		}
		return playsRelationshipName_6019Parser;
	}

	/**
	 * @generated
	 */
	private IParser coversRelationshipName_6020Parser;

	/**
	 * @generated
	 */
	private IParser getCoversRelationshipName_6020Parser() {
		if (coversRelationshipName_6020Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			coversRelationshipName_6020Parser = parser;
		}
		return coversRelationshipName_6020Parser;
	}

	/**
	 * @generated
	 */
	private IParser occupiesRelationshipName_6021Parser;

	/**
	 * @generated
	 */
	private IParser getOccupiesRelationshipName_6021Parser() {
		if (occupiesRelationshipName_6021Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			occupiesRelationshipName_6021Parser = parser;
		}
		return occupiesRelationshipName_6021Parser;
	}

	/**
	 * @generated
	 */
	private IParser iNSRelationshipName_6022Parser;

	/**
	 * @generated
	 */
	private IParser getINSRelationshipName_6022Parser() {
		if (iNSRelationshipName_6022Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			iNSRelationshipName_6022Parser = parser;
		}
		return iNSRelationshipName_6022Parser;
	}

	/**
	 * @generated
	 */
	private IParser makeRelationshipName_6023Parser;

	/**
	 * @generated
	 */
	private IParser getMakeRelationshipName_6023Parser() {
		if (makeRelationshipName_6023Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			makeRelationshipName_6023Parser = parser;
		}
		return makeRelationshipName_6023Parser;
	}

	/**
	 * @generated
	 */
	private IParser breakRelationshipName_6024Parser;

	/**
	 * @generated
	 */
	private IParser getBreakRelationshipName_6024Parser() {
		if (breakRelationshipName_6024Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			breakRelationshipName_6024Parser = parser;
		}
		return breakRelationshipName_6024Parser;
	}

	/**
	 * @generated
	 */
	private IParser helpRelationshipName_6025Parser;

	/**
	 * @generated
	 */
	private IParser getHelpRelationshipName_6025Parser() {
		if (helpRelationshipName_6025Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			helpRelationshipName_6025Parser = parser;
		}
		return helpRelationshipName_6025Parser;
	}

	/**
	 * @generated
	 */
	private IParser hurtRelationshipName_6026Parser;

	/**
	 * @generated
	 */
	private IParser getHurtRelationshipName_6026Parser() {
		if (hurtRelationshipName_6026Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hurtRelationshipName_6026Parser = parser;
		}
		return hurtRelationshipName_6026Parser;
	}

	/**
	 * @generated
	 */
	private IParser somePlusRelationshipName_6027Parser;

	/**
	 * @generated
	 */
	private IParser getSomePlusRelationshipName_6027Parser() {
		if (somePlusRelationshipName_6027Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			somePlusRelationshipName_6027Parser = parser;
		}
		return somePlusRelationshipName_6027Parser;
	}

	/**
	 * @generated
	 */
	private IParser someMinusRelationshipName_6028Parser;

	/**
	 * @generated
	 */
	private IParser getSomeMinusRelationshipName_6028Parser() {
		if (someMinusRelationshipName_6028Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			someMinusRelationshipName_6028Parser = parser;
		}
		return someMinusRelationshipName_6028Parser;
	}

	/**
	 * @generated
	 */
	private IParser andRelationshipName_6029Parser;

	/**
	 * @generated
	 */
	private IParser getAndRelationshipName_6029Parser() {
		if (andRelationshipName_6029Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			andRelationshipName_6029Parser = parser;
		}
		return andRelationshipName_6029Parser;
	}

	/**
	 * @generated
	 */
	private IParser orRelationshipName_6030Parser;

	/**
	 * @generated
	 */
	private IParser getOrRelationshipName_6030Parser() {
		if (orRelationshipName_6030Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			orRelationshipName_6030Parser = parser;
		}
		return orRelationshipName_6030Parser;
	}

	/**
	 * @generated
	 */
	private IParser unknownRelationshipName_6031Parser;

	/**
	 * @generated
	 */
	private IParser getUnknownRelationshipName_6031Parser() {
		if (unknownRelationshipName_6031Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getRelationship_RelationshipName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			unknownRelationshipName_6031Parser = parser;
		}
		return unknownRelationshipName_6031Parser;
	}

	/**
	 * @generated
	 */
	private IParser dependencyLinkDependencyName_6032Parser;

	/**
	 * @generated
	 */
	private IParser getDependencyLinkDependencyName_6032Parser() {
		if (dependencyLinkDependencyName_6032Parser == null) {
			EAttribute[] features = new EAttribute[] { IstarPackage.eINSTANCE
					.getDependencyLink_DependencyName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dependencyLinkDependencyName_6032Parser = parser;
		}
		return dependencyLinkDependencyName_6032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActorNodeNameEditPart.VISUAL_ID:
			return getActorNodeName_5021Parser();
		case AgentNodeNameEditPart.VISUAL_ID:
			return getAgentNodeName_5022Parser();
		case PositionNodeNameEditPart.VISUAL_ID:
			return getPositionNodeName_5023Parser();
		case RoleNodeNameEditPart.VISUAL_ID:
			return getRoleNodeName_5024Parser();
		case GoalNodeNameEditPart.VISUAL_ID:
			return getGoalNodeName_5025Parser();
		case SoftgoalNodeNameEditPart.VISUAL_ID:
			return getSoftgoalNodeName_5026Parser();
		case TaskNodeNameEditPart.VISUAL_ID:
			return getTaskNodeName_5027Parser();
		case ResourceNodeNameEditPart.VISUAL_ID:
			return getResourceNodeName_5028Parser();
		case BeliefNodeNameEditPart.VISUAL_ID:
			return getBeliefNodeName_5029Parser();
		case GoalNodeName2EditPart.VISUAL_ID:
			return getGoalNodeName_5016Parser();
		case SoftgoalNodeName2EditPart.VISUAL_ID:
			return getSoftgoalNodeName_5017Parser();
		case TaskNodeName2EditPart.VISUAL_ID:
			return getTaskNodeName_5018Parser();
		case ResourceNodeName2EditPart.VISUAL_ID:
			return getResourceNodeName_5019Parser();
		case BeliefNodeName2EditPart.VISUAL_ID:
			return getBeliefNodeName_5020Parser();
		case ISARelationshipNameEditPart.VISUAL_ID:
			return getISARelationshipName_6017Parser();
		case IsPartOfRelationshipNameEditPart.VISUAL_ID:
			return getIsPartOfRelationshipName_6018Parser();
		case PlaysRelationshipNameEditPart.VISUAL_ID:
			return getPlaysRelationshipName_6019Parser();
		case CoversRelationshipNameEditPart.VISUAL_ID:
			return getCoversRelationshipName_6020Parser();
		case OccupiesRelationshipNameEditPart.VISUAL_ID:
			return getOccupiesRelationshipName_6021Parser();
		case INSRelationshipNameEditPart.VISUAL_ID:
			return getINSRelationshipName_6022Parser();
		case MakeRelationshipNameEditPart.VISUAL_ID:
			return getMakeRelationshipName_6023Parser();
		case BreakRelationshipNameEditPart.VISUAL_ID:
			return getBreakRelationshipName_6024Parser();
		case HelpRelationshipNameEditPart.VISUAL_ID:
			return getHelpRelationshipName_6025Parser();
		case HurtRelationshipNameEditPart.VISUAL_ID:
			return getHurtRelationshipName_6026Parser();
		case SomePlusRelationshipNameEditPart.VISUAL_ID:
			return getSomePlusRelationshipName_6027Parser();
		case SomeMinusRelationshipNameEditPart.VISUAL_ID:
			return getSomeMinusRelationshipName_6028Parser();
		case AndRelationshipNameEditPart.VISUAL_ID:
			return getAndRelationshipName_6029Parser();
		case OrRelationshipNameEditPart.VISUAL_ID:
			return getOrRelationshipName_6030Parser();
		case UnknownRelationshipNameEditPart.VISUAL_ID:
			return getUnknownRelationshipName_6031Parser();
		case DependencyLinkDependencyNameEditPart.VISUAL_ID:
			return getDependencyLinkDependencyName_6032Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(IstarVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(IstarVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (IstarElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
