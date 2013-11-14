package deors.demos.cloud.rhc.repositories;

import java.util.Collection;

import deors.demos.cloud.rhc.entities.Codes;

public interface CodesDAO {

    Collection<? extends Codes> selectAll();

    Codes select(Codes criteria);

    Codes insert(Codes record);

    int update(Codes record);

    int delete(Codes record);
}
