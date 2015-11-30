#Shantanu Jha 2015

#Enter the location of your own personal directory in hw ... make sure there are no spaces next to the equal sign
#For example 'blah=blah' will work but 'blah =blah' or 'blah= blah' or 'blah = blah' will not work
alias hw='cd /Users/Phionx/Github/AP_CS_work/HW'
alias euler='cd /Users/Phionx/Github/ProjectEuler' #personal cd alias

#Aliases for the functions defined below
alias update=foo
alias fill=deez

#Commit and push to github
#To run this command you would type in: 'update <commit-message>' into your terminal
#this will commit and push the repo you are currently in to github
foo() {
        git add .
        git commit -m $1
        git push
}


#To use this command you first have to cd into your HW folder (You can do this by using the alias command: 'hw')
#After you are in your hw directory you can run: 'fill <Java-file-name> <hw-number> <hw-title>'
#For today that would be: 'fill GuessNumber 38 Keep\ Guessing'
#A directory named '38' will be created in your hw folder
#in '38' you will find a java file with the appropriate heading and more

deez(){

        local file="$1"
        local number="$2"
        local name="$3"
        local now="$(date +'%Y-%m-%d')"
        #make and cd into the hw directory
        mkdir "$number"
        cd "$number"


        #Heading - Edit this accordingly
        echo "/*" >> "$file".java
        echo "Shantanu Jha" >> "$file".java #Change this to your own name
        echo "APCS1 pd5" >> "$file".java #Change this to your own period
        echo "HW$number--$name" >> "$file".java
        echo "$now" >> "$file".java
        echo "*/" >> "$file".java

        #Java stuff
        echo "" >> "$file".java
        echo "public class $file {" >> "$file".java
        echo "" >> "$file".java
        echo "public static void main(String [] args){" >> "$file".java
        echo "" >> "$file".java
        echo "}" >> "$file".java
        echo "}" >> "$file".java

}
