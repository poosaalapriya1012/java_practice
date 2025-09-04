# Initialize the user list and movies list
user_list = []
mvs = []

while True:
    print("\n1. Add User\n2. Add Movies for User\n3. Display Users\n4. Display Movies of a User\n5. Exit")
    ch = int(input("Enter your choice: "))
    
    if ch == 1:
        user_name = input("Enter user name: ")
        user_list.append(user_name)
        print(f"User '{user_name}' added successfully!")
    
    elif ch == 2:
        user_name = input("Enter user name: ")
        if user_name in user_list:
            mv_name = input("Enter movie names separated by spaces: ")
            ml = set(mv_name.split())  # Convert movies to a set to handle duplicates
            mvs.append((user_name, ml))
            print(f"Movies {ml} added for user '{user_name}'")
        else:
            print("User does not exist. Please create a user first.")
    
    elif ch == 3:
        print("Current users:", user_list)
    
    elif ch == 4:
        user_name = input("Enter user name: ")
        user_movies = [movies for u_name, movies in mvs if u_name == user_name]
        if user_movies:
            print(f"Movies for user '{user_name}': {user_movies[0]}")
        else:
            print(f"No movies found for user '{user_name}'.")
    
    elif ch == 5:
        print("Exiting the program.")
        break
    
    else:
        print("Invalid choice. Please try again.")
