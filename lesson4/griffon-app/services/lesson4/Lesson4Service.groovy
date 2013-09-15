package lesson4

class Lesson4Service {
    String sayHello(String name) {
        name ? "Hello $name" : 'Howdy stranger!'
    }
}