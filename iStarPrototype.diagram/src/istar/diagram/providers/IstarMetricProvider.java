/*
 * 
 */
package istar.diagram.providers;

import istar.Actor;
import istar.Agent;
import istar.Goal;
import istar.IstarPackage;
import istar.Position;
import istar.Role;
import istar.Softgoal;
import istar.Task;
import istar.diagram.expressions.IstarOCLFactory;
import istar.diagram.part.IstarDiagramEditor;
import istar.diagram.part.IstarDiagramEditorPlugin;
import istar.diagram.part.IstarDiagramEditorUtil;
import istar.diagram.part.IstarVisualIDRegistry;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;

/**
 * @generated
 */
public class IstarMetricProvider {

	/**
	 * @generated
	 */
	public static class MetricsAction extends Action {

		/**
		 * @generated
		 */
		private IWorkbenchPage page;

		/**
		 * @generated
		 */
		public MetricsAction(IWorkbenchPage page) {
			setText("Metrics");
			this.page = page;
		}

		/**
		 * @generated
		 */
		public void run() {
			IWorkbenchPart workbenchPart = page.getActivePart();
			IViewPart metricsView = null;
			try {
				metricsView = page
						.findView(istar.diagram.providers.IstarMetricProvider.ResultView.VIEW_ID);
				if (metricsView == null) {
					metricsView = page
							.showView(istar.diagram.providers.IstarMetricProvider.ResultView.VIEW_ID);
				} else {
					if (metricsView != null
							&& workbenchPart instanceof IDiagramWorkbenchPart) {
						final IDiagramWorkbenchPart part = (IDiagramWorkbenchPart) workbenchPart;
						((ResultView) metricsView).setInput(part);
					}
					page.activate(metricsView);
				}
			} catch (PartInitException e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Diagram metric view failure", e); //$NON-NLS-1$
			}
		}
	}

	/**
	 * @generated
	 */
	static List calculateMetrics(IDiagramWorkbenchPart diagramPart) {
		final DiagramEditPart diagramEditPart = diagramPart
				.getDiagramEditPart();
		try {
			return (List) diagramPart.getDiagramEditPart().getEditingDomain()
					.runExclusive(new RunnableWithResult.Impl() {

						public void run() {
							Diagram diagram = diagramEditPart.getDiagramView();
							ArrayList<ElementMetrics> metrics = new ArrayList<ElementMetrics>(
									50);
							calculateSemanticElementMetrics(diagramEditPart,
									metrics);
							setResult(metrics);
						}
					});
		} catch (InterruptedException e) {
			return Collections.EMPTY_LIST;
		}
	}

