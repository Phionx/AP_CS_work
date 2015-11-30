Shantanu Jha 2015

#Enter the location of your own personal directory in hw ... make sure there are no spaces next to the equal sign
#For example 'blah=blah' will work but 'blah =blah' or 'blah= blah' or 'blah = blah' will not work
alias hw='cd /Users/Phionx/Github/AP_CS_work/HW'

alias euler='cd /Users/Phionx/Github/ProjectEuler'

#Aliases for the functions defined below
alias update=foo
alias fill=deez

#Commit and push to github
foo() {
        git add .
        git commit -m $1
        git push
}

#the command 'fill test 40 lol' will create a directory 40 and cd into it
#then it will create a file named test.java
#then it will enter the heading
#/*
#Shantanu Jha
#APCS1 pd5
#HW41--lol
$Current Date
#*/≈
deez(){

        local file="$1"
        local number="$2"
        local name="$3"
        local now="$(date +'%Y-%m-%d')"
        #make and cd into the hw directory
        mkdir "$number"
        cd "$number"

        #Edit this accordingly
        echo "/*" >> "$file".java
        echo "Shantanu Jha" >> "$file".java
        echo "APCS1 pd5" >> "$file".java
        echo "HW$number--$name" >> "$file".java
        echo "$now" >> "$file".java
        echo "*/" >> "$file".java

        echo "" >> "$file".java
        echo "public class $file {" >> "$file".java
        echo "" >> "$file".java
        echo "}" >> "$file".java

}
