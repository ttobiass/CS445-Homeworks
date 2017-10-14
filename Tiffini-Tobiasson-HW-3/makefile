JC = javac
JVM = java
CP = .:/usr/share/java/junit4-4.12.jar
RN = org.junit.runner.JUnitCore
.SUFFIXES: .java .class
.java.class:
	$(JC) -cp $(CP) $(TESTS)
	$(JC) $(CLASSES)


TESTS = \
	tests/buttontest.java\
	tests/lightbulbtest.java\
	tests/tablelamptest.java\
	tests/alltests.java

CLASSES = \
        Lightbulb/Lightbulb.java\
	Button/button.java\
	Button/PushdownButton.java\
	TableLamp/TableLamp.java\
	MainClass.java


default: classes
default: tests

classes: $(CLASSES:.java=.class)
tests: $(TESTS:.java=.class)

clean: 
	$(RM) *.class
	$(RM) Button/*.class
	$(RM) Lightbulb/*.class
	$(RM) TableLamp/*.class
	$(RM) tests/*.class

run: classes
	$(JVM) MainClass

unittest: tests
	$(JVM) -cp $(CP) $(RN) tests.alltests