	/**
	 * NOTE: metrics are being collected for domain elements contained in the semantic element associated with diagram view, actual diagram content (elements present there) is not taken into account.
	 * @generated
	 */
	static void calculateSemanticElementMetrics(
			DiagramEditPart diagramEditPart, List<ElementMetrics> metricsList) {
		Diagram diagram = diagramEditPart.getDiagramView();
		EObject next = diagram.getElement();
		Iterator/*<EObject>*/it = next != null ? next.eAllContents()
				: Collections.EMPTY_LIST.iterator();
		HashMap<EObject, ElementMetrics> target2row = new HashMap<EObject, ElementMetrics>();
		while (next != null) {
			ArrayList<Metric> res = new ArrayList<Metric>(5);
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getGoal().isInstance(next)) {
				res.add(new Metric("NDG", calcNDG((Goal) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getSoftgoal().isInstance(next)) {
				res.add(new Metric("NDS", calcNDS((Softgoal) next), new Double(
						0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getTask().isInstance(next)) {
				res.add(new Metric("NDT", calcNDT((Task) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getISTAR().isInstance(next)) {
				res.add(new Metric("NAct", calcNAct((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NElem", calcNElem((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAB", calcNEIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNEIAB",
						calcMinNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("MaxNEIAB",
						calcMaxNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("AvgNEIAB",
						calcAvgNEIAB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NDAG", calcNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAG", calcMinNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAG", calcMaxNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAG", calcAvgNDAG((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAS", calcNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAS", calcMinNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAS", calcMaxNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAS", calcAvgNDAS((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDAT", calcNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MinNDAT", calcMinNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDAT", calcMaxNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDAT", calcAvgNDAT((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PODA", calcPODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("PIDA", calcPIDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIActB", calcNEIActB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIAgentB",
						calcNEIAgentB((istar.ISTAR) next), new Double(0.0),
						null));
				res.add(new Metric("NEIPosB", calcNEIPosB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NEIRoleB",
						calcNEIRoleB((istar.ISTAR) next), new Double(0.0), null));
				res.add(new Metric("NEOAB", calcNEOAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGWD", calcNGWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NGIAB", calcNGIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSWD", calcNSWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NSIAB", calcNSIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTWD", calcNTWD((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NTIAB", calcNTIAB((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NODA", calcNODA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NDA", calcNDA((istar.ISTAR) next),
						new Double(0.0), null));
				res.add(new Metric("NIDA", calcNIDA((istar.ISTAR) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getActor().isInstance(next)) {
				res.add(new Metric("NEI", calcNEI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDGI", calcNDGI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDGI", calcMinNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDGI", calcMaxNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGWDI", calcNGWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NGI", calcNGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDGI", calcAvgNDGI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDSI", calcNDSI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDSI", calcMinNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDSI", calcMaxNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSWDI", calcNSWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NSI", calcNSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDSI", calcAvgNDSI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NDTI", calcNDTI((Actor) next), new Double(
						0.0), null));
				res.add(new Metric("MinNDTI", calcMinNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("MaxNDTI", calcMaxNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTWDI", calcNTWDI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NTI", calcNTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("AvgNDTI", calcAvgNDTI((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NOD", calcNOD((Actor) next),
						new Double(0.0), null));
				res.add(new Metric("NID", calcNID((Actor) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getAgent().isInstance(next)) {
				res.add(new Metric("NEIA", calcNEIA((Agent) next), new Double(
						0.0), null));
			}
			if (IstarPackage.eINSTANCE.getPosition().isInstance(next)) {
				res.add(new Metric("NEIP", calcNEIP((Position) next),
						new Double(0.0), null));
			}
			if (IstarPackage.eINSTANCE.getRole().isInstance(next)) {
				res.add(new Metric("NEIR", calcNEIR((Role) next), new Double(
						0.0), null));
			}
			if (!res.isEmpty()) {
				ElementMetrics row = new ElementMetrics(next,
						formatElementName(next),
						(Metric[]) res.toArray(new Metric[res.size()]));
				metricsList.add(row);
				target2row.put(next, row);
			}
			next = it.hasNext() ? (EObject) it.next() : null;
		}
		if (!target2row.isEmpty()) { // list was modified, need to process only semantic metrics
			// bind semantic elements to notation
			IstarDiagramEditorUtil.LazyElement2ViewMap element2ViewMap = new IstarDiagramEditorUtil.LazyElement2ViewMap(
					diagram, target2row.keySet());
			for (Iterator it2 = target2row.entrySet().iterator(); it2.hasNext();) {
				Map.Entry entry = (Map.Entry) it2.next();
				EObject semanticElement = (EObject) entry.getKey();
				View targetView = IstarDiagramEditorUtil.findView(
						diagramEditPart, semanticElement, element2ViewMap);
				ElementMetrics elementMetrics = (ElementMetrics) entry
						.getValue();
				elementMetrics.diagramElementID = targetView.eResource()
						.getURIFragment(targetView);
			}
		}
	}

	/**
	 * @generated
	 */
	private static String formatViewName(View viewTarget) {
		StringBuffer notationQNameBuf = new StringBuffer();
		notationQNameBuf.append(formatElementName(viewTarget));
		if (viewTarget.getElement() != null) {
			notationQNameBuf
					.append("->").append(formatElementName(viewTarget.getElement())); //$NON-NLS-1$
		}
		int visualID = IstarVisualIDRegistry.getVisualID(viewTarget);
		notationQNameBuf
				.append('[')
				.append(visualID < 0 ? Integer.toString(System
						.identityHashCode(viewTarget)) : Integer
						.toString(visualID)).append(']');
		return notationQNameBuf.toString();
	}

	/**
	 * @generated
	 */
	private static String formatElementName(EObject object) {
		return EMFCoreUtil.getQualifiedName(object, true);
	}

	/**
	 * @generated
	 */
	private static class ElementMetrics {

		/**
		 * @generated
		 */
		final Metric[] metrics;

		/**
		 * @generated
		 */
		final String targetElementQName;

		/**
		 * @generated
		 */
		final Image elementImage;

		/**
		 * @generated
		 */
		String diagramElementID;

		/**
		 * @generated
		 */
		ElementMetrics(EObject target, String name, Metric[] metrics) {
			assert metrics.length > 0;
			assert name != null;
			this.metrics = metrics;
			this.targetElementQName = name;
			EClass imageTarget = target.eClass();
			if (target instanceof View) {
				View viewTarget = (View) target;
				if ("".equals(viewTarget.getType()) && viewTarget.getElement() != null) { //$NON-NLS-1$
					imageTarget = viewTarget.getElement().eClass();
				}
			}
			this.elementImage = IstarElementTypes.getImage(imageTarget);
		}

		/**
		 * @generated
		 */
		Metric getMetricByKey(String key) {
			for (int i = 0; i < metrics.length; i++) {
				if (metrics[i].key.equals(key)) {
					return metrics[i];
				}
			}
			return null;
		}
	}

	/**
	 * @generated
	 */
	private static class Metric implements Comparable {

		/**
		 * @generated
		 */
		final String key;

		/**
		 * @generated
		 */
		final Double value;

		/**
		 * @generated
		 */
		final Double lowLimit;

		/**
		 * @generated
		 */
		final Double highLimit;

		/**
		 * @generated
		 */
		final String displayValue;

		/**
		 * @generated
		 */
		Metric(String key, Double value) {
			this(key, value, null, null);
		}

		/**
		 * @generated
		 */
		Metric(String key, Double value, Double low, Double high) {
			assert key != null;
			this.key = key;
			this.value = value;
			this.lowLimit = low;
			this.highLimit = high;
			this.displayValue = (value != null) ? NumberFormat.getInstance()
					.format(value) : "null"; //$NON-NLS-1$
		}

		/**
		 * @generated
		 */
		public int compareTo(Object other) {
			Metric otherMetric = (Metric) other;
			if (value != null && otherMetric.value != null) {
				return (value.longValue() < otherMetric.value.longValue()) ? -1
						: (value.longValue() == otherMetric.value.longValue() ? 0
								: 1);
			}
			return (value == null && otherMetric.value == null) ? 0
					: (value == null) ? -1 : 1;
		}
	}

	/**
	 * @generated
	 */
	private static String[] getMetricKeys() {
		return new String[] { "NAct", "NElem", "NEIAB", "MinNEIAB", "MaxNEIAB",
				"AvgNEIAB", "NDAG", "MinNDAG", "MaxNDAG", "AvgNDAG", "NDAS",
				"MinNDAS", "MaxNDAS", "AvgNDAS", "NDAT", "MinNDAT", "MaxNDAT",
				"AvgNDAT", "PODA", "PIDA", "NEIActB", "NEIAgentB", "NEIPosB",
				"NEIRoleB", "NEOAB", "NEI", "NDGI", "MinNDGI", "MaxNDGI",
				"NGWD", "NGWDI", "NDG", "NGIAB", "NGI", "AvgNDGI", "NDSI",
				"MinNDSI", "MaxNDSI", "NSWD", "NSWDI", "NDS", "NSIAB", "NSI",
				"AvgNDSI", "NDTI", "MinNDTI", "MaxNDTI", "NTWD", "NTWDI",
				"NDT", "NTIAB", "NTI", "AvgNDTI", "NODA", "NDA", "NIDA", "NOD",
				"NID", "NEIA", "NEIP", "NEIR" };
	}

	/**
	 * @generated
	 */
	private static String[] getMetricToolTips() {
		return new String[] {
				"Number of Actors" + '\n'
						+ "total number of actors in the model" + '\n'
						+ "low: 0.0",
				"Number of Elements" + '\n'
						+ "total number of elements in the model" + '\n'
						+ "low: 0.0",
				"Number of Elements Inside Actors Boundaries"
						+ '\n'
						+ "total number of elements inside all actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Minimum Number of Elements Inside Actors Boundaries"
						+ '\n'
						+ "mininum number of elements inside actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Maximum Number of Elements Inside Actors Boundaries"
						+ '\n'
						+ "maximum number of elements inside actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Average Number of Elements Inside Actors Boundaries"
						+ '\n'
						+ "average number of elements inside actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Number of Decompositions Associated with a Goal"
						+ '\n'
						+ "total number of decompositions associated with a goal inside all actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Minimum Number of Decompositions Associated with a Goal"
						+ '\n'
						+ "minimum number of decompositions associated with a goal inside an actors boundary in the model"
						+ '\n' + "low: 0.0",
				"Maximum Number of Decompositions Associated with a Goal"
						+ '\n'
						+ "maximum number of decompositions associated with a goalinside an actors boundary in the model"
						+ '\n' + "low: 0.0",
				"Average Number of Decompositions Associated with a Goal"
						+ '\n'
						+ "average of the number of decompositions associated with a goal inside an actors boundary in the model"
						+ '\n' + "low: 0.0",
				"Number of Decompositions Associated with a Softgoal"
						+ '\n'
						+ "total number of decompositions associated with a softgoal inside allactors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Minimum Number of Decompositions Associated with a Softgoal"
						+ '\n'
						+ "minimum number of decompositions associated with a softgoal inside an actors boundary in the model"
						+ '\n' + "low: 0.0",
				"Maximum Number of Decompositions Associated with a Softgoal"
						+ '\n'
						+ "maximum number of decompositions associated with a softgoal inside an actors boundary in the model"
						+ '\n' + "low: 0.0",
				"Average Number of Decompositions Associated with a Softgoal"
						+ '\n'
						+ "average of the number of decompositions associated with a softgoal inside an actors boundary in the model"
						+ '\n' + "low: 0.0",
				"Number of Decompositions Associated with a Task"
						+ '\n'
						+ "total number of decompositions associated with a task inside all actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Minimum Number of Decompositions Associated with a Task"
						+ '\n'
						+ "minimum number of decompositions associated with a task inside an actors boundary in the model"
						+ '\n' + "low: 0.0",
				"Maximum Number of Decompositions Associated with a Task"
						+ '\n'
						+ "maximum number of decompositions associated with a task inside an actors boundary in the model"
						+ '\n' + "low: 0.0",
				"Average Number of Decompositions Associated with a Task"
						+ '\n'
						+ "average of the number of decompositions associated with a task inside an actors boundary in the model"
						+ '\n' + "low: 0.0",
				"Percentage of Outgoing Dependencies of Actors"
						+ '\n'
						+ "percentage of outgoing dependencies of all actors in the model"
						+ '\n' + "low: 0.0",
				"Percentage of Incoming Dependencies of Actors"
						+ '\n'
						+ "percentage of incoming dependencies of all actors in the model"
						+ '\n' + "low: 0.0",
				"Number of Elements Inside Actors Boundaries"
						+ '\n'
						+ "total number of elements inside all actors boundaries"
						+ '\n' + "low: 0.0",
				"Number of Elements Inside Agents Boundaries"
						+ '\n'
						+ "total number of elements inside all agents boundaries"
						+ '\n' + "low: 0.0",
				"Number of Elements Inside Positions Boundaries"
						+ '\n'
						+ "total number of elements inside all positions boundaries"
						+ '\n' + "low: 0.0",
				"Number of Elements Inside Roles Boundaries"
						+ '\n'
						+ "total number of elements inside all roles boundaries"
						+ '\n' + "low: 0.0",
				"Number of Elements Outside Actors Boundaries"
						+ '\n'
						+ "total number of elements inside all actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Number of Elements Inside THIS Actor Boundary"
						+ '\n'
						+ "number of elements inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Number of Decompositions Associated with a Goal Inside THIS Actor Boundary"
						+ '\n'
						+ "total number of decompositions associated with a goal inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Minimum Number of Decompositions Associated with a Goal Inside THIS Actor Boundary"
						+ '\n'
						+ "minimum number of decompositions associated with a goal inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Maximum Number of Decompositions Associated with a Goal Inside THIS Actor Boundary"
						+ '\n'
						+ "maximum number of decompositions associated with a goal inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Number of Goals With Decompositions"
						+ '\n'
						+ "total number of goals with decompositions in the model"
						+ '\n' + "low: 0.0",
				"Number of Goals With Decompositions Inside THIS Actor Boundary"
						+ '\n'
						+ "total number of goals with decompositions inside THIS actor boundary"
						+ '\n' + "low: 0.0",
				"Number of Decompositions of THIS Goal"
						+ '\n'
						+ "total number of decompositions associated with THIS goal in the model"
						+ '\n' + "low: 0.0",
				"Number of Goals Inside Actors Boundaries"
						+ '\n'
						+ "total number of goals inside all actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Number of Goals Inside THIS Actor Boundary"
						+ '\n'
						+ "number of goals inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Average Number of Decompositions Associated with a Goal Inside THIS Actor Boundary"
						+ '\n'
						+ "average number of decompositions associated with a goal inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Number of Decompositions Associated with a Softgoal Inside THIS Actor Boundary"
						+ '\n'
						+ "total number of decompositions associated with a softgoal inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Minimum Number of Decompositions Associated with a Softgoal Inside THIS Actor Boundary"
						+ '\n'
						+ "minimum number of decompositions associated with a softgoal inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Maximum Number of Decompositions Associated with a Softgoal Inside THIS Actor Boundary"
						+ '\n'
						+ "maximum number of decompositions associated with a softgoal inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Number of Softgoals With Decompositions"
						+ '\n'
						+ "total number of softgoals with decompositions in the model"
						+ '\n' + "low: 0.0",
				"Number of Softgoals With Decompositions Inside THIS Actor Boundary"
						+ '\n'
						+ "total number of softgoals with decompositions inside THIS actor boundary"
						+ '\n' + "low: 0.0",
				"Number of Decompositions of THIS Softgoal"
						+ '\n'
						+ "total number of decompositions associated with THIS softgoal in the model"
						+ '\n' + "low: 0.0",
				"Number of Softgoals Inside Actor Boundary"
						+ '\n'
						+ "total number of softgoals inside all actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Number of Softgoals Inside THIS Actor Boundary"
						+ '\n'
						+ "number of softgoals inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Average Number of Decompositions Associated with a Softgoal Inside THIS Actor Boundary"
						+ '\n'
						+ "average number of decompositions associated with a softgoal inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Number of Decompositions Associated with a Task Inside THIS Actor Boundary"
						+ '\n'
						+ "total number of decompositions associated with a task inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Minimum Number of Decompositions Associated with a Task Inside THIS Actor Boundary"
						+ '\n'
						+ "minimum number of decompositions associated with a task inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Maximum Number of Decompositions Associated with a Task InsideTHIS Actor Boundary"
						+ '\n'
						+ "maximum number of decompositions associated with a task inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Number of Tasks With Decompositions"
						+ '\n'
						+ "total number of tasks with decompositions in the model"
						+ '\n' + "low: 0.0",
				"Number of Tasks With Decompositions Inside THIS Actor Boundary"
						+ '\n'
						+ "total number of tasks with decompositions inside THIS actor boundary"
						+ '\n' + "low: 0.0",
				"Number of Decompositions of THIS Task"
						+ '\n'
						+ "total number of decompositions associated with THIS task in the model"
						+ '\n' + "low: 0.0",
				"Number of Tasks Inside Actor Boundary"
						+ '\n'
						+ "total number of tasks inside all actors boundaries in the model"
						+ '\n' + "low: 0.0",
				"Number of Tasks Inside THIS Actor Boundary"
						+ '\n'
						+ "number of tasks inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Average Number of Decompositions Associated with a Task Inside THIS Actor Boundary"
						+ '\n'
						+ "average number of decompositions associated with a task inside THIS actor boundary in the model"
						+ '\n' + "low: 0.0",
				"Number of Outgoing Dependencies of Actors" + '\n'
						+ "total number of outgoing dependencies of all actors"
						+ '\n' + "low: 0.0",
				"Number of Dependencies of Actors" + '\n'
						+ "total number of  dependencies of all actors" + '\n'
						+ "low: 0.0",
				"Number of Incoming Dependencies of Actors" + '\n'
						+ "total number of incoming dependencies of all actors"
						+ '\n' + "low: 0.0",
				"Number of Outgoing Dependencies" + '\n'
						+ "number of outgoing dependencies of an actor" + '\n'
						+ "low: 0.0",
				"Number of Incoming Dependencies" + '\n'
						+ "number of incoming dependencies of an actor" + '\n'
						+ "low: 0.0",
				"Number of Elements Inside THIS Agent Boundary" + '\n'
						+ "number of elements inside THIS agent boundary"
						+ '\n' + "low: 0.0",
				"Number of Elements Inside THIS Position Boundary" + '\n'
						+ "number of elements inside THIS position boundary"
						+ '\n' + "low: 0.0",
				"Number of Elements Inside THIS Role Boundary" + '\n'
						+ "number of elements inside THIS role boundary" + '\n'
						+ "low: 0.0" };
	}

	/**
	 * @generated
	 */
	public static Double calcNAct(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(13,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNElem(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(14,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEIAB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(15,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMinNEIAB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(16,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMaxNEIAB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(17,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcAvgNEIAB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(18,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDAG(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(19,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMinNDAG(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(20,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMaxNDAG(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(21,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcAvgNDAG(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(22,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDAS(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(23,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMinNDAS(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(24,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMaxNDAS(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(25,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcAvgNDAS(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(26,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDAT(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(27,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMinNDAT(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(28,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMaxNDAT(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(29,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcAvgNDAT(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(30,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcPODA(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(31,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcPIDA(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(32,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEIActB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(33,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEIAgentB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(34,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEIPosB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(35,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEIRoleB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(36,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEOAB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(37,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEI(Actor target) {
		Object val = IstarOCLFactory.getExpression(38,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDGI(Actor target) {
		Object val = IstarOCLFactory.getExpression(39,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMinNDGI(Actor target) {
		Object val = IstarOCLFactory.getExpression(40,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMaxNDGI(Actor target) {
		Object val = IstarOCLFactory.getExpression(41,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNGWD(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(42,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNGWDI(Actor target) {
		Object val = IstarOCLFactory.getExpression(43,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDG(Goal target) {
		Object val = IstarOCLFactory.getExpression(44,
				IstarPackage.eINSTANCE.getGoal(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNGIAB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(45,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNGI(Actor target) {
		Object val = IstarOCLFactory.getExpression(46,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcAvgNDGI(Actor target) {
		Object val = IstarOCLFactory.getExpression(47,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDSI(Actor target) {
		Object val = IstarOCLFactory.getExpression(48,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMinNDSI(Actor target) {
		Object val = IstarOCLFactory.getExpression(49,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMaxNDSI(Actor target) {
		Object val = IstarOCLFactory.getExpression(50,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNSWD(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(51,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNSWDI(Actor target) {
		Object val = IstarOCLFactory.getExpression(52,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDS(Softgoal target) {
		Object val = IstarOCLFactory.getExpression(53,
				IstarPackage.eINSTANCE.getSoftgoal(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNSIAB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(54,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNSI(Actor target) {
		Object val = IstarOCLFactory.getExpression(55,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcAvgNDSI(Actor target) {
		Object val = IstarOCLFactory.getExpression(56,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDTI(Actor target) {
		Object val = IstarOCLFactory.getExpression(57,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMinNDTI(Actor target) {
		Object val = IstarOCLFactory.getExpression(58,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcMaxNDTI(Actor target) {
		Object val = IstarOCLFactory.getExpression(59,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNTWD(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(60,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNTWDI(Actor target) {
		Object val = IstarOCLFactory.getExpression(61,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDT(Task target) {
		Object val = IstarOCLFactory.getExpression(62,
				IstarPackage.eINSTANCE.getTask(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNTIAB(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(63,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNTI(Actor target) {
		Object val = IstarOCLFactory.getExpression(64,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcAvgNDTI(Actor target) {
		Object val = IstarOCLFactory.getExpression(65,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNODA(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(66,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNDA(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(67,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNIDA(istar.ISTAR target) {
		Object val = IstarOCLFactory.getExpression(68,
				IstarPackage.eINSTANCE.getISTAR(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNOD(Actor target) {
		Object val = IstarOCLFactory.getExpression(69,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNID(Actor target) {
		Object val = IstarOCLFactory.getExpression(70,
				IstarPackage.eINSTANCE.getActor(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEIA(Agent target) {
		Object val = IstarOCLFactory.getExpression(71,
				IstarPackage.eINSTANCE.getAgent(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEIP(Position target) {
		Object val = IstarOCLFactory.getExpression(72,
				IstarPackage.eINSTANCE.getPosition(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static Double calcNEIR(Role target) {
		Object val = IstarOCLFactory.getExpression(73,
				IstarPackage.eINSTANCE.getRole(), null).evaluate(target);
		if (val instanceof Number) {
			return val.getClass() == Double.class ? (Double) val : new Double(
					((Number) val).doubleValue());
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static class ResultView extends ViewPart implements IOpenListener {
		/**
		 * @generated
		 */
		public static final String VIEW_ID = "istar.diagram.metricView"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		private static int MAX_VISIBLE_KEY_CHAR_COUNT = 8;

		/**
		 * @generated
		 */
		private TableViewer viewer;

		/**
		 * @generated
		 */
		private Resource diagramResource;

		/**
		 * @generated
		 */
		void setInput(IDiagramWorkbenchPart diagramPart) {
			diagramResource = diagramPart.getDiagram().eResource();
			setTitleToolTip(diagramResource.getURI().path());
			List metrics = calculateMetrics(diagramPart);
			adjustLayout(metrics);
			viewer.setInput(metrics);
		}

		/**
		 * @generated
		 */
		private void adjustLayout(List metricResultList) {
			Map maxValStrMap = calcMetricMaxValueStrLenMap(metricResultList);
			Table table = viewer.getTable();
			TableLayout layout = new TableLayout();
			org.eclipse.swt.graphics.GC gc = new org.eclipse.swt.graphics.GC(
					table);

			gc.setFont(JFaceResources.getDialogFont());
			int padding = gc.stringExtent("X").x * 2; //$NON-NLS-1$
			for (int i = 0; i < getMetricKeys().length; i++) {
				final String nextKey = getMetricKeys()[i];
				String valueStr = (String) maxValStrMap.get(nextKey);
				int minWidth = valueStr != null ? gc.stringExtent(valueStr).x
						+ padding : 20;
				layout.addColumnData(new ColumnPixelData(minWidth, true));
			}
			gc.dispose();

			layout.addColumnData(new ColumnWeightData(1, 50, true));
			viewer.getTable().setLayout(layout);
			viewer.getTable().layout(true, true);
		}

		/**
		 * @generated
		 */
		public void createPartControl(Composite parent) {
			this.viewer = new TableViewer(parent, SWT.FULL_SELECTION);
			final Table table = viewer.getTable();
			table.setHeaderVisible(true);
			table.setLinesVisible(true);

			for (int i = 0; i < getMetricKeys().length; i++) {
				TableColumn column = new TableColumn(table, SWT.NONE);
				column.setAlignment(SWT.RIGHT);
				column.setMoveable(true);
				column.setText(getMetricKeys()[i]);
				column.setToolTipText(getMetricToolTips()[i]);
			}

			TableColumn objectColumn = new TableColumn(table, SWT.NONE);
			objectColumn.setText("Element");
			objectColumn.setToolTipText("Measurement element");

			viewer.setLabelProvider(new Labels());
			viewer.setContentProvider(new ArrayContentProvider());
			viewer.addOpenListener(this);

			SelectionListener headerSelListener = new SelectionListener() {
				public void widgetSelected(SelectionEvent e) {
					table.setSortColumn((TableColumn) e.getSource());
					table.setSortDirection((table.getSortDirection() != SWT.DOWN) ? SWT.DOWN
							: SWT.UP);
					viewer.refresh();
				}

				public void widgetDefaultSelected(SelectionEvent e) {
				}
			};
			TableColumn[] columns = viewer.getTable().getColumns();
			for (int i = 0; i < columns.length; i++) {
				columns[i].addSelectionListener(headerSelListener);
			}

			viewer.setSorter(new ViewerSorter() {
				public int compare(Viewer viewer, Object e1, Object e2) {
					TableColumn c = table.getSortColumn();
					int result = 0;
					if (c != null) {
						Metric mc1 = ((ElementMetrics) e1).getMetricByKey(c
								.getText());
						Metric mc2 = ((ElementMetrics) e2).getMetricByKey(c
								.getText());
						result = (mc1 != null && mc2 != null) ? mc1
								.compareTo(mc2) : (mc1 == null ? -1 : 1);
					} else {
						result = ((ElementMetrics) e1).targetElementQName
								.compareTo(((ElementMetrics) e2).targetElementQName);
					}
					return table.getSortDirection() == SWT.DOWN ? result
							: -result;
				}
			});
			IEditorPart editor = getSite().getPage().getActiveEditor();
			if (editor != null
					&& editor.getClass().equals(IstarDiagramEditor.class)) {
				setInput((IstarDiagramEditor) editor);
			}
		}

		/**
		 * @generated
		 */
		public void open(OpenEvent event) {
			try {
				IEditorPart editorPart = getSite().getPage()
						.openEditor(
								new FileEditorInput(
										WorkspaceSynchronizer
												.getFile(diagramResource)),
								IstarDiagramEditor.ID);
				if (editorPart == null) {
					return;
				}
				IDiagramWorkbenchPart diagramPart = (IDiagramWorkbenchPart) editorPart
						.getAdapter(IDiagramWorkbenchPart.class);
				ElementMetrics selection = (ElementMetrics) ((IStructuredSelection) event
						.getSelection()).getFirstElement();
				String viewID = selection.diagramElementID;
				if (viewID != null) {
					View targetView = (View) diagramPart.getDiagram()
							.eResource().getEObject(viewID);
					if (targetView != null) {
						EditPart targetEditPart = (EditPart) diagramPart
								.getDiagramGraphicalViewer()
								.getEditPartRegistry().get(targetView);
						if (targetEditPart != null) {
							IstarDiagramEditorUtil.selectElementsInDiagram(
									diagramPart,
									Collections.singletonList(targetEditPart));
						}
					}
				}
			} catch (PartInitException e) {
				IstarDiagramEditorPlugin.getInstance().logError(
						"Can't open diagram editor", e); //$NON-NLS-1$
			}
		}

		/**
		 * @generated
		 */
		private static Map calcMetricMaxValueStrLenMap(List allMetrics) {
			Map metric2MaxStrLen = new HashMap();
			for (int i = 0; i < getMetricKeys().length; i++) {
				String nextKey = getMetricKeys()[i];
				int trimPos = Math.min(nextKey.length(),
						MAX_VISIBLE_KEY_CHAR_COUNT);
				metric2MaxStrLen.put(nextKey, nextKey.substring(0, trimPos));
			}
			for (Iterator it = allMetrics.iterator(); it.hasNext();) {
				ElementMetrics elementMetrics = (ElementMetrics) it.next();
				for (int i = 0; i < elementMetrics.metrics.length; i++) {
					Metric metric = elementMetrics.metrics[i];
					String valueStr = (String) metric2MaxStrLen.get(metric.key);
					if (valueStr == null
							|| metric.displayValue.length() > valueStr.length()) {
						metric2MaxStrLen.put(metric.key, metric.displayValue);
					}
				}
			}
			return metric2MaxStrLen;
		}

		/**
		 * @generated
		 */
		public void setFocus() {
		}

		/**
		 * @generated
		 */
		private class Labels extends LabelProvider implements
				ITableLabelProvider, ITableColorProvider {

			/**
			 * @generated
			 */
			private boolean isElementColumn(int columnIndex) {
				return columnIndex >= getMetricKeys().length;
			}

			/**
			 * @generated
			 */
			public Image getColumnImage(Object element, int columnIndex) {
				return isElementColumn(columnIndex) ? ((ElementMetrics) element).elementImage
						: null;
			}

			/**
			 * @generated
			 */
			public String getColumnText(Object element, int columnIndex) {
				ElementMetrics elementMetrics = (ElementMetrics) element;
				if (columnIndex == getMetricKeys().length) {
					return elementMetrics.targetElementQName;
				}
				final String key = getMetricKeys()[columnIndex];
				Metric metric = elementMetrics.getMetricByKey(key);
				return (metric != null) ? metric.displayValue : "-"; //$NON-NLS-1$
			}

			/**
			 * @generated
			 */
			public Color getBackground(Object element, int columnIndex) {
				return null;
			}

			/**
			 * @generated
			 */
			public Color getForeground(Object element, int columnIndex) {
				if (isElementColumn(columnIndex)) {
					return null;
				}
				ElementMetrics columnElement = (ElementMetrics) element;
				final String key = getMetricKeys()[columnIndex];
				Metric metric = columnElement.getMetricByKey(key);
				if (metric != null && metric.value != null) {
					if (metric.highLimit != null
							&& metric.highLimit.longValue() < metric.value
									.longValue()) {
						return ColorConstants.red;
					} else if (metric.lowLimit != null
							&& metric.lowLimit.longValue() > metric.value
									.longValue()) {
						return ColorConstants.blue;
					}
				}
				return null;
			}
		}

	}

}
