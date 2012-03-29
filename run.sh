pushd $1 1>/dev/null
javac -d target $(find src -iname *.java) && java -Djava.security.manager -cp target/ Solution
popd 1>/dev/null
