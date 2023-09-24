package com.chevonphillip.inventory;

import java.util.Objects;

public class Warehouse {
    private int warehouseId;
    private String warehouseName;
    private String inventories;

    public Warehouse(int warehouseId, String warehouseName, String inventories) {
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.inventories = inventories;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getInventories() {
        return inventories;
    }

    public void setInventories(String inventories) {
        this.inventories = inventories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warehouse warehouse)) return false;
        return getWarehouseId() == warehouse.getWarehouseId() && Objects.equals(getWarehouseName(), warehouse.getWarehouseName()) && Objects.equals(getInventories(), warehouse.getInventories());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWarehouseId(), getWarehouseName(), getInventories());
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseId=" + warehouseId +
                ", warehouseName='" + warehouseName + '\'' +
                ", inventories='" + inventories + '\'' +
                '}';
    }
}
