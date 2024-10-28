package com.karaman.hospitalappointmentsystem.service;


import com.karaman.hospitalappointmentsystem.model.DoctorModel;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface DoctorService  extends UserDetailsService {
    List<DoctorModel> getAllDoctor();
    DoctorModel saveDoctor(DoctorModel doctorModel);
    DoctorModel getDoctorById(Long id);
    DoctorModel updateDoctor(DoctorModel doctorModel);
    void deleteDoctorById(Long id);
}
