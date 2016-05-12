/*
 * 
 */
package istar.diagram.edit.parts;

import istar.diagram.edit.policies.PositionPositionHasElementCompartmentCanonicalEditPolicy;
import istar.diagram.edit.policies.PositionPositionHasElementCompartmentItemSemanticEditPolicy;
import istar.diagram.part.IstarVisualIDRegistry;
import istar.diagram.part.Messages;
import istar.diagram.providers.IstarElementTypes;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

/**
 * @generated
 */
public class PositionPositionHasElementCompartmentEditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7007;

	/**
	 * @generated
	 */
	public PositionPositionHasElementCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.PositionPositionHasElementCompartmentEditPart_title;
	}

	/**
	 * @generated
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new PositionPositionHasElementCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						IstarVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PositionPositionHasElementCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == IstarElementTypes.Goal_3006) {
				return this;
			}
			if (type == IstarElementTypes.Softgoal_3007) {
				return this;
			}
			if (type == IstarElementTypes.Task_3008) {
				return this;
			}
			if (type == IstarElementTypes.Resource_3009) {
				return this;
			}
			if (type == IstarElementTypes.Belief_3010) {
				return this;
			}
			return getParent().getTargetEditPart(request);
		}
		if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
			if (RequestConstants.REQ_CONNECTION_END.equals(request.getType())) {
				for (Object type : ((CreateUnspecifiedTypeConnectionRequest) request)
						.getElementTypes()) {
					if (type instanceof IElementType) {
						IElementType elementType = (IElementType) type;
						if (elementType.equals(IstarElementTypes.Make_4025)
								|| elementType
										.equals(IstarElementTypes.Break_4026)
								|| elementType
										.equals(IstarElementTypes.Help_4027)
								|| elementType
										.equals(IstarElementTypes.Hurt_4028)
								|| elementType
										.equals(IstarElementTypes.SomePlus_4029)
								|| elementType
										.equals(IstarElementTypes.SomeMinus_4030)
								|| elementType
										.equals(IstarElementTypes.And_4031)
								|| elementType
										.equals(IstarElementTypes.Or_4032)
								|| elementType
										.equals(IstarElementTypes.Unknown_4033)
								|| elementType
										.equals(IstarElementTypes.MeansEnd_4034)
								|| elementType
										.equals(IstarElementTypes.DecompositionLink_4035)
								|| elementType
										.equals(IstarElementTypes.DependencyLink_4036))
							return super.getTargetEditPart(request);
					}
				}
			}
			return getParent().getTargetEditPart(request);
		}
		return super.getTargetEditPart(request);
	}

}
