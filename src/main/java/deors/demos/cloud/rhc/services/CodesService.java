package deors.demos.cloud.rhc.services;

import java.util.Collection;

import deors.demos.cloud.rhc.entities.Codes;
import deors.demos.cloud.rhc.repositories.CodesDAO;

public interface CodesService {

    void setCodesDAO(CodesDAO codesDAO);

    Collection<? extends Codes> selectAll();

    Codes select(Codes criteria);

    Codes insert(Codes record);

    int update(Codes record);

    int delete(Codes record);
}
