package kpmg

import grails.test.mixin.TestFor
import org.junit.Test
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(EntityService)
class EntityServiceSpec extends Specification {

    EntityService entityService
    def setup() {
    }

    def cleanup() {
    }

    void "Retrieve entity"() {
        given:

        when: "service is called"
        //"service" represents the grails service you are testing for
        Entity entity = service.getEntityTree()

        then: "Expect something to happen"
        //Assertion goes here
        assert entity.title == "Anwendingsentwicklng"
        assert entity.domains.size() == 2
        assert entity.domains[1].title == "Devops"
        assert entity.domains[2].title == "Design"
    }
}
