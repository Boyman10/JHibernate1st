package org.rhm.services;

import org.springframework.stereotype.Repository;

/**
 * Class handling DAO using POstgresql
 */
@Repository("DataStoreDao")
public class DataStoreDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

}
