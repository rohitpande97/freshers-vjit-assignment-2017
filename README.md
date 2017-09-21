# Assignment - Restaurant Management System
## Objective
- To assess how you approach problem solving
- To assess your practical understanding of object-oriented concepts
- To assess your originality

You have to design and implement a simple restaurant management system which depicts the typical actors and systems involved in the operation of a restaurant.

Note that though you obviously can take the easy route and search online for a solution, this assignment is really about displaying your own analytical and technical skills, so the more individuality you show, the better shall be your prospects.

Also we not only assess the work but also how much diligence and commitment is being shown towards this, hence make sure you commit code regularly as we would be closely monitoring the progress on a daily basis.

Use this opportunity to show us what you have got and that you have what it takes to join us in our wonderful journey in the era of modern software develpoment.

# Functional Requirements
Below are listed the functional requirements that the solution should support. Wherever in doubt, make reasonable assumptions and move forward but please do document those assumptions as well so that we know why you made them.

Let us imagine we are talking about a popular restaurant such as Paradise with its own restaurant management system. If we expand the various actors and sub systems involved, we could break it down as below
- A food menu which lists various sections (starters / main course / desserts) having items inside each.
- A price chart associated with every item on the menu.
- The customers who visit the restaurant.
- Hosts and hostesses who allot customers tables or queue them up if all tables are in use.
- Bus boys who serve water, clean tables, lay out fresh cloth, etc. 
- Managers who take initial orders, receive complaints, prepare and hand out the bills, etc.
- Servers who serve the food on the table.
- Executive chef who receives orders and expedites food preparation
- Line cooks who prepare the food.
- Order register where the customer orders are stored
- Cash register where bills are generated and payments are stored
- Feedback system where customer complaints and feedback comments are stored
- The general restaurant facilities such as tables, chairs, utensils, so on so forth.

The solution needs to model all the actors and sub systems in an object-oriented manner and define attributes and methods that these various entities would contain / perform.

The solution also needs to define meaningful interactions between the various actors and sub systems so that when looked at a whole, one can indentify how the entire system works on a daily basis.

The solution finally needs to provide an entry point (public static void main) which when executed will showcase how the entire restaurant system works. e.g. 
- Customer walks in
- Host allots a table for him / her
- Bus boy serves water
- Manager shows the menu to the customer
- Customer orders food
- Manager places order
- Executive chef gets order and instructs other line cooks
- Once food is prepared, the server serves food
- On completion, customer requests a bill from the manager
- Customer gives feedback, pays bill and leaves
- Payment is registered in the cash registered
- Bus boy cleans up table

# Thinking beyond
You have full freedom to think beyond the basic outline above. For example, we never talked about food takeways, valet parking, etc. but nothing stops you from designing these too. Let your imagination and creativity run loose here.

# Technical requirements
- Java is the programming language to be used to develop the solution
- Maven should be used as the build system for compiling and producing the final binary
- The solution should produce a JAR file which we can run from the command line by passing necessary arguments
- Classpath dependencies that we would need to meet in order to be able to run the solution
- Wherever possible, decouple data from the system. e.g. the menu items could be read from a file rather than hard coding within the solution
 
# How to submit the assignment
## Step 1
Fork this repository, and create a subdirectory titled with your name and any other optional text describing your solution
## Step 2
Complete coding for your solution
## Step 3
Submit a pull request to this repository before the stipulated due date for the assignment. Everything related to your solution should be within the subdirectory you created above
## Step 4
Include at a minimum one README file describing your solution along with detailed instructions on how to run it. You can have as many documentation files as you want. Use Markdown for the documentation

# Important
You would need to mandatorily submit a pull request, without which we cannot consider your assignment for evaluation. Also ensure that you submit only one pull request and that too only after you are fully ready to share your assignment with us.

We really look forward to getting some bright minds who can show us all their creativity and aptitude through this assignment.

# Reference Material
Given below are links to some reference material which you may find useful while doing the assignment.

1. Github - Forking and submitting pull requests
 - https://gun.io/blog/how-to-github-fork-branch-and-pull-request/

2. Using Tortoise GIT
 - https://tortoisegit.org/docs/tortoisegit/

3. GIT basics
 - https://www.atlassian.com/git/tutorials

4. Maven tutorial and how to use with Eclipse
 - https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
 - http://www.mkyong.com/maven/how-to-create-a-java-project-with-maven/

## All the best and happy coding :-)
