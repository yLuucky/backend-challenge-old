package backend.challenge.modules.task.repositories;

import backend.challenge.modules.task.dtos.TaskDTO;
import backend.challenge.modules.task.dtos.TaskProgressDTO;
import backend.challenge.modules.task.models.Task;

import java.util.List;

public interface ITaskRepository {

	Task index(Long taskId);
	List<Task> show();
	Task create(TaskDTO taskDTO);
	Task update(Task task);
	void delete(Long taskId);

    Task UpdateProgress(TaskProgressDTO taskProgressDTO);

	Task updateStatus(Task task);
}
