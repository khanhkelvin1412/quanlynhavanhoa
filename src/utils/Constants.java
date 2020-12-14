package utils;

public interface Constants {

    interface STATUS{
        Integer DELETED = 0;
        Integer ACTIVATED = 1;
    }

    interface ROOM{
        String AREA = " mét vuông";
        String PRICE = " giá ";
        String TYPE = "Phòng ";
        String DOT = ".";
    }

    interface DEVICE{
        String TABLE = "Bàn";
        String RADIO = "Đài";
        String PROJECTOR = "Máy chiếu";
        String CHAIR = "Ghế";
        String SPEAKER = "Loa";
    }

    interface SENTENCES{
        String POSITION = "Địa điểm: ";
    }
}
