package kpmg

import grails.test.mixin.*
import spock.lang.*

@TestFor(EntityController)
@Mock(EntityService)
class EntityControllerSpec extends Specification {

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.entityList
            model.entityCount == 0
    }


}
