/**
 *
 */
package org.training.dao;

import de.hybris.platform.product.daos.ProductDao;

import java.util.List;

import org.training.model.CourseModel;
import org.training.model.TrainingModel;


/**
 * @author yawo
 *
 */
public interface TrainingDao extends ProductDao
{
	List<CourseModel> getAllCourses();

	List<CourseModel> getAllCoursesByTraining(String code);

	List<TrainingModel> getAllTraining();

	/**
	 * @param code
	 * @return
	 */
	List<CourseModel> findCourseByCode(String code);

	/**
	 * @param code
	 * @return
	 */
	List<TrainingModel> findTrainingByCode(String code);

}
