# ratpack-server

# How to build
You need to install:
- JDK (try JDK 11. If it doesn't work try JDK 8 and let me know)
- Groovy (Try latest Groovy. If it doens't work try 2.5.15 and let me know)

This project should in theory work with wide ranges of JDK and Groovy versions but I had bad experience so far.

To build and run use `groovy ratpack.groovy`

# How to use
- HTTP GET to `http://localhost:5050` should render "hello world"
- HTTP GET to `http://localhost:5050/some.json` should render content of the `some.json` file
