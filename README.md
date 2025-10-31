
## Keycloak Configuration Steps (Step-by-Step)

1. **Create Client**
   ![1_create_client](src/main/resources/static/images/1_create_clinet.png)
2. **Add Client Name**
   ![2_add_client_name](src/main/resources/static/images/2_add_client_name.png)
3. **Choose Authentication Flow**
   ![3_choose_authentication_flow](src/main/resources/static/images/3_choose_authentication_flow.png)
4. **Login Setting Step**
   ![4_login_setting_step](src/main/resources/static/images/4_login_setting_step.png)
5. **Verify Create Client Step**
   ![5_verify_create_client_step](src/main/resources/static/images/5_verify_create_client_step.png)
6. **See Your Client Created in List**
   ![6_see_your_client_created_in_list](src/main/resources/static/images/6_see_your_client_created_in_list.png)
7. **Admin Create Realm Roles**
   ![7_admin_create_realm_roles](src/main/resources/static/images/7_admin_create_realm_roles.png)
8. **Click Create Realm Roles**
   ![7_1_click_create_realm_roles](src/main/resources/static/images/7_1_click_create_realm_roles.png)
9. **Create User Realm Role**
   ![8_create_user_realm_role](src/main/resources/static/images/8_create_user_realm_role.png)
10. **Step Create User**
    ![9_step_create_user](src/main/resources/static/images/9_step_create_user.png)
11. **After Create User**
    ![10_after_create_user](src/main/resources/static/images/10_after_create_user.png)
12. **Set Password For User**
    ![11_set_password_for_user](src/main/resources/static/images/11_set_password_for_user.png)
13. **Click Set Password For User**
    ![12_click_set_password_for_user](src/main/resources/static/images/12_click_set_password_for_user.png)
14. **Click Save Password**
    ![13_step_click_save_password](src/main/resources/static/images/13_step_click_save_password.png)
15. **See Password In List**
    ![14_see_password_in_list](src/main/resources/static/images/14_see_password_in_list.png)
16. **Create Role For Client**
    ![15_create_role_for_client](src/main/resources/static/images/15_create_role_for_client.png)
17. **Click Client For Create Role**
    ![15_1_click_client_for_create_role](src/main/resources/static/images/15_1_click_client_for_create_role.png)
18. **Create Client Admin**
    ![16_create_client_admin](src/main/resources/static/images/16_create_client_admin.png)
19. **Create Client User**
    ![17_create_client_user](src/main/resources/static/images/17_create_client_user.png)
20. **After Create Client We Have Two Clients In List**
    ![18_after_create_client_two_clients_in_list](src/main/resources/static/images/18_after_create_client_two_clients_in_list.png)
21. **Go To Realm Roles**
    ![19_go_to_realm_roles](src/main/resources/static/images/19_go_to_realm_roles.png)
22. **Assign Client Role**
    ![20_assign_client_role](src/main/resources/static/images/20_assign_client_role.png)
23. **Assign Client For User Role Admin**
    ![21_assign_client_for_user_role_admin](src/main/resources/static/images/21_assign_client_for_user_role_admin.png)
24. **Click For User Role For Assign Client**
    ![22_click_for_user_role_for_assign_client](src/main/resources/static/images/22_click_for_user_role_for_assign_client.png)
25. **Click Assign Client Role For Assign To User**
    ![23_click_assign_client_role_for_assign_to_user](src/main/resources/static/images/23_click_assign_client_role_for_assign_to_user.png)
26. **Search Client For Role User And Click Assign**
    ![24_search_client_for_role_user_and_click_assign](src/main/resources/static/images/24_search_client_for_role_user_and_click_assign.png)
27. **Client User Role Assigned**
    ![25_client_user_role_assigned](src/main/resources/static/images/25_client_user_role_assigned.png)
28. **User Role In List Column Composite Is Changed To True**
    ![26_user_role_in_list_column_composite_is_true](src/main/resources/static/images/26_user_role_in_list_column_composite_is_true.png)
29. **Go To User List**
    ![27_go_to_user_list](src/main/resources/static/images/27_go_to_user_list.png)
30. **Click On Assign Client Role**
    ![28_click_on_assign_client_role](src/main/resources/static/images/28_click_on_assign_client_role.png)
31. **Search Client Admin And Assign**
    ![29_search_client_admin_and_assign](src/main/resources/static/images/29_search_client_admin_and_assign.png)
32. **Role Is Assigned**
    ![30_role_is_assigned](src/main/resources/static/images/30_role_is_assigned.png)
33. **Click To See Endpoint Configuration**
    ![31_click_to_see_endpoint_configuration](src/main/resources/static/images/31_click_to_see_endpoint_configuration.png)
34. **You Will See All Endpoint Of Configuration**
    ![32_you_will_see_all_endpoints_of_configuration](src/main/resources/static/images/32_you_will_see_all_endpoints_of_configuration.png)
35. **Login With Postman**
    ![33_login_with_postman](src/main/resources/static/images/33_login_with_postman.png)
36. **Check Access Token**
    ![34_check_access_token](src/main/resources/static/images/34_check_access_token.png)
37. **Create Project Spring Boot**
    ![35_create_project_spring_boot](src/main/resources/static/images/35_create_project_spring_boot.png)
38. **Add Dependency Server**
    ![36_add_dependency_server](src/main/resources/static/images/36_add_dependency_server.png)


# Spring Boot & Keycloak Integration Example

This project is a demonstration of how to secure a Spring Boot REST API using Keycloak as an OAuth2/OIDC Identity and Access Management provider. The application is configured as a Resource Server that validates JSON Web Tokens (JWTs) issued by a Keycloak instance.

