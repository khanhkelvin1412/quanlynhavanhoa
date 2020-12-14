package service.service_impl;


import java.util.List;

import dao.impl.FormInfoDAO;
import service.FormInfoService;
import model.FormInfo;

public class FormInfoServiceImpl implements FormInfoService {

    FormInfoDAO formInfoDAO = new FormInfoDAO();

    @Override
    public Long save(FormInfo form) {
        return formInfoDAO.insertRoom(form);
    }
    
        
    @Override
	public void updateRoom(FormInfo form_info) {
		formInfoDAO.updateRoom(form_info);
	}


	@Override
	public FormInfo findOne(Integer id) {
		return formInfoDAO.findOne(id);
	}
        
    @Override
	public List<FormInfo> searchForm(FormInfo form) {
        List<FormInfo> list = formInfoDAO.searchForm(form);
        if (list.isEmpty()) {
        	return null;
        } else {
        	return list;
        }
	}
        
    @Override
	public List<FormInfo> findAll() {
		return formInfoDAO.findAll();}

}
