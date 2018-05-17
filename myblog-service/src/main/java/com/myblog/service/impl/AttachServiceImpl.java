package com.myblog.service.impl;

import com.myblog.repository.AttachRepository;
import com.myblog.service.AttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by somedragon on 2018/5/17.
 */
@Service
public class AttachServiceImpl implements AttachService {

    @Autowired
    private AttachRepository attachRepository;
}
