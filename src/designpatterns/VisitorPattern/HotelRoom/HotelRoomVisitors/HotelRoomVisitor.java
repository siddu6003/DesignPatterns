package designpatterns.VisitorPattern.HotelRoom.HotelRoomVisitors;

import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.DoubleRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.PremiumRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.SingleRoom;

public interface HotelRoomVisitor {
    void visit(SingleRoom singleRoom);
    void visit(DoubleRoom doubleRoom);
    void visit(PremiumRoom premiumRoom);
}
