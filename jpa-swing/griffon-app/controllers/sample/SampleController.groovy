package sample

import griffon.transform.Threading
import javax.persistence.EntityManager
import javax.persistence.Query

@griffon.plugins.jpa.JpaAware
class SampleController {
    def model

    def load = {
        withJpa { String persistenceUnit, EntityManager em ->
            List<Person> tmpList = []
            tmpList.addAll em.createQuery('select p from Person p order by p.id').resultList
            execInsideUIAsync { model.people.addAll tmpList }
        }
    }

    @Threading(Threading.Policy.SKIP)
    void clear(evt) {
        model.people.clear()
    }
}