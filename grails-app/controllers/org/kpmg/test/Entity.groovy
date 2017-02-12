package org.kpmg.test

import kpmg.EntityService

class Entity {

    EntityService entityService

    def index() {
        entityService.getEntityTree()
    }
}
