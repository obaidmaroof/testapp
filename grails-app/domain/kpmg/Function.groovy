package kpmg

class Function {
    String title

    static constraints = {
        title blank: false
    }

    Function(String t) {
        title = t
    }
}
