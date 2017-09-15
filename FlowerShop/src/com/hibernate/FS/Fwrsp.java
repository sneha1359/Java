package com.hibernate.FS;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="FLOWER_SHOP")
public class Fwrsp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "SHOP_ID")
	private int id;
	
	@Column(name = "SHOP_NAME", length = 25)
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<FM> managers;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Fwr> flowers = new LinkedList<Fwr>();
	
	@ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "FLOWERS", joinColumns = @JoinColumn(name = "SHOP_ID"))
    @MapKeyColumn(name = "FLOWER_NAME")
    @Column(name = "WEEKLY_SALES", length = 25)
    private Map<String, Float> weeklySales = new LinkedHashMap<String, Float>();
	
	public Fwrsp() {}

	public Fwrsp(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FM> getManagers() {
		return managers;
	}

	public void setManagers(List<FM> managers) {
		this.managers = managers;
	}

	public List<Fwr> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Fwr> flowers) {
		this.flowers = flowers;
	}

	@Override
	public String toString() {
		return "FlowerShop [id=" + id + ", name=" + name + ", managers=" + managers + "]";
	}
	
	

}
