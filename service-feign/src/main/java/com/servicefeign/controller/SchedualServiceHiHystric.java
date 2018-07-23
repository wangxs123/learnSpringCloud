package com.servicefeign.controller;

import com.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author： 王孝双
 * @date：Create by 2018/7/12 15:59
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
