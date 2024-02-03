# Hibernate Project with Many-to-Many Mapping

This Hibernate project implements a many-to-many mapping between the `Course` and `Student` entities using a join table. In this mapping, a course can have multiple students enrolled, and a student can be enrolled in multiple courses. The join table holds foreign keys from both tables to establish the relationship. No cascading delete operations are applied, ensuring that deleting a course does not delete its associated students, and deleting a student does not delete their enrolled courses. Lazy loading is utilized to load data only when requested, optimizing performance.

## Features

- **Many-to-Many Mapping**: Implements a many-to-many mapping between `Course` and `Student` entities, allowing courses to have multiple students and students to be enrolled in multiple courses.
- **Join Table**: Utilizes a join table to establish the relationship between courses and students, holding foreign keys from both tables.
- **Lazy Loading**: Implements lazy loading to load data only when requested, optimizing performance by reducing unnecessary data retrieval.
- **Efficient Data Management**: Enables efficient management of course enrollment and student registration without cascading delete operations.

## Project Structure

The project structure includes the following components:

- `Course` entity: Represents a course with details such as title, description, and enrolled students.
- `Student` entity: Represents a student with details such as name, email, and enrolled courses.
- Join table: Stores the relationship between courses and students by holding foreign keys from both tables.
- `Main` class: Contains the main method to demonstrate CRUD operations and many-to-many mappings.

## Usage

To run the Hibernate project with many-to-many mappings locally, follow these steps:

1. Clone this repository.
2. Open the project in your preferred IDE.
3. Update the Hibernate configuration file (`hibernate.cfg.xml`) with your database connection details.
4. Run the `Main` class to execute the CRUD operations and observe the behavior of many-to-many mappings with lazy loading.

## Contributing

Contributions are welcome! If you have any suggestions, bug fixes, or feature implementations, please open an issue or submit a pull request.
