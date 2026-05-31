package com.cidapp.aep.model.request;


import com.cidapp.aep.model.user.User;

import java.time.LocalDateTime;

public class Movement {
    private String description;
    private LocalDateTime createdAt;
    private User user;
}