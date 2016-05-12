/*
 * 
 */
package istar.diagram.expressions;

import istar.diagram.part.IstarDiagramEditorPlugin;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

/**
 * @generated
 */
public class IstarOCLFactory {

	/**
	 * @generated
	 */
	private final IstarAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	private final String[] expressionBodies;

	/**
	 * @generated
	 */
	protected IstarOCLFactory() {
		this.expressions = new IstarAbstractExpression[74];
		this.expressionBodies = new String[] { "self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self <> oppositeEnd", //$NON-NLS-1$
				"self.NAct()", //$NON-NLS-1$
				"self.NElem()", //$NON-NLS-1$
				"self.NEIAB()", //$NON-NLS-1$
				"self.MinNEIAB()", //$NON-NLS-1$
				"self.MaxNEIAB()", //$NON-NLS-1$
				"self.AvgNEIAB()", //$NON-NLS-1$
				"self.NDAG()", //$NON-NLS-1$
				"self.MinNDAG()", //$NON-NLS-1$
				"self.MaxNDAG()", //$NON-NLS-1$
				"self.AvgNDAG()", //$NON-NLS-1$
				"self.NDAS()", //$NON-NLS-1$
				"self.MinNDAS()", //$NON-NLS-1$
				"self.MaxNDAS()", //$NON-NLS-1$
				"self.AvgNDAS()", //$NON-NLS-1$
				"self.NDAT()", //$NON-NLS-1$
				"self.MinNDAT()", //$NON-NLS-1$
				"self.MaxNDAT()", //$NON-NLS-1$
				"self.AvgNDAT()", //$NON-NLS-1$
				"self.PODA()", //$NON-NLS-1$
				"self.PIDA()", //$NON-NLS-1$
				"self.NEIActB()", //$NON-NLS-1$
				"self.NEIAgentB()", //$NON-NLS-1$
				"self.NEIPosB()", //$NON-NLS-1$
				"self.NEIRoleB()", //$NON-NLS-1$
				"self.NEOAB()", //$NON-NLS-1$
				"self.NEI()", //$NON-NLS-1$
				"self.NDGI()", //$NON-NLS-1$
				"self.MinNDGI()", //$NON-NLS-1$
				"self.MaxNDGI()", //$NON-NLS-1$
				"self.NGWD()", //$NON-NLS-1$
				"self.NGWDI()", //$NON-NLS-1$
				"self.NDG()", //$NON-NLS-1$
				"self.NGIAB()", //$NON-NLS-1$
				"self.NGI()", //$NON-NLS-1$
				"self.AvgNDGI()", //$NON-NLS-1$
				"self.NDSI()", //$NON-NLS-1$
				"self.MinNDSI()", //$NON-NLS-1$
				"self.MaxNDSI()", //$NON-NLS-1$
				"self.NSWD()", //$NON-NLS-1$
				"self.NSWDI()", //$NON-NLS-1$
				"self.NDS()", //$NON-NLS-1$
				"self.NSIAB()", //$NON-NLS-1$
				"self.NSI()", //$NON-NLS-1$
				"self.AvgNDSI()", //$NON-NLS-1$
				"self.NDTI()", //$NON-NLS-1$
				"self.MinNDTI()", //$NON-NLS-1$
				"self.MaxNDTI()", //$NON-NLS-1$
				"self.NTWD()", //$NON-NLS-1$
				"self.NTWDI()", //$NON-NLS-1$
				"self.NDT()", //$NON-NLS-1$
				"self.NTIAB()", //$NON-NLS-1$
				"self.NTI()", //$NON-NLS-1$
				"self.AvgNDTI()", //$NON-NLS-1$
				"self.NODA()", //$NON-NLS-1$
				"self.NDA()", //$NON-NLS-1$
				"self.NIDA()", //$NON-NLS-1$
				"self.NOD()", //$NON-NLS-1$
				"self.NID()", //$NON-NLS-1$
				"self.NEIA()", //$NON-NLS-1$
				"self.NEIP()", //$NON-NLS-1$
				"self.NEIR()", //$NON-NLS-1$
		};
	}

	/**
	 * @generated
	 */
	private static IstarOCLFactory getInstance() {
		IstarOCLFactory instance = IstarDiagramEditorPlugin.getInstance()
				.getIstarOCLFactory();
		if (instance == null) {
			IstarDiagramEditorPlugin.getInstance().setIstarOCLFactory(
					instance = new IstarOCLFactory());
		}
		return instance;
	}

	/**
	 * @generated
	 */
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	 * @generated
	 */
	public static IstarAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		IstarOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(
					cached.expressionBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	 * @generated
	 */
	public static IstarAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * This method will become private in the next release
	 * @generated
	 */
	public static IstarAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends IstarAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
