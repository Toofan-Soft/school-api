package com.toofan.soft.school.api.repos.current_school_data;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;
import com.toofan.soft.school.api.comon.Phone;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveSchoolDataRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            String name,
            int address,
            List<Phone> phones,
            String email
    ) {}
}
