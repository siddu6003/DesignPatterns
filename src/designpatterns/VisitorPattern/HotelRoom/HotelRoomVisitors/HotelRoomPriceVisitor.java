package designpatterns.VisitorPattern.HotelRoom.HotelRoomVisitors;

import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.DoubleRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.PremiumRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.SingleRoom;

public class HotelRoomPriceVisitor implements HotelRoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        singleRoom.setPrice(100);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        doubleRoom.setPrice(200);
    }

    @Override
    public void visit(PremiumRoom premiumRoom) {
        premiumRoom.setPrice(500);
    }
}
