/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 26, 2015 2:57:19 PM                     ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.constants.TrainingConstants;
import org.training.jalo.Training;

/**
 * Generated class for type {@link org.training.jalo.Course Course}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCourse extends Product
{
	/** Qualifier of the <code>Course.subject</code> attribute **/
	public static final String SUBJECT = "subject";
	/** Qualifier of the <code>Course.numberOfDays</code> attribute **/
	public static final String NUMBEROFDAYS = "numberOfDays";
	/** Qualifier of the <code>Course.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>Course.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Course.trainer</code> attribute **/
	public static final String TRAINER = "trainer";
	/** Qualifier of the <code>Course.position</code> attribute **/
	public static final String POSITION = "position";
	/** Qualifier of the <code>Course.trainingPOS</code> attribute **/
	public static final String TRAININGPOS = "trainingPOS";
	/** Qualifier of the <code>Course.training</code> attribute **/
	public static final String TRAINING = "training";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAINING's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCourse> TRAININGHANDLER = new BidirectionalOneToManyHandler<GeneratedCourse>(
	TrainingConstants.TC.COURSE,
	false,
	"training",
	"trainingPOS",
	true,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUBJECT, AttributeMode.INITIAL);
		tmp.put(NUMBEROFDAYS, AttributeMode.INITIAL);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(TRAINER, AttributeMode.INITIAL);
		tmp.put(POSITION, AttributeMode.INITIAL);
		tmp.put(TRAININGPOS, AttributeMode.INITIAL);
		tmp.put(TRAINING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAININGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Language value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.numberOfDays</code> attribute.
	 * @return the numberOfDays
	 */
	public Integer getNumberOfDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.numberOfDays</code> attribute.
	 * @return the numberOfDays
	 */
	public Integer getNumberOfDays()
	{
		return getNumberOfDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.numberOfDays</code> attribute. 
	 * @return the numberOfDays
	 */
	public int getNumberOfDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.numberOfDays</code> attribute. 
	 * @return the numberOfDays
	 */
	public int getNumberOfDaysAsPrimitive()
	{
		return getNumberOfDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.numberOfDays</code> attribute. 
	 * @param value the numberOfDays
	 */
	public void setNumberOfDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.numberOfDays</code> attribute. 
	 * @param value the numberOfDays
	 */
	public void setNumberOfDays(final Integer value)
	{
		setNumberOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.numberOfDays</code> attribute. 
	 * @param value the numberOfDays
	 */
	public void setNumberOfDays(final SessionContext ctx, final int value)
	{
		setNumberOfDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.numberOfDays</code> attribute. 
	 * @param value the numberOfDays
	 */
	public void setNumberOfDays(final int value)
	{
		setNumberOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.position</code> attribute.
	 * @return the position
	 */
	public Integer getPosition(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POSITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.position</code> attribute.
	 * @return the position
	 */
	public Integer getPosition()
	{
		return getPosition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.position</code> attribute. 
	 * @return the position
	 */
	public int getPositionAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPosition( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.position</code> attribute. 
	 * @return the position
	 */
	public int getPositionAsPrimitive()
	{
		return getPositionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POSITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final Integer value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final SessionContext ctx, final int value)
	{
		setPosition( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final int value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.subject</code> attribute.
	 * @return the subject
	 */
	public String getSubject(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.subject</code> attribute.
	 * @return the subject
	 */
	public String getSubject()
	{
		return getSubject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final String value)
	{
		setSubject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.trainer</code> attribute.
	 * @return the trainer
	 */
	public Customer getTrainer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, TRAINER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.trainer</code> attribute.
	 * @return the trainer
	 */
	public Customer getTrainer()
	{
		return getTrainer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.trainer</code> attribute. 
	 * @param value the trainer
	 */
	public void setTrainer(final SessionContext ctx, final Customer value)
	{
		setProperty(ctx, TRAINER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.trainer</code> attribute. 
	 * @param value the trainer
	 */
	public void setTrainer(final Customer value)
	{
		setTrainer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.training</code> attribute.
	 * @return the training - Training associated to the course
	 */
	public Training getTraining(final SessionContext ctx)
	{
		return (Training)getProperty( ctx, TRAINING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.training</code> attribute.
	 * @return the training - Training associated to the course
	 */
	public Training getTraining()
	{
		return getTraining( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.training</code> attribute. 
	 * @param value the training - Training associated to the course
	 */
	public void setTraining(final SessionContext ctx, final Training value)
	{
		TRAININGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.training</code> attribute. 
	 * @param value the training - Training associated to the course
	 */
	public void setTraining(final Training value)
	{
		setTraining( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.trainingPOS</code> attribute.
	 * @return the trainingPOS
	 */
	 Integer getTrainingPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TRAININGPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.trainingPOS</code> attribute.
	 * @return the trainingPOS
	 */
	 Integer getTrainingPOS()
	{
		return getTrainingPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.trainingPOS</code> attribute. 
	 * @return the trainingPOS
	 */
	 int getTrainingPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTrainingPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Course.trainingPOS</code> attribute. 
	 * @return the trainingPOS
	 */
	 int getTrainingPOSAsPrimitive()
	{
		return getTrainingPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.trainingPOS</code> attribute. 
	 * @param value the trainingPOS
	 */
	 void setTrainingPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TRAININGPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.trainingPOS</code> attribute. 
	 * @param value the trainingPOS
	 */
	 void setTrainingPOS(final Integer value)
	{
		setTrainingPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.trainingPOS</code> attribute. 
	 * @param value the trainingPOS
	 */
	 void setTrainingPOS(final SessionContext ctx, final int value)
	{
		setTrainingPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Course.trainingPOS</code> attribute. 
	 * @param value the trainingPOS
	 */
	 void setTrainingPOS(final int value)
	{
		setTrainingPOS( getSession().getSessionContext(), value );
	}
	
}
