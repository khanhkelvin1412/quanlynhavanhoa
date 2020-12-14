package service.service_impl;


import java.util.List;

import model.Device;
import dao.impl.DeviceDAO;
import service.DeviceService;


public class DeviceServiceImpl implements DeviceService {

    private DeviceDAO deviceDAO = new DeviceDAO();

    @Override
    public Device findByName(String name, Integer status) {
        return deviceDAO.findByName(name, status);
    }

    @Override
    public Device findById(Long id) {
        return deviceDAO.findOne(id);
    }

    @Override
    public List<Device> getAll() {
        return deviceDAO.findAll().isEmpty() ? null : deviceDAO.findAll();
    }

    @Override
    public List<Device> getAllDevice() {
        return deviceDAO.findAll();
    }
}
