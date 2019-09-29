package me.js.springbatch.repository;

import me.js.springbatch.entity.CustomerBackup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerBackupRepository extends JpaRepository<CustomerBackup, Long> {

}
