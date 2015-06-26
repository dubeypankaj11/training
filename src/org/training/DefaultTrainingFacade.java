/**
 *
 */
package org.training;

import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;

import java.util.ArrayList;
import java.util.List;

import org.training.data.CourseData;
import org.training.data.TrainingData;
import org.training.facade.TrainingFacade;
import org.training.model.CourseModel;
import org.training.model.TrainingModel;
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
		final List<CourseModel> courses = trainingService.getAllCourses();
		final List<CourseData> datas = new ArrayList<CourseData>();
		for (final CourseModel course : courses)
		{
			datas.add(quickCourseConvert(course));
		}
		return datas;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.facade.TrainingFacade#getAllCoursesByTraining(java.lang.String)
	 */
	@Override
	public List<CourseData> getAllCoursesByTraining(final String code)
	{
		final List<CourseModel> courses = trainingService.getAllCoursesByTraining(code);
		final List<CourseData> datas = new ArrayList<CourseData>();
		for (final CourseModel course : courses)
		{
			datas.add(quickCourseConvert(course));
		}
		return datas;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.facade.TrainingFacade#getAllTraining()
	 */
	@Override
	public List<TrainingData> getAllTraining()
	{
		final List<TrainingModel> trainings = trainingService.getAllTrainings();
		final List<TrainingData> datas = new ArrayList<TrainingData>();
		for (final TrainingModel training : trainings)
		{
			datas.add(quickTrainingConvert(training));
		}
		return datas;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.facade.TrainingFacade#findCourseByCode(java.lang.String)
	 */
	@Override
	public CourseData findCourseByCode(final String code)
	{
		final CourseModel source = trainingService.findCourseByCode(code);
		//Normally we should create a converter...
		return quickCourseConvert(source);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.training.facade.TrainingFacade#findTrainingByCode(java.lang.String)
	 */
	@Override
	public TrainingData findTrainingByCode(final String code)
	{
		final TrainingModel source = trainingService.findTrainingByCode(code);
		//Normally we should create a converter...
		return quickTrainingConvert(source);
	}

	private CourseData quickCourseConvert(final CourseModel course)
	{
		final CourseData data = new CourseData();
		data.setCode(course.getCode());
		data.setSubject(course.getSubject());
		data.setNumberOfDays(course.getNumberOfDays());
		data.setTrainer(course.getCode());
		data.setLanguage(course.getCode());
		data.setOnlineDate(course.getOnlineDate());
		return data;
	}

	private TrainingData quickTrainingConvert(final TrainingModel training)
	{
		final TrainingData data = new TrainingData();
		data.setCode(training.getCode());
		data.setSubject(training.getSubject());
		data.setNumberOfDays(training.getNumberOfDays());
		data.setOnlineDate(training.getOnlineDate());
		return data;
	}



}
