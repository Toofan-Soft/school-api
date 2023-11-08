package com.toofan.soft.school.api.repos.isolation;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifyIsolationsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Isolation> isolations
    ) {}

    record Isolation (
            int id,
            String name
    ) {}
}
