eRegister
=========

An electronic attendance register

HOW TO CLONE?
    git clone git@github.com:b1004614/eRegister.git
    This is the command line used to clone the project so that other people can view and use the application.

HOW TO BUILD?  

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
    Type "git commit -a -m "and what ever you have done today", as it is your first commit you will be asked to change a few details. Highlight both "git config" and fill out the section where it asks about username and email. Then press enter.
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
    
    Now its time to set up the database for all the details for classes and students etc. Firstly type in the terminal window mysql -uroot -ppassword and then enter. This will log you on to mysql.
    Then type "Create database eRegister default chase utf8 default collate uft8_bin" you should get a response saying query okay.
    Now type in "grant all on eRegister.* to 'webarc'@'localhost' identify by'webarch';
    Then back in another terminal window you want to copy and paste from the sql powerpoint the details that are needed to be put in. This information goes in grails-app,conf,spring,datasource.groovy. You need to type in gedit firstly.
    
    Now we need to create the domain classes, to do this go into the terminal window and type "grails create-domain-class uk.shu.ac.webarch.eRegister.student which is where the student class will be saved in. You then need to create a domain class for each of the other classes on the business model.
    Now do a git status to see what has been updated, then type git add grails-app/domain/test/ then a git commit and push.
    If you type into my sql now, "show tables;" no results will show which is a good thing.
    For each of the domain classes, go onto gedit, and then for each class type in the suitable names for each table name and use the many to many and one to many to link each together.
    This will be a good commit point to say how you have created new domain classes and linked them with one another.
    Then git push.
    
    After you have created the domain classes and linked them, we then need to create controllers then scaffolds for these.
    Firstly type "grails create-controller [package] controller" This creates the new controller
     for example you could use "grails create-controller student". This needs to be done for each domain class.
    You can then git commit and push as you can say that you have created controllers for each class.
    
    Now to create the scaffolds which is pretty simple, all you need to do is say "grails generate-all ,,domain-classs-name>> this will create the scaffold for this class. Now complete this for the other classes.
    Git commit and git push here also.
    
    Now to create the bootstrap. Firstly you have to go into gedit on the terminal, and go into conf then into bootstrap.groovy.
    From hereyou insert the data in the correct way, making sure that what every values you are entering are the correct titles as the table you are creating them for. For example if you are creating a new student, make sure you only enter the student name and id, as that is all that needs to be inserted in that class domain.
    Then type println
    Now grails run-app and let it load, if the bootstrap is successful it will show on your termianl window saying bootstrap complete.
    When you go onto your application, click on student, and then your test data should be showing up, this will also show on there at the startup everytime you run grails.
    You can now do test data for each of the domain classes.
    
    Now once you have created this, you should be able to make data for each class. I managed to get the timestamp to work, but unfortunately this is as far as i could get with the assignment.
    
    
    
HOW TO RUN?
    I will now talk about how to run my programme under certain sub headings to make it easier.

    TALK ABOUT HOW TO OPEN 
        This is the first heading. Once i had completed a certain section of the assignment, i would git commit and git push, to update the network map on github.
        I would then go onto the terminal window, and type in grails run-app. This would then take me to my applcation, where you can view each page (which will be discussed later).
        
    TALK ABOUT USER INTERFACE AND THE DIFFERENT PAGES
        The main page is the homepage, and shows the links to each of the sheets that i have created. These sheets include:
            Students - when you click on here you can view students who have already attended which class, you can also add new students.
            Reg Class - This page will show you which instructor is teaching which class, and for which class group.
            Reg Entry - Will show which student is registered and at what time and dae the signed in.
            Instructor - Will show the name of the instructor.
            Enrollment - Will show the enrolled student name and which class they are enrolled on.
            Course - Will show which courses are being taken and by who.
            RegSheet - Will show the instructors name and which class they are teaching.
            
    SHOW HOW TO CREATE IN DIFFERENT PAGES.
        I will now talk about how to create different things in each of the sheets, so it is easier to use and understand how they all link with each other.
            Students - when you click on here you can view students who have already attended which class, you can also add new students.
            Reg Class - When you select the reg class page, you will be shown which class instructor is teaching which class. To create this you click on create new reg class, and select the instructor, select which class, then the name of that class is enetered.
            Reg Entry - To create an entry ont his sheet you click on create new reg entry and you choose which student is being signed in and then click create, as the timestamp is automatically set to the correct time and date.
            Instructor - Click on new instructor. On here you can add a registration class which the instructor teachers, you can also select the instructor to teach that class.
            Enrollment - You select which student is enrolled on the system, and then select which class they will be in/attending.
            Course - On the course sheet, you select "new course" then add the course code, description and name, you can even add a registration class to this course.
            RegSheet - YOu select new reg sheet, then insert the correct data.
            
    TALK ABOUT THE BOOTSTRAP NAMES THAT HAVE BEEN USED.
        Bootstrap data has been included in this, just to give the programme some test data, so that it can be used from scratch wihtout creating any new data. 
        So if you go onto a sheet you can select a student name, course name, instructor, and use this to create registration sheets and test data.
