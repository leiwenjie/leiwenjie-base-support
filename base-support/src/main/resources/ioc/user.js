var ioc = {
	userDao : {
		type : 'com.leiwenjie.base.support.user.dao.impl.UserDao',
		singleton : true,
		args : [ {
			refer : "dao"
		} ]
	}
};