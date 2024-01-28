package com.chaitanya.roomservices;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ROOM")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room {
	@Id
	@Column(name="ROOM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="NAME")
	private String name;
	@Column(name="ROOM_NUMBER")
	private String roomNumber;
	@Column(name="BED_INFO")
	private String bedInfo;

}
