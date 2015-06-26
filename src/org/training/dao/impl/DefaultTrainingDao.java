/**
 *
 */
package org.training.dao.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.product.daos.impl.DefaultProductDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.training.dao.TrainingDao;
import org.training.model.CourseModel;
import org.training.model.TrainingModel;


/**
 * @author yawo
 *
 */
public class DefaultTrainingDao extends DefaultProductDao implements TrainingDao
{
	private static String ALL_COURSES = "SELECT {pk} FROM {Course}";
	private static String ALL_TRAININGS = "SELECT {pk} FROM {Training}";
	private static String COURSES_BY_CODE = "SELECT {pk} FROM {Course} WHERE {code} = ?code";
	private static String TRAININGS_BY_CODE = "SELECT {pk} FROM {Training} WHERE {code} = ?code";
	private static String COURSES_BY_TRAINING = "SELECT {c:pk} as training "
			+ "FROM {  Course as c  JOIN Training as t   ON {c:training} = {t:pk}}" + "WHERE {t:code} = ?code";


	private FlexibleSearchService flexibleSearchService;

	/**
	 * @return the flexibleSearchService
	 */
	@Override
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	@Override
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	/**
	 * @param typecode
	 */
	public DefaultTrainingDao(final String typecode)
	{
		super(typecode);
		// YTODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.dao.TrainingDao#getAllCourses()
	 */
	@Override
	public List<CourseModel> getAllCourses()
	{
		final SearchResult<CourseModel> result = flexibleSearchService.search(ALL_COURSES);
		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.dao.TrainingDao#getAllCoursesByTraining()
	 */
	@Override
	public List<CourseModel> getAllCoursesByTraining(final String code)
	{
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put("code", code);
		final SearchResult<CourseModel> result = flexibleSearchService.search(COURSES_BY_TRAINING, params);
		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.dao.TrainingDao#getAllTraining()
	 */
	@Override
	public List<TrainingModel> getAllTraining()
	{
		final SearchResult<TrainingModel> result = flexibleSearchService.search(ALL_TRAININGS);
		return result.getResult();
	}

	@Override
	public List<CourseModel> findCourseByCode(final String code)
	{
		validateParameterNotNull(code, "Product code must not be null!");
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put("code", code);
		final SearchResult<CourseModel> result = flexibleSearchService.search(COURSES_BY_CODE, params);
		return result.getResult();

	}

	@Override
	public List<TrainingModel> findTrainingByCode(final String code)
	{
		validateParameterNotNull(code, "Product code must not be null!");
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put("code", code);
		final SearchResult<TrainingModel> result = flexibleSearchService.search(TRAININGS_BY_CODE, params);
		return result.getResult();

	}



}
