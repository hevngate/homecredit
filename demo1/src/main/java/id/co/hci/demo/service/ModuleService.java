package id.co.hci.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import id.co.hci.demo.dao.ModuleDao;
import id.co.hci.demo.entity.ModuleEntity;
import id.co.hci.demo.pojo.ModulePojo;
import id.co.hci.demo.pojo.ModulesPojo;
import id.co.hci.demo.util.ModuleSorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ModuleService {
    @Autowired
    ModuleDao moduleDao;

    public String getModules (String userId){
        List<ModuleEntity> modulList = moduleDao.findByUserId(userId);
        if(modulList.size()>0){
            List<ModulePojo> moduleListPojo = new ArrayList<>();
            for (ModuleEntity moduleEntity:modulList){
                moduleListPojo.add(convertToPojo(moduleEntity));
            }
            moduleListPojo.sort(new ModuleSorter());
            ModulesPojo modules = new ModulesPojo(moduleListPojo);
            ObjectMapper mapper = new ObjectMapper();
            String json ="";
            try {
                json = mapper.writeValueAsString(modules);
                System.out.println(json);
            } catch (IOException e){
                e.printStackTrace();
            }
            return json;
        } else {
            return "User Id Not Found";
        }

    }

    private ModulePojo convertToPojo(ModuleEntity moduleEntity) {
        return new ModulePojo(moduleEntity.getModuleName(),moduleEntity.getModuleOrder());
    }
}
