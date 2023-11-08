package com.toofan.soft.school.api.repos.employee;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;
import com.toofan.soft.school.api.comon.Phone;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifyEmployeesRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Employee> employees
    ) {}

    record Employee (
            int id,
            String name,
            byte[] image,
            List<Phone> phones,
            long birthdate,
            int birthplace,
            int location,
            int maritalStatusId,
            int genderId,
            int bloodTypeId,
            int nationalityId,
            int religionId,
            AddEmployeesRepo.Job job,
            AddEmployeesRepo.Qualification qualification,
            AddEmployeesRepo.Identity identity
    ) {}

    record Job (
            long jobNumber,
            long employmentDate,
            long workStartDate,
            long workEndDate,
            long financialNumber,
            int jobId,
            int jobTypeId,
            long sendingDate,
            int functionalClassId,
            int employeeStateId
    ) {}

    record Qualification (
            int id,
            long issueDate,
            int issuePlace,
            int specialtyId,
            byte[] attachment
    ) {}

    record Identity (
            int typeId,
            long number,
            long issueDate,
            int issuePlace,
            byte[] attachment
    ) {}
}
