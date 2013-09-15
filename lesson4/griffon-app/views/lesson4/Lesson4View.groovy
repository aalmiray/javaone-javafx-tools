package lesson4

application(title: 'Lesson4', sizeToScene: true, centerOnScreen: true) {
    scene(fill: WHITE, width: 400, height: 200) {
        anchorPane {
            label('Please enter your name:', leftAnchor: 14, topAnchor: 14)
            textField(leftAnchor: 172, topAnchor: 11, text: bind(model.nameProperty()))
            button(sayHelloAction, leftAnchor: 172, topAnchor: 45)
        }
    }
}
