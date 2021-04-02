
package ionescu_stefanosv2_individual_parta;

import java.util.ArrayList;


public class TrainerInformation {
    
    
   private Trainer trainer;
   private ArrayList<Course> courses;
    
   public TrainerInformation(){
   }
    public TrainerInformation(Trainer trainer, ArrayList<Course> courses) {
        this.trainer = trainer;
        this.courses = courses;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
 
    
    
}
