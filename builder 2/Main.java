public class Main 
{
    public static void main(String[] args) 
	{

        PatientRecord patient = new PatientRecord.Builder()
                .setPatientName("Balaji")
                .setAge(32)
                .setDisease("Fever")
                .setDoctorName("Dr. Kumar")
                .setRoomType("AC")
                .setBillAmount(15000)
                .build();

        patient.displayDetails();
    }
}