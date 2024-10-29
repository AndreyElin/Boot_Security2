package web.services;

import web.models.Role;

public interface RoleService {

    Role getById(long id);

    void saveRole(Role role);

}
