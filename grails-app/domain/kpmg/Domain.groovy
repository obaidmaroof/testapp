package kpmg

class Domain {
    static hasMany = [ functions:Function]

    String title

    static constraints = {
        title blank: false
    }

    Domain(String t) {
        title = t
    }
}
