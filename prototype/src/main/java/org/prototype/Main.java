package org.prototype;

import org.prototype.domain.Permission;
import org.prototype.domain.Role;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Permission> perms = List.of(new Permission("All", true),
                                         new Permission("Some", false));
        Role admin = new Role("Admin", true, perms);
        System.out.println(admin.toString());
        Role admin2 = (Role) admin.deepClone();
        System.out.println(admin2.toString());
    }
}