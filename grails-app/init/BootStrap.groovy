import tweetassign_01.Account
import tweetassign_01.Message

class BootStrap {

    def init = { servletContext ->
        // def a1=new Account(accountHandle: 'walterauma', fullName: 'Walter Auma', emailAddress: 'walterauma@umn.edu', accountPassword: 'msse2016ASSIGN').save(failOnError:true)
        // def a2=new Account(accountHandle: 'naynanayate', fullName: 'Nayna Nayate', emailAddress: 'naynayate@umn.edu', accountPassword: 'msse2016ASSIGN').save(failOnError:true)
        // def a3=new Account(accountHandle: 'janeakinyi', fullName: 'Janet Akinyi', emailAddress: 'jakinyi@umn.edu', accountPassword: 'msse2016ASSIGN',followers:a1,following:a1).save(failOnError:true)
        // def m1=new Message(msgText: "Welcome to Atlanta", acc:a1 ).save(failOnError:true)
        // def m2=new Message(msgText: "Welcome to Minnesota", acc:a2 ).save(failOnError:true)
        // def m3=new Message(msgText: "How is the weather out there?", acc:a1 ).save(failOnError:true)
        // def m4=new Message(msgText: "It's getting better, infact it is warm.", acc:a2 ).save(failOnError:true)
    }
    def destroy = {
    }
}
