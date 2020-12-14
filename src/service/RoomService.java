package service;


import java.util.List;
import model.Room;


public interface RoomService {
	
    List<Room> getListRoom();

    Room findByFloorAndNumberFloor(Integer floor, Integer numberFloor, Integer status);

    Room findById(Long id);

    List<Room> findAll();
}
