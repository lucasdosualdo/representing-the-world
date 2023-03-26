public class NumericalCalculation {
    private String interpolation;
    private String numericalIntegration;
    private String linearSystems;

    String getInterpolation() {
    return this.interpolation;
    }

    String getNumericalIntegration() {
    return this.numericalIntegration;
    }
    String getLinearSystems() {
    return this.linearSystems;
    }

    void setInterpolation() {
        this.interpolation = "learned";
    }

    void setNumericalIntegration() {
        this.numericalIntegration = "learned";
    }
    void setLinearSystems() {
        this.linearSystems = "learned";
    }
}