## Features

-   **OAuth2 Resource Server**: The application acts as a resource server, protecting its endpoints.
-   **JWT Validation**: It validates JWTs issued by Keycloak, checking the signature and issuer.
-   **Role-Based Access Control (RBAC)**: Endpoints are secured based on user roles defined in Keycloak.
-   **Custom Role Mapping**: A `JwtAuthConverter` is implemented to correctly map Keycloak's realm roles to Spring Security's `GrantedAuthority` objects.

## Technology Stack

-   Java 21
-   Spring Boot 3.x
-   Spring Security 6.x (OAuth2 Resource Server)
-   Maven
-   Keycloak

---

## Prerequisites

Before you begin, ensure you have the following installed:
-   JDK 21 or later
-   Maven 3.8 or later
-   A running Keycloak instance (you can use Docker for a quick setup).

---

## 1. Keycloak Configuration

You need to configure a realm, a client, roles, and users in your Keycloak instance.

### 1.1. Create a Realm
Create a new realm (e.g., `my-realm`).

### 1.2. Create Roles
In your new realm, create at least two roles:
-   `user`
-   `admin`

### 1.3. Create a Client
1.  Go to **Clients** and create a new client.
2.  Set the **Client ID** (e.g., `spring-boot-client`).
3.  Ensure **Client authentication** is **On**.
4.  On the **Capability config** tab, enable **Direct access grants**. This allows you to get a token using a username and password, which is useful for testing.
5.  Save the client.
6.  Go to the **Credentials** tab and copy the **Client secret**. You will need this for testing.

### 1.4. Create Users
1.  Go to **Users** and create two users.
2.  **User One**:
    -   Set a username (e.g., `testuser`).
    -   Go to the **Credentials** tab and set a password.
    -   Go to the **Role mapping** tab, click **Assign role**, and assign the `user` role.
3.  **User Two**:
    -   Set a username (e.g., `testadmin`).
    -   Go to the **Credentials** tab and set a password.
    -   Go to the **Role mapping** tab, click **Assign role**, and assign both `admin` and `user` roles.

---

## 2. Project Setup

### 2.1. Configure Application Properties
Update the `src/main/resources/application.properties` file with your Keycloak realm details.

```properties
# File: src/main/resources/application.properties

# Application name
spring.application.name=spring-boot-keycloak-integration

# Server port
server.port=8081

# ===============================================
# OAUTH2 (KEYCLOAK) RESOURCE SERVER CONFIGURATION
# ===============================================

# The URI of the Keycloak realm.
# Spring Security uses this to discover the authorization server's public keys
# to validate the JWT signature.
# Replace 'my-realm' with the name of your Keycloak realm.
spring.security.oauth2.resourceserver.jwt.issuer-uri=http://localhost:8080/realms/my-realm
```

### 2.2. Build and Run the Application
You can run the application using the Maven wrapper.

Open a terminal in the project root directory and run:

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8081`.

---

## 3. Testing the API

You will need an access token from Keycloak to call the secured endpoints.

### 3.1. Get an Access Token
Use `curl` to request an access token from Keycloak. Replace the placeholders with your own values.

```bash
curl -X POST "http://localhost:8080/realms/my-realm/protocol/openid-connect/token" \
-H "Content-Type: application/x-www-form-urlencoded" \
-d "grant_type=password" \
-d "client_id=spring-boot-client" \
-d "client_secret=your-client-secret" \
-d "username=testuser" \
-d "password=the-user-password"
```

The response will contain an `access_token`. Copy it for the next step.

### 3.2. Call the Secured Endpoints

Use the obtained `access_token` to make requests to the API.

#### Endpoint for Users (`/api/v1/demo/user`)
This endpoint requires the `user` role.

```bash
curl -X GET http://localhost:8081/api/v1/demo/user \
-H "Authorization: Bearer <YOUR_ACCESS_TOKEN>"
```
**Expected Response:**
```
Hello from Spring Boot & Keycloak - USER
```

#### Endpoint for Admins or Users (`/api/v1/demo/admin-or-user`)
This endpoint requires either the `admin` or `user` role.

```bash
curl -X GET http://localhost:8081/api/v1/demo/admin-or-user \
-H "Authorization: Bearer <YOUR_ACCESS_TOKEN>"
```
**Expected Response:**
```
Hello from Spring Boot & Keycloak - ADMIN or USER

```
# Spring Boot & Keycloak Integration — Step Images and Config

This document shows the Keycloak configuration steps (mapped to your screenshot filenames). Put the images in your project at:

Of course. The reason the images may not be displaying is likely due to the file paths and potential typos in the filenames within your `README.md`. Markdown image links are sensitive to both.

I will correct the typos in the filenames and adjust the image paths to be more standard for a `README.md` file at the project root. A common practice is to place documentation images in a dedicated folder at the root of the project, like `.github/images/`.

Here are the steps:

1.  I'll provide the command to create a new directory for the images.
2.  I'll update the `README.md` file with the corrected paths and filenames.

### 1. Create Image Directory

First, create a directory to store the images for your `README.md`. Open your terminal and run this command from the root of your project:

```bash
mkdir -p .github/images
```

Now, please **move all your PNG image files** into this new `.github/images/` directory and rename them to match the corrected filenames I will use in the `README.md` below.

### 2. Update `README.md`

Here are the changes for your `README.md` file. I've corrected the typos and updated the image paths.


// File: C:\Users\SOVANNARO\Documents\spring-boot\spring-boot-keycloak-intergration\README.md
// ... existing code
Hello from Spring Boot & Keycloak - ADMIN or USER