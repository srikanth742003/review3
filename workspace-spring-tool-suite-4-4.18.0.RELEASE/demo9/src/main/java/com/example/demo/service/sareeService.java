package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.textiles;
import com.example.demo.repo.sareerepoint;

@Service
public class sareeService {
@Autowired
private sareerepoint sri;

public textiles save(textiles a)
{
	return sri.save(a);
}
public textiles update(textiles u)
{
	return sri.save(u);
}
public List<textiles> findAllsaree()
{
	return (List<textiles>) sri.findAll();
}
public void delete(int id)
{
	sri.deleteById(id);
}
//sorting
	public List<textiles> sortAsc(String employeename)
	{
		return sri .findAll(Sort.by(employeename).ascending());
	}
}