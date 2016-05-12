/*
 * 
 */
package istar.diagram.part;

import istar.diagram.providers.IstarElementTypes;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class IstarPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createActors1Group());
		paletteRoot.add(createElements2Group());
		paletteRoot.add(createAssociations3Group());
		paletteRoot.add(createContributions4Group());
		paletteRoot.add(createLinks5Group());
	}

	/**
	 * Creates "Actors" palette tool group
	 * @generated
	 */
	private PaletteContainer createActors1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Actors1Group_title);
		paletteContainer.setId("createActors1Group"); //$NON-NLS-1$
		paletteContainer.add(createActor1CreationTool());
		paletteContainer.add(createAgent2CreationTool());
		paletteContainer.add(createPosition3CreationTool());
		paletteContainer.add(createRole4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createElements2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Elements2Group_title);
		paletteContainer.setId("createElements2Group"); //$NON-NLS-1$
		paletteContainer.add(createBelief1CreationTool());
		paletteContainer.add(createGoal2CreationTool());
		paletteContainer.add(createResource3CreationTool());
		paletteContainer.add(createSoftgoal4CreationTool());
		paletteContainer.add(createTask5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Associations" palette tool group
	 * @generated
	 */
	private PaletteContainer createAssociations3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Associations3Group_title);
		paletteContainer.setId("createAssociations3Group"); //$NON-NLS-1$
		paletteContainer.add(createCovers1CreationTool());
		paletteContainer.add(createINS2CreationTool());
		paletteContainer.add(createISA3CreationTool());
		paletteContainer.add(createIsPartOf4CreationTool());
		paletteContainer.add(createOccupies5CreationTool());
		paletteContainer.add(createPlays6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Contributions" palette tool group
	 * @generated
	 */
	private PaletteContainer createContributions4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Contributions4Group_title);
		paletteContainer.setId("createContributions4Group"); //$NON-NLS-1$
		paletteContainer.add(createAnd1CreationTool());
		paletteContainer.add(createBreak2CreationTool());
		paletteContainer.add(createHelp3CreationTool());
		paletteContainer.add(createHurt4CreationTool());
		paletteContainer.add(createMake5CreationTool());
		paletteContainer.add(createOr6CreationTool());
		paletteContainer.add(createSome7CreationTool());
		paletteContainer.add(createSome8CreationTool());
		paletteContainer.add(createUnknown9CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Links5Group_title);
		paletteContainer.setId("createLinks5Group"); //$NON-NLS-1$
		paletteContainer.add(createDecomposition1CreationTool());
		paletteContainer.add(createDependency2CreationTool());
		paletteContainer.add(createMeansend3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Actor1CreationTool_title,
				Messages.Actor1CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Actor_2011));
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Actor_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgent2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Agent2CreationTool_title,
				Messages.Agent2CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Agent_2012));
		entry.setId("createAgent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Agent_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPosition3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Position3CreationTool_title,
				Messages.Position3CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Position_2013));
		entry.setId("createPosition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Position_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Role4CreationTool_title,
				Messages.Role4CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Role_2014));
		entry.setId("createRole4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Role_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBelief1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.Belief_3010);
		types.add(IstarElementTypes.Belief_2019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Belief1CreationTool_title,
				Messages.Belief1CreationTool_desc, types);
		entry.setId("createBelief1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Belief_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoal2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.Goal_3006);
		types.add(IstarElementTypes.Goal_2015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Goal2CreationTool_title,
				Messages.Goal2CreationTool_desc, types);
		entry.setId("createGoal2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Goal_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.Resource_3009);
		types.add(IstarElementTypes.Resource_2018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Resource3CreationTool_title,
				Messages.Resource3CreationTool_desc, types);
		entry.setId("createResource3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Resource_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftgoal4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.Softgoal_3007);
		types.add(IstarElementTypes.Softgoal_2016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Softgoal4CreationTool_title,
				Messages.Softgoal4CreationTool_desc, types);
		entry.setId("createSoftgoal4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Softgoal_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTask5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(IstarElementTypes.Task_3008);
		types.add(IstarElementTypes.Task_2017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Task5CreationTool_title,
				Messages.Task5CreationTool_desc, types);
		entry.setId("createTask5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Task_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCovers1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Covers1CreationTool_title,
				Messages.Covers1CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Covers_4022));
		entry.setId("createCovers1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Covers_4022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createINS2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.INS2CreationTool_title,
				Messages.INS2CreationTool_desc,
				Collections.singletonList(IstarElementTypes.INS_4024));
		entry.setId("createINS2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.INS_4024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createISA3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ISA3CreationTool_title,
				Messages.ISA3CreationTool_desc,
				Collections.singletonList(IstarElementTypes.ISA_4019));
		entry.setId("createISA3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.ISA_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIsPartOf4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.IsPartOf4CreationTool_title,
				Messages.IsPartOf4CreationTool_desc,
				Collections.singletonList(IstarElementTypes.IsPartOf_4020));
		entry.setId("createIsPartOf4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.IsPartOf_4020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOccupies5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Occupies5CreationTool_title,
				Messages.Occupies5CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Occupies_4023));
		entry.setId("createOccupies5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Occupies_4023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlays6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Plays6CreationTool_title,
				Messages.Plays6CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Plays_4021));
		entry.setId("createPlays6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Plays_4021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnd1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.And1CreationTool_title,
				Messages.And1CreationTool_desc,
				Collections.singletonList(IstarElementTypes.And_4031));
		entry.setId("createAnd1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.And_4031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBreak2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Break2CreationTool_title,
				Messages.Break2CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Break_4026));
		entry.setId("createBreak2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Break_4026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHelp3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Help3CreationTool_title,
				Messages.Help3CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Help_4027));
		entry.setId("createHelp3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Help_4027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHurt4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Hurt4CreationTool_title,
				Messages.Hurt4CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Hurt_4028));
		entry.setId("createHurt4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Hurt_4028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMake5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Make5CreationTool_title,
				Messages.Make5CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Make_4025));
		entry.setId("createMake5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Make_4025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOr6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Or6CreationTool_title, Messages.Or6CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Or_4032));
		entry.setId("createOr6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Or_4032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSome7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Some7CreationTool_title,
				Messages.Some7CreationTool_desc,
				Collections.singletonList(IstarElementTypes.SomeMinus_4030));
		entry.setId("createSome7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.SomeMinus_4030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSome8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Some8CreationTool_title,
				Messages.Some8CreationTool_desc,
				Collections.singletonList(IstarElementTypes.SomePlus_4029));
		entry.setId("createSome8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.SomePlus_4029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnknown9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Unknown9CreationTool_title,
				Messages.Unknown9CreationTool_desc,
				Collections.singletonList(IstarElementTypes.Unknown_4033));
		entry.setId("createUnknown9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.Unknown_4033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecomposition1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Decomposition1CreationTool_title,
				Messages.Decomposition1CreationTool_desc,
				Collections
						.singletonList(IstarElementTypes.DecompositionLink_4035));
		entry.setId("createDecomposition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.DecompositionLink_4035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Dependency2CreationTool_title,
				Messages.Dependency2CreationTool_desc,
				Collections
						.singletonList(IstarElementTypes.DependencyLink_4036));
		entry.setId("createDependency2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.DependencyLink_4036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeansend3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Meansend3CreationTool_title,
				Messages.Meansend3CreationTool_desc,
				Collections.singletonList(IstarElementTypes.MeansEnd_4034));
		entry.setId("createMeansend3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(IstarElementTypes
				.getImageDescriptor(IstarElementTypes.MeansEnd_4034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
