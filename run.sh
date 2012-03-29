javac -d $1/target $(find $1/src -iname *.java) && java -Djava.security.manager -cp $1/target/ Solution
