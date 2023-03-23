package HW1;

public class FitnessClub {
        private String name;
        private int maxClients;
        private int currentClients;
        private String address;

        public FitnessClub(String name, int maxClients, int currentClients, String address) {
            this.name = name;
            this.maxClients = maxClients;
            this.currentClients = currentClients;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMaxClients() {
            return maxClients;
        }

        public void setMaxClients(int maxClients) {
            this.maxClients = maxClients;
        }

        public int getCurrentClients() {
            return currentClients;
        }

        public void setCurrentClients(int currentClients) {
            this.currentClients = currentClients;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public boolean canAddClient(int numNewClient){
            return (currentClients + numNewClient <= maxClients);
        }
    }

