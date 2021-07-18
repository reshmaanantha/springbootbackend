package com.workllama.springbootvuejsdemo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	@Entity
	@Table
	public class State {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String name;
		@OneToMany(mappedBy="state",
				   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
							 CascadeType.DETACH, CascadeType.REFRESH})
		private List<City> cities;
		@ManyToOne(
				   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
							 CascadeType.DETACH, CascadeType.REFRESH})
		@JoinColumn(name="country_id")
		private Country country;
		//private long countryId;
		public long getId() {
			return id;
		}
		public List<City> getCities() {
			return cities;
		}
		public void setCities(List<City> cities) {
			this.cities = cities;
		}
		public Country getCountry() {
			return country;
		}
		public void setCountry(Country country) {
			this.country = country;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setId(long id) {
			this.id = id;
		}
}
