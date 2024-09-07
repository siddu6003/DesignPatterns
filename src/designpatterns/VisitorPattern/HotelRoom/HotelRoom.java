package designpatterns.VisitorPattern.HotelRoom;

import designpatterns.VisitorPattern.HotelRoom.HotelRoomVisitors.HotelRoomVisitor;

public interface HotelRoom {
    int getPrice();

    int getMaintainence();
    void accept(HotelRoomVisitor visitor);
}
