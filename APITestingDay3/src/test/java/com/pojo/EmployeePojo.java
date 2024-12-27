package com.pojo;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePojo {

	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<DataPojo> data;
	private Support support;

}
