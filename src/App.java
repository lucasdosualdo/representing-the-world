public class App {
    public static void main(String[] args) throws Exception {
        
        RespondeAi respondeAi = new RespondeAi();

        String cinematicKnowledge = respondeAi.subjects.physics.getCinematics();

        respondeAi.subjects.physics.setNewtonsLaws();

        String newtonsLawsKnowledge = respondeAi.subjects.physics.getNewtonsLaws(); 

        System.out.println("knowledge in cinematics: " + cinematicKnowledge);
        System.out.println("knowledge in Newton's laws: " + newtonsLawsKnowledge);
    }
}
