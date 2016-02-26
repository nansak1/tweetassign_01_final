package tweetassign_01

import grails.rest.Resource

@Resource()
class Message {
    String msgText
    Date dateCreated
    static hasOne=[acc:Account]
    static constraints = {
        msgText nullable: false, blank: false, size: 1..40
    }
}
