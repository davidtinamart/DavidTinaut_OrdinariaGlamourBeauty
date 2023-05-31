package org.example;
import java.util.ArrayList;
import java.util.List;


    public class IPOManagementSystem {


        private IPOProcess ipoProcess;
        private List<String> suppliers;
        private List<String> investors;

        public IPOManagementSystem() {
            ipoProcess = new IPOProcess();
            suppliers = new ArrayList<>();
            investors = new ArrayList<>();
        }

        public void addLegalDocument(Document document) {
            ipoProcess.addLegalDocument(document);
        }

        public void addFinancialDocument(Document document) {
            ipoProcess.addFinancialDocument(document);
        }

        public void addOperationalDocument(Document document) {
            ipoProcess.addOperationalDocument(document);
        }

        public void addMilestone(String milestone) {
            ipoProcess.addMilestone(milestone);
        }

        public void addStakeholder(String stakeholder) {
            ipoProcess.addStakeholder(stakeholder);
        }

        public void addSupplier(String supplier) {
            suppliers.add(supplier);
        }

        public void addInvestor(String investor) {
            investors.add(investor);
        }

        // Getters and setters

        public IPOProcess getIpoProcess() {
            return ipoProcess;
        }

        public void setIpoProcess(IPOProcess ipoProcess) {
            this.ipoProcess = ipoProcess;
        }

        public List<String> getSuppliers() {
            return suppliers;
        }

        public void setSuppliers(List<String> suppliers) {
            this.suppliers = suppliers;
        }

        public List<String> getInvestors() {
            return investors;
        }

        public void setInvestors(List<String> investors) {
            this.investors = investors;
        }

        // toString
        @Override
        public String toString() {
            return "IPOManagementSystem{" +
                    "ipoProcess=" + ipoProcess +
                    ", suppliers=" + suppliers +
                    ", investors=" + investors +
                    '}';
        }




}
