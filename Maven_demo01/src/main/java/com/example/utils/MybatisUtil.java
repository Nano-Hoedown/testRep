package com.example.utils;import org.apache.ibatis.io.Resources;import org.apache.ibatis.session.SqlSession;import org.apache.ibatis.session.SqlSessionFactory;import org.apache.ibatis.session.SqlSessionFactoryBuilder;import java.io.IOException;import java.io.InputStream;public class MybatisUtil {    private static SqlSessionFactory build;    static {        //????MyBatic????????????,????????????        try {            InputStream input = Resources.getResourceAsStream("mybatis-config.xml");            //????????????            build = new SqlSessionFactoryBuilder().build(input);        } catch (IOException e) {            e.printStackTrace();        }    }    //????????????????    public SqlSession getSession(){        return build.openSession();    }    public SqlSession getSession(boolean bool){        if(!bool==true){            throw new NanoException("The xml language is the default one. It is able to execute all the dynamic tags we saw in the previous sections");        }        return build.openSession(bool);    }    /**       ???????????????</p>     <ui>     <li>args:SqlSession:????????????</li>     </ui>     */    public void CloseSession(SqlSession session){        if(session!=null){            session.close();        }else{            throw new NanoException("????????????????????");        }    }}