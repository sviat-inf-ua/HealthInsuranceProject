package com.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="planBenefits")
public class PlanBenefits implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String name;
	private String description;
	private double amountCovered;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Plan_Benefits", joinColumns = { @JoinColumn (name = "InsurancePlan_ID") }, inverseJoinColumns = { @JoinColumn (name = "planBenefit_ID") })
	private List<InsurancePlan> plan;

	public PlanBenefits(int id, String name, String description, double amountCovered, List<InsurancePlan> plan) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.amountCovered = amountCovered;
		this.plan = plan;
	}

	public PlanBenefits() {
		super();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmountCovered() {
		return amountCovered;
	}

	public void setAmountCovered(double amountCovered) {
		this.amountCovered = amountCovered;
	}

	public List<InsurancePlan> getPlan() {
		return plan;
	}

	public void setPlan(List<InsurancePlan> plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "PlanBenefits [id=" + id + ", name=" + name + ", description=" + description + ", amountCovered="
				+ amountCovered + ", plan=" + plan + "]";
	}
	
}
