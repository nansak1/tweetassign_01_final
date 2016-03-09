import grails.converters.JSON
import tweetassign_01.Account
import tweetassign_01.Message

class BootStrap {

    def jsonMarsh = JSON.registerObjectMarshaller(Account) {
        Account a -> return [id: a?.id, accountHandle: a?.accountHandle, fullName: a?.fullName, emailAddress: a?.emailAddress, accountPassword: a?.accountPassword, followers: a?.followers?.accountHandle, following: a?.following?.accountHandle, msg: a?.msg, followingTotal: a?.following?.size(), followersTotal: a?.followers?.size()]
    }

    def init = { servletContext ->

        def a1 = new Account(accountHandle: 'richelliot', fullName: 'Richard Elliot', emailAddress: 'richelliot@gmail.com', accountPassword: 'msse2016ASSIGN').save(failOnError: true)
        def a2 = new Account(accountHandle: 'donaldtrump', fullName: 'Donald Trump', emailAddress: 'dtrump@trumpmag.com', accountPassword: 'msse2016ASSIGN').save(failOnError: true)
        def a3 = new Account(accountHandle: 'jacquekult', fullName: 'Jacqualine Kimtai', emailAddress: 'jkimtaii@umn.edu', accountPassword: 'msse2016ASSIGN', followers: a1, following: a1).save(failOnError: true)
        def a4 = new Account(accountHandle: 'jeremyn', fullName: 'Jeremy Nathan', emailAddress: 'jnath@umn.edu', accountPassword: 'msse2016ASSIGN', followers: [a1, a3], following: a2).save(failOnError: true)
        def a5 = new Account(accountHandle: 'kkadeshian', fullName: 'Kim Kadeshian', emailAddress: 'kkadeshian@umn.edu', accountPassword: 'msse2016ASSIGN', followers: [a1, a2, a3, a4], following: [a2, a4]).save(failOnError: true)

        def m1 = new Message(msgText: "Welcome to Atlanta", acc: a1).save(failOnError: true)
        def m2 = new Message(msgText: "Welcome to Minnesota", acc: a2).save(failOnError: true)
        def m3 = new Message(msgText: "How is the weather out there?", acc: a1).save(failOnError: true)
        def m4 = new Message(msgText: "It's getting better, infact it is warm.", acc: a2).save(failOnError: true)
    }
    def destroy = {
    }
}
