package service;


import java.util.List;
import model.Device;

public interface DeviceService {
	
    List<Device> getAllDevice();

    Device findByName(String name, Integer status);

    Device findById(Long id);

    List<Device> getAll();
}
