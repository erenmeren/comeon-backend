package com.comeon.gamelove.domain;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractTimestampEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Date created;

//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "updated", nullable = false)
//    private Date updated;

    @PrePersist
    protected void onCreate() {
        created = new Date();
    }

//    @PreUpdate
//    protected void onUpdate() {
//        updated = new Date();
//    }
}
