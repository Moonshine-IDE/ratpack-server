@Grapes([
  @Grab(group='io.ratpack', module='ratpack-groovy', version='1.7.2',  transitive=false),
  @Grab(group='io.ratpack', module='ratpack-core',   version='1.7.2'),
  @Grab(group='io.ratpack', module='ratpack-guice',  version='1.7.2'),
  @Grab(group='org.slf4j',  module='slf4j-simple',   version='1.7.26')
])

import static ratpack.groovy.Groovy.ratpack

String readFileString(String filePath) {
    def file = new File(filePath)
    return file.text
}

ratpack {
    handlers {
        get {
            render "Hello World!"
        }
        get(":filename") {
            def content = readFileString "$pathTokens.filename"
            render content 
        }
    }
}