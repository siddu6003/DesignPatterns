package designpatterns.VisitorPattern.HotelRoom.HotelRoomVisitors;

import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.DoubleRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.PremiumRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.SingleRoom;

public class HotelRoomMaintainenceVisitor implements HotelRoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        singleRoom.setMaintainence(10);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        doubleRoom.setMaintainence(20);
    }

    @Override
    public void visit(PremiumRoom premiumRoom) {
        premiumRoom.setMaintainence(30);
    }
}
