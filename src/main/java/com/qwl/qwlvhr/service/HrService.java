package com.qwl.qwlvhr.service;

import com.qwl.qwlvhr.bean.Hr;
import com.qwl.qwlvhr.mapper.HrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.getHrByUsername(username);
        if(hr==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return hr;
    }
}
