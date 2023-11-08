package com.toofan.soft.school.api.repos.qualification;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveQualificationsRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<Qualification> qualifications
    ) {}

    record Qualification (
            int id,
            String name
    ) {}
}
