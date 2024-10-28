package com.karaman.hospitalappointmentsystem.service;

import com.karaman.hospitalappointmentsystem.model.PrescriptionModel;

import java.util.List;

public interface PrescriptionService {
    List<PrescriptionModel> getAllPrescription();
    PrescriptionModel savePrescription(PrescriptionModel prescriptionModel);
    PrescriptionModel getPrescriptionById(Long id);
    PrescriptionModel updatePrescription(PrescriptionModel PrescriptionModel);
    void deletePrescriptionById(Long id);
}
