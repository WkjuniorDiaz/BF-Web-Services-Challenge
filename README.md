# BF-Web-Services-Challenge
 
## Installation 
* Download [IntelliJ IDEA](https://www.jetbrains.com/idea/) 
* Download [Github Desktop](https://desktop.github.com/)

## How to clone the project
* Open Github desktop.
* Select **Add-Clone Repository** from Left Menu.
* Enter the repository URL (SSH)
* Select the **Clone** button.
* Select **Open in Intellij**, in case Intellij is not by default: Select "Options on the section Open the repository in your external editor".
* Wait for the dependencies to finish downloading.

## IntelliJ Project Setup
* Select "File" from top menu bar
* Select "Settings" option
* Select "Plugins" option from Settings modal
* Search for “Gherkin” plugin and install
* Search for “Cucumber for Java” plugin and install

## Running the project: 
To run the project we need to use the following steps:
1. Open the pom.xml
2. On the left side of the IDEA you will find a section "Maven", click on "Maven"
3. Click on the download icon and select "Download Sources" and wait for the dependencies to download
4. On the right side of the IDEA, under Project tree search for the class **TestRunner** on the package of **runner**.
5. Right click on the class "TestRunner" and select "Run TestRunner"

## Report
To visualize the report after the execution of the TestRunner we need to use the following steps:
1. Under the project tree, on the package "test-output", search for the cucumberReports directory.
2. Right click on the file WebServicesReport.html
3. Select "Open in" 
4. Select "Browser" choose the browser you prefer.

## Re run the project: 
In case you need to re run the project, please follow this steps:
1. Under features package, select the "postPet.feature"
2. Under the petId data example, increment by one the petId 
