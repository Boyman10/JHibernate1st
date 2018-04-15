package org.rhm.services;

import org.rhm.model.DataStore;
import org.springframework.stereotype.Service;

/**
 * Service class to manipulate our DataStore beans using a specific DAO
 * @author hackme
 *
 */
@Service
public class AddDataService {

    DataStoreDao dtDao;

    /**
     * Consctructor class
     */
    public AddDataService(){

        System.out.println("Loading our service " + this.getClass().getSimpleName());
    }

    public void setDataStoreDao(dataStoreDao dtStDao) {

        this.dtDao = dtStDao;
    }

    public void addData(DataStore dt) {
        dtDao.addDataStore(dt);
    }
}
