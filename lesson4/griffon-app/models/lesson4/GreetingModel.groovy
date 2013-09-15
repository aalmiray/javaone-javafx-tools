package lesson4

import groovyx.javafx.beans.FXBindable
import griffon.plugins.dialogs.AbstractDialogModel

class GreetingModel extends AbstractDialogModel {
    protected String getDialogKey() { 'Greeting' }

    protected String getDialogTitle() { 'Greetings' }

    void mvcGroupInit(Map args) {
        super.mvcGroupInit(args)
        setWidth(400d)
        setHeight(200d)
    }

    @FXBindable String message
}