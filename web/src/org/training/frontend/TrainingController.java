/**
 *
 */
package org.training.frontend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.data.CourseData;
import org.training.data.TrainingData;
import org.training.facade.TrainingFacade;


/**
 * @author yawo
 *
 */
@Controller
public class TrainingController
{
	@Autowired
	private TrainingFacade trainingFacade;


	@RequestMapping(value = "/trainings")
	public String showTrainings(final Model model)
	{
		final List<TrainingData> trainings = trainingFacade.getAllTraining();
		model.addAttribute("trainings", trainings);
		return "TrainingListing";
	}

	@RequestMapping(value = "/trainings/{trainingCode}")
	public String showTraining(final Model model, @PathVariable final String trainingCode)
	{
		final TrainingData training = trainingFacade.findTrainingByCode(trainingCode);
		final List<CourseData> courses = trainingFacade.getAllCoursesByTraining(trainingCode);
		model.addAttribute("training", training);
		model.addAttribute("courses", courses);
		return "TrainingDetails";
	}



}
