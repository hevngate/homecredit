package id.co.hci.demo.util;

import id.co.hci.demo.pojo.ModulePojo;

import java.util.Comparator;

public class ModuleSorter implements Comparator<ModulePojo> {
    @Override
    public int compare(ModulePojo o1, ModulePojo o2) {
        return ( Integer.valueOf(o1.getModuleOrder()).compareTo(Integer.valueOf(o2.getModuleOrder())));
    }
}

