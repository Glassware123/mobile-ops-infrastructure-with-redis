package com.test.repository;

import com.test.domain.XMobileUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface XMobileRepository extends MongoRepository<XMobileUser,String>{

    public XMobileUser findByPhoneNumber();

    }
