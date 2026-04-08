class PatientRecord 
{

    private String patientName;
    private int age;
    private String disease;
    private String doctorName;
    private String roomType;
    private double billAmount;

    private PatientRecord(Builder builder) {
        this.patientName = builder.patientName;
        this.age = builder.age;
        this.disease = builder.disease;
        this.doctorName = builder.doctorName;
        this.roomType = builder.roomType;
        this.billAmount = builder.billAmount;
    }

    public void displayDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Bill Amount: " + billAmount);
    }

    public static class Builder {

        private String patientName;
        private int age;
        private String disease;
        private String doctorName;
        private String roomType;
        private double billAmount;


        public Builder setPatientName(String patientName) {
            this.patientName = patientName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setDisease(String disease) {
            this.disease = disease;
            return this;
        }

        public Builder setDoctorName(String doctorName) {
            this.doctorName = doctorName;
            return this;
        }

        public Builder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder setBillAmount(double billAmount) {
            this.billAmount = billAmount;
            return this;
        }

        public PatientRecord build() {
            return new PatientRecord(this);
        }
    }
}

