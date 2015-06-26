/**
 *
 */
package org.training;

import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;

import java.util.List;

import org.training.data.CourseData;
import org.training.data.TrainingData;
import org.training.facade.TrainingFacade;
import org.training.service.TrainingService;


/**
 * @author yawo
 *
 */
public class DefaultTrainingFacade extends DefaultProductFacade<CourseData> implements TrainingFacade
{

	private TrainingService trainingService;

	/**
	 * @return the trainingService
	 */
	public TrainingService getTrainingService()
	{
		return trainingService;
	}

	/**
	 * @param trainingService
	 *           the trainingService to set
	 */
	public void setTrainingService(final TrainingService trainingService)
	{
		this.trainingService = trainingService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.facade.TrainingFacade#getAllCourses()
	 */
	@Override
	public List<CourseData> getAllCourses()
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.facade.TrainingFacade#getAllCoursesByTraining(java.lang.String)
	 */
	@Override
	public List<CourseData> getAllCoursesByTraining(final String code)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.facade.TrainingFacade#getAllTraining()
	 */
	@Override
	public List<TrainingData> getAllTraining()
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.facade.TrainingFacade#findCourseByCode(java.lang.String)
	 */
	@Override
	public CourseData findCourseByCode(final String code)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.facade.TrainingFacade#findTrainingByCode(java.lang.String)
	 */
	@Override
	public TrainingData findTrainingByCode(final String code)
	{
		// YTODO Auto-generated method stub
		return null;
	}





}
