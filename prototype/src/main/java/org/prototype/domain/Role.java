package org.prototype.domain;

import org.prototype.prototype.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Role implements Prototype {

    private String name;
    private boolean status;
    private List<Permission> permissions = new ArrayList<>();

    public Role(){}

    public Role(String name, boolean status, List<Permission> permissions) {
        this.name = name;
        this.status = status;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public Prototype clone() {
        Role clone = new Role();
        clone.setName(this.name);
        clone.setStatus(this.status);
        List<Permission> perms = new ArrayList<>();
        for(Permission p : this.permissions){
            perms.add(p);
        }
        clone.setPermissions(perms);
        return clone;
    }

    @Override
    public Prototype deepClone() {
        Role clone = new Role();
        clone.setName(this.name);
        clone.setStatus(this.status);
        List<Permission> perms = new ArrayList<>();
        for(Permission p : this.permissions){
            perms.add((Permission) p.clone());
        }
        clone.setPermissions(perms);
        return clone;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this))+" Role{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", permissions=" + permissions +
                '}';
    }
}
