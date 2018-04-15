package org.rhm.services;


import org.rhm.model.DataStore;
import org.rhm.utilities.MyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Class handling DAO using POstgresql
 */
@Repository("DataStoreDao")
public class DataStoreDao {


    private NamedParameterJdbcTemplate jdbc ;

    public DataStoreDao() {

        System.out.println("Hello DataStore Dao");
        MyLogger.log.debug("Hello my dear DataStore Dao");
    }

    @Autowired
    public void setDataSource(DataSource dtJdbc){

        this.jdbc = new NamedParameterJdbcTemplate(dtJdbc);
    }

    @Transactional
    public boolean addDataStore(DataStore dts) {

        MyLogger.log.debug("+++++++++ Before bean property...");
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(dts);

        MyLogger.log.debug("We are writing the data within the DB");
        return jdbc.update("INSERT INTO datastore(fullname,email,message,age) values(:name,:email,:message,:age)", params) == 1;
    }

    public List<DataStore> getDataStores() {

        return jdbc.query("SELECT * FROM datastore", new RowMapper<DataStore>() {

                    public DataStore mapRow(ResultSet rs, int nRows) throws SQLException {

                        DataStore dts = new DataStore();
                        dts.setName(rs.getString("fullname"));
                        dts.setEmail(rs.getString("email"));
                        dts.setMessage(rs.getString("message"));
                        dts.setAge(rs.getInt("age"));

                        return dts;
                    }


                }

        );

    }
}
