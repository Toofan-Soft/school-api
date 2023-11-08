package com.toofan.soft.school.api.repos.work;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifyWorksRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Work> works
    ) {}

    record Work (
            int id,
            String name
    ) {}
}
