package com.toofan.soft.school.api.repos.village;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveVillagesRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int isolationId
    ) {}

    record Response (
            List<Isolation> isolations
    ) {}

    record Isolation (
            int id,
            List<Village> villages
    ) {}

    record Village (
            int id,
            String name
    ) {}
}
