public class StrengthOfMaterials {
    private String flexion;
    private String torsion;
    private String stressAndDeformation;

    String getFlexion () {
    return this.flexion;
    }

    String getTorsion () {
       return this.torsion;
    }

    String getStressAndDeformation () {
        return  this.stressAndDeformation;
    }

    void setFlexion () {
        this.flexion = "learned";
    }

    void setTorsion () {
        this.torsion = "learned";
    }

    void setStressAndDeformation () {
        this.stressAndDeformation = "learned";
    }
}
