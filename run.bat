SET CLASSPATH=.;C:\Users\$USER\CAMINHO\antlr-4.9.2-complete.jar;'%CLASSPATH%
java org.antlr.v4.Tool Gramatica.g4
javac *.java
java org.antlr.v4.gui.TestRig Gramatica init -gui < input.txt
@REM java Main < input.txt > Input.java
