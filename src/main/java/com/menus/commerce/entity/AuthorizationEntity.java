package com.menus.commerce.entity;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "authorization")
public class AuthorizationEntity {

  @Id
  @GeneratedValue
  @Column(name = "ID", updatable = false, nullable = false)
  private UUID id;

  @Column(name="AUTHORIZED")
  private boolean authorized;

  @Column(name="TIME")
  private Timestamp time;

  @Column(name = "MESSAGE")
  private String message;

  @Column(name = "ERROR")
  private String error;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "ORDER_ID", referencedColumnName = "id")
  private OrderEntity orderEntity;

}
