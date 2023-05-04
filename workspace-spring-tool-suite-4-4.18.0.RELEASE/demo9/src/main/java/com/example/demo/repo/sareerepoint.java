package com.example.demo.repo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.textiles;

import jakarta.transaction.Transactional;
@Repository
public interface sareerepoint extends CrudRepository<textiles, Integer> {

	List<textiles> findAll(Sort ascending);
	//query
	@Query(value="select c from textiles c")
	List<textiles> getAll();
		
	@Query(value="select c from textiles c where c.sareeid=?1")
	public List<textiles> jpql(@Param("id") int did);
	
	@Modifying
	@Transactional
	@Query(value="delete from textiles c where c.sareeid=?1 and c.sareecolor=?2")
	Integer deleteDetails(@Param("id") int did, @Param("color") int scolor);
	
	@Modifying
	@Transactional
	@Query(value="update textiles c set c.employeename=?1 where sareeid=?2")
	Integer updateDetails(@Param("employeename") String dname, @Param("id") int did);

}
