class User{
    private final String userId;
    private final String name;
    private final String emailId;
    private User(UserBuilder builder){
        this.userId = builder.userId;    
        this.name = builder.name;
        this.emailId = builder.emailId;
    }
    public String getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public String getEmailid(){
        return emailId;
    }
    static class UserBuilder{
        private String userId;
        private String name;
        private String emailId;
        public UserBuilder(){

        }
        public UserBuilder setUserId(String userId){
            this.userId = userId;
            return this
        }
        public UserBuilder setName(String name){
            this.name = name;
            return this
        }
        public UserBuilder setEmailId(String userId){
            this.emailId = emailId;
            return this
        }
        public User build(){
            return new User(this)
        }
    }
}