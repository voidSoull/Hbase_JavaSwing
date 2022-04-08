package com.exam.hbase;


import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;

public class HBaseClientTest {

	public static void main(String[] args) throws IOException {
		
		Configuration conf = HBaseConfiguration.create();
		conf.set("zookeeper.znode.parent", "/hbase");
		HBaseCustomClient client = new HBaseCustomClient(conf);
		String tableName = "Person";
		String[] families = { "Education", "WorkEx", "Skills" };
		
		
		client.deleteTable(tableName);
		

	}

}