package designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes;

import designpatterns.VisitorPattern.HotelRoom.HotelRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomVisitors.HotelRoomVisitor;

public class PremiumRoom implements HotelRoom {

    private static int price;

    private static int maintainence;

    @Override
    public int getMaintainence() {
        return maintainence;
    }

    public void setMaintainence(int maintainence) {
        this.maintainence = maintainence;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void accept(HotelRoomVisitor visitor) {
        visitor.visit(this);
    }
}
