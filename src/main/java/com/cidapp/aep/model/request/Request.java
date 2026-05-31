package com.cidapp.aep.model.request;

import com.cidapp.aep.model.user.User;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Solicitação de serviço público
public class Request {
    private String protocol;
    private Category category;
    private String description;
    private String location;
    private String neighborhood;
    private Status status;
    private Priority priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime slaDeadline;
    private String delayJustification;
    private boolean isAnonymous;
    private User user;
    private List<Attachment> attachments;
    private List<Movement> movements;
    private Sector sector;
}