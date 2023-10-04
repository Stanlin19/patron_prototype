package org.prototype.domain;

import org.prototype.prototype.Prototype;

public class Permission implements Prototype {
    private String permission;
    private boolean status;

    public Permission(){}

    public Permission(String permission, boolean status) {
        this.permission = permission;
        this.status = status;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public Prototype clone() {
        return new Permission(this.permission, this.status);
    }

    @Override
    public Prototype deepClone() {
        return clone();
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this))+" Permission{" +
                "permission='" + permission + '\'' +
                ", status=" + status +
                '}';
    }
}
