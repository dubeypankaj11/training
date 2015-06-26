/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 26, 2015 3:15:31 PM                     ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.TrainingConstants;
import org.training.jalo.Course;
import org.training.jalo.Training;

/**
 * Generated class for type <code>TrainingManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Course createCourse(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingConstants.TC.COURSE );
			return (Course)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Course : "+e.getMessage(), 0 );
		}
	}
	
	public Course createCourse(final Map attributeValues)
	{
		return createCourse( getSession().getSessionContext(), attributeValues );
	}
	
	public Training createTraining(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingConstants.TC.TRAINING );
			return (Training)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Training : "+e.getMessage(), 0 );
		}
	}
	
	public Training createTraining(final Map attributeValues)
	{
		return createTraining( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingConstants.EXTENSIONNAME;
	}
	
}
