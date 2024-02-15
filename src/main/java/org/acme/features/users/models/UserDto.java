package org.acme.features.users.models;

import java.sql.Timestamp;

public class UserDto {
    private Timestamp updatedAt;
    private Timestamp createdAt;
    private Long updatedBy;
    private Long createdBy;
    private boolean enabled;
    private String fullName;
    private String username;
    private String password;
    private String mobile;
    private String email;
    public UserDto() {}
    public UserDto(Timestamp updatedAt, Timestamp createdAt, Long updatedBy, Long createdBy, boolean enabled, String fullName, String username, String password, String mobile, String email) {
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.enabled = enabled;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.email = email;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
