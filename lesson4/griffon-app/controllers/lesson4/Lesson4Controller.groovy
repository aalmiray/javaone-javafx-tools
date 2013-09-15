package lesson4

class Lesson4Controller {
    Lesson4Model model
    Lesson4Service lesson4Service

    def sayHelloAction = {
        String message = lesson4Service.sayHello(model.name)
        withMVCGroup('greeting') { m, v, c ->
            m.message = message
            c.show()
        }
    }
}