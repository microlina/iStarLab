/*
 * 
 */
package istar.diagram.providers.assistants;

import istar.diagram.providers.IstarElementTypes;
import istar.diagram.providers.IstarModelingAssistantProvider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class IstarModelingAssistantProviderOfISTAREditPart extends
		IstarModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(9);
		types.add(IstarElementTypes.Actor_2011);
		types.add(IstarElementTypes.Agent_2012);
		types.add(IstarElementTypes.Position_2013);
		types.add(IstarElementTypes.Role_2014);
		types.add(IstarElementTypes.Goal_2015);
		types.add(IstarElementTypes.Softgoal_2016);
		types.add(IstarElementTypes.Task_2017);
		types.add(IstarElementTypes.Resource_2018);
		types.add(IstarElementTypes.Belief_2019);
		return types;
	}

}
