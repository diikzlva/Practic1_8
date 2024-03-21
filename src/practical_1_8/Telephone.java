
    package practical_1_8;

    class Telephone {
        
        private String model;
        String serialNumber;
        private String color;
        private boolean isMobile;

        public Telephone(String model, String serialNumber, String color, boolean isMobile) {
            
            this.model = model;
            this.serialNumber = serialNumber;
            this.color = color;
            this.isMobile = isMobile;
        }

        public String getModel() {
            return model;
        }

        public String getSerialNumber() {
            return serialNumber;
        }

        public String getColor() {
            return color;
        }

        public boolean isMobile() {
            return isMobile;
        }

        @Override
        public String toString() {
            return model + ", " + serialNumber + ", " + color + ", " + isMobile;
        }
    }  
    

