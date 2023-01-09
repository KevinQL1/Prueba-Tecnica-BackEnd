package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;
import com.example.demo.model.Solicitude;
import com.example.demo.repository.SolicitudeRepository;

@Service
public class SolicitudeService implements SolicitudeRepository{
	
	@Autowired
	private SolicitudeRepository solicitudeRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	
	public List<Solicitude> findAllById(Long id){
		List<Solicitude> answerId = new ArrayList<>();
		List<Solicitude> answer = solicitudeRepository.findAll();
		for(int i=0; i<answer.size(); i++) {
			if(answer.get(i).getId()==id) {
				answerId.add(answer.get(i));
			}
		}
		return answerId;
	}

	@Override
	public <S extends Solicitude> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Solicitude> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Solicitude> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Solicitude getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Solicitude getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Solicitude getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Solicitude> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Solicitude> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Solicitude> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Solicitude> findAll() {
		// TODO Auto-generated method stub
		return solicitudeRepository.findAll();
	}

	@Override
	public List<Solicitude> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return solicitudeRepository.findAllById(ids);
	}

	@Override
	public <S extends Solicitude> S save(S entity) {
		return solicitudeRepository.save(entity);
	}

	@Override
	public Optional<Solicitude> findById(Long id) {
		// TODO Auto-generated method stub
		return solicitudeRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Solicitude entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Solicitude> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Solicitude> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return solicitudeRepository.findAll(sort);
	}

	@Override
	public Page<Solicitude> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Solicitude> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Solicitude> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Solicitude> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Solicitude> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Solicitude, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
}
