package kpmg

class Entity {
    static hasMany = [ domains:Domain]

    String title

    static constraints = {
        title blank: false
    }

    Entity(String t) {
        title = t
        domains = new ArrayList<>()
    }
}
