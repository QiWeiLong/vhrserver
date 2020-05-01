package com.qwl.qwlvhr.bean;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
public class Hr implements UserDetails {
    private Long id;
    private String name;
    private String phone;
    private String telephone;
    private String address;
    private boolean enabled;
    private String username;
    private String password;
    private String remark;
    private List<Role> roles;
    private String userface;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        for (Role role : roles) {
//            authorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//        return authorities;
        return null;
    }

    @Override
    //账号是否没有过期
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    //账户是否没有被锁定
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    //密码是否没有过期
    public boolean isCredentialsNonExpired() {
        return true;
    }
}