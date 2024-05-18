package com.product.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entity.MasterTable;

@Repository
public interface MasterRepo extends JpaRepository<MasterTable, String>{

}
