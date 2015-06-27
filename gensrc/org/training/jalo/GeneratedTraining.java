/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 26, 2015 4:57:56 PM                     ---
 * ----------------------------------------------------------------
 */
package org.training.jalo;

import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.constants.TrainingConstants;
import org.training.jalo.Course;

/**
 * Generated class for type {@link org.training.jalo.Training Training}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTraining extends Product
{
	/** Qualifier of the <code>Training.subject</code> attribute **/
	public static final String SUBJECT = "subject";
	/** Qualifier of the <code>Training.numberOfDays</code> attribute **/
	public static final String NUMBEROFDAYS = "numberOfDays";
	/** Qualifier of the <code>Training.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Training.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>Training.courses</code> attribute **/
	public static final String COURSES = "courses";
	/**
	* {@link OneToManyHandler} for handling 1:n COURSES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Course> COURSESHANDLER = new OneToManyHandler<Course>(
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
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.courses</code> attribute.
	 * @return the courses - Courses associated to the training
	 */
	public List<Course> getCourses(final SessionContext ctx)
	{
		return (List<Course>)COURSESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.courses</code> attribute.
	 * @return the courses - Courses associated to the training
	 */
	public List<Course> getCourses()
	{
		return getCourses( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.courses</code> attribute. 
	 * @param value the courses - Courses associated to the training
	 */
	public void setCourses(final SessionContext ctx, final List<Course> value)
	{
		COURSESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.courses</code> attribute. 
	 * @param value the courses - Courses associated to the training
	 */
	public void setCourses(final List<Course> value)
	{
		setCourses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to courses. 
	 * @param value the item to add to courses - Courses associated to the training
	 */
	public void addToCourses(final SessionContext ctx, final Course value)
	{
		COURSESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to courses. 
	 * @param value the item to add to courses - Courses associated to the training
	 */
	public void addToCourses(final Course value)
	{
		addToCourses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from courses. 
	 * @param value the item to remove from courses - Courses associated to the training
	 */
	public void removeFromCourses(final SessionContext ctx, final Course value)
	{
		COURSESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from courses. 
	 * @param value the item to remove from courses - Courses associated to the training
	 */
	public void removeFromCourses(final Course value)
	{
		removeFromCourses( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.numberOfDays</code> attribute.
	 * @return the numberOfDays
	 */
	public Integer getNumberOfDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.numberOfDays</code> attribute.
	 * @return the numberOfDays
	 */
	public Integer getNumberOfDays()
	{
		return getNumberOfDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.numberOfDays</code> attribute. 
	 * @return the numberOfDays
	 */
	public int getNumberOfDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.numberOfDays</code> attribute. 
	 * @return the numberOfDays
	 */
	public int getNumberOfDaysAsPrimitive()
	{
		return getNumberOfDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.numberOfDays</code> attribute. 
	 * @param value the numberOfDays
	 */
	public void setNumberOfDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.numberOfDays</code> attribute. 
	 * @param value the numberOfDays
	 */
	public void setNumberOfDays(final Integer value)
	{
		setNumberOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.numberOfDays</code> attribute. 
	 * @param value the numberOfDays
	 */
	public void setNumberOfDays(final SessionContext ctx, final int value)
	{
		setNumberOfDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.numberOfDays</code> attribute. 
	 * @param value the numberOfDays
	 */
	public void setNumberOfDays(final int value)
	{
		setNumberOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.subject</code> attribute.
	 * @return the subject
	 */
	public String getSubject(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.subject</code> attribute.
	 * @return the subject
	 */
	public String getSubject()
	{
		return getSubject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.subject</code> attribute. 
	 * @param value the subject
	 */
	public void setSubject(final String value)
	{
		setSubject( getSession().getSessionContext(), value );
	}
	
}
