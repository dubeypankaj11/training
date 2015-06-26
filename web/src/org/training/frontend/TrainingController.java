/**
 *
 */
package org.training.frontend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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

}