eRegister
=========

An electronic attendance register

Your project README in githubshould have sufficient information to allow the assessor (And anyone else interested) to clone, build and run your project on a standard debian system similar to the class instance.
You may wish to offer additional information in your readme (Screenshots of features etc). Use it as a portfolio piece and show off/highlight anything you're proud of and want to be sure it's seen.


How to clone?
    Research on google

How to build?  

    Building an attendance system through github and grails can be quite tricky, but if you follow these steps, then i'm that you will be able to complete this.
    First of all you need to make sure that you have an empty vmware workstation,  you need to install grails onto the workstation "Grails version 2.2.2" then you need to create a new directory called eRegister.
    You then need to head to github.com, and create a new account if you havent already.
    Once on the homepage, click on "new repository". Enter the details on the next page, clicking on public and initialize
    You will now be presented with the repository where you will be able to view the network map, and everything that is involved in your application.
    
    Now go back to the terminal window and type "ssh-keygen", then highlight the "/home/aces.../ssh/" and cd into that directory.
    Then type "cat id_rsa.pub" and copy the long code given in response.
    Go to your github account, account settings, ssh key and paste in the key that you have just copied on the terminal window,a dn click add key. This has now cloned your vmware workstation with github.
    A new directory called eRegister will now have been created.
    Type cd eRegister, and you will ow be in that directory. If you "ls" you can see all the files that are in that directory currently.
    Back on the github homepage if you click on the network map a branch will show up, as this is what you have just created.
    Back on the terminal page type "git branch develop" this creates a develop branch on the local server so now type "git push origin develop" which pushes it to github.
    Enter your username and password when prompted.
    Refresh your network map, and the new branch will show up.
    Do the same to create a release branch.
    Once you have created the release branch type "git checkout develop" which changes you back onto the develop branch.
    Now type "git status", which shows what you have done to your project so far.
    Type "git commit -a 0m "and what ever you have done today", as it is your first commit you will be asked to change a few details. Highlight both "git config" and fill out the section where it asks about username and email. Then press enter.
    Now "git push" type in your username and password, this will then push all your work upto github.
    Run "git branch" this will show what branches you have created so far.
    Then type "git merge develop" this will merge the release branch into the develop branch.
    Git commit this and then git push, entering your username and password. The release tag will now be in line with the release branch.
    
    We will now create a lecture branch. "git branch develop" will do this then type "git push lectures" which pushes it to github server.
    Type "grails create app eRegister" this will now create a new app for you, and if you "ls" this you can see what files are inside at the moment.
    Now type "git checkout develop" and then type "git add *" now everything will be added to this branch.
    Then git commit and git push all this.
    Now type "grails run-app" and click "n" You will now be able to view the grails homepage for your application.
    Back in your terminal type cd /grails pp/view index.gsp and get rid of everything in there, then git commit and push this.
    
    
    
    
    
    Create new grails application on vmware
    Create new github account if needed, if not create new repository
    Create new domain classes using code .......
    Edit relationships
    Create scafolding
    Create bootstrap
    
    git commit, git push, git status (talk about) used for each task to update github account.
    developing branches (talk about) every week branches have been developed to show what has beenc reated/updated.
    
How to run?
    Talk about how to open (grails run-app)
    Talk about user interface (different pages)
    Show how to create in different pages.
    Talk about the bootstrap names that have been used.
