# LibraryServiceTrackerRIT
This application demonstrates the usage of the Visitor pattern to model various library services offered at the Rochester Institute of Technology (RIT). It allows users to interact with different library services and displays relevant information about each service.

## Purpose

The purpose of this project is to showcase the implementation of the Visitor design pattern in the context of RIT's library services. By using the Visitor pattern, we can separate the algorithms for different library service actions from the objects on which they operate, making it easy to add new services or modify existing ones without changing the code of the services themselves.

## Features

- Demonstrates the Visitor pattern implementation.
- Models various library services offered at RIT.
- Provides detailed information about each library service.
- Easy to extend with new library services.

## How to Run

To run the RIT Library Services App, follow these steps:

1. Clone the repository to your local machine.
2. Compile the Java files using a Java compiler.
3. Run the `LibraryApp` class, which contains the main method.

## Usage

Upon running the application, you will see the information about different library services displayed in the console. Each service will be visited by the `LibraryServiceDisplayVisitor`, which will print relevant details about the service.

![Output](images/output.png)

## Library Service Visitors

### LibraryServiceVisitor
This interface defines a visitor for various library services. It contains methods for visiting each type of library service.

### LibraryServiceDisplayVisitor
This concrete visitor implements the LibraryServiceVisitor interface. It is responsible for displaying information about various library services.

## Library Services

### BookPickupService
Represents a service where RIT community members can submit an online request for physical materials in the library's collection, and they will be contacted when their items are ready for pickup. This service is free and available to all current students, faculty, and staff with an active RIT account.

### BorrowAndRenewService
Represents a service where RIT students, faculty, staff, and alumni may borrow library materials by presenting a current RIT ID at the Library Services Desk. Fines for hourly loan items are assessed after a brief grace period, then continue to accumulate at the rates above. If you have a fines balance of $5 or more, your borrowing privileges are suspended until the fines are paid.

### BorrowFromOtherLocationsService
Represents a service where if your item is not immediately available from our library, there are several ways to get what you need.

### CourseReservesService
Represents a service where the RIT Libraries Reserves collection allows instructors to identify materials to which the Library should provide controlled access during the semester. Placing items on reserve removes them from the circulating collection and assigns shorter loan periods (e.g. 2 hours) to ensure availability of high-demand items to the maximum number of borrowers. These materials are kept at the Library Service Desk at Wallace.

### FacultyStaffDeliveryService
Represents a service where RIT Libraries may ship items to faculty and staff who are fully remote workers. If this applies, faculty or staff members are required to provide their current mailing address.

### DOIService
Represents a service where RIT Libraries is able to assign DOIs for the RIT community through a partnership with the Research & Computing Office and membership with DataCite, a DOI registration agency. This service allows for better citation tracking and access to research, particularly for products of non-traditional publishing.
