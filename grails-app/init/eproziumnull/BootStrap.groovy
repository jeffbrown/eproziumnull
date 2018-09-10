package eproziumnull

class BootStrap {

    def init = { servletContext ->
        new Widget(name: 'Widget With A Null Description').save()
        new Widget(name: 'Widget With A Description', description: 'This Is A Description').save()
    }
    def destroy = {
    }
}
