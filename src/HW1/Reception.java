package HW1;

public class Reception {
    private int receptionId;
    private String receptionistName;
    private boolean isAvailable;

    // Конструктор класса
    public Reception(int id, String name, boolean isAvailable) {
        this.receptionId = id;
        this.receptionistName = name;
        this.isAvailable = isAvailable;
    }


    public int getReceptionId() {
        return receptionId;
    }

    public void setReceptionId(int receptionId) {
        this.receptionId = receptionId;
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public void setReceptionistName(String receptionistName) {
        this.receptionistName = receptionistName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public boolean checkAvailability() {
        return this.isAvailable;
    }


    public void changeReceptionistName(String newName) {
        this.receptionistName = newName;
    }
}

