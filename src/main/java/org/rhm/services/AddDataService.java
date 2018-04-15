package org.rhm.services;

import org.rhm.model.DataStore;
import org.rhm.utilities.MyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
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
// + this.getClass().getSimpleName()
        MyLogger.log.debug("+++++++++ Loading our service ");
    }

    @Autowired
    public void setDataStoreDao(DataStoreDao dtStDao) {

        MyLogger.log.debug("+++++++++ SEtting up DAtaStore DAO");
        this.dtDao = dtStDao;
    }

    public void addData(DataStore dt) {

        MyLogger.log.debug("+++++++++ Adding data ");

        try {
            dtDao.addDataStore(dt);
        } catch (DataAccessException e) {
            MyLogger.log.error("Error data access exception " + e.getMessage());
        }
    }
}
