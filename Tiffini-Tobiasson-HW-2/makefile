JC = javac
JVM = java
CP = .:/usr/share/java/junit4-4.12.jar
RN = org.junit.runner.JUnitCore
.SUFFIXES: .java .class
.java.class:
	$(JC) -cp $(CP) $(TESTS)
	$(JC) $(CLASSES)



TESTS = \
	ImprovedStringTokenizerTest.java

CLASSES = \
        ImprovedRandom.java\
	ImprovedStringTokenizer.java\
	tests.java


default: classes
default: tests

classes: $(CLASSES:.java=.class)
tests: $(TESTS:.java=.class)

clean: 
	$(RM) *.class

run: classes
	$(JVM) tests

unittest: tests
	$(JVM) -cp $(CP) $(RN) ImprovedStringTokenizerTest
