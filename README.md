
# Nirvana Hotel booking
Welcome to the Nirvana Hotel Booking and Management Platform project. 
This application aims to provide a comprehensive solution for hotel room booking and management using modern technologies. 
The project utilizes Spring Boot for the backend, React for the frontend, and MySQL for data storage.
Our goal is to create a user-friendly platform where customers can book rooms effortlessly and hotel administrators can manage room availability and bookings efficiently.


# Project Description
## Homepage: 
The main entry point of the application where users can search for available rooms, view room types, and navigate to other sections.

## Room Search and Filters: 
Users can filter rooms by type (e.g., Single, Studio, Host) and search for available rooms based on their desired dates and room type. Pagination is provided for easy navigation through room listings.

## Booking Management:
Room Details: Users can view details of each room, including pricing and availability.
Booking Process: After logging in, users can select check-in and check-out dates, specify the number of adults and children, and confirm their booking. Booking confirmation details, including a unique code, are provided.
Find My Booking: Users can retrieve their booking details using the provided confirmation code.
User Profile:

## Booking History: 
Users can view their past bookings.
Profile Management: Users can update or delete their profile information.
Admin Dashboard:

## Room Management: 
Admins can add, edit, or delete rooms. They can also filter and paginate through the list of rooms.
Booking Management: Admins can view and manage all bookings, including marking them as completed or canceled.
Login and Registration:

## User Login/Registration: 
Users can create accounts, log in, and manage their profiles.

## Admin Login:
Admins have separate login credentials to access the administrative functionalities.
## Availability Check: 
Users can check if a room is available for selected dates and view all bookings associated with that room.

## Error Handling: 
The system provides informative error messages for incorrect booking codes or unavailable rooms.

# Architectural Design Overview
## Entity Relationships:

## User:
Fields: ID, email, name, phone number, password, and a list of bookings.
Relationships: One-to-many with the Booking entity.

## Room:
Fields: ID, room type, room price, photo, room description, and a list of bookings.
Relationships: One-to-many with the Booking entity.

## Booking:
Fields: ID, user reference, room reference, booking details (dates, number of guests, etc.).
Relationships: Many-to-one with both the User and Room entities.

## System Architecture:

## Backend:

Implemented using Spring Boot to handle business logic, manage data access, and provide RESTful APIs.
MySQL is used for data storage, managing user, room, and booking information.

## Frontend:

Developed with React to create a dynamic and responsive user interface.
Integrates with the backend through RESTful APIs to fetch and display data.





# ScreenShots

### Register Page
<img width="960" alt="Screenshot 2024-08-25 185407" src="https://github.com/user-attachments/assets/57bdb129-548c-4a10-ab0a-5f0b7e6ee1cc">

### Login Page
<img width="960" alt="loginpage" src="https://github.com/user-attachments/assets/d0dba7cb-b3d0-43aa-9383-817e3b6efcfd">

### Home Page
![Home](https://github.com/user-attachments/assets/7c20dec4-3ae1-4fbf-803c-0b48f8c87aa0)

### Manage Room
![manageRoom](https://github.com/user-attachments/assets/882b457a-e070-476d-a312-72bfcdcc93a2)

### Add Room
![Add room](https://github.com/user-attachments/assets/e035eac2-d87d-46db-91bd-5f54a95dc66e)

### All Rooms
![AllRooms](https://github.com/user-attachments/assets/89fa382c-d8f4-4321-9dff-0f9881be007d)


### User Profile
![UserProfile2](https://github.com/user-attachments/assets/a0802f59-560e-4b62-a339-8178fc05c843)

### Edit Profile
![EditProfile](https://github.com/user-attachments/assets/ec41299a-e742-4550-8901-5741565a08ce)

### Find Booking
![Findbooking](https://github.com/user-attachments/assets/1882d45f-1f75-479f-b4d4-71d2c5644cef)


### Booking details at admin side
![booking detail at admin](https://github.com/user-attachments/assets/222a10c7-9755-441f-9659-199b0f73b445)
