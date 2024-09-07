import designpatterns.VisitorPattern.HotelRoom.HotelRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.DoubleRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.PremiumRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomTypes.SingleRoom;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomVisitors.HotelRoomMaintainenceVisitor;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomVisitors.HotelRoomPriceVisitor;
import designpatterns.VisitorPattern.HotelRoom.HotelRoomVisitors.HotelRoomVisitor;

import java.util.Scanner;

public class Main {

    private static void getPriceAndMaintainanceForHotelRoom(HotelRoom hotelRoom, HotelRoomVisitor hotelRoomVisitor, HotelRoomMaintainenceVisitor hotelRoomMaintainenceVisitor) {
        getPriceForHotelRoom(hotelRoom, hotelRoomVisitor);
        getMaintainancePriceForHotelRoom(hotelRoom, hotelRoomMaintainenceVisitor);
    }
    private static void getPriceForHotelRoom(HotelRoom hotelRoom, HotelRoomVisitor hotelRoomVisitor) {
        hotelRoom.accept(hotelRoomVisitor);
    }

    private static void getMaintainancePriceForHotelRoom(HotelRoom hotelRoom, HotelRoomMaintainenceVisitor hotelRoomMaintainenceVisitor) {
        hotelRoom.accept(hotelRoomMaintainenceVisitor);
    }

    private static int totalCostPerRoom(int days, HotelRoom hotelRoom) {
        return days * (hotelRoom.getPrice() + hotelRoom.getMaintainence());
    }

    private static int price(int days, int input) {

        HotelRoomPriceVisitor hotelRoomPriceVisitor = new HotelRoomPriceVisitor();
        HotelRoomMaintainenceVisitor hotelRoomMaintainenceVisitor = new HotelRoomMaintainenceVisitor();

        switch (input) {
            case 1 :
                HotelRoom singleRoom = new SingleRoom();
                getPriceAndMaintainanceForHotelRoom(singleRoom, hotelRoomPriceVisitor, hotelRoomMaintainenceVisitor);
                return totalCostPerRoom(days, singleRoom);

            case 2 :
                HotelRoom doubleRoom = new DoubleRoom();
                getPriceAndMaintainanceForHotelRoom(doubleRoom, hotelRoomPriceVisitor, hotelRoomMaintainenceVisitor);
                return totalCostPerRoom(days, doubleRoom);

            case 3 :
                HotelRoom premiumRoom = new PremiumRoom();
                getPriceAndMaintainanceForHotelRoom(premiumRoom, hotelRoomPriceVisitor, hotelRoomMaintainenceVisitor);
                return totalCostPerRoom(days, premiumRoom);

            default: return 0;

        }

    }
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("welcome to hotel room booking please press select the room options you need");
        System.out.println("===========================");

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the number as shown below");
        System.out.println("Single Room - press 1");
        System.out.println("Double Room - press 2");
        System.out.println("Premium Room - press 3");

        int input = sc.nextInt();

        System.out.println("==========================");
        System.out.println("Thank you now please enter the no of days of stay");

        int days = sc.nextInt();

        System.out.println();
        System.out.println("Final Bill Amount");
        System.out.println("===========================");
        System.out.println("final price for the total days of stay " + days + " is " + price(days, input));


    }
}