package kpmg

import grails.transaction.Transactional

@Transactional
class EntityService {

    def getEntityTree() {
        return Entity.findByTitle("Anwendingsentwicklng")
    }
}
