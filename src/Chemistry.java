public class Chemistry {
    private String atomicStructure;
    private String periodicTable;
    private String chemicalBonds;

    String getAtomicStructure() {
       return this.atomicStructure;
    }

    
    String getPeriodicTable() {
        return  this.periodicTable;
    }

    String getChemicalBonds() {
        return  this.chemicalBonds;
    }

    void setAtomicStructure() {
        this.atomicStructure = "learned";
    }

    
    void setPeriodicTable() {
        this.periodicTable = "learned";
    }

    void setChemicalBonds() {
        this.chemicalBonds = "learned";
    }
}
