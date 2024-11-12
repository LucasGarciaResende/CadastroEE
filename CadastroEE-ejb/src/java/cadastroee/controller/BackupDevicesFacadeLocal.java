/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroee.controller;

import cadastroee.model.BackupDevices;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author jedim
 */
@Local
public interface BackupDevicesFacadeLocal {

    void create(BackupDevices backupDevices);

    void edit(BackupDevices backupDevices);

    void remove(BackupDevices backupDevices);

    BackupDevices find(Object id);

    List<BackupDevices> findAll();

    List<BackupDevices> findRange(int[] range);

    int count();
    
}
