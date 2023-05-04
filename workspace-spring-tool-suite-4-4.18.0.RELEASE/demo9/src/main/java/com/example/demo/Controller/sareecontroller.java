package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.textiles;
import com.example.demo.repo.sareerepoint;
import com.example.demo.service.sareeService;

@RestController

public class sareecontroller {
	@Autowired sareeService obj;
	@PostMapping("/post")
	public textiles addDetail(@RequestBody textiles a)
	{
		return obj.save(a);
	}
	@GetMapping("/get")
	public List<textiles> getDtails()
	{
		return obj.findAllsaree();
		
	}
	@PutMapping("/put")
	public textiles updateDetails(@RequestBody textiles cid)
	
	{
		return obj.update(cid);
	}
@DeleteMapping("/dsaree/{sareeid}")
public String deleteDetails(@PathVariable("sareeid")int mid)
{
	obj.delete(mid);
	return "Deleted Sucessfully";
}
@GetMapping("/sortAsc/{employeename}")
public List<textiles> sortAscend(@PathVariable("employeename") String employeename)
{
	return obj.sortAsc(employeename);
}

public sareerepoint sr;
//query
@GetMapping("/jpql")

public List<textiles> getJp()
{
	return sr.getAll();
}

@GetMapping("jp/{id}")

public List<textiles> getjpql(@PathVariable("id") int did)
{
	return sr.jpql(did);
}

@PutMapping("/updated/{name}/{id}")

public String updateDetails(@PathVariable("name") String dname, @PathVariable("id") int did)
{
	sr.updateDetails(dname,did);
	return "Updated";
}

@DeleteMapping("deleted/{id}/{gender}")

public String deleteDetails(@PathVariable("id") int did,@PathVariable("age") int age )
{
	sr.deleteDetails(did, age);
	return "Deleted";
}
}
