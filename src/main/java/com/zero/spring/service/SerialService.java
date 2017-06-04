package com.zero.spring.service;

import com.zero.spring.model.SerialModel;
import org.springframework.stereotype.Service;

/**
 * Created by zqh on 2017/6/2.
 */
@Service
public interface SerialService {
    SerialModel getSerialByPage(int page);
}
