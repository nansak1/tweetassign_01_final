class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }


        "/accounts"(resources: 'account') {
            "/messages"(resources: 'message')
        }


        "/messages"(resources: 'message')
        "/accounts"(resources: 'account')

        "/"(view: "/index")
        "500"(controller: 'Error', action: 'internalServerError')
        "404"(controller: 'Error', action: 'notFound')
        "401"(controller: 'Error', action: 'unauthorized')
        "403"(controller: 'Error', action: 'forbidden')

    }
}
