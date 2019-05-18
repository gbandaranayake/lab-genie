/*
 * (C) Copyright 2010-2015 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 *
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package ruh.efac.lab.genie.repository;
/*
 * Created by GayanB
 */

import ruh.efac.lab.genie.domain.Instrument;

import java.util.List;

public interface InstrumentsRepository {
    List<Instrument> getInstruments(String labName);

    List<Instrument> getInstruments(String labName, String instrumentName);

    void saveInstrument(Instrument instrument);

    void deleteInstrumentById(Instrument instrument);

    void addAll(List<Instrument> instruments);

    List<Instrument> getInstrumentsByInventory(int inventoryNo);

    void deleteInstrumentById(long instrumentId);
}
