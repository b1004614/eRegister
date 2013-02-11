package uk.ac.shu.webarch.eregister

class Instructor {

    String name
    String staffNumber

    Set classes

    static hasMany = [classes_taught_by_this_instructor:RegClass]

    static mappedBy = [classes_taught_by_this_instructor:'class_instructor']

    static constraints = {
    name(nullable:false, blank:false,maxsize:256);
    staffNumber(nullable:false, blank:false,maxSize:20);
    }
}
