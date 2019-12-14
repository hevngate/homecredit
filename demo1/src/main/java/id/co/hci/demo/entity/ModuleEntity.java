package id.co.hci.demo.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Data
@Entity
@Table(name="M_MODULE")
public class ModuleEntity {

    public ModuleEntity(){}


    @Id
    @GeneratedValue
    private long id;

    @Column(name="USER_ID", nullable = false)
    private String userId;

    @Column(name="MODULE_NAME", nullable = false)
    private String moduleName;

    @Column(name="MODULE_ORDER", nullable = false)
    private Integer moduleOrder;

    public ModuleEntity(String userId, String moduleName, Integer moduleOrder) {
        this.userId = userId;
        this.moduleName = moduleName;
        this.moduleOrder = moduleOrder;
    }



}
