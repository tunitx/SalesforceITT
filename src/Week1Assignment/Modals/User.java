package Week1Assignment.Modals;


class User {
    private int id;
    private String name;
    private Plan selectedPlan;
    private String email;

    public User(int id, String name, Plan selectedPlan, String email){
        this.id = id;
        this.email = email;
        this.name = name;
        this.selectedPlan = selectedPlan;
    }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getSelectedPlan() {
        return selectedPlan;
    }

    public void setSelectedPlan(Plan selectedPlan) {
        this.selectedPlan = selectedPlan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

