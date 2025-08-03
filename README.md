🚚 Workforce Management API — Backend Challenge Solution
This project is a Spring Boot backend implementation for a Workforce Management module in a logistics super-app, built as part of the Railse backend assignment.

Overview
This API enables logistics managers to:

Create, assign, and smartly track tasks for field and operations staff

Reassign work by reference (e.g., a particular customer or order), with correct task lifecycle (no duplicates)

Filter workloads by date, assignee, or priority

Set and change priorities for tasks

Comment on tasks and view their activity timeline (audit/history)

🧑💻 Assignment Features Implemented
 Starter project modularized using Spring Boot, Gradle, Lombok, and MapStruct

 Bug 1 fix: Task reassignment cancels prior active tasks (no duplicates)

 Bug 2 fix: Cancelled tasks do not clutter views — hidden from fetch APIs

 Smart "daily work" fetch: Returns all relevant open tasks (including prior still-active ones)

 Task priority: Each task is HIGH/MEDIUM/LOW. Priority can be changed and tasks filtered by priority.

 Task comments & activity log: Team can leave comments; all significant activity is recorded and viewable per task.

 In-memory repository seed data for demo/testing — try all APIs right away with provided IDs.

🚀 Getting Started
Java 17+ and Gradle required.



text
git clone https://github.com/your-name/railse-backend-assignment.git
cd railse-backend-assignment
Run the application:

text
./gradlew bootRun
The API is now running at http://localhost:8080/.

🛠️ Example API Calls
You can use Postman or curl to try all endpoints. Some working examples with valid data:

📋 Get single task by ID
text
GET http://localhost:8080/task-mgmt/1
🔍 Smart fetch tasks by date (all active/relevant)
text
POST http://localhost:8080/task-mgmt/fetch-by-date/v2
Content-Type: application/json

{
  "start_date": 1700000000000,
  "end_date": 1900000000000,
  "assignee_ids": [1, 2, 3]
}
🌟 Fetch all HIGH priority tasks
text
GET http://localhost:8080/task-mgmt/priority/HIGH
✏️ Change priority of a task
text
PATCH http://localhost:8080/task-mgmt/1/priority
Content-Type: application/json

{
  "priority": "MEDIUM"
}
💬 Add comment to a task
text
POST http://localhost:8080/task-mgmt/1/comments
Content-Type: application/json

{
  "commentText": "Please follow up once done."
}
🔁 Assign by reference (bugfix demo)
text
POST http://localhost:8080/task-mgmt/assign-by-ref
Content-Type: application/json

{
  "reference_id": 201,
  "reference_type": "ENTITY",
  "assignee_id": 5
}
API Endp
