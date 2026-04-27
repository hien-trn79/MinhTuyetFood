package com.hintrn.MinhTuyetFood.service;

import com.hintrn.MinhTuyetFood.model.Staff;
import com.hintrn.MinhTuyetFood.repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    StaffRepo repo;

    // [GET] /api/staffs
    public List<Staff> getStaffs() {
        return repo.findAll();
    }

    // [POST] /api/staffs
    public void addStaff(Staff newStaff) {
        repo.save(newStaff);
    }

    // [GET] /api/{staffId}
    public Staff getStaffById(int staffId) {
        return repo.findById(staffId).orElse(new Staff(0, "No name", "No Subname", 1900, "No address", "123456789"));
    }

    // [PUT] /api/staffs/{staffId}
    public void updateStaff(Staff newStaff) {
        repo.save(newStaff);
    }

    // [DELETE] /api/staffs/{staffId}
    public void deleteStaff(int id) {
        repo.deleteById(id);
    }
}
