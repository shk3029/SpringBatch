package me.js.springbatch.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class CustomerBackup {
    @Id
    @GeneratedValue
    private Long id;
    private Long customerId;

    public CustomerBackup(Long customerId) {
        this.customerId = customerId;
    }
}
