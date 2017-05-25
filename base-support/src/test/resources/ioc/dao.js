var ioc = {
	dao : {
		type : "org.nutz.dao.impl.NutDao",
		args : [ {
			refer : "dataSource"
		} ]
	},
	dataSource : {
		type : "com.alibaba.druid.pool.DruidDataSource",
		events : {
			depose : "close"
		},
		fields : {
			driverClassName : {
				java : '$conf.get("db_driver")'
			},
			url : {
				java : '$conf.get("db_url")'
			},
			username : {
				java : '$conf.get("db_user")'
			},
			password : {
				java : '$conf.get("db_passwd")'
			},
			filters : "stat",
			initialSize : 5,
			maxActive : 20,
			testOnReturn : true,
			// validationQueryTimeout : 5,
			validationQuery : "select 1"
		}
	}
};