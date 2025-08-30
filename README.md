# AI-BASED-RECOMMENDATION-SYSTEM

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: PRABHU DEVRAJ BANGARI

*INTERN ID*: CTO4DY391

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

AI BASED RECOMMMENDATION SYSTEM DETAILED DESCRIPTION:-

In this project, I have developed a basic AI Recommendation System using the Java programming language as the core technology. The project was implemented in Apache NetBeans IDE, which provided me with a structured environment to write, compile, and execute the program seamlessly. The recommendation system follows a simple yet effective collaborative filtering technique, where user preferences are stored in a dataset and analyzed to suggest products that may be of interest to a particular user.

Tools and Technologies Used

Java Programming Language
The main coding of this project is done in Java, one of the most popular and widely used programming languages in the world. Java was chosen because of its object-oriented structure, strong libraries, platform independence, and the fact that it integrates well with IDEs like NetBeans. Java also makes it easy to handle data structures like HashMaps, which are crucial in storing user-product ratings in this project.

Apache NetBeans IDE
Apache NetBeans is the development environment I used to build this project. It is a free and open-source IDE that supports Java and many other languages. NetBeans provides features like:

Code auto-completion and syntax highlighting

Project structure management (src, resources, etc.)

Integrated build tools (Clean and Build options)

Debugging support to find and fix errors easily
Using NetBeans made the development process efficient and more organized, especially while managing multiple classes and packages.

CSV File (Dataset)
The project uses a CSV file (Comma Separated Values file) as the dataset. The CSV file contains three columns: User ID, Product ID, and Rating. This file was placed in the resources folder of the project so it could be accessed by the program. The file simulates user feedback or ratings for different products.

Java Collections Framework (HashMap and List)
A nested HashMap structure (Map<Integer, Map<Integer, Integer>>) was used to store ratings where the outer map represents users and the inner map represents products with their ratings. ArrayLists and Sets were also used to store and display recommendations. These data structures allowed efficient searching and storing of relationships between users and items.

How the System Works

The system reads the CSV dataset at runtime.

It loads all the user ratings into a nested HashMap.

For a chosen user (in this case, User 1), the system checks what products other users have rated highly (rating ≥ 4).

If the target user has not already rated those products, they are recommended to them.

Finally, the system prints the dataset as well as the personalized recommendations.

For example, if User 2 rated a product highly and User 1 has not rated it, that product is suggested to User 1. This is a simple but practical demonstration of collaborative filtering.

Future Uses of AI Recommendation Systems

Recommendation systems have a massive role in today’s world of technology and data science. While my project demonstrates a basic version, in real life, AI-based recommendation systems power some of the world’s largest companies:

E-Commerce (Amazon, Flipkart, eBay)
Personalized product suggestions increase sales and improve user experience.

Entertainment Platforms (Netflix, Spotify, YouTube)
Movies, songs, or videos are recommended based on what similar users enjoyed.

Social Media (Instagram, Facebook, Twitter/X)
Posts, ads, and connections are suggested based on user activity.

Education (Coursera, Udemy, Khan Academy)
Courses and learning paths are recommended to learners depending on their past progress.

Healthcare
Personalized treatment plans and medicine recommendations can be made using similar logic but with more advanced AI models.

Future Scope in AI Research
More advanced recommendation systems use Machine Learning and Deep Learning techniques like Neural Networks, Matrix Factorization, and Reinforcement Learning to provide even more accurate and real-time recommendations.

Conclusion

This project demonstrates how AI recommendation systems can be built from scratch using simple tools like Java, NetBeans, and CSV datasets. While this project is a basic implementation, it reflects the core principle of how companies personalize user experiences in the digital age. Apache NetBeans provided an excellent platform for coding, debugging, and testing the system, making development smooth.

*OUTPUT*:

![Image](https://github.com/user-attachments/assets/2b3d85a3-958e-49a0-94c6-38df74a26621)

![Image](https://github.com/user-attachments/assets/1da42d8c-4743-42e0-9aa7-4b1f87bbfdac)

![Image](https://github.com/user-attachments/assets/80e07f48-23b2-498e-8592-6029da0156d8)

![Image](https://github.com/user-attachments/assets/0b65db3b-0dc3-4dc5-b7a1-c315342e5174)



The future scope of such systems is enormous. From business and entertainment to healthcare and education, recommendation systems will continue to expand, making decision-making easier and more efficient for users worldwide. This project gave me a solid foundation for understanding how AI can be implemented practically and how it can evolve in the future.
