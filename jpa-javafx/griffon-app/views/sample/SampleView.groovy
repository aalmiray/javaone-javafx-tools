package sample

stage(title: 'Griffon + JavaFX + JPA', visible: true, centerOnScreen: true) {
    scene(fill: WHITE, width: 352, height: 300) {
        borderPane {
            top {
                toolBar {
                    button(loadAction)
                    button(clearAction)
                }
            }
            tv = tableView(selectionMode: 'single', cellSelectionEnabled: true) {
                tableColumn(property: 'id', text: 'Id', prefWidth: 50)
                tableColumn(property: 'name', text: 'Name', prefWidth: 150)
                tableColumn(property: 'lastname', text: 'Lastname', prefWidth: 150)
            }
        }
        // workaround GFX-36
        tv.items = model.people
    }
}