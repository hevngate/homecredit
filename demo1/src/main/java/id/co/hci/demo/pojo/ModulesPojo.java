package id.co.hci.demo.pojo;


import lombok.Data;

import java.util.List;

@Data
public class ModulesPojo {
    private List<ModulePojo> modules;

    public ModulesPojo(){}


    public ModulesPojo(List<ModulePojo> modules) {
        this.modules = modules;
    }
}