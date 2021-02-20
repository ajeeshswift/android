package com.swift.akc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Dharma
 */
@Entity
@Table(name = "com_farm_flora_hvst")
@Getter
@Setter
public class CommunityFarmFloraHarvest extends AbstractEntity implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Column(name = "flora_st_id")
  private Integer floraStId;
  @Column(name = "harvest_method")
  private String harvestMethod;
  @Column(name = "harvest_date")
  @Temporal(TemporalType.DATE)
  private Date harvestDate;
  @Column(name = "harvest_quantity")
  private String harvestQuantity;
  @Column(name = "own_use")
  private String ownUse;
  @Column(name = "sold_quantity")
  private String soldQuantity;
  @Column(name = "sold_rate")
  private String soldRate;
  @Column(name = "sold_income")
  private String soldIncome;
  @Column(name = "euid")
  private Short euid;
  @Column(name = "edtm")
  @Temporal(TemporalType.TIMESTAMP)
  private Date edtm;
  @Column(name = "uid")
  private Short uid;
  @Column(name = "dtm")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtm;
  @Column(name = "plant_seed")
  private String plantSeed;
  @Column(name = "plant_seed_unit")
  private String plantSeedUnit;

  public CommunityFarmFloraHarvest() {
  }

  public CommunityFarmFloraHarvest(Integer id) {
    this.id = id;
  }
}