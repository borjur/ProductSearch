package springstruts.model.dao.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import springstruts.model.DVDTO;

import java.util.List;

import springstruts.model.dao.DVDDAO;


public class DVDDAOImpl implements DVDDAO {
    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public List<DVDTO> searchProductsByName(final String name) {
        List<DVDTO> r = hibernateTemplate.executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException {
                Query query = session.createQuery("FROM DVDTO WHERE TITLE LIKE '%"+name+"%'");
                //query.setString("title", name);
                List<DVDTO> r = query.list();
                return r;
            }
        });
        return r;
    }
}
