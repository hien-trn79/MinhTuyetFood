package com.hintrn.MinhTuyetFood.controller;

import com.hintrn.MinhTuyetFood.model.Staff;
import com.hintrn.MinhTuyetFood.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/staffs")
public class StaffController {
    @Autowired
    StaffService service;

    // [GET] /api/staffs
    @GetMapping
    public List<Staff> getStaffs() {
        return service.getStaffs();
    }

    // [POST] /api/staffs
    @PostMapping
    public void addStaff(@RequestBody Staff newStaff) {
        service.addStaff(newStaff);
    }

    // [GET] /api/staffs/{staffId}
    @GetMapping("/{staffId}")
    public Staff getStaffById(@PathVariable int staffId) {
        return service.getStaffById(staffId);
    }

    // [PUT] /api/staffs/{staffId}
    @PutMapping("/{staffId}")
    public void updateStaff(@PathVariable int staffId, @RequestBody Staff newStaff) {
        Staff foundStaff = service.getStaffById(staffId);
        if(foundStaff != null) {
            service.updateStaff(newStaff);
        }
    }

    // [DELETE] /api/staffs/{staffId}
    @DeleteMapping("/{staffId}")
    public void deleteStaff(@PathVariable int staffId) {
        service.deleteStaff(staffId);
    }
}
