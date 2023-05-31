package org.example;
import java.util.ArrayList;
import java.util.List;

public class IPOProcess {
    private List<Document> legalDocuments;
    private List<Document> financialDocuments;
    private List<Document> operationalDocuments;
    private List<String> milestones;
    private List<String> stakeholders;

    public IPOProcess() {
        legalDocuments = new ArrayList<>();
        financialDocuments = new ArrayList<>();
        operationalDocuments = new ArrayList<>();
        milestones = new ArrayList<>();
        stakeholders = new ArrayList<>();
    }

    public void addLegalDocument(Document document) {
        legalDocuments.add(document);
    }

    public void addFinancialDocument(Document document) {
        financialDocuments.add(document);
    }

    public void addOperationalDocument(Document document) {
        operationalDocuments.add(document);
    }

    public void addMilestone(String milestone) {
        milestones.add(milestone);
    }

    public void addStakeholder(String stakeholder) {
        stakeholders.add(stakeholder);
    }

    // Getters y setters

    public List<Document> getLegalDocuments() {
        return legalDocuments;
    }

    public void setLegalDocuments(List<Document> legalDocuments) {
        this.legalDocuments = legalDocuments;
    }

    public List<Document> getFinancialDocuments() {
        return financialDocuments;
    }

    public void setFinancialDocuments(List<Document> financialDocuments) {
        this.financialDocuments = financialDocuments;
    }

    public List<Document> getOperationalDocuments() {
        return operationalDocuments;
    }

    public void setOperationalDocuments(List<Document> operationalDocuments) {
        this.operationalDocuments = operationalDocuments;
    }

    public List<String> getMilestones() {
        return milestones;
    }

    public void setMilestones(List<String> milestones) {
        this.milestones = milestones;
    }

    public List<String> getStakeholders() {
        return stakeholders;
    }

    public void setStakeholders(List<String> stakeholders) {
        this.stakeholders = stakeholders;
    }

    // toString
    @Override
    public String toString() {
        return "IPOProcess{" +
                "legalDocuments=" + legalDocuments +
                ", financialDocuments=" + financialDocuments +
                ", operationalDocuments=" + operationalDocuments +
                ", milestones=" + milestones +
                ", stakeholders=" + stakeholders +
                '}';
    }


}
