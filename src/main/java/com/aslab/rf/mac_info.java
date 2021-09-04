package com.aslab.rf;

import java.util.ArrayList;
import java.util.List;

public class mac_info {

	private int id;
	private String mac;

	private int age;
	private int weight;

	public mac_info(int in_id, String in_mac) {
		id = in_id;
		mac = in_mac;
	}

	public mac_info(int in_age, int in_weight) {
		age = in_age;
		weight = in_weight;
	}

	public List<String> get_json() {

		List<String> list = new ArrayList<String>();
		list.add(String.valueOf(id));
		list.add(mac);

		return list;
	}

	public List<String> get_json_num() {

		List<String> list = new ArrayList<String>();
		list.add(String.valueOf(age));
		list.add(String.valueOf(weight));

		return list;
	}
}
