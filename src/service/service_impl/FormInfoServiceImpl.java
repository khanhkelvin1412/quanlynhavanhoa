package service.service_impl;

import dao.impl.FormInfoDAO;
import model.FormInfo;
import service.FormInfoService;

public class FormInfoServiceImpl implements FormInfoService {

    FormInfoDAO formInfoDAO = new FormInfoDAO();

    @Override
    public Long save(FormInfo form) {
        return formInfoDAO.insertRoom(form);
    }
}
