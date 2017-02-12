package kpmg

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EntityController {

    EntityService entityService

    static allowedMethods = [show: "GET"]

    def index() {
        Entity entity = entityService.getEntityTree()
        respond entity
    }

    def show(Entity entity) {
        respond entity
    }

    def create() {
       // respond new Entity(params)
    }

    @Transactional
    def save(Entity entity) {
//        if (entity == null) {
//            transactionStatus.setRollbackOnly()
//            notFound()
//            return
//        }
//
//        if (entity.hasErrors()) {
//            transactionStatus.setRollbackOnly()
//            respond entity.errors, view:'create'
//            return
//        }
//
//        entity.save flush:true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.created.message', args: [message(code: 'entity.label', default: 'Entity'), entity.id])
//                redirect entity
//            }
//            '*' { respond entity, [status: CREATED] }
//        }
    }

    def edit(Entity entity) {
     //   respond entity
    }

    @Transactional
    def update(Entity entity) {
//        if (entity == null) {
//            transactionStatus.setRollbackOnly()
//            notFound()
//            return
//        }
//
//        if (entity.hasErrors()) {
//            transactionStatus.setRollbackOnly()
//            respond entity.errors, view:'edit'
//            return
//        }
//
//        entity.save flush:true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.updated.message', args: [message(code: 'entity.label', default: 'Entity'), entity.id])
//                redirect entity
//            }
//            '*'{ respond entity, [status: OK] }
//        }
    }

    @Transactional
    def delete(Entity entity) {

//        if (entity == null) {
//            transactionStatus.setRollbackOnly()
//            notFound()
//            return
//        }
//
//        entity.delete flush:true
//
//        request.withFormat {
//            form multipartForm {
//                flash.message = message(code: 'default.deleted.message', args: [message(code: 'entity.label', default: 'Entity'), entity.id])
//                redirect action:"index", method:"GET"
//            }
//            '*'{ render status: NO_CONTENT }
//        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'entity.label', default: 'Entity'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
