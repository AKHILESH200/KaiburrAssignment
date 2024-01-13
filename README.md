### Kaiburr-Assignment

## Files:
# Screenshot - It contains the Screenshot of the Tasks done.






# Spring Dependencies Used
   - SpringWeb
   - Lombok
   - MongoDb
   - DevTools


# Task-1:

# I have created the project using Spring Framework and for the backend mongoDB is used. The endpoints for the project are as follows:
   - tasks/CreateTask (Add task details to the database)
   - tasks/GetTaskById (Fetch all the tasks available in the database)
   - tasks/GetTaskById/Id (Fetches the tasks available based on Id from the database)
   - tasks/GetTaskByName (Fetches the tasks available based on name from the database)
   - tasks/GetTop10TasksByAsignee (Fetches the top 10 tasks sorted in ascending order by StartTime based on Assignee)
   - tasks/DeleteTaskById (Deletes the task from the database based on Id)

# The Restfull API's which are called when tested using postman. And these are:
  - tasks/CreateTask
  - tasks/GetTaskById
  - tasks/GetTaskById/Id
  - tasks/GetTaskByName
  - tasks/GetTop10TasksByAsignee
  - tasks/DeleteTaskById

# Steps To Run Task-1:
 - Install IDE of any choice (preferably STS(Spring Tool Suite) which runs on eclipse IDE or IDE of your choice with java installed in it)
 - Install MongoDb Compass locally or use online version your wish
 - Download postman application 
 - Download the project or clone it in your local directory
 - Open the IDE and import the project zip
 - open application.services and add the below lines:
    - spring.data.mongodb.host=localhost
    - spring.data.mongodb.port=27017
    - spring.data.mongodb.database=Task

- open MongoDb and create a Database with name as Task and collection as task


 - go to the main file and select run as SpringBoot to fire up the server
 - Open the postman and check the endpoints 

## ScreenShots--Task1:
- CreateTask**
- ![ScreenShots of task1](https://github.com/AKHILESH200/KaiburrAssignment/blob/main/Screenshots/Task1/CreateTask.PNG)

- CreateTaskProofMongo:
- ![ScreenShots of task1](https://github.com/AKHILESH200/KaiburrAssignment/blob/main/Screenshots/Task1/CreateTaskProofMongo.PNG)

- DeleteTaskById:
-![ScreenShots of task1](https://github.com/AKHILESH200/KaiburrAssignment/blob/main/Screenshots/Task1/DeleteTaskById.PNG)

- DeleteTaskByIdProof:
- ![ScreenShots of task1](https://github.com/AKHILESH200/KaiburrAssignment/blob/main/Screenshots/Task1/DeleteTaskByIdProofMongo.PNG)

-  GetTaskById:
-  ![ScreenShots of task1](https://github.com/AKHILESH200/KaiburrAssignment/blob/main/Screenshots/Task1/GetTaskById.PNG)

-  GetTaskById/Id:
-  ![ScreenShots of task1](https://github.com/AKHILESH200/KaiburrAssignment/blob/main/Screenshots/Task1/GetTaskByIdWithId.PNG)

-  GetTaskByName:
-  ![ScreenShots of task1](https://github.com/AKHILESH200/KaiburrAssignment/blob/main/Screenshots/Task1/GetTaskByName.PNG)

-  GetTop10TasksByAssignee:
-  ![ScreenShots of task1](https://github.com/AKHILESH200/KaiburrAssignment/blob/main/Screenshots/Task1/GetTop10TasksByAssignee.PNG)

-  GetTop10TasksByAssigneeProof:
-  ![ScreenShots of task1](https://github.com/AKHILESH200/KaiburrAssignment/blob/main/Screenshots/Task1/GetTop10TasksByAssigneeProof.PNG)




### FOR Task-5 The screenShots are big as it is a ipynb file we can directly open up in the editor to view***


 
	 
		
