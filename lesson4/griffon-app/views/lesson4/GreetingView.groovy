package lesson4

content = scene(id: 'content', fill: WHITE) {
    hbox(padding: 80) {
        label(text: bind(model.messageProperty()))
    }
}