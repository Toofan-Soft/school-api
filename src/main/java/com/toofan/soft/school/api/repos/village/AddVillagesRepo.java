package com.toofan.soft.school.api.repos.village;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface AddVillagesRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Isolation> isolations
    ) {}

    record Isolation (
            int id,
            List<String> villagesNames
    ) {}
}
