package com.nissan.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.YonoApp;

@Repository
public interface IYonoRepo extends JpaRepositoryImplementation<YonoApp, Integer> {

	@Query("from YonoApp where accountNumber=?1")
	public YonoApp searchSpecificCustomer(long accountNumber);

}
