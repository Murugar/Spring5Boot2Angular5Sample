package com.iqmsoft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iqmsoft.entity.ToDo;
import com.iqmsoft.exception.ResourceNotFoundException;

@Service
public interface MainService {

	/**
	 * <p>
	 * This method returns all available TODO
	 * </p>
	 * 
	 * @return List of TODO
	 */
	List<ToDo> listAll();

	/**
	 * <p>
	 * This method add new TODO in persist layer.
	 * </p>
	 * 
	 * @param toDo
	 * @return Newly added TODO
	 */
	ToDo addToDo(ToDo toDo);

	/**
	 * <p>
	 * This method update List of provided TODO in persist layer.
	 * </p>
	 * 
	 * @param todos
	 *            List of ToDo to be updated.
	 * @return List of ToDo.
	 * @throws ResourceNotFoundException
	 *             throws ResourceNotFoundException is resources that needs to be
	 *             updated are not found in persist layer.
	 */
	List<ToDo> updateAll(List<ToDo> todos) throws ResourceNotFoundException;

	/**
	 * <p>
	 * This method deletes ToDo of given id.
	 * </p>
	 * 
	 * @param id
	 *            Id of ToDo to be deleted.
	 * @throws ResourceNotFoundException
	 *             throws ResourceNotFoundException is resources that needs to be
	 *             updated are not found in persist layer.
	 */
	void delete(Long id) throws ResourceNotFoundException;

}
