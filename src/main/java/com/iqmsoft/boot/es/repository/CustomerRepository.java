package com.iqmsoft.boot.es.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.iqmsoft.boot.es.model.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
	List<Customer> findByFirstname(String firstname);
	Page<Customer> findByFirstname(String firstname, Pageable pageable);
    List<Customer> findByAge(int age);
}

