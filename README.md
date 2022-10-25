# Oblig3_softwareEngineering

How to set up Github Actions on a git repository: 
1. Create a github repo where you can push your codes from intelij idea or any other Integrated Development Environtment of your choice. Alternatively, You can also push your codes using Ide and connect it to you github account to push and commit the codes from there. 
2. After commiting and pushing your codes click the Action Tab in your git repo and choose the Continous integration. In my case I used Java with Maven as builing tool
![image](https://user-images.githubusercontent.com/86023396/196386720-e934caad-3420-4707-bda0-30dc685d7370.png)

After clicking Java with Maven, it will create a .yml file that runs the test everytime you commit and push codes to your git repo

![image](https://user-images.githubusercontent.com/86023396/196388541-9f25c76a-1588-4a9a-b209-350ad609b3a9.png)

Everytime you have changes in your code and commit and push this changes it creates a log in Actions where it will check if the code that you push are correct and runnning properly. 
![image](https://user-images.githubusercontent.com/86023396/196390962-348d82f5-f055-42de-a161-3f4e506de516.png)

In the beginning I am having error creating the maven.yml file. It says that I am having problem with Build with Maven. 
![image](https://user-images.githubusercontent.com/86023396/196391661-46bc3dab-ae75-473d-9b86-0c004018832b.png)
![image](https://user-images.githubusercontent.com/86023396/196391857-9e70c462-d90a-4cf1-8058-bde9d821d7be.png)

 But then the problem was actually in my git repo (Oblig2_RachelMedinaHusanovic) I needed to add build plugins in my pom.xml 
<img width="374" alt="image" src="https://user-images.githubusercontent.com/86023396/197714699-00978416-5aa1-428e-add1-724874847722.png">

After adding this build plugin, all the actions im comminting in my git repo passes the workflow. 
<img width="947" alt="image" src="https://user-images.githubusercontent.com/86023396/197715045-45ff4ec9-da73-44a2-86df-b230bc6023ac.png">

And the test are all running by updating my maven.yml file. 


<img width="455" alt="image" src="https://user-images.githubusercontent.com/86023396/197715305-ae794b33-0548-4042-9a3b-adca39840026.png">



