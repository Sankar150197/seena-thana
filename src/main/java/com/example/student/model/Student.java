package com.example.student.model;
import jakarta.persistence.*;
@Table
@Entity
public class Student {
		@GeneratedValue
		@Id
		@Column
		private Integer id;

		@Column
		private  String name;

		@Column
		private String mobileNumber;

		@Column
		private Integer totalMark;
		/**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the mobileNumber
		 */
		public String getMobileNumber() {
			return mobileNumber;
		}
		/**
		 * @param mobileNumber the mobileNumber to set
		 */
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		/**
		 * @return the totalMark
		 */
		public Integer getTotalMark() {
			return totalMark;
		}
		/**
		 * @param totalMark the totalMark to set
		 */
		public void setTotalMark(Integer totalMark) {
			this.totalMark = totalMark;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", totalMark=" + totalMark
					+ "]";
		}

	}

