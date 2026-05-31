package com.cidapp.aep.model.request;

import com.cidapp.aep.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_request")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String protocol;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String description;

    private String location;

    private String neighborhood;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime slaDeadline;

    private String delayJustification;

    private boolean anonymous;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany
    private List<Attachment> attachments;

    @OneToMany
    private List<Movement> movements;

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private Sector sector;
}