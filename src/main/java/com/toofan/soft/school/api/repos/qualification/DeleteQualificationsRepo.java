package com.toofan.soft.school.api.repos.qualification;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface DeleteQualificationsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Integer> qualificationsIds
    ) {}
}
