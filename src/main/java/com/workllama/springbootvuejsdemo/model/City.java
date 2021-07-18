package com.workllama.springbootvuejsdemo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table
	public class City {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String name;
		@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
				 CascadeType.DETACH, CascadeType.REFRESH})
		@JoinColumn(name="state_id")
		private State state;

		public State getStates() {
			return state;
		}
		public void setStates(State state) {
			this.state = state;
		}
		//private long countryId;
		public long getId() {
			return id;
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

