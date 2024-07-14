package org.example.exceptiongame;

public class A {
    public void a(Service s, Connection c) throws Exception {
        s.setConnection(c);
        try {
            s.execute();
            c.commit();
        }catch (Exception e){
            System.err.println("Exception" + e);
            c.rollback();
            throw e;
        }
        finally {
            c.close();
        }
    }
}
