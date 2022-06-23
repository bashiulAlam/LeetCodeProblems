class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.big == 0)
                    return false;
                else {
                    this.big--;
                    return true;
                }
            case 2:
                if (this.medium == 0)
                    return false;
                else {
                    this.medium--;
                    return true;
                }
            case 3:
                if (this.small == 0)
                    return false;
                else {
                    this.small--;
                    return true;
                }
            default:
                return false;
        }
    }
}