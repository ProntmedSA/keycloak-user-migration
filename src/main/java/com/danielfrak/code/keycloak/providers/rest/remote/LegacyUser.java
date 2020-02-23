package com.danielfrak.code.keycloak.providers.rest.remote;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A user in the old authentication system
 */
public class LegacyUser {

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private boolean isEnabled;
    private boolean isEmailVerified;
    private Map<String, List<String>> attributes;
    private List<String> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public boolean isEmailVerified() {
        return isEmailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        isEmailVerified = emailVerified;
    }

    public Map<String, List<String>> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, List<String>> attributes) {
        this.attributes = attributes;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegacyUser legacyUser = (LegacyUser) o;
        return isEnabled == legacyUser.isEnabled &&
                isEmailVerified == legacyUser.isEmailVerified &&
                Objects.equals(username, legacyUser.username) &&
                Objects.equals(email, legacyUser.email) &&
                Objects.equals(firstName, legacyUser.firstName) &&
                Objects.equals(lastName, legacyUser.lastName) &&
                Objects.equals(attributes, legacyUser.attributes) &&
                Objects.equals(roles, legacyUser.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, firstName, lastName, isEnabled, isEmailVerified, attributes,
                roles);
    }
}
