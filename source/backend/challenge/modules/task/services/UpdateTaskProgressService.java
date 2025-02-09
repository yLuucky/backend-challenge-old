package backend.challenge.modules.task.services;

import backend.challenge.modules.task.dtos.TaskProgressDTO;
import backend.challenge.modules.task.models.Task;
import backend.challenge.modules.task.repositories.ITaskRepository;

import javax.inject.Inject;

public class UpdateTaskProgressService implements IUpdateTaskProgressService {
    private final ITaskRepository taskRepository;

    @Inject
    public UpdateTaskProgressService(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task execute(TaskProgressDTO taskProgressDTO) {
        Task taskUpdated = this.taskRepository.UpdateProgress(taskProgressDTO);
        return taskUpdated;
    }
}
