package dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class TransportistaDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    public List consultarClienteById(int id){
    List cli= new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from transportista where Id=?";
    cli = this.jdbcTemplate.queryForList(sql,id);
    return cli;
    }
    public List consultarClienteByNombre(String nombre){
    List cli = new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from transportista where nombre like '%" + nombre + "%'";
    cli = this.jdbcTemplate.queryForList(sql);
        return cli;
    }
}

