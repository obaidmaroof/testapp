package kpmg


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class EntityControllerIntegrationSpec extends Specification {

    def entityService

    void "test get Entity"() {
        when:
            def entityController = new EntityController()
            entityController.entityService = entityService
            new Entity('asdas').save(failOnError: true, flush: true)
            Entity e = entityController.index()
        then:
            e != null
            assertEquals "bar", fc.response.contentAsString
    }
}
