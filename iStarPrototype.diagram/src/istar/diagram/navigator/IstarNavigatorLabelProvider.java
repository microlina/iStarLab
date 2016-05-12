/*
 * 
 */
package istar.diagram.navigator;

import istar.DecompositionLink;
import istar.MeansEnd;
import istar.diagram.edit.parts.ActorEditPart;
import istar.diagram.edit.parts.ActorNodeNameEditPart;
import istar.diagram.edit.parts.AgentEditPart;
import istar.diagram.edit.parts.AgentNodeNameEditPart;
import istar.diagram.edit.parts.AndEditPart;
import istar.diagram.edit.parts.AndRelationshipNameEditPart;
import istar.diagram.edit.parts.Belief2EditPart;
import istar.diagram.edit.parts.BeliefEditPart;
import istar.diagram.edit.parts.BeliefNodeName2EditPart;
import istar.diagram.edit.parts.BeliefNodeNameEditPart;
import istar.diagram.edit.parts.BreakEditPart;
import istar.diagram.edit.parts.BreakRelationshipNameEditPart;
import istar.diagram.edit.parts.CoversEditPart;
import istar.diagram.edit.parts.CoversRelationshipNameEditPart;
import istar.diagram.edit.parts.DecompositionLinkEditPart;
import istar.diagram.edit.parts.DependencyLinkDependencyNameEditPart;
import istar.diagram.edit.parts.DependencyLinkEditPart;
import istar.diagram.edit.parts.Goal2EditPart;
import istar.diagram.edit.parts.GoalEditPart;
import istar.diagram.edit.parts.GoalNodeName2EditPart;
import istar.diagram.edit.parts.GoalNodeNameEditPart;
import istar.diagram.edit.parts.HelpEditPart;
import istar.diagram.edit.parts.HelpRelationshipNameEditPart;
import istar.diagram.edit.parts.HurtEditPart;
import istar.diagram.edit.parts.HurtRelationshipNameEditPart;
import istar.diagram.edit.parts.INSEditPart;
import istar.diagram.edit.parts.INSRelationshipNameEditPart;
import istar.diagram.edit.parts.ISAEditPart;
import istar.diagram.edit.parts.ISARelationshipNameEditPart;
import istar.diagram.edit.parts.ISTAREditPart;
import istar.diagram.edit.parts.IsPartOfEditPart;
import istar.diagram.edit.parts.IsPartOfRelationshipNameEditPart;
import istar.diagram.edit.parts.MakeEditPart;
import istar.diagram.edit.parts.MakeRelationshipNameEditPart;
import istar.diagram.edit.parts.MeansEndEditPart;
import istar.diagram.edit.parts.OccupiesEditPart;
import istar.diagram.edit.parts.OccupiesRelationshipNameEditPart;
import istar.diagram.edit.parts.OrEditPart;
import istar.diagram.edit.parts.OrRelationshipNameEditPart;
import istar.diagram.edit.parts.PlaysEditPart;
import istar.diagram.edit.parts.PlaysRelationshipNameEditPart;
import istar.diagram.edit.parts.PositionEditPart;
import istar.diagram.edit.parts.PositionNodeNameEditPart;
import istar.diagram.edit.parts.Resource2EditPart;
import istar.diagram.edit.parts.ResourceEditPart;
import istar.diagram.edit.parts.ResourceNodeName2EditPart;
import istar.diagram.edit.parts.ResourceNodeNameEditPart;
import istar.diagram.edit.parts.RoleEditPart;
import istar.diagram.edit.parts.RoleNodeNameEditPart;
import istar.diagram.edit.parts.Softgoal2EditPart;
import istar.diagram.edit.parts.SoftgoalEditPart;
import istar.diagram.edit.parts.SoftgoalNodeName2EditPart;
import istar.diagram.edit.parts.SoftgoalNodeNameEditPart;
import istar.diagram.edit.parts.SomeMinusEditPart;
import istar.diagram.edit.parts.SomeMinusRelationshipNameEditPart;
import istar.diagram.edit.parts.SomePlusEditPart;
import istar.diagram.edit.parts.SomePlusRelationshipNameEditPart;
import istar.diagram.edit.parts.Task2EditPart;
import istar.diagram.edit.parts.TaskEditPart;
import istar.diagram.edit.parts.TaskNodeName2EditPart;
import istar.diagram.edit.parts.TaskNodeNameEditPart;
import istar.diagram.edit.parts.UnknownEditPart;
import istar.diagram.edit.parts.UnknownRelationshipNameEditPart;
import istar.diagram.part.IstarDiagramEditorPlugin;
import istar.diagram.part.IstarVisualIDRegistry;
import istar.diagram.providers.IstarElementTypes;
import istar.diagram.providers.IstarParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class IstarNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		IstarDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		IstarDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof IstarNavigatorItem
				&& !isOwnView(((IstarNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof IstarNavigatorGroup) {
			IstarNavigatorGroup group = (IstarNavigatorGroup) element;
			return IstarDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof IstarNavigatorItem) {
			IstarNavigatorItem navigatorItem = (IstarNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case ISTAREditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?is?ISTAR", IstarElementTypes.ISTAR_1000); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?is?Actor", IstarElementTypes.Actor_2011); //$NON-NLS-1$
		case AgentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?is?Agent", IstarElementTypes.Agent_2012); //$NON-NLS-1$
		case PositionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?is?Position", IstarElementTypes.Position_2013); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?is?Role", IstarElementTypes.Role_2014); //$NON-NLS-1$
		case GoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?is?Goal", IstarElementTypes.Goal_2015); //$NON-NLS-1$
		case SoftgoalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?is?Softgoal", IstarElementTypes.Softgoal_2016); //$NON-NLS-1$
		case TaskEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?is?Task", IstarElementTypes.Task_2017); //$NON-NLS-1$
		case ResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?is?Resource", IstarElementTypes.Resource_2018); //$NON-NLS-1$
		case BeliefEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?is?Belief", IstarElementTypes.Belief_2019); //$NON-NLS-1$
		case Goal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?is?Goal", IstarElementTypes.Goal_3006); //$NON-NLS-1$
		case Softgoal2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?is?Softgoal", IstarElementTypes.Softgoal_3007); //$NON-NLS-1$
		case Task2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?is?Task", IstarElementTypes.Task_3008); //$NON-NLS-1$
		case Resource2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?is?Resource", IstarElementTypes.Resource_3009); //$NON-NLS-1$
		case Belief2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?is?Belief", IstarElementTypes.Belief_3010); //$NON-NLS-1$
		case ISAEditPart.VISUAL_ID:
			return getImage("Navigator?Link?is?ISA", IstarElementTypes.ISA_4019); //$NON-NLS-1$
		case IsPartOfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?IsPartOf", IstarElementTypes.IsPartOf_4020); //$NON-NLS-1$
		case PlaysEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?Plays", IstarElementTypes.Plays_4021); //$NON-NLS-1$
		case CoversEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?Covers", IstarElementTypes.Covers_4022); //$NON-NLS-1$
		case OccupiesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?Occupies", IstarElementTypes.Occupies_4023); //$NON-NLS-1$
		case INSEditPart.VISUAL_ID:
			return getImage("Navigator?Link?is?INS", IstarElementTypes.INS_4024); //$NON-NLS-1$
		case MakeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?Make", IstarElementTypes.Make_4025); //$NON-NLS-1$
		case BreakEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?Break", IstarElementTypes.Break_4026); //$NON-NLS-1$
		case HelpEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?Help", IstarElementTypes.Help_4027); //$NON-NLS-1$
		case HurtEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?Hurt", IstarElementTypes.Hurt_4028); //$NON-NLS-1$
		case SomePlusEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?SomePlus", IstarElementTypes.SomePlus_4029); //$NON-NLS-1$
		case SomeMinusEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?SomeMinus", IstarElementTypes.SomeMinus_4030); //$NON-NLS-1$
		case AndEditPart.VISUAL_ID:
			return getImage("Navigator?Link?is?And", IstarElementTypes.And_4031); //$NON-NLS-1$
		case OrEditPart.VISUAL_ID:
			return getImage("Navigator?Link?is?Or", IstarElementTypes.Or_4032); //$NON-NLS-1$
		case UnknownEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?Unknown", IstarElementTypes.Unknown_4033); //$NON-NLS-1$
		case MeansEndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?MeansEnd", IstarElementTypes.MeansEnd_4034); //$NON-NLS-1$
		case DecompositionLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?DecompositionLink", IstarElementTypes.DecompositionLink_4035); //$NON-NLS-1$
		case DependencyLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?is?DependencyLink", IstarElementTypes.DependencyLink_4036); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = IstarDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& IstarElementTypes.isKnownElementType(elementType)) {
			image = IstarElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof IstarNavigatorGroup) {
			IstarNavigatorGroup group = (IstarNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof IstarNavigatorItem) {
			IstarNavigatorItem navigatorItem = (IstarNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (IstarVisualIDRegistry.getVisualID(view)) {
		case ISTAREditPart.VISUAL_ID:
			return getISTAR_1000Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2011Text(view);
		case AgentEditPart.VISUAL_ID:
			return getAgent_2012Text(view);
		case PositionEditPart.VISUAL_ID:
			return getPosition_2013Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2014Text(view);
		case GoalEditPart.VISUAL_ID:
			return getGoal_2015Text(view);
		case SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_2016Text(view);
		case TaskEditPart.VISUAL_ID:
			return getTask_2017Text(view);
		case ResourceEditPart.VISUAL_ID:
			return getResource_2018Text(view);
		case BeliefEditPart.VISUAL_ID:
			return getBelief_2019Text(view);
		case Goal2EditPart.VISUAL_ID:
			return getGoal_3006Text(view);
		case Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_3007Text(view);
		case Task2EditPart.VISUAL_ID:
			return getTask_3008Text(view);
		case Resource2EditPart.VISUAL_ID:
			return getResource_3009Text(view);
		case Belief2EditPart.VISUAL_ID:
			return getBelief_3010Text(view);
		case ISAEditPart.VISUAL_ID:
			return getISA_4019Text(view);
		case IsPartOfEditPart.VISUAL_ID:
			return getIsPartOf_4020Text(view);
		case PlaysEditPart.VISUAL_ID:
			return getPlays_4021Text(view);
		case CoversEditPart.VISUAL_ID:
			return getCovers_4022Text(view);
		case OccupiesEditPart.VISUAL_ID:
			return getOccupies_4023Text(view);
		case INSEditPart.VISUAL_ID:
			return getINS_4024Text(view);
		case MakeEditPart.VISUAL_ID:
			return getMake_4025Text(view);
		case BreakEditPart.VISUAL_ID:
			return getBreak_4026Text(view);
		case HelpEditPart.VISUAL_ID:
			return getHelp_4027Text(view);
		case HurtEditPart.VISUAL_ID:
			return getHurt_4028Text(view);
		case SomePlusEditPart.VISUAL_ID:
			return getSomePlus_4029Text(view);
		case SomeMinusEditPart.VISUAL_ID:
			return getSomeMinus_4030Text(view);
		case AndEditPart.VISUAL_ID:
			return getAnd_4031Text(view);
		case OrEditPart.VISUAL_ID:
			return getOr_4032Text(view);
		case UnknownEditPart.VISUAL_ID:
			return getUnknown_4033Text(view);
		case MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_4034Text(view);
		case DecompositionLinkEditPart.VISUAL_ID:
			return getDecompositionLink_4035Text(view);
		case DependencyLinkEditPart.VISUAL_ID:
			return getDependencyLink_4036Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getISTAR_1000Text(View view) {
		istar.ISTAR domainModelElement = (istar.ISTAR) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getModelName();
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActor_2011Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Actor_2011,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry.getType(ActorNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAgent_2012Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Agent_2012,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry.getType(AgentNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPosition_2013Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Position_2013,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(PositionNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRole_2014Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Role_2014,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry.getType(RoleNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_2015Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Goal_2015,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry.getType(GoalNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_2016Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Softgoal_2016,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(SoftgoalNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTask_2017Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Task_2017,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry.getType(TaskNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResource_2018Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Resource_2018,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(ResourceNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBelief_2019Text(View view) {
		IParser parser = IstarParserProvider
				.getParser(IstarElementTypes.Belief_2019,
						view.getElement() != null ? view.getElement() : view,
						IstarVisualIDRegistry
								.getType(BeliefNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGoal_3006Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Goal_3006,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry.getType(GoalNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSoftgoal_3007Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Softgoal_3007,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(SoftgoalNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTask_3008Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Task_3008,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry.getType(TaskNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResource_3009Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Resource_3009,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(ResourceNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBelief_3010Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Belief_3010,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(BeliefNodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getISA_4019Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.ISA_4019,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(ISARelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIsPartOf_4020Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.IsPartOf_4020,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(IsPartOfRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlays_4021Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Plays_4021,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(PlaysRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCovers_4022Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Covers_4022,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(CoversRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOccupies_4023Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Occupies_4023,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(OccupiesRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getINS_4024Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.INS_4024,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(INSRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMake_4025Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Make_4025,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(MakeRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBreak_4026Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Break_4026,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(BreakRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHelp_4027Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Help_4027,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(HelpRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHurt_4028Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Hurt_4028,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(HurtRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSomePlus_4029Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.SomePlus_4029,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(SomePlusRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSomeMinus_4030Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.SomeMinus_4030,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(SomeMinusRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnd_4031Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.And_4031,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(AndRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOr_4032Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Or_4032,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(OrRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknown_4033Text(View view) {
		IParser parser = IstarParserProvider.getParser(
				IstarElementTypes.Unknown_4033,
				view.getElement() != null ? view.getElement() : view,
				IstarVisualIDRegistry
						.getType(UnknownRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMeansEnd_4034Text(View view) {
		MeansEnd domainModelElement = (MeansEnd) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRelationshipName();
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDecompositionLink_4035Text(View view) {
		DecompositionLink domainModelElement = (DecompositionLink) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getRelationshipName();
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDependencyLink_4036Text(View view) {
		IParser parser = IstarParserProvider
				.getParser(
						IstarElementTypes.DependencyLink_4036,
						view.getElement() != null ? view.getElement() : view,
						IstarVisualIDRegistry
								.getType(DependencyLinkDependencyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			IstarDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ISTAREditPart.MODEL_ID.equals(IstarVisualIDRegistry
				.getModelID(view));
	}

}
