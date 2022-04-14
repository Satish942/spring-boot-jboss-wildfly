package com.thepracticaldeveloper.jbosswildflydemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FinDaoImpl implements FinDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	/*
	 * @Autowired LobHandler lobHandler;
	 */

	/*
	 * public FinDaoImpl(DataSource dataSource) { jdbcTemp = new
	 * JdbcTemplate(dataSource); }
	 */

	@Override
	public List<Fin> empList() {
		return jdbcTemplate.query(
                "select * from fin",
                (rs, rowNum) ->
                        new Fin(
                                rs.getLong("code"),
                                rs.getString("type")
                        )
        );
	}

}
