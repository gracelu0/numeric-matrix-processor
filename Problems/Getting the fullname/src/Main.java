class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null){
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null){
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "Unknown";
        }
        else {
            String fullName = "";
            if (this.firstName != null){
                fullName += this.firstName + " ";
            }
            if (this.lastName != null) {
                fullName += this.lastName;
            }
            return fullName.trim();
        }


    }
}