JC = javac
JVM = java
CP = .:/usr/share/java/junit4-4.12.jar
RN = org.junit.runner.JUnitCore
.SUFFIXES: .java .class
.java.class:
	$(JC) -cp $(CP) $(TESTS)
	$(JC) $(CLASSES)



TESTS = \
	AntTest.java\
	BatTest.java\
	CreatureTest.java\
	FlyTest.java\
	ThingTest.java\
	TigerTest.java\
	AllTests.java

CLASSES = \
        Thing.java\
	Creature.java\
	Tiger.java\
	Ant.java\
	Fly.java\
	Flyer.java\
	Bat.java\
	TestCreature.java


default: classes
default: tests

classes: $(CLASSES:.java=.class)
tests: $(TESTS:.java=.class)

clean: 
	$(RM) *.class

run: classes
	$(JVM) TestCreature

unittest: tests
	$(JVM) -cp $(CP) $(RN) AllTests
