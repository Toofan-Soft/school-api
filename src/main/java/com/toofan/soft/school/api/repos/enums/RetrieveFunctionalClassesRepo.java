package com.toofan.soft.school.api.repos.enums;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveFunctionalClassesRepo extends API {
    Response execute() throws APIException, RemoteException;

    record Response (
            List<FunctionalClass> functionalClasses
    ) {}

    record FunctionalClass (
            int id,
            String name
    ) {}
}
