package id.co.hci.demo.dao;

import id.co.hci.demo.entity.ModuleEntity;
import id.co.hci.demo.pojo.ModulePojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleDao extends JpaRepository<ModuleEntity,Long> {

    @Query("SELECT m FROM ModuleEntity m WHERE m.userId = ?1")
    List<ModuleEntity> findByUserId(String userId);
}
