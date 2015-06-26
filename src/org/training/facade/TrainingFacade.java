/**
 *
 */
package org.training.facade;

import de.hybris.platform.commercefacades.product.ProductFacade;

import java.util.List;

import org.training.data.CourseData;
import org.training.data.TrainingData;


/**
 * @author yawo
 *
 */
public interface TrainingFacade extends ProductFacade
{
	List<CourseData> getAllCourses();

	List<CourseData> getAllCoursesByTraining(String code);

	List<TrainingData> getAllTraining();

	CourseData findCourseByCode(String code);

	TrainingData findTrainingByCode(String code);
}
