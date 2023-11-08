package com.toofan.soft.school.api.repos.current_school_data;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;

public interface RetrieveSchoolAdministrationDataRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            String principalName,
            String agentName,
            String controlHeadName
    ) {}
}
