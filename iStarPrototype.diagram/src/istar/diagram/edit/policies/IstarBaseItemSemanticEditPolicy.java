/*
 * 
 */
package istar.diagram.edit.policies;

import istar.Actor;
import istar.Agent;
import istar.And;
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
import istar.Role;
import istar.Softgoal;
import istar.SomeMinus;
import istar.SomePlus;
import istar.Task;
import istar.Unknown;
import istar.diagram.expressions.IstarOCLFactory;
import istar.diagram.part.IstarDiagramEditorPlugin;
import istar.diagram.part.IstarVisualIDRegistry;
import istar.diagram.providers.IstarElementTypes;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

/**
 * @generated
 */
public class IstarBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected IstarBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						IstarVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = IstarElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = IstarDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			IstarDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateISA_4019(istar.ISTAR container, Actor source,
				Actor target) {
			return canExistISA_4019(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateIsPartOf_4020(istar.ISTAR container,
				Actor source, Actor target) {
			return canExistIsPartOf_4020(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePlays_4021(istar.ISTAR container, Agent source,
				Role target) {
			return canExistPlays_4021(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCovers_4022(istar.ISTAR container,
				Position source, Role target) {
			return canExistCovers_4022(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOccupies_4023(istar.ISTAR container,
				Agent source, Position target) {
			return canExistOccupies_4023(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateINS_4024(istar.ISTAR container, Agent source,
				Agent target) {
			return canExistINS_4024(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMake_4025(istar.ISTAR container,
				Element source, Softgoal target) {
			return canExistMake_4025(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBreak_4026(istar.ISTAR container,
				Element source, Softgoal target) {
			return canExistBreak_4026(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHelp_4027(istar.ISTAR container,
				Element source, Softgoal target) {
			return canExistHelp_4027(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHurt_4028(istar.ISTAR container,
				Element source, Softgoal target) {
			return canExistHurt_4028(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSomePlus_4029(istar.ISTAR container,
				Element source, Softgoal target) {
			return canExistSomePlus_4029(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSomeMinus_4030(istar.ISTAR container,
				Element source, Softgoal target) {
			return canExistSomeMinus_4030(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAnd_4031(istar.ISTAR container, Element source,
				Softgoal target) {
			return canExistAnd_4031(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOr_4032(istar.ISTAR container, Element source,
				Softgoal target) {
			return canExistOr_4032(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateUnknown_4033(istar.ISTAR container,
				Element source, Softgoal target) {
			return canExistUnknown_4033(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMeansEnd_4034(istar.ISTAR container,
				Task source, Goal target) {
			return canExistMeansEnd_4034(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDecompositionLink_4035(istar.ISTAR container,
				Task source, Element target) {
			return canExistDecompositionLink_4035(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDependencyLink_4036(istar.ISTAR container,
				Node source, Node target) {
			return canExistDependencyLink_4036(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistISA_4019(istar.ISTAR container,
				istar.ISA linkInstance, Actor source, Actor target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getActor()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(0,
							IstarPackage.eINSTANCE.getActor(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistIsPartOf_4020(istar.ISTAR container,
				IsPartOf linkInstance, Actor source, Actor target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getActor()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(1,
							IstarPackage.eINSTANCE.getActor(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistPlays_4021(istar.ISTAR container,
				Plays linkInstance, Agent source, Role target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCovers_4022(istar.ISTAR container,
				Covers linkInstance, Position source, Role target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOccupies_4023(istar.ISTAR container,
				Occupies linkInstance, Agent source, Position target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistINS_4024(istar.ISTAR container,
				istar.INS linkInstance, Agent source, Agent target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getAgent()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(2,
							IstarPackage.eINSTANCE.getAgent(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistMake_4025(istar.ISTAR container,
				Make linkInstance, Element source, Softgoal target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(3,
							IstarPackage.eINSTANCE.getElement(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistBreak_4026(istar.ISTAR container,
				Break linkInstance, Element source, Softgoal target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(4,
							IstarPackage.eINSTANCE.getElement(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistHelp_4027(istar.ISTAR container,
				Help linkInstance, Element source, Softgoal target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(5,
							IstarPackage.eINSTANCE.getElement(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistHurt_4028(istar.ISTAR container,
				Hurt linkInstance, Element source, Softgoal target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(6,
							IstarPackage.eINSTANCE.getElement(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistSomePlus_4029(istar.ISTAR container,
				SomePlus linkInstance, Element source, Softgoal target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(7,
							IstarPackage.eINSTANCE.getElement(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistSomeMinus_4030(istar.ISTAR container,
				SomeMinus linkInstance, Element source, Softgoal target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(8,
							IstarPackage.eINSTANCE.getElement(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistAnd_4031(istar.ISTAR container,
				And linkInstance, Element source, Softgoal target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(9,
							IstarPackage.eINSTANCE.getElement(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistOr_4032(istar.ISTAR container, Or linkInstance,
				Element source, Softgoal target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(10,
							IstarPackage.eINSTANCE.getElement(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistUnknown_4033(istar.ISTAR container,
				Unknown linkInstance, Element source, Softgoal target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(11,
							IstarPackage.eINSTANCE.getElement(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistMeansEnd_4034(istar.ISTAR container,
				MeansEnd linkInstance, Task source, Goal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistDecompositionLink_4035(istar.ISTAR container,
				DecompositionLink linkInstance, Task source, Element target) {
			try {
				if (source == null) {
					return true;
				} else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", IstarPackage.eINSTANCE.getElement()); //$NON-NLS-1$
					Object sourceVal = IstarOCLFactory.getExpression(12,
							IstarPackage.eINSTANCE.getTask(), env).evaluate(
							source,
							Collections.singletonMap("oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public boolean canExistDependencyLink_4036(istar.ISTAR container,
				DependencyLink linkInstance, Node source, Node target) {
			return true;
		}
	}

}
