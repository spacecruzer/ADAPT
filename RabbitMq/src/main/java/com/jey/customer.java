package com.teja;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Configuration
@Document(collection="customers")
public class customer {
	

		
		@Id
		private String customid;
		private String custName;
		
		
		public customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public customer(String customid, String custName) {
			super();
			this.customid = customid;
			this.custName = custName;
			
		}

		public String getCustomid() {
			return customid;
		}

		public void setCustomid(String customid) {
			this.customid = customid;
		}

		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}
	
		
		

	}
