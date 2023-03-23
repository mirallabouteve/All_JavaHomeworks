package HW1;

public class Schedule {

        private String dayType;
        private int timeSlots;

        public Schedule(String dayType, int timeSlots) {
            this.dayType = dayType;
            this.timeSlots = timeSlots;
        }


        public String getDayType() {
            return dayType;
        }

        public void setDayType(String dayType) {
            this.dayType = dayType;
        }

        public int getTimeSlots() {
            return timeSlots;
        }

        public void setTimeSlots(int timeSlots) {
            this.timeSlots = timeSlots;
        }


        public boolean isClubOpen(int hours) {
            if (dayType.equals("Выходной")) {
                return (hours >= 9 && hours <= 20);
            } else {
                return (hours >= 9 && hours <= 22);
            }
        }
    }
