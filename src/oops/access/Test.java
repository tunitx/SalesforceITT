package oops.access;


// access modifiers :

// public : class, package, subclass(same package), subclass (diff package), world (not subclass, not same package)
// protected : class, package, subclass(same package), subclass (diff package)
// default : class, package, subclass(same pkg)
// private : class


public class Test {
        protected String name;
        public int age;
        protected String password;

        protected Test(int age, String name, String password){
            this.age = age;
            this.name = name;
            this.password = password;
        }



    public String getName() {
        return name;
    }

     int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }
}

