package id.co.hci.demo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class ModulePojo {
    private String moduleName;
    private Integer moduleOrder;

    public ModulePojo(){}


    public ModulePojo(String moduleName, Integer moduleOrder) {
        this.moduleName = moduleName;
        this.moduleOrder = moduleOrder;
    }
}