package com.iqmsoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.iqmsoft.entity.ToDo;
import com.iqmsoft.exception.ResourceNotFoundException;
import com.iqmsoft.repository.MainRepository;
import com.iqmsoft.service.MainService;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    MainRepository todoRepository;

	@Override
	public List<ToDo> listAll() {
        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.ASC, "id");
        return todoRepository.findAll(sortByCreatedAtDesc);
	}

	@Override
	public ToDo addToDo(ToDo toDo) {
		toDo.setCompleted(false);
        return todoRepository.save(toDo);
	}

	@Override
	public List<ToDo> updateAll(List<ToDo> todos) throws ResourceNotFoundException {
		List<Long> toDoIdList = new ArrayList<Long>();
        for(ToDo item : todos) {
        		toDoIdList.add(item.getId());
        }
        List<ToDo> todoDataList = todoRepository.findAll();
        if(todoDataList.size() != todos.size()) {
            throw new ResourceNotFoundException();
        }
        for(ToDo item : todoDataList) {
        		item.setCompleted(true);
	    }

        return todoRepository.saveAll(todoDataList);
	}

	@Override
	public void delete(Long id) throws ResourceNotFoundException {
        ToDo todo =todoRepository.findById(id).get();
        if(todo == null) {
            throw new ResourceNotFoundException();
        }
        todoRepository.delete(todo);
	}

}
