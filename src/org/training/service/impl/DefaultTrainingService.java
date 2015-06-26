/**
 *
 */
package org.training.service.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateIfSingleResult;
import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;
import static java.lang.String.format;

import de.hybris.platform.product.impl.DefaultProductService;

import java.util.List;

import org.training.dao.TrainingDao;
import org.training.model.CourseModel;
import org.training.model.TrainingModel;
import org.training.service.TrainingService;


/**
 * @author yawo
 *
 */
public class DefaultTrainingService extends DefaultProductService implements TrainingService
{

	TrainingDao trainingDao;

	/**
	 * @return the trainingDao
	 */
	public TrainingDao getTrainingDao()
	{
		return trainingDao;
	}

	/**
	 * @param trainingDao
	 *           the trainingDao to set
	 */
	public void setTrainingDao(final TrainingDao trainingDao)
	{
		this.trainingDao = trainingDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.service.TrainingService#getAllCourses()
	 */
	@Override
	public List<CourseModel> getAllCourses()
	{
		return trainingDao.getAllCourses();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.service.TrainingService#getAllCoursesByTraining(java.lang.String)
	 */
	@Override
	public List<CourseModel> getAllCoursesByTraining(final String code)
	{
		return trainingDao.getAllCoursesByTraining(code);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.service.TrainingService#getAllTraining()
	 */
	@Override
	public List<TrainingModel> getAllTraining()
	{
		return trainingDao.getAllTraining();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.service.TrainingService#findCourseByCode(java.lang.String)
	 */
	@Override
	public CourseModel findCourseByCode(final String code)
	{
		validateParameterNotNull(code, "Parameter code must not be null");
		final List<CourseModel> courses = trainingDao.findCourseByCode(code);

		validateIfSingleResult(courses, format("Product with code '%s' not found!", code),
				format("Product code '%s' is not unique, %d products found!", code, Integer.valueOf(courses.size())));

		return courses.get(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.service.TrainingService#findTrainingByCode(java.lang.String)
	 */
	@Override
	public TrainingModel findTrainingByCode(final String code)
	{
		validateParameterNotNull(code, "Parameter code must not be null");
		final List<TrainingModel> trainings = trainingDao.findTrainingByCode(code);

		validateIfSingleResult(trainings, format("Product with code '%s' not found!", code),
				format("Product code '%s' is not unique, %d products found!", code, Integer.valueOf(trainings.size())));

		return trainings.get(0);
	}
}
