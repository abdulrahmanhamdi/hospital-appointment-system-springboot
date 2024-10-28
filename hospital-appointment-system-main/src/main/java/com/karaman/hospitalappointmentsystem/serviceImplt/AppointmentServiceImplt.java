package com.karaman.hospitalappointmentsystem.serviceImplt;

import com.karaman.hospitalappointmentsystem.model.AppointmentModel;
import com.karaman.hospitalappointmentsystem.repository.AppointmentRepository;
import com.karaman.hospitalappointmentsystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppointmentServiceImplt implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public AppointmentServiceImplt(AppointmentRepository appointmentRepository){
        this.appointmentRepository=appointmentRepository;
    }

    @Override
    public List<AppointmentModel> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    @Override
    public AppointmentModel saveAppointment(AppointmentModel appointmentModel) {
        return appointmentRepository.save(appointmentModel);
    }

    @Override
    public AppointmentModel getAppointmentById(Long id) {
        return appointmentRepository.getById(id);
    }

    @Override
    public AppointmentModel updateAppointment(AppointmentModel AppointmentModel) {
        return appointmentRepository.save(AppointmentModel);
    }

    @Override
    public void deleteAppointmentById(Long id) {
    appointmentRepository.deleteById(id);
    }
}
