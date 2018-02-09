/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 *
 * @author jose
 */
public class Db2{
    
    @Resource(name="jdbc/supermercado")
    private javax.sql.DataSource ds;
    
    public DataSource getDataSource(){
        return ds;
    }
    
}
