package com.toofan.soft.school.api.repos.village;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifyVillagesRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Village> villages
    ) {}

    record Village (
            int id,
            String name
    ) {}
}
