application {
    title = 'Lesson4'
    startupGroups = ['lesson4']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "greeting"
    'greeting' {
        model      = 'lesson4.GreetingModel'
        view       = 'lesson4.GreetingView'
        controller = 'lesson4.GreetingController'
    }

    // MVC Group for "lesson4"
    'lesson4' {
        model      = 'lesson4.Lesson4Model'
        view       = 'lesson4.Lesson4View'
        controller = 'lesson4.Lesson4Controller'
    }
}
