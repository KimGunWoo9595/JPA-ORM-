package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Map;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
          /*  Member member = new Member();

            member.setId(3L);
            member.setName("helloB");*/
         /*   Member findMember = em.find(Member.class, 1L);
           findMember.setName("난 김건우");*/

          /*  List<Member> resultList = em.createQuery("select m from Member as m", Member.class).getResultList();

            for (Member member : resultList) {
                System.out.println("member.getName() = " + member.getName());
            }*/

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
