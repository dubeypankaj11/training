/**
 *
 */
package org.training.service;

import de.hybris.platform.product.ProductService;

import java.util.List;

import org.training.model.CourseModel;
import org.training.model.TrainingModel;


/**
 * @author yawo
 *
 */
public interface TrainingService extends ProductService
{
	List<CourseModel> getAllCourses();

	List<CourseModel> getAllCoursesByTraining(String code);

	List<TrainingModel> getAllTrainings();

	CourseModel findCourseByCode(String code);

	TrainingModel findTrainingByCode(String code);
}
